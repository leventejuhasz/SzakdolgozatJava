package szakdolgozat;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static szakdolgozat.Kezdooldal.customerId;

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

    /**
     * Creates new form cartFrame
     */
    public cartFrame() {
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
        jButton1 = new javax.swing.JButton();
        closeProgramIconOnUserPanel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        buyTicketsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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
                "Name", "Luggage", "Seat Number", "Origin place", "Destination Place", "Departure Time", "Arrival Time", "Flight Number", "Price"
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

        cartPanel.add(myTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1270, 170));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cartPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 254, 110, 40));

        closeProgramIconOnUserPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/X11-icon.png"))); // NOI18N
        closeProgramIconOnUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramIconOnUserPanelMouseClicked(evt);
            }
        });
        cartPanel.add(closeProgramIconOnUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

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
        cartPanel.add(buyTicketsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Number of Tickets: ");
        cartPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("To be paid in total: ");
        cartPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/High_resolution_wallpaper_background_ID_77700337015.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        cartPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-620, -40, -1, 1630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeProgramIconOnUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramIconOnUserPanelMouseClicked
        exitQuestion();
    }//GEN-LAST:event_closeProgramIconOnUserPanelMouseClicked

    private void buyTicketsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketsButtonMouseClicked

        Pay p = new Pay();

        p.setVisible(true);
        p.setLocationRelativeTo(null);

    }//GEN-LAST:event_buyTicketsButtonMouseClicked

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    private DefaultTableModel model2;

    private void loadMyTickets() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();
            String query = "Select Gender, FirstName, LastName, BirthDate , Luggage, flight_info.Origin_country, flight_info.Destination_country, passenger.OriginAirportName, passenger.DestinationAirportName, passenger.Departure_time, Flight_num_id,  passenger.Arrival_time, SeatNum From passenger Inner Join flight_info ON flight_info.Flight_num_id = passenger.Flight_num where passenger.Customer_id=" + customerId;
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
            boolean vanUtas = false;
            int i = 0;
            while (res.next()) {

                String name = res.getString("FirstName") + " " + res.getString("LastName");
                String gender = res.getString("Gender");
                String birth = res.getString("BirthDate");
                String luggage = res.getString("Luggage");
                String seatn = res.getString("SeatNum");
                String departure = res.getString("Departure_Time");
                String orp = res.getString("Origin_country") + ", " + res.getString("OriginAirportName");
                String dep = res.getString("Destination_country") + ", " + res.getString("DestinationAirportName");
                String fid = res.getString("Flight_num_id");
                data[i][0] = name;
                data[i][1] = gender;
                data[i][2] = birth;
                data[i][3] = luggage;
                data[i][4] = seatn;
                data[i][5] = fid;
                data[i][6] = orp;
                data[i][7] = dep;
                data[i][8] = departure;
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
    private javax.swing.JLabel closeProgramIconOnUserPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane myTickets;
    private javax.swing.JTable myTicketsTable;
    // End of variables declaration//GEN-END:variables
}
