package szakdolgozat;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static szakdolgozat.Kezdooldal.customerId;
import static szakdolgozat.Passenger.PassengerAge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juhasz Levente
 */
public class MyTickets extends javax.swing.JFrame {

    public static String base_price;

    public MyTickets() {
        initComponents();

        loadMyTickets();
        mozgato();

    }

    private void exitQuestion() {

        int n = JOptionPane.showConfirmDialog(
                this,
                "Are you sure want to exit?",
                "Exit guestion", JOptionPane.YES_NO_OPTION);

        if (n == 0) {
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartPanel = new javax.swing.JPanel();
        myTickets = new javax.swing.JScrollPane();
        myTicketsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myTickets.setBackground(new java.awt.Color(0, 0, 0));
        myTickets.setForeground(new java.awt.Color(0, 0, 0));

        myTicketsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Luggage", "Origin place", "Destination Place", "Departure Time", "Arrival Time", "Seat number", "Flight Number", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myTickets.setViewportView(myTicketsTable);

        cartPanel.add(myTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1290, 170));

        backButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        cartPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/High_resolution_wallpaper_background_ID_77700337015.jpg"))); // NOI18N
        cartPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-990, -930, 2300, 1330));

        getContentPane().add(cartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1310, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int posX = 0, posY = 0;

    private void mozgato() {

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });

        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt) {
                //sets frame position when mouse dragged			
                setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);

            }
        });
    }

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked
    private DefaultTableModel model2;

    private void loadMyTickets() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();
            String query = "Select FirstName, LastName,Luggage,SeatNum, flight_info.Origin_country, passenger.OriginAirportName, flight_info.Destination_country, passenger.DestinationAirportName, passenger.Departure_time, passenger.Arrival_time, Flight_num_id, price_info.price  From passenger Inner Join flight_info ON flight_info.Flight_num_id = passenger.Flight_num Inner Join price_info ON price_info.Passenger_id = passenger.passenger_id  where passenger.Customer_id=" + customerId;
            ResultSet res = smt.executeQuery(query);
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT COUNT(*) AS rowcount FROM passenger where Customer_id LIKE '" + customerId + "'");
            r.next();
            int count = r.getInt("rowcount");
            System.out.println(count);
            System.out.println(customerId);
            r.close();
            String columns[] = {myTicketsTable.getColumnName(0), myTicketsTable.getColumnName(1), myTicketsTable.getColumnName(2), myTicketsTable.getColumnName(3), myTicketsTable.getColumnName(4), myTicketsTable.getColumnName(5), myTicketsTable.getColumnName(6), myTicketsTable.getColumnName(7), myTicketsTable.getColumnName(8)};
            String data[][] = new String[count][myTicketsTable.getColumnCount()];

            int i = 0;
            while (res.next()) {

                String name = res.getString("FirstName") + " " + res.getString("LastName");
                String luggage = res.getString("Luggage");
                String seatn = res.getString("SeatNum");
                String orp = res.getString("Origin_country") + ", " + res.getString("OriginAirportName");
                String dep = res.getString("Destination_country") + ", " + res.getString("DestinationAirportName");
                String departure = res.getString("Departure_time");
                String arr = res.getString("Arrival_time");
                String fid = res.getString("Flight_num_id");
                String price = res.getString("price") + " EUR";
                data[i][0] = name;
                data[i][1] = luggage;
                data[i][2] = seatn;
                data[i][3] = orp;
                data[i][4] = dep;
                data[i][5] = departure;
                data[i][6] = arr;
                data[i][7] = fid;
                data[i][8] = price;

                i++;

            }

            model2 = new DefaultTableModel(data, columns);
            myTicketsTable.setModel(model2);

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane myTickets;
    private javax.swing.JTable myTicketsTable;
    // End of variables declaration//GEN-END:variables
}
