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
public class cartFrame extends javax.swing.JFrame {

    public static String base_price;



    public cartFrame() {
        initComponents();

        loadMyTickets();
        mozgato();
        design();

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

    private void design() {
        numOfTicketsLabel.setText("Number of Tickets: " + myTicketsTable.getRowCount());

        int total = 0;

        for (int i = 0; i < myTicketsTable.getRowCount(); i++) {
            total += Integer.parseInt((String) myTicketsTable.getValueAt(i, 8).toString().replaceAll(" EUR", ""));
        }
        totalPay.setText("To be paid in total: " + total + " EUR");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartPanel = new javax.swing.JPanel();
        myTickets = new javax.swing.JScrollPane();
        myTicketsTable = new javax.swing.JTable();
        deletePassenger = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        buyTicketsButton = new javax.swing.JButton();
        numOfTicketsLabel = new javax.swing.JLabel();
        totalPay = new javax.swing.JLabel();
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Luggage", "Origin place", "Destination Place", "Departure Time", "Arrival Time", "Flight Number", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myTickets.setViewportView(myTicketsTable);

        cartPanel.add(myTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1290, 170));

        deletePassenger.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deletePassenger.setText("Delete Passenger");
        deletePassenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePassengerMouseClicked(evt);
            }
        });
        cartPanel.add(deletePassenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 200, 40));

        backButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        cartPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        buyTicketsButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buyTicketsButton.setForeground(new java.awt.Color(0, 0, 0));
        buyTicketsButton.setText("Buy tickets");
        buyTicketsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyTicketsButtonMouseClicked(evt);
            }
        });
        cartPanel.add(buyTicketsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, 40));

        numOfTicketsLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numOfTicketsLabel.setForeground(new java.awt.Color(255, 255, 255));
        numOfTicketsLabel.setText("Number of Tickets: ");
        cartPanel.add(numOfTicketsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        totalPay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        totalPay.setForeground(new java.awt.Color(255, 255, 255));
        totalPay.setText("To be paid in total: ");
        cartPanel.add(totalPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/High_resolution_wallpaper_background_ID_77700337015.jpg"))); // NOI18N
        cartPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-990, -930, 2300, 1330));

        getContentPane().add(cartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1310, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyTicketsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketsButtonMouseClicked

        Pay p = new Pay();

        p.setVisible(true);
        p.setLocationRelativeTo(null);

    }//GEN-LAST:event_buyTicketsButtonMouseClicked

    private void updatePrice() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

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

    private void deletePassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePassengerMouseClicked

        try {
            if (myTicketsTable.isRowSelected(myTicketsTable.getSelectedRow())) {
                JFrame jFrame = new JFrame();
                int result = JOptionPane.showConfirmDialog(jFrame, "Are you sure want to delete this passenger?");

                if (result == 0) {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
                    Statement smt = con.createStatement();
                    smt.executeUpdate("Delete FROM passenger where seatNum =" + myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 2));
                    con.close();
                    model2.removeRow(myTicketsTable.getSelectedRow());

                }

            }

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_deletePassengerMouseClicked
    private DefaultTableModel model2;

    private void loadMyTickets() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();
            String query = "Select FirstName, LastName,Luggage,SeatNum, flight_info.Origin_country, passenger.OriginAirportName, flight_info.Destination_country, passenger.DestinationAirportName, passenger.Departure_time, passenger.Arrival_time, Flight_num_id, Base_Price  From passenger Inner Join flight_info ON flight_info.Flight_num_id = passenger.Flight_num where passenger.Customer_id=" + customerId;
            ResultSet res = smt.executeQuery(query);
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT COUNT(*) AS rowcount FROM passenger where Customer_id LIKE '" + customerId + "'");
            r.next();
            int count = r.getInt("rowcount");
            System.out.println(count);
            System.out.println(customerId);
            r.close();
            String columns[] = {myTicketsTable.getColumnName(0), myTicketsTable.getColumnName(1), myTicketsTable.getColumnName(2), myTicketsTable.getColumnName(3), myTicketsTable.getColumnName(4), myTicketsTable.getColumnName(5), myTicketsTable.getColumnName(6), myTicketsTable.getColumnName(7)};
            String data[][] = new String[count][myTicketsTable.getColumnCount()];
            boolean vanUtas = false;
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
                String price = res.getString("Base_Price") + " EUR";
                data[i][0] = name;
                data[i][1] = luggage;
                data[i][2] = seatn;
                data[i][3] = orp;
                data[i][4] = dep;
                data[i][5] = departure;
                data[i][6] = arr;
                data[i][7] = fid;
                data[i][8] = price;
                vanUtas = true;
                i++;

            }

            model2 = new DefaultTableModel(data, columns);
            myTicketsTable.setModel(model2);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton buyTicketsButton;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JButton deletePassenger;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane myTickets;
    private javax.swing.JTable myTicketsTable;
    private javax.swing.JLabel numOfTicketsLabel;
    private javax.swing.JLabel totalPay;
    // End of variables declaration//GEN-END:variables
}
