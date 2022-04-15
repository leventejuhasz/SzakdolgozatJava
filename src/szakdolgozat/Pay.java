/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakdolgozat;


import java.awt.Cursor;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;

import javax.swing.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;

import javax.swing.table.DefaultTableModel;
import static szakdolgozat.Kezdooldal.Arrival_time;
import static szakdolgozat.Kezdooldal.Departure_time;
import static szakdolgozat.Kezdooldal.DestinationAirportName;
import static szakdolgozat.Kezdooldal.Destination_country;
import static szakdolgozat.Kezdooldal.OriginAirportName;
import static szakdolgozat.Kezdooldal.Origin_country;
import static szakdolgozat.Kezdooldal.cartTable;
import static szakdolgozat.Kezdooldal.customerId;
import static szakdolgozat.Kezdooldal.flightNum;

import static szakdolgozat.Kezdooldal.total;
import static szakdolgozat.Passenger.numberOfTickets;
import static szakdolgozat.Kezdooldal.totalPay;
import static szakdolgozat.Kezdooldal.numOfTicketsLabel;
import static szakdolgozat.PassengersInfo.passengers;

/**
 *
 * @author User
 */
public class Pay extends javax.swing.JFrame implements iDatabase {

    private static Pay obj = null;

    Pay() {
        initComponents();
        mozgato();
        designPaymentInterface();
    }

    public static Pay getObj() {
        if (obj == null) {
            obj = new Pay();
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

    private void designPaymentInterface() {
        amountToBePaidLabel.setText("€" + total);
        this.cancelPaymentsLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        limittexfieldnumbers(first4CardNumber, 4);
        limittexfieldnumbers(second4CardNumber, 4);
        limittexfieldnumbers(third4CardNumber, 4);
        limittexfieldnumbers(last4CardNumber, 4);
        limittexfieldnumbers(monthTextfield, 2);
        limittexfieldnumbers(yearTextfield, 2);
        limittexfieldnumbers(cvcTextField, 3);

    }

    public boolean onlyDigits(String str, int n) {

        for (int i = 0; i < n; i++) {

            if (str.charAt(i) >= '0'
                    && str.charAt(i) <= '9') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private void errorFramePopUp(String errorText) {

        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, errorText);
    }

    public boolean ischeckPayment() {
        boolean checkCodeError = false;
        if (!onlyDigits(first4CardNumber.getText(), 4) == true) {
            errorFramePopUp("Card numbers can contains only numbers!");
            checkCodeError = true;
        }
        
        if (first4CardNumber.getText().length()<4 || second4CardNumber.getText().length()<4 ||third4CardNumber.getText().length()<4 || last4CardNumber.getText().length()<4 ) {
            errorFramePopUp("Wrong card number!");
        }
        
        if (!onlyDigits(second4CardNumber.getText(), 4) == true) {
            errorFramePopUp("Card numbers can contains only numbers!");
            checkCodeError = true;
        }
        if (!onlyDigits(third4CardNumber.getText(), 4) == true) {
            errorFramePopUp("Card numbers can contains only numbers!");
            checkCodeError = true;
        }
        if (!onlyDigits(last4CardNumber.getText(), 4) == true) {
            errorFramePopUp("Card numbers can contains only numbers!");
            checkCodeError = true;
        }

        if (onlyLettersSpaces(firstlastNameTextfield.getText()) == false) {
            errorFramePopUp("The card holders name can contains only letters and space!");
            checkCodeError = true;
        }

        if (Integer.parseInt(monthTextfield.getText()) > 12) {
            errorFramePopUp("Wrong month!");
            checkCodeError = true;
        }

        if (Integer.parseInt(monthTextfield.getText()) <= 0) {
            errorFramePopUp("Wrong month!");
            checkCodeError = true;
        }

        if (!onlyDigits(yearTextfield.getText(), 2) == true) {
            errorFramePopUp("Year can only a number!");
            checkCodeError = true;
        }

        if (!onlyDigits(monthTextfield.getText(), 2) == true) {
            errorFramePopUp("Month can only a number!");
            checkCodeError = true;
        }
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int yearlevagott = Integer.parseInt(String.valueOf(year).substring(1, 4));
        if (Integer.parseInt(yearTextfield.getText()) < yearlevagott) {
            errorFramePopUp("Card expired!");
            checkCodeError = true;
        }

        if (Integer.parseInt(yearTextfield.getText()) == yearlevagott) {

            if (Integer.parseInt(monthTextfield.getText()) <= month) {
                errorFramePopUp("Card expired!");
                checkCodeError = true;
            }

        }
        if (!onlyDigits(cvcTextField.getText(), 3) == true) {

            errorFramePopUp("CVC code can only contains number!");
            checkCodeError = true;
        }
        if (cvcTextField.getText().length() != 3) {
            errorFramePopUp("CVC code needs to be 3 number!");
            checkCodeError = true;
        }
        return checkCodeError;

    }

    private void limittexfieldnumbers(JTextField textfield, int limit) {

        textfield.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (textfield.getText().length() >= limit) // limit to 4 characters
                {
                    e.consume();
                }
            }
        });

    }

    public static boolean onlyLettersSpaces(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) || ch == ' ') {
                continue;
            }
            return false;
        }
        return true;
    }

    private void sikeresFizetes() {
        Icon pie = null;
        try {
            pie = new ImageIcon(ImageIO.read(Szakdolgozat.class.getResourceAsStream("icons8-check-64.png")));
        } catch (IOException ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this,
                "Succsefull payment!",
                "Succsefull payment!",
                JOptionPane.INFORMATION_MESSAGE,
                pie);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topaylabel = new javax.swing.JLabel();
        amountToBePaidLabel = new javax.swing.JLabel();
        cancelPaymentsLabel = new javax.swing.JLabel();
        greybackground = new javax.swing.JLabel();
        paymentsTitle = new javax.swing.JLabel();
        payments2Title = new javax.swing.JLabel();
        visaicon = new javax.swing.JLabel();
        chipicon = new javax.swing.JLabel();
        third4CardNumber = new javax.swing.JTextField();
        last4CardNumber = new javax.swing.JTextField();
        second4CardNumber = new javax.swing.JTextField();
        first4CardNumber = new javax.swing.JTextField();
        firstlastNameTextfield = new javax.swing.JTextField();
        yearTextfield = new javax.swing.JTextField();
        expireslabel = new javax.swing.JLabel();
        cardholderlabel = new javax.swing.JLabel();
        cardnumberlabel = new javax.swing.JLabel();
        cvcLabel = new javax.swing.JLabel();
        cvcTextField = new javax.swing.JTextField();
        monthTextfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cardIconLabel = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        whitebackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topaylabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        topaylabel.setForeground(new java.awt.Color(255, 255, 255));
        topaylabel.setText("To pay ");
        jPanel1.add(topaylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 30));

        amountToBePaidLabel.setDisplayedMnemonic('a');
        amountToBePaidLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        amountToBePaidLabel.setForeground(new java.awt.Color(255, 255, 255));
        amountToBePaidLabel.setText("$379");
        jPanel1.add(amountToBePaidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        cancelPaymentsLabel.setBackground(new java.awt.Color(255, 255, 255));
        cancelPaymentsLabel.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        cancelPaymentsLabel.setForeground(new java.awt.Color(255, 255, 255));
        cancelPaymentsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/icons8-back-32.png"))); // NOI18N
        cancelPaymentsLabel.setText(" Cancel your Payments");
        cancelPaymentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelPaymentsLabelMouseClicked(evt);
            }
        });
        jPanel1.add(cancelPaymentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        greybackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/43464b.png"))); // NOI18N
        jPanel1.add(greybackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 630));

        paymentsTitle.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        paymentsTitle.setForeground(new java.awt.Color(51, 51, 51));
        paymentsTitle.setText("Payments");
        jPanel1.add(paymentsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        payments2Title.setDisplayedMnemonic('P');
        payments2Title.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        payments2Title.setForeground(new java.awt.Color(0, 0, 0));
        payments2Title.setText("Fill in credit card to begin");
        jPanel1.add(payments2Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        visaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/visa.png"))); // NOI18N
        jPanel1.add(visaicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, 60));

        chipicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/icons8-chip-card-40.png"))); // NOI18N
        jPanel1.add(chipicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        third4CardNumber.setBackground(new java.awt.Color(0, 51, 102));
        third4CardNumber.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        third4CardNumber.setForeground(new java.awt.Color(255, 255, 255));
        third4CardNumber.setText("0000");
        third4CardNumber.setBorder(null);
        third4CardNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        third4CardNumber.setOpaque(false);
        jPanel1.add(third4CardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        last4CardNumber.setBackground(new java.awt.Color(0, 51, 102));
        last4CardNumber.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        last4CardNumber.setForeground(new java.awt.Color(255, 255, 255));
        last4CardNumber.setText("0000");
        last4CardNumber.setBorder(null);
        last4CardNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        last4CardNumber.setOpaque(false);
        jPanel1.add(last4CardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        second4CardNumber.setBackground(new java.awt.Color(0, 51, 102));
        second4CardNumber.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        second4CardNumber.setForeground(new java.awt.Color(255, 255, 255));
        second4CardNumber.setText("0000");
        second4CardNumber.setBorder(null);
        second4CardNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        second4CardNumber.setOpaque(false);
        jPanel1.add(second4CardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        first4CardNumber.setBackground(new java.awt.Color(0, 51, 102));
        first4CardNumber.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        first4CardNumber.setForeground(new java.awt.Color(255, 255, 255));
        first4CardNumber.setText("0000");
        first4CardNumber.setBorder(null);
        first4CardNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        first4CardNumber.setOpaque(false);
        jPanel1.add(first4CardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        firstlastNameTextfield.setBackground(new java.awt.Color(0, 51, 102));
        firstlastNameTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        firstlastNameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        firstlastNameTextfield.setText("FiRST LAST");
        firstlastNameTextfield.setBorder(null);
        firstlastNameTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        firstlastNameTextfield.setOpaque(false);
        jPanel1.add(firstlastNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 190, -1));

        yearTextfield.setBackground(new java.awt.Color(0, 51, 102));
        yearTextfield.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        yearTextfield.setForeground(new java.awt.Color(255, 255, 255));
        yearTextfield.setText("23");
        yearTextfield.setBorder(null);
        yearTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        yearTextfield.setOpaque(false);
        jPanel1.add(yearTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 30, 20));

        expireslabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        expireslabel.setForeground(new java.awt.Color(255, 255, 255));
        expireslabel.setText("Expires");
        jPanel1.add(expireslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        cardholderlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cardholderlabel.setForeground(new java.awt.Color(255, 255, 255));
        cardholderlabel.setText("Card Holder");
        jPanel1.add(cardholderlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        cardnumberlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cardnumberlabel.setForeground(new java.awt.Color(255, 255, 255));
        cardnumberlabel.setText("Card Number: ");
        jPanel1.add(cardnumberlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        cvcLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cvcLabel.setForeground(new java.awt.Color(255, 255, 255));
        cvcLabel.setText("CVC");
        jPanel1.add(cvcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, -1, -1));

        cvcTextField.setBackground(new java.awt.Color(0, 51, 102));
        cvcTextField.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cvcTextField.setForeground(new java.awt.Color(255, 255, 255));
        cvcTextField.setText("232");
        cvcTextField.setBorder(null);
        cvcTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        cvcTextField.setOpaque(false);
        jPanel1.add(cvcTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 40, 20));

        monthTextfield.setBackground(new java.awt.Color(0, 51, 102));
        monthTextfield.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        monthTextfield.setForeground(new java.awt.Color(255, 255, 255));
        monthTextfield.setText("03");
        monthTextfield.setBorder(null);
        monthTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        monthTextfield.setOpaque(false);
        jPanel1.add(monthTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, -1, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("/");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 20, 40));

        cardIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/image (1).png"))); // NOI18N
        jPanel1.add(cardIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        payButton.setBackground(new java.awt.Color(0, 255, 51));
        payButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        payButton.setForeground(new java.awt.Color(255, 255, 255));
        payButton.setText("Pay now");
        payButton.setBorderPainted(false);
        payButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payButtonMouseClicked(evt);
            }
        });
        jPanel1.add(payButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 470, 60));

        whitebackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/white-color-solid-background-1920x1080.png"))); // NOI18N
        whitebackground.setText("jLabel4");
        jPanel1.add(whitebackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelPaymentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPaymentsLabelMouseClicked
        int n = JOptionPane.showConfirmDialog(
                this,
                "Are you sure wants to stop the payment?",
                "Exit",
                JOptionPane.YES_NO_OPTION);

        if (n == 0) {
            this.dispose();
        }


    }//GEN-LAST:event_cancelPaymentsLabelMouseClicked

    private void payButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payButtonMouseClicked
        if (ischeckPayment() == false) {
            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
            model.setRowCount(0);
            total = 0;
            numberOfTickets = 0;
            totalPay.setText("To be paid in total: " + total + " EUR");
            numOfTicketsLabel.setText("Number of tickets: " + numberOfTickets);

            try {

                for (int i = 0; i < passengers.size(); i++) {

                    ResultSet r = lekerdezes("Select Num_of_available_seats-1 from flight_info where Flight_num_id =" + flightNum);
                    r.next();
                    int seatnum = r.getInt(1);

                    sqlUpdate("Update flight_info SET Num_of_available_seats = Num_of_available_seats-1 where Flight_num_id = " + flightNum);

                    sqlUpdate("Insert INTO passenger (Gender,FirstName, LastName, BirthDate, Luggage,Origin_country,Destination_country, OriginAirportName, DestinationAirportName, Departure_time, Arrival_time,SeatNum,Flight_num , Customer_id) VALUES ('" + passengers.get(i).getGender() + "' , '" + passengers.get(i).getFirstName() + "' , '" + passengers.get(i).getLastName() + "' , '" + passengers.get(i).getBirthdate() + "' , '" + passengers.get(i).getLuggage() + "' , '" + Origin_country + "' , '" + Destination_country + "' , '" + OriginAirportName + "' , '" + DestinationAirportName + "' , '" + Departure_time + "' , '" + Arrival_time + "' , '" + seatnum + "' , '" + flightNum + "' , '" + customerId + "')");
                    int passenger_Id = 0;
                    ResultSet result = lekerdezes("Select passenger_id from passenger where Customer_id =" + customerId + " ORDER BY passenger_id DESC LIMIT 1");
                    if (result.next()) {
                        passenger_Id = Integer.parseInt(result.getString("passenger_id"));

                    }
                    sqlUpdate("Insert INTO price_info (Passenger_name, Price, Flight_num, Customer_id, Passenger_id)  VALUES ('" + passengers.get(i).getFirstName() + " " + passengers.get(i).getLastName() + "' , '" + passengers.get(i).getPayable() + "' , '" + flightNum + "' , '" + customerId + "' , '" + passenger_Id + "')");
                    Thread.sleep(20);
                }

                this.dispose();

                sikeresFizetes();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
            }


    }//GEN-LAST:event_payButtonMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountToBePaidLabel;
    private javax.swing.JLabel cancelPaymentsLabel;
    private javax.swing.JLabel cardIconLabel;
    private javax.swing.JLabel cardholderlabel;
    private javax.swing.JLabel cardnumberlabel;
    private javax.swing.JLabel chipicon;
    private javax.swing.JLabel cvcLabel;
    private javax.swing.JTextField cvcTextField;
    private javax.swing.JLabel expireslabel;
    private javax.swing.JTextField first4CardNumber;
    private javax.swing.JTextField firstlastNameTextfield;
    private javax.swing.JLabel greybackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last4CardNumber;
    private javax.swing.JTextField monthTextfield;
    public static javax.swing.JButton payButton;
    private javax.swing.JLabel payments2Title;
    private javax.swing.JLabel paymentsTitle;
    private javax.swing.JTextField second4CardNumber;
    private javax.swing.JTextField third4CardNumber;
    private javax.swing.JLabel topaylabel;
    private javax.swing.JLabel visaicon;
    private javax.swing.JLabel whitebackground;
    private javax.swing.JTextField yearTextfield;
    // End of variables declaration//GEN-END:variables
}
