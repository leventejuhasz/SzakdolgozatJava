/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakdolgozat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import static szakdolgozat.Kezdooldal.arrtime;
import static szakdolgozat.Kezdooldal.deptime;
import static szakdolgozat.Kezdooldal.orairport;
import static szakdolgozat.Kezdooldal.orcountry;
import static szakdolgozat.Kezdooldal.destairport;
import static szakdolgozat.Kezdooldal.destcountry;
import static szakdolgozat.Kezdooldal.maxnumofseats;
import static szakdolgozat.Kezdooldal.adminflightnum;
import static szakdolgozat.Kezdooldal.availableseats;

public class ManageFlight extends javax.swing.JFrame {

    public ManageFlight() {
        initComponents();
        labels();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageFlightPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        passengersTable = new javax.swing.JTable();
        SearchPassenger = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageFlightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        ManageFlightPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 1460, 450));
        ManageFlightPanel.add(SearchPassenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 240, 40));

        searchLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(0, 0, 0));
        searchLabel.setText("Search Passenger: ");
        ManageFlightPanel.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Delete Passenger");
        ManageFlightPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 660, 170, 40));

        destPlaceLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        destPlaceLabel.setForeground(new java.awt.Color(0, 0, 0));
        destPlaceLabel.setText("Destination Country: ");
        ManageFlightPanel.add(destPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        orplaceLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        orplaceLabel.setForeground(new java.awt.Color(0, 0, 0));
        orplaceLabel.setText("Origin Country: ");
        ManageFlightPanel.add(orplaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        arrtimeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        arrtimeLabel.setForeground(new java.awt.Color(0, 0, 0));
        arrtimeLabel.setText("Arrival Time: ");
        ManageFlightPanel.add(arrtimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        numofavseatsLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        numofavseatsLabel.setForeground(new java.awt.Color(0, 0, 0));
        numofavseatsLabel.setText("Number of available seats: ");
        ManageFlightPanel.add(numofavseatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, -1, -1));

        deptimeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deptimeLabel.setForeground(new java.awt.Color(0, 0, 0));
        deptimeLabel.setText("Departure Time: ");
        ManageFlightPanel.add(deptimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        orairportnameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        orairportnameLabel.setForeground(new java.awt.Color(0, 0, 0));
        orairportnameLabel.setText("Origin Airport Name: ");
        ManageFlightPanel.add(orairportnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        destaiportNameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        destaiportNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        destaiportNameLabel.setText("Destination Airport Name: ");
        ManageFlightPanel.add(destaiportNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        passengertabletitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        passengertabletitle.setForeground(new java.awt.Color(255, 0, 0));
        passengertabletitle.setText("Passengers Table");
        ManageFlightPanel.add(passengertabletitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        numofmaxseatLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        numofmaxseatLabel.setForeground(new java.awt.Color(0, 0, 0));
        numofmaxseatLabel.setText("Number of max seats: ");
        ManageFlightPanel.add(numofmaxseatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        flightNumLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        flightNumLabel.setForeground(new java.awt.Color(0, 0, 0));
        flightNumLabel.setText("Flight Number: ");
        ManageFlightPanel.add(flightNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/305614_2.jpg"))); // NOI18N
        ManageFlightPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 830));

        getContentPane().add(ManageFlightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
            DefaultTableModel model;

    private void fillTable() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            System.out.println(adminflightnum);
            String query = "Select passenger.FirstName, passenger.LastName, BirthDate , Luggage, SeatNum, registration_info.FirstName, registration_info.LastName, Email , phoneNumber FROM passenger Inner Join registration_info ON registration_info.CustomerId = passenger.Customer_id where Flight_num = " + adminflightnum;
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery(query);
            Statement s = con.createStatement();
            System.out.println(adminflightnum);
            ResultSet r = s.executeQuery("SELECT COUNT(passenger_id) as rowcount FROM passenger WHERE Flight_num ="+adminflightnum);
            r.next();
            int count = r.getInt("rowcount");
            r.close();
            System.out.println(count);
            String columns[] = {passengersTable.getColumnName(0), passengersTable.getColumnName(1), passengersTable.getColumnName(2), passengersTable.getColumnName(3), passengersTable.getColumnName(4), passengersTable.getColumnName(5), passengersTable.getColumnName(6)};
            String data[][] = new String[count][passengersTable.getColumnCount()];
            System.out.println("kutya");
            int i = 0;
            while (res.next()) {
 System.out.println("c");
                String passname = res.getString("FirstName" + " " + res.getString("LastName"));
                String bd = res.getString("BirthDate");
                String lug = res.getString("Luggage");
                String seat = res.getString("SeatNum");
                String contactname = res.getString("FirstName" + " " + "LastName");
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
               
               System.out.println("c");
            }

            model = new DefaultTableModel(data, columns);
            passengersTable.setModel(model);
            con.close();
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

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageFlightPanel;
    private javax.swing.JTextField SearchPassenger;
    private javax.swing.JLabel arrtimeLabel;
    private javax.swing.JLabel deptimeLabel;
    private javax.swing.JLabel destPlaceLabel;
    private javax.swing.JLabel destaiportNameLabel;
    private javax.swing.JLabel flightNumLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numofavseatsLabel;
    private javax.swing.JLabel numofmaxseatLabel;
    private javax.swing.JLabel orairportnameLabel;
    private javax.swing.JLabel orplaceLabel;
    private javax.swing.JTable passengersTable;
    private javax.swing.JLabel passengertabletitle;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
