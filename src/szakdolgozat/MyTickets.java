package szakdolgozat;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
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

import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.swing.JFileChooser;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juhasz Levente
 */
public class MyTickets extends javax.swing.JFrame implements iDatabase {

    private static MyTickets obj = null;
    public static String base_price;

    MyTickets() {
        initComponents();

        loadMyTickets();
        mozgato();

    }

    public static MyTickets getObj() {
        if (obj == null) {
            obj = new MyTickets();
        }
        return obj;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartPanel = new javax.swing.JPanel();
        myTickets = new javax.swing.JScrollPane();
        myTicketsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        saveToPDf = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myTickets.setBackground(new java.awt.Color(0, 0, 0));
        myTickets.setForeground(new java.awt.Color(0, 0, 0));

        myTicketsTable.setForeground(new java.awt.Color(51, 51, 255));
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
        myTicketsTable.setGridColor(new java.awt.Color(51, 51, 255));
        myTicketsTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        myTicketsTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
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

        saveToPDf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        saveToPDf.setText("Save to PDF");
        saveToPDf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveToPDfMouseClicked(evt);
            }
        });
        cartPanel.add(saveToPDf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/High_resolution_wallpaper_background_ID_77700337015.jpg"))); // NOI18N
        cartPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, -930, 2310, 1270));

        getContentPane().add(cartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1310, -1));

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
    public void errorPopUp(String text) {
        JOptionPane.showMessageDialog(this,
                text,
                "Error",
                JOptionPane.ERROR_MESSAGE);

    }
    private void saveToPDfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveToPDfMouseClicked

        if (!myTicketsTable.getSelectionModel().isSelectionEmpty()) {

            JFileChooser savePath = new JFileChooser();
            savePath.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int retval = savePath.showSaveDialog(this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                try {

                    String query = "Select Passenger_id,Flight_num from price_info where Flight_num = " + myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 7);

                    ResultSet res = lekerdezes(query);
                    if (res.next()) {
                        String id = res.getString("Passenger_id");
                        String fn = res.getString("Flight_num");
                        Document writePdf = new Document();
                        PdfWriter writer = PdfWriter.getInstance(writePdf, new FileOutputStream(savePath.getSelectedFile() + "/" + myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 0) + "_" + id + ".pdf"));
                        writePdf.open();
                        PdfPTable table = new PdfPTable(1);
                        PdfPCell cell = new PdfPCell();
                        Paragraph olvasojegy = new Paragraph("Ticket");
                        olvasojegy.setFont(new Font(Font.FontFamily.UNDEFINED, 20));
                        olvasojegy.setSpacingAfter(6f);
                        olvasojegy.setAlignment(Element.ALIGN_CENTER);
                        cell.addElement(olvasojegy);
                        Paragraph adatok = new Paragraph(String.format("Name: %s\nLuggage: %s\nDeparting: %s\nSeat: %s\nDestination: %s\nFlight Number: %s\n", myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 0), myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 1), myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 4), myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 6), myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 3), myTicketsTable.getValueAt(myTicketsTable.getSelectedRow(), 7)));
                        adatok.setSpacingAfter(10f);
                        cell.addElement(adatok);
                        BarcodeEAN barcode = new BarcodeEAN();
                        barcode.setCodeType(Barcode.EAN8);
                        String code = id + fn;
                        for (int i = code.length(); i < 8; i++) {
                            code = "0" + code;
                        }
                        barcode.setCode(code);
                        barcode.setGuardBars(false);
                        barcode.setBarHeight(8f);
                        barcode.setSize(5f);
                        Image img = barcode.createImageWithBarcode(writer.getDirectContent(), BaseColor.BLACK, BaseColor.GRAY);
                        img.setWidthPercentage(60f);
                        img.setAlignment(Element.ALIGN_CENTER);
                        cell.addElement(img);
                        cell.setPadding(50);
                        table.addCell(cell);
                        writePdf.add(table);
                        writePdf.close();
                        JOptionPane.showMessageDialog(rootPane, "Successful saving!", "Info", JOptionPane.INFORMATION_MESSAGE);

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            errorPopUp("No ticket selected!");
        }

    }//GEN-LAST:event_saveToPDfMouseClicked
    private DefaultTableModel model2;

    public void loadMyTickets() {

        try {

            String query = "Select FirstName, LastName,Luggage,SeatNum, flight_info.Origin_country, passenger.OriginAirportName, flight_info.Destination_country, passenger.DestinationAirportName, passenger.Departure_time, passenger.Arrival_time, Flight_num_id, price_info.price  From passenger Inner Join flight_info ON flight_info.Flight_num_id = passenger.Flight_num Inner Join price_info ON price_info.Passenger_id = passenger.passenger_id  where passenger.Customer_id=" + customerId;
            ResultSet res = lekerdezes(query);

            ResultSet r = lekerdezes("SELECT COUNT(*) AS rowcount FROM passenger where Customer_id LIKE '" + customerId + "'");
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
                data[i][2] = orp;
                data[i][3] = dep;
                data[i][4] = departure;
                data[i][5] = arr;
                data[i][6] = seatn;
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
    private javax.swing.JButton saveToPDf;
    // End of variables declaration//GEN-END:variables
}
