/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakdolgozat;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static szakdolgozat.Kezdooldal.arrtime;
import static szakdolgozat.Kezdooldal.deptime;
import static szakdolgozat.Kezdooldal.orairport;
import static szakdolgozat.Kezdooldal.orcountry;
import static szakdolgozat.Kezdooldal.destairport;
import static szakdolgozat.Kezdooldal.destcountry;
import static szakdolgozat.Kezdooldal.maxnumofseats;
import static szakdolgozat.Kezdooldal.adminflightnum;
import static szakdolgozat.Kezdooldal.availableseats;
import static szakdolgozat.Kezdooldal.promotion;

public class ManageFlight extends javax.swing.JFrame implements iDatabase {

    public ManageFlight() {
        initComponents();
        labels();
        fillTable();
        sorter();
        mozgato();

    }

    private void sqlUpdate(String sql) throws ClassNotFoundException, SQLException {

        connectToDatabase().executeUpdate(sql);

    }

    private ResultSet lekerdezes(String sql) throws ClassNotFoundException, SQLException {
        Statement smt = connectToDatabase();

        ResultSet res = smt.executeQuery(sql);

        return res;

    }

    //csatlakozás az adatbázishoz
    private Statement connectToDatabase() throws ClassNotFoundException, SQLException {
        Class.forName(CONNECTION);
        Connection con = DriverManager.getConnection(CONNECT_TO_LOCALHOST, USER, PASSWORD);

        Statement smt = con.createStatement();

        return smt;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageFlightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengersTable = new javax.swing.JTable();
        SearchPassenger = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        deletePassengerButton = new javax.swing.JButton();
        destPlaceLabel = new javax.swing.JLabel();
        orplaceLabel = new javax.swing.JLabel();
        arrtimeLabel = new javax.swing.JLabel();
        numofavseatsLabel = new javax.swing.JLabel();
        deptimeLabel = new javax.swing.JLabel();
        orairportnameLabel = new javax.swing.JLabel();
        destaiportNameLabel = new javax.swing.JLabel();
        passengertabletitle = new javax.swing.JLabel();
        numofmaxseatLabel = new javax.swing.JLabel();
        flightNumLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        closeManageFlighFrametLabel = new javax.swing.JLabel();
        promotionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageFlightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passengersTable.setAutoCreateRowSorter(true);
        passengersTable.setForeground(new java.awt.Color(51, 51, 255));
        passengersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Birth date", "Luggage", "Seat Number", "Contact person name ", "Contact person Email address", "Contact person phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(passengersTable);

        ManageFlightPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1490, 440));
        ManageFlightPanel.add(SearchPassenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 540, 240, 40));

        searchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search Passenger: ");
        ManageFlightPanel.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 500, -1, -1));

        deletePassengerButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deletePassengerButton.setText("Delete Selected Passenger");
        deletePassengerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePassengerButtonMouseClicked(evt);
            }
        });
        ManageFlightPanel.add(deletePassengerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, 230, 40));

        destPlaceLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        destPlaceLabel.setForeground(new java.awt.Color(255, 255, 255));
        destPlaceLabel.setText("Destination Country: ");
        ManageFlightPanel.add(destPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        orplaceLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        orplaceLabel.setForeground(new java.awt.Color(255, 255, 255));
        orplaceLabel.setText("Origin Country: ");
        ManageFlightPanel.add(orplaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        arrtimeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        arrtimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        arrtimeLabel.setText("Arrival Time: ");
        ManageFlightPanel.add(arrtimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        numofavseatsLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        numofavseatsLabel.setForeground(new java.awt.Color(255, 255, 255));
        numofavseatsLabel.setText("Number of available seats: ");
        ManageFlightPanel.add(numofavseatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, -1, -1));

        deptimeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deptimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        deptimeLabel.setText("Departure Time: ");
        ManageFlightPanel.add(deptimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        orairportnameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        orairportnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        orairportnameLabel.setText("Origin Airport Name: ");
        ManageFlightPanel.add(orairportnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        destaiportNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        destaiportNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        destaiportNameLabel.setText("Destination Airport Name: ");
        ManageFlightPanel.add(destaiportNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        passengertabletitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passengertabletitle.setForeground(new java.awt.Color(255, 255, 255));
        passengertabletitle.setText("Passengers");
        ManageFlightPanel.add(passengertabletitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        numofmaxseatLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        numofmaxseatLabel.setForeground(new java.awt.Color(255, 255, 255));
        numofmaxseatLabel.setText("Number of max seats: ");
        ManageFlightPanel.add(numofmaxseatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        flightNumLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        flightNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        flightNumLabel.setText("Flight Number: ");
        ManageFlightPanel.add(flightNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        searchButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        ManageFlightPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 590, 110, 40));

        closeManageFlighFrametLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/X11-icon.png"))); // NOI18N
        closeManageFlighFrametLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeManageFlighFrametLabelMouseClicked(evt);
            }
        });
        ManageFlightPanel.add(closeManageFlighFrametLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 0, 50, -1));

        promotionLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        promotionLabel.setForeground(new java.awt.Color(255, 255, 255));
        promotionLabel.setText("Promotion: ");
        ManageFlightPanel.add(promotionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/High_resolution_wallpaper_background_ID_77700337015.jpg"))); // NOI18N
        ManageFlightPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 710));

        getContentPane().add(ManageFlightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keresees() {
        TableRowSorter sorter = new TableRowSorter(model);
        String title = SearchPassenger.getText();
        passengersTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(title));

    }

    private void errorPopUp(String text) {
        JOptionPane.showMessageDialog(this,
                text,
                "Error",
                JOptionPane.ERROR_MESSAGE);

    }
    
    
    
    
    
    
    
    private void deletePassengerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePassengerButtonMouseClicked

        try {
            if (!passengersTable.getSelectionModel().isSelectionEmpty()) {
                JFrame jFrame = new JFrame();
                int result = JOptionPane.showConfirmDialog(jFrame, "Are you sure want to delete this passenger?");

                if (result == 0) {
                    String sql = "Delete FROM passenger where seatNum =" + passengersTable.getValueAt(passengersTable.getSelectedRow(), 3);
                    sqlUpdate(sql);
                    String sql2 = "Update flight_info SET Num_of_available_seats = (Num_of_available_seats + 1) where Flight_num_id = " + adminflightnum;

                    sqlUpdate(sql2);

                    String sql3 = "Select Num_of_available_seats from flight_info where Flight_num_id =" + adminflightnum;

                    ResultSet r = lekerdezes(sql3);

                    if (r.next()) {
                        availableseats = r.getString("Num_of_available_seats");
                    }
                    numofavseatsLabel.setText("Number of available seats: " + availableseats);

                    model.removeRow(passengersTable.getSelectedRow());
                    r.close();
                }

            } else {
                errorPopUp("Please select a Passenger!");
            }

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_deletePassengerButtonMouseClicked

    private void sorter() {

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(passengersTable.getModel());
        passengersTable.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int columnIndexToSort = 3;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.DESCENDING));

        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }


    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        if (SearchPassenger.getText() == "") {
            errorPopUp("Please write something, that you want to search!");
        } else {
            keresees();
        }


    }//GEN-LAST:event_searchButtonMouseClicked

    private void closeManageFlighFrametLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeManageFlighFrametLabelMouseClicked

        this.dispose();

    }//GEN-LAST:event_closeManageFlighFrametLabelMouseClicked
    DefaultTableModel model;

    private void fillTable() {

        try {

            String query = "Select passenger.FirstName, passenger.LastName, BirthDate , Luggage, SeatNum, registration_info.FirstName, registration_info.LastName, Email , phoneNumber FROM passenger Inner Join registration_info ON registration_info.Customer_id = passenger.Customer_id where Flight_num = " + adminflightnum;

            ResultSet res = lekerdezes(query);

            ResultSet r = lekerdezes("SELECT COUNT(passenger_id) as rowcount FROM passenger WHERE Flight_num =" + adminflightnum);
            r.next();
            int count = r.getInt("rowcount");
            r.close();
            String columns[] = {passengersTable.getColumnName(0), passengersTable.getColumnName(1), passengersTable.getColumnName(2), passengersTable.getColumnName(3), passengersTable.getColumnName(4), passengersTable.getColumnName(5), passengersTable.getColumnName(6)};
            String data[][] = new String[count][passengersTable.getColumnCount()];
            int i = 0;
            while (res.next()) {
                String passname = res.getString("passenger.FirstName") + " " + res.getString("passenger.LastName");
                String bd = res.getString("BirthDate");
                String lug = res.getString("Luggage");
                String seat = res.getString("SeatNum");
                String contactname = res.getString("registration_info.FirstName") + " " + res.getString("registration_info.LastName");
                String nos = res.getString("Email");
                String fid = res.getString("phoneNumber");
                data[i][0] = passname;
                data[i][1] = bd;
                data[i][2] = lug;
                data[i][3] = seat;
                data[i][4] = contactname;
                data[i][5] = nos;
                data[i][6] = fid;
                i++;
            }

            model = new DefaultTableModel(data, columns);
            passengersTable.setModel(model);

            res.close();
            r.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void labels() {

        deptimeLabel.setText("Departure time: " + deptime);
        arrtimeLabel.setText("Arrival time: " + arrtime);
        orplaceLabel.setText("Origin country: " + orcountry);
        destPlaceLabel.setText("Destination country: " + destcountry);
        orairportnameLabel.setText("Origin aiport name: " + orairport);
        destaiportNameLabel.setText("Destination aiport name: " + destairport);
        numofmaxseatLabel.setText("Number of max seats: " + maxnumofseats);
        numofavseatsLabel.setText("Number of available seats: " + availableseats);
        flightNumLabel.setText("Flight number: " + adminflightnum);
        promotionLabel.setText("Promotion: " + promotion + "%");
        this.closeManageFlighFrametLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageFlightPanel;
    private javax.swing.JTextField SearchPassenger;
    private javax.swing.JLabel arrtimeLabel;
    public static javax.swing.JLabel closeManageFlighFrametLabel;
    private javax.swing.JButton deletePassengerButton;
    private javax.swing.JLabel deptimeLabel;
    private javax.swing.JLabel destPlaceLabel;
    private javax.swing.JLabel destaiportNameLabel;
    private javax.swing.JLabel flightNumLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numofavseatsLabel;
    private javax.swing.JLabel numofmaxseatLabel;
    private javax.swing.JLabel orairportnameLabel;
    private javax.swing.JLabel orplaceLabel;
    private javax.swing.JTable passengersTable;
    private javax.swing.JLabel passengertabletitle;
    private javax.swing.JLabel promotionLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
