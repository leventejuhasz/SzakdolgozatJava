package szakdolgozat;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class SearchInJtable extends JPanel {

    //JTable Header 
    Kezdooldal k = new Kezdooldal();
    JTable j = k.getAddFlightTable();

    String columns2[];
    String data2[][];

  
    public void keepJtableData() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");

            String query = "Select Departure_time,Arrival_time,Origin_place, OriginAirportName, Destination_place, DestinationAirportName, Num_of_seats from flight_info";
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery(query);
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT COUNT(*) AS rowcount FROM flight_info");
            r.next();
            int count = r.getInt("rowcount");
            r.close();

            String columns[] = {j.getColumnName(0), j.getColumnName(1), j.getColumnName(2), j.getColumnName(3), j.getColumnName(4), j.getColumnName(5), j.getColumnName(6)};

            String data[][] = new String[count][j.getColumnCount()];

            int i = 0;
            while (res.next()) {

                String dep = res.getString("Departure_Time");
                String ati = res.getString("Arrival_Time");
                String orc = res.getString("Origin_place");
                String ora = res.getString("OriginAirportName");
                String dec = res.getString("Destination_place");
                String dea = res.getString("DestinationAirportName");
                String nos = res.getString("Num_of_seats");
                data[i][0] = dep;
                data[i][1] = ati;
                data[i][2] = orc;
                data[i][3] = ora;
                data[i][4] = dec;
                data[i][5] = dea;
                data[i][6] = nos;
                i++;
            }
            columns2 = columns;
            data2 = data;
            DefaultTableModel model = new DefaultTableModel(data, columns);
            j.setModel(model);
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    //create a JTable with data
    JTable table = new JTable(data2, columns2);

    TableRowSorter<TableModel> sort = new TableRowSorter<>(j.getModel());

    JTextField textField = new JTextField();

    public SearchInJtable() {

        //set the width of the 3rd column to 200 pixels
        TableColumnModel columnModel = j.getColumnModel();
        columnModel.getColumn(2).setPreferredWidth(200);

        j.setRowSorter(sort);

        JPanel p = new JPanel(new BorderLayout());
        p.add(new JLabel("Search for a word:"), BorderLayout.WEST);
        p.add(textField, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(p, BorderLayout.SOUTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String str = textField.getText();
                if (str.trim().length() == 0) {
                    sort.setRowFilter(null);
                } else {
                    //(?i) means case insensitive search
                    sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String str = textField.getText();
                if (str.trim().length() == 0) {
                    sort.setRowFilter(null);
                } else {
                    sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame f = new JFrame("Search in JTable");
                f.add(new SearchInJtable());
                f.setSize(500, 180);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });
    }
}
