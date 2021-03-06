package szakdolgozat;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.time.LocalDate;

import java.time.ZoneId;

import java.util.Calendar;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import static szakdolgozat.Kezdooldal.Origin_country;
import static szakdolgozat.Kezdooldal.Destination_country;
import static szakdolgozat.Kezdooldal.OriginAirportName;
import static szakdolgozat.Kezdooldal.DestinationAirportName;
import static szakdolgozat.Kezdooldal.Departure_time;
import static szakdolgozat.Kezdooldal.Arrival_time;
import static szakdolgozat.Kezdooldal.flightNum;
import static szakdolgozat.Kezdooldal.cartTable;
import static szakdolgozat.Kezdooldal.basePrice;
import static szakdolgozat.PassengersInfo.passengers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Passenger extends javax.swing.JFrame {

    public static int numberOfTickets;
    public static long PassengerAge;
    public static String firstName, lastName, gender, luggage, birthdate;
    public static int price;

    private int luggagePrice;

    public Passenger() {
        initComponents();

        comboBoxFeltolt();

        NotaskingRadioButton.setOpaque(false);
        luggage1.setOpaque(false);
        luggage2.setOpaque(false);
        luggage3.setOpaque(false);
        luggage4.setOpaque(false);
        luggage5.setOpaque(false);
        NotaskingRadioButton.setSelected(true);

        mozgato();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lastNameLabel = new javax.swing.JLabel();
        LastNamePassengerTextfield = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firtsNamePassengerTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox();
        passengerGenderLabel = new javax.swing.JLabel();
        NotaskingRadioButton = new javax.swing.JRadioButton();
        luggage1 = new javax.swing.JRadioButton();
        luggage2 = new javax.swing.JRadioButton();
        luggage5 = new javax.swing.JRadioButton();
        luggage3 = new javax.swing.JRadioButton();
        luggage4 = new javax.swing.JRadioButton();
        luggageLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        passengerGenderLabel1 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox();
        MonthComboBox = new javax.swing.JComboBox();
        dayComboBox = new javax.swing.JComboBox();
        passengerGenderLabel2 = new javax.swing.JLabel();
        passengerGenderLabel3 = new javax.swing.JLabel();
        passengerGenderLabel4 = new javax.swing.JLabel();
        passengerBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name: ");
        jPanel1.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        LastNamePassengerTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(LastNamePassengerTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 260, 40));

        firstNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name: ");
        jPanel1.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        firtsNamePassengerTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(firtsNamePassengerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 260, 40));

        genderComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Man", "Women" }));
        jPanel1.add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        passengerGenderLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passengerGenderLabel.setForeground(new java.awt.Color(255, 255, 255));
        passengerGenderLabel.setText("Gender: ");
        jPanel1.add(passengerGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 20));

        NotaskingRadioButton.setBackground(new java.awt.Color(102, 102, 102));
        NotaskingRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        NotaskingRadioButton.setText("I am not asking (0 EUR)");
        jPanel1.add(NotaskingRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        luggage1.setBackground(new java.awt.Color(102, 102, 102));
        luggage1.setForeground(new java.awt.Color(255, 255, 255));
        luggage1.setText("1 piece of 10 kg Checked Baggage (55 x 40 x 20 cm) + 29 EUR");
        jPanel1.add(luggage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        luggage2.setBackground(new java.awt.Color(102, 102, 102));
        luggage2.setForeground(new java.awt.Color(255, 255, 255));
        luggage2.setText("1 piece of checked baggage weighing 20 kg (119 x 119 x 81 cm) + 48 EUR");
        jPanel1.add(luggage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        luggage5.setBackground(new java.awt.Color(102, 102, 102));
        luggage5.setForeground(new java.awt.Color(255, 255, 255));
        luggage5.setText("1 piece of 10 kg Checked Baggage (55 x 40 x 20 cm) and 2 pieces of 20 kg Checked Baggage (119 x 119 x 81 cm) + 120 EUR");
        jPanel1.add(luggage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        luggage3.setBackground(new java.awt.Color(102, 102, 102));
        luggage3.setForeground(new java.awt.Color(255, 255, 255));
        luggage3.setText("1 piece of 10 kg Checked Baggage (55 x 40 x 20 cm) and 1 piece of 20 kg Checked Baggage (119 x 119 x 81 cm) + 75 EUR ");
        jPanel1.add(luggage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        luggage4.setBackground(new java.awt.Color(102, 102, 102));
        luggage4.setForeground(new java.awt.Color(255, 255, 255));
        luggage4.setText("2 pieces of 20 kg Checked Baggage (119 x 119 x 81 cm) + 94 EUR");
        jPanel1.add(luggage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        luggageLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        luggageLabel.setForeground(new java.awt.Color(255, 255, 255));
        luggageLabel.setText("Luggage for the whole trip:");
        jPanel1.add(luggageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        saveButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, -1, 40));

        passengerGenderLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passengerGenderLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passengerGenderLabel1.setText("Birth date: ");
        jPanel1.add(passengerGenderLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        jPanel1.add(yearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        MonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(MonthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        jPanel1.add(dayComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        passengerGenderLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passengerGenderLabel2.setForeground(new java.awt.Color(255, 255, 255));
        passengerGenderLabel2.setText("month: ");
        jPanel1.add(passengerGenderLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 20));

        passengerGenderLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passengerGenderLabel3.setForeground(new java.awt.Color(255, 255, 255));
        passengerGenderLabel3.setText("day:");
        jPanel1.add(passengerGenderLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, 20));

        passengerGenderLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passengerGenderLabel4.setForeground(new java.awt.Color(255, 255, 255));
        passengerGenderLabel4.setText("Year: ");
        jPanel1.add(passengerGenderLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 20));

        passengerBackground.setBackground(new java.awt.Color(102, 102, 102));
        passengerBackground.setForeground(new java.awt.Color(255, 255, 255));
        passengerBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/80301f1d6a1b8c3219d7cb286d58a715.jpg"))); // NOI18N
        jPanel1.add(passengerBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-520, -210, 1760, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int checkAge(int age) {

        if (age < 2) {
            return 20;
        }

        if (age <= 14 && age >= 2) {
            return 15;
        }

        if (age >= 15 && age <= 17) {
            return 10;

        }

        return 0;

    }
    int posX, posY;

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

    private int calculatePassengerTicketPrice() {

        int promotion = checkAge((int) getdifferenceInYears());

        int amount = (int) (basePrice - (basePrice * ((double) promotion / (double) 100)));

        return amount;

    }


    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        if (isPassengerError() == false) {

            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
            model.addRow(
                    new Object[]{
                        firtsNamePassengerTextField.getText() + " " + LastNamePassengerTextfield.getText(),
                        selectedLuggage(),
                        Origin_country + ", " + OriginAirportName,
                        Destination_country + ", " + DestinationAirportName,
                        Departure_time,
                        Arrival_time,
                        flightNum,
                        luggagePrice + calculatePassengerTicketPrice() + " EUR"}
            );
            numberOfTickets = cartTable.getRowCount();
            firstName = firtsNamePassengerTextField.getText();
            lastName = LastNamePassengerTextfield.getText();
            gender = (String) genderComboBox.getSelectedItem();
            luggage = selectedLuggage();
            birthdate = yearComboBox.getSelectedItem() + "-" + MonthComboBox.getSelectedItem() + "-" + dayComboBox.getSelectedItem();

            passengers.add(new PassengerInfo(firstName, lastName, gender, birthdate, luggage, luggagePrice + calculatePassengerTicketPrice()));

            this.dispose();
        }


    }//GEN-LAST:event_saveButtonActionPerformed

    public void errorPopUp(String text) {
        JOptionPane.showMessageDialog(this,
                text,
                "Error",
                JOptionPane.ERROR_MESSAGE);

    }

    public static int objectToInt(Object obj) {
        int x = ((Number) obj).intValue();
        return x;
    }

    private long getdifferenceInYears() {

        int ev = objectToInt(this.yearComboBox.getSelectedItem());
        int honap = objectToInt(this.MonthComboBox.getSelectedItem());
        int nap = objectToInt(this.dayComboBox.getSelectedItem());
        LocalDate start = LocalDate.of(ev, honap, nap);
        LocalDate stop = LocalDate.now(ZoneId.of("Europe/Luxembourg"));
        long years = java.time.temporal.ChronoUnit.YEARS.between(start, stop);

        return years;
    }

    public boolean isPassengerError() {

        int db = 0;

        if (NotaskingRadioButton.isSelected()) {
            db++;

        }
        if (luggage1.isSelected()) {

            db++;

        }
        if (luggage2.isSelected()) {

            db++;

        }
        if (luggage3.isSelected()) {

            db++;

        }
        if (luggage4.isSelected()) {

            db++;

        }
        if (luggage5.isSelected()) {

            db++;

        }
        if (db > 1) {
            errorPopUp("Please select only one luggage!");
            return true;
        }

        if (db == 0) {
            errorPopUp("Please choose a luggage option!");
            return true;
        }
        if (firtsNamePassengerTextField.getText().matches("")) {
            errorPopUp("Please write a first name!");
            return true;
        }
        if (LastNamePassengerTextfield.getText().matches("")) {
            errorPopUp("Please write a last name!");
        }

        if (!Character.isUpperCase(firtsNamePassengerTextField.getText().charAt(0))) {

            errorPopUp("First Name needs to start with uppercase!");

            return true;
        }

        char[] chars2 = firtsNamePassengerTextField.getText().toCharArray();

        for (char c : chars2) {
            if (!Character.isLetter(c)) {
                errorPopUp("First Name can contains only letters!");
                return true;
            }
        }

        char[] chars = LastNamePassengerTextfield.getText().toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                errorPopUp("Last Name can contains only letters!");
                return true;
            }
        }
        if (!Character.isUpperCase(LastNamePassengerTextfield.getText().charAt(0))) {

            errorPopUp("Last Name needs to start with uppercase!");
            return true;
        }

        return false;

    }

    private String selectedLuggage() {

        if (NotaskingRadioButton.isSelected()) {

            return NotaskingRadioButton.getText();
        } else if (luggage1.isSelected()) {
            luggagePrice += 29;
            return luggage1.getText();
        } else if (luggage2.isSelected()) {
            luggagePrice += 48;
            return luggage2.getText();
        } else if (luggage3.isSelected()) {
            luggagePrice += 75;
            return luggage3.getText();
        } else if (luggage4.isSelected()) {
            luggagePrice += 94;
            return luggage4.getText();
        } else if (luggage5.isSelected()) {
            luggagePrice += 120;
            return luggage5.getText();
        }

        return "";
    }


    private void MonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthComboBoxActionPerformed
        String month = MonthComboBox.getSelectedItem() + "";
        if (month.matches("02")) {
            for (int i = 1; i <= 29; i++) {
                dayComboBox.addItem(new Integer(i));
            }
        } else if (month.matches("01") || month.matches("03") || month.matches("05") || month.matches("08") || month.matches("10") || month.matches("12")) {
            for (int i = 1; i <= 31; i++) {
                dayComboBox.addItem(new Integer(i));
            }
        } else {
            for (int i = 1; i <= 30; i++) {
                dayComboBox.addItem(new Integer(i));
            }

        }
    }//GEN-LAST:event_MonthComboBoxActionPerformed
    public void comboBoxFeltolt() {
        String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        for (int i = 1950; i <= Calendar.getInstance().get(Calendar.YEAR); i++) {
            yearComboBox.addItem(new Integer(i));
        }

        for (int i = 0; i < months.length; i++) {
            MonthComboBox.addItem(new Integer(months[i]));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LastNamePassengerTextfield;
    private javax.swing.JComboBox MonthComboBox;
    private javax.swing.JRadioButton NotaskingRadioButton;
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firtsNamePassengerTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton luggage1;
    private javax.swing.JRadioButton luggage2;
    private javax.swing.JRadioButton luggage3;
    private javax.swing.JRadioButton luggage4;
    private javax.swing.JRadioButton luggage5;
    private javax.swing.JLabel luggageLabel;
    private javax.swing.JLabel passengerBackground;
    private javax.swing.JLabel passengerGenderLabel;
    private javax.swing.JLabel passengerGenderLabel1;
    private javax.swing.JLabel passengerGenderLabel2;
    private javax.swing.JLabel passengerGenderLabel3;
    private javax.swing.JLabel passengerGenderLabel4;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
}
