package szakdolgozat;

import java.sql.Connection;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.swing.table.TableRowSorter;
import javax.xml.bind.DatatypeConverter;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

/**
 *
 * @author Juhász Levente
 */
public class Kezdooldal extends javax.swing.JFrame {

    private ArrayList<User> users;
    private int jegyekszama;

    public static int customerId;

    public Kezdooldal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        loginEmailLabel = new javax.swing.JLabel();
        FlywithusJlabel = new javax.swing.JLabel();
        ComeJlabel = new javax.swing.JLabel();
        loginEmailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        logginButton = new javax.swing.JButton();
        leftBackgroundLabel = new javax.swing.JLabel();
        registrationLabel = new javax.swing.JLabel();
        loginErrorLabel = new javax.swing.JLabel();
        bluebackgroundLabel = new javax.swing.JLabel();
        RegistrationPanel = new javax.swing.JPanel();
        streetTextfield = new javax.swing.JTextField();
        cityTextfield = new javax.swing.JTextField();
        zipCodeTextfield = new javax.swing.JTextField();
        lastNameTextfield = new javax.swing.JTextField();
        firstNameTextfield = new javax.swing.JTextField();
        countryTextfield = new javax.swing.JTextField();
        phoneNumberTextfield = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        passwordAgainLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        manRadioButton = new javax.swing.JRadioButton();
        womanRadioButton = new javax.swing.JRadioButton();
        registartionLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        registrationButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        firstNameErrorLabel = new javax.swing.JLabel();
        emailErrorLabel = new javax.swing.JLabel();
        lastNameErrorLabel = new javax.swing.JLabel();
        streetErrorLabel = new javax.swing.JLabel();
        zipCodeErrorLabel = new javax.swing.JLabel();
        cityErrorLabel = new javax.swing.JLabel();
        countryErrorLabel = new javax.swing.JLabel();
        phoneNumberErrorLabel = new javax.swing.JLabel();
        succesfullRegistrationLabel = new javax.swing.JLabel();
        emailTextfield = new javax.swing.JTextField();
        registrationPasswordAgainTextField = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        registrationPasswordTextField = new javax.swing.JPasswordField();
        registrationPasswordLabel = new javax.swing.JLabel();
        registrationPasswordErrorHandlingLabel = new javax.swing.JLabel();
        genderErrorLabel = new javax.swing.JLabel();
        luggagePic = new javax.swing.JLabel();
        AdminPanel = new javax.swing.JPanel();
        departureTimeLabel = new javax.swing.JLabel();
        arrivalTimeLabel = new javax.swing.JLabel();
        originPlaceLabel = new javax.swing.JLabel();
        destinationPlaceLabel = new javax.swing.JLabel();
        numberOfSeats = new javax.swing.JLabel();
        numberOfSeatsTextField = new javax.swing.JTextField();
        adminRegisterFlightButton = new javax.swing.JButton();
        adminBackButton = new javax.swing.JButton();
        deleteButon = new javax.swing.JButton();
        destinationCountryComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addFlightTable = new javax.swing.JTable();
        adminErrorLabel = new javax.swing.JLabel();
        originAirportNameComboBox = new javax.swing.JComboBox();
        departureTimejDateChooser = new com.toedter.calendar.JDateChooser();
        arrivalTImejDateChooser = new com.toedter.calendar.JDateChooser();
        departureTimeHourComboBox = new javax.swing.JComboBox();
        departureTimeMinuteComboBox = new javax.swing.JComboBox();
        ArrivalTimeHourComboBox = new javax.swing.JComboBox();
        ArrivalTimeMinComboBox = new javax.swing.JComboBox();
        originCountryComboBox = new javax.swing.JComboBox();
        depHourLabel = new javax.swing.JLabel();
        depMinLabel = new javax.swing.JLabel();
        arrHourLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        originPlaceLabel1 = new javax.swing.JLabel();
        destinationPlaceLabel1 = new javax.swing.JLabel();
        destinationAirportNameComboBox = new javax.swing.JComboBox<>();
        ManageFlightButton = new javax.swing.JButton();
        searchTextfield = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        UserPanel = new javax.swing.JPanel();
        myTicketsLabel = new javax.swing.JLabel();
        buyTicketsLabel = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        buyTicketsPanel = new javax.swing.JPanel();
        buyTicketsJscrollPane = new javax.swing.JScrollPane();
        BuyTicketsTable = new javax.swing.JTable();
        ourDepartingFlightsLabel = new javax.swing.JLabel();
        reservationButton = new javax.swing.JButton();
        userDestinationCountryLabel = new javax.swing.JLabel();
        buyTicketsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        youngComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        infantComboBox = new javax.swing.JComboBox();
        adultComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        kidComboBox = new javax.swing.JComboBox();
        destinationTextField = new javax.swing.JTextField();
        passengerData = new javax.swing.JButton();
        userBackgroundLabel = new javax.swing.JLabel();
        myTicketsjScrollPane = new javax.swing.JScrollPane();
        myTicketsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1150, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setMinimumSize(new java.awt.Dimension(1150, 700));
        loginPanel.setPreferredSize(new java.awt.Dimension(1150, 700));
        loginPanel.setVerifyInputWhenFocusTarget(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLabel.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Jelszó:");
        passwordLabel.setToolTipText("");
        loginPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 190, 30));

        loginEmailLabel.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        loginEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginEmailLabel.setText("Felhasználónév:");
        loginEmailLabel.setToolTipText("");
        loginPanel.add(loginEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 190, 30));

        FlywithusJlabel.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        FlywithusJlabel.setForeground(new java.awt.Color(0, 51, 102));
        FlywithusJlabel.setText("FLY WITH US");
        loginPanel.add(FlywithusJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 320, 80));

        ComeJlabel.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        ComeJlabel.setForeground(new java.awt.Color(0, 51, 102));
        ComeJlabel.setText("COME ");
        loginPanel.add(ComeJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, 50));

        loginEmailTextField.setBackground(new java.awt.Color(255, 255, 255));
        loginEmailTextField.setForeground(new java.awt.Color(0, 0, 0));
        loginEmailTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEmailTextFieldActionPerformed(evt);
            }
        });
        loginPanel.add(loginEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 320, 30));

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        passwordTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginPanel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 320, 30));

        logginButton.setBackground(new java.awt.Color(0, 0, 0));
        logginButton.setForeground(new java.awt.Color(255, 255, 255));
        logginButton.setText("Belépés");
        logginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logginButtonActionPerformed(evt);
            }
        });
        loginPanel.add(logginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 90, 40));

        leftBackgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/LeftPanelBackGround.jpg"))); // NOI18N
        loginPanel.add(leftBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 700));

        registrationLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registrationLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrationLabel.setText("Regisztráció");
        registrationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationLabelMouseClicked(evt);
            }
        });
        loginPanel.add(registrationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 650, -1, -1));

        loginErrorLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        loginPanel.add(loginErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        bluebackgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bluebackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/asd.jpg"))); // NOI18N
        loginPanel.add(bluebackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 750, 700));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        RegistrationPanel.setMaximumSize(new java.awt.Dimension(1150, 700));
        RegistrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        streetTextfield.setBackground(new java.awt.Color(51, 51, 51));
        streetTextfield.setForeground(new java.awt.Color(255, 255, 255));
        streetTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        streetTextfield.setText(" óvoda utca 23.");
        streetTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        streetTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        streetTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTextfieldActionPerformed(evt);
            }
        });
        RegistrationPanel.add(streetTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 240, 30));

        cityTextfield.setBackground(new java.awt.Color(51, 51, 51));
        cityTextfield.setForeground(new java.awt.Color(255, 255, 255));
        cityTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cityTextfield.setText("Kecskéd");
        cityTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cityTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(cityTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 30));

        zipCodeTextfield.setBackground(new java.awt.Color(51, 51, 51));
        zipCodeTextfield.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        zipCodeTextfield.setText("1232");
        zipCodeTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zipCodeTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(zipCodeTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 240, 30));

        lastNameTextfield.setBackground(new java.awt.Color(51, 51, 51));
        lastNameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        lastNameTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastNameTextfield.setText("Levente");
        lastNameTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lastNameTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(lastNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 240, 30));

        firstNameTextfield.setBackground(new java.awt.Color(51, 51, 51));
        firstNameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        firstNameTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstNameTextfield.setText("Juhasz");
        firstNameTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        firstNameTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(firstNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 240, 30));

        countryTextfield.setBackground(new java.awt.Color(51, 51, 51));
        countryTextfield.setForeground(new java.awt.Color(255, 255, 255));
        countryTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        countryTextfield.setText("Hungary");
        countryTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countryTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(countryTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 240, 30));

        phoneNumberTextfield.setBackground(new java.awt.Color(51, 51, 51));
        phoneNumberTextfield.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNumberTextfield.setText("20 238 6025");
        phoneNumberTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        phoneNumberTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(phoneNumberTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 240, 30));

        lastNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setText("Last Name: ");
        RegistrationPanel.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        streetLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        streetLabel.setForeground(new java.awt.Color(0, 0, 0));
        streetLabel.setText("Street: ");
        RegistrationPanel.add(streetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        contactNumberLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contactNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        contactNumberLabel.setText("Zip Code: ");
        RegistrationPanel.add(contactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        cityLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(0, 0, 0));
        cityLabel.setText("City: ");
        RegistrationPanel.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        countryLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(0, 0, 0));
        countryLabel.setText("Country: ");
        RegistrationPanel.add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        phoneNumberLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberLabel.setText("Phone Number: ");
        RegistrationPanel.add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        passwordAgainLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passwordAgainLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordAgainLabel.setText("Password again: ");
        RegistrationPanel.add(passwordAgainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        firstNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setText("First Name: ");
        RegistrationPanel.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        manRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        manRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        manRadioButton.setText("Man");
        manRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manRadioButtonActionPerformed(evt);
            }
        });
        RegistrationPanel.add(manRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        womanRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        womanRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        womanRadioButton.setText("Woman");
        womanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womanRadioButtonActionPerformed(evt);
            }
        });
        RegistrationPanel.add(womanRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        registartionLabel.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        registartionLabel.setForeground(new java.awt.Color(0, 0, 0));
        registartionLabel.setText("Registration");
        registartionLabel.setToolTipText("");
        RegistrationPanel.add(registartionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        RegistrationPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 50));

        registrationButton.setBackground(new java.awt.Color(0, 0, 0));
        registrationButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registrationButton.setForeground(new java.awt.Color(255, 255, 255));
        registrationButton.setText("Registration");
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });
        RegistrationPanel.add(registrationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 140, 50));

        genderLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 0, 0));
        genderLabel.setText("gender: ");
        RegistrationPanel.add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        firstNameErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        firstNameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(firstNameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 220, 20));

        emailErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(emailErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 240, 20));

        lastNameErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lastNameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(lastNameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 280, 20));

        streetErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        streetErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(streetErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 290, 20));

        zipCodeErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        zipCodeErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(zipCodeErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 280, 20));

        cityErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cityErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(cityErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 270, 20));

        countryErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        countryErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(countryErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 300, 20));

        phoneNumberErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        phoneNumberErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        RegistrationPanel.add(phoneNumberErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 250, 20));

        succesfullRegistrationLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        succesfullRegistrationLabel.setForeground(new java.awt.Color(0, 0, 0));
        RegistrationPanel.add(succesfullRegistrationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, -1, -1));

        emailTextfield.setBackground(new java.awt.Color(51, 51, 51));
        emailTextfield.setForeground(new java.awt.Color(255, 255, 255));
        emailTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTextfield.setText("leventejuhasz2002@gmail.com");
        emailTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(emailTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 240, 30));

        registrationPasswordAgainTextField.setBackground(new java.awt.Color(51, 51, 51));
        registrationPasswordAgainTextField.setForeground(new java.awt.Color(255, 255, 255));
        registrationPasswordAgainTextField.setText("232213231");
        registrationPasswordAgainTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrationPasswordAgainTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationPasswordAgainTextFieldActionPerformed(evt);
            }
        });
        RegistrationPanel.add(registrationPasswordAgainTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 240, 30));

        emailLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("Email: ");
        RegistrationPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        registrationPasswordTextField.setBackground(new java.awt.Color(51, 51, 51));
        registrationPasswordTextField.setForeground(new java.awt.Color(255, 255, 255));
        registrationPasswordTextField.setText("232213231");
        registrationPasswordTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegistrationPanel.add(registrationPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 240, 30));

        registrationPasswordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registrationPasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        registrationPasswordLabel.setText("Password: ");
        RegistrationPanel.add(registrationPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        registrationPasswordErrorHandlingLabel.setForeground(new java.awt.Color(255, 0, 51));
        RegistrationPanel.add(registrationPasswordErrorHandlingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        genderErrorLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        genderErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        RegistrationPanel.add(genderErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));
        RegistrationPanel.add(luggagePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        getContentPane().add(RegistrationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        AdminPanel.setMaximumSize(new java.awt.Dimension(1150, 700));
        AdminPanel.setMinimumSize(new java.awt.Dimension(1150, 700));
        AdminPanel.setPreferredSize(new java.awt.Dimension(1150, 700));
        AdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        departureTimeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        departureTimeLabel.setForeground(new java.awt.Color(0, 0, 0));
        departureTimeLabel.setText("Departure Time: ");
        AdminPanel.add(departureTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        arrivalTimeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        arrivalTimeLabel.setForeground(new java.awt.Color(0, 0, 0));
        arrivalTimeLabel.setText("Arrival Time: ");
        AdminPanel.add(arrivalTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        originPlaceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        originPlaceLabel.setForeground(new java.awt.Color(0, 0, 0));
        originPlaceLabel.setText("Origin Airport Name: ");
        AdminPanel.add(originPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 200, 30));

        destinationPlaceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        destinationPlaceLabel.setForeground(new java.awt.Color(0, 0, 0));
        destinationPlaceLabel.setText("Destination Airport Name: ");
        AdminPanel.add(destinationPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 190, 30));

        numberOfSeats.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numberOfSeats.setForeground(new java.awt.Color(0, 0, 0));
        numberOfSeats.setText("Number of Seats: ");
        AdminPanel.add(numberOfSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, -1, 30));

        numberOfSeatsTextField.setText("100");
        numberOfSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfSeatsTextFieldActionPerformed(evt);
            }
        });
        AdminPanel.add(numberOfSeatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 50, -1));

        adminRegisterFlightButton.setBackground(new java.awt.Color(0, 0, 0));
        adminRegisterFlightButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adminRegisterFlightButton.setForeground(new java.awt.Color(255, 255, 255));
        adminRegisterFlightButton.setText("Register");
        adminRegisterFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRegisterFlightButtonActionPerformed(evt);
            }
        });
        AdminPanel.add(adminRegisterFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 110, 50));

        adminBackButton.setBackground(new java.awt.Color(0, 0, 0));
        adminBackButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adminBackButton.setForeground(new java.awt.Color(255, 255, 255));
        adminBackButton.setText("Back");
        adminBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackButtonActionPerformed(evt);
            }
        });
        AdminPanel.add(adminBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 100, 40));

        deleteButon.setBackground(new java.awt.Color(0, 0, 0));
        deleteButon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteButon.setForeground(new java.awt.Color(255, 255, 255));
        deleteButon.setText("Delete Flight");
        deleteButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightButonActionPerformed(evt);
            }
        });
        AdminPanel.add(deleteButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 140, 50));

        destinationCountryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destinationCountryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinationCountryComboBoxItemStateChanged(evt);
            }
        });
        AdminPanel.add(destinationCountryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 290, 30));

        addFlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departure Time", "Arrival Time", "Origin Place", "Origin Airport Name", "Destination Airport Name", "Destination Place", "Number of Seats", "Flight Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(addFlightTable);

        AdminPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1150, 210));

        adminErrorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adminErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        AdminPanel.add(adminErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, -1, -1));

        originAirportNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                originAirportNameComboBoxItemStateChanged(evt);
            }
        });
        AdminPanel.add(originAirportNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 290, 30));
        AdminPanel.add(departureTimejDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, -1));
        AdminPanel.add(arrivalTImejDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 210, -1));

        departureTimeHourComboBox.setMaximumRowCount(24);
        departureTimeHourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        AdminPanel.add(departureTimeHourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 60, 30));

        departureTimeMinuteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        AdminPanel.add(departureTimeMinuteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 60, 30));

        ArrivalTimeHourComboBox.setMaximumRowCount(24);
        ArrivalTimeHourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        AdminPanel.add(ArrivalTimeHourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 60, 30));

        ArrivalTimeMinComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        AdminPanel.add(ArrivalTimeMinComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 60, 30));

        originCountryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        originCountryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                originCountryComboBoxItemStateChanged(evt);
            }
        });
        AdminPanel.add(originCountryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 290, 30));

        depHourLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        depHourLabel.setForeground(new java.awt.Color(0, 0, 0));
        depHourLabel.setText("Hour:");
        AdminPanel.add(depHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, 30));

        depMinLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        depMinLabel.setForeground(new java.awt.Color(0, 0, 0));
        depMinLabel.setText("Minute:");
        AdminPanel.add(depMinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, 30));

        arrHourLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        arrHourLabel.setForeground(new java.awt.Color(0, 0, 0));
        arrHourLabel.setText("Hour:");
        AdminPanel.add(arrHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Minute: ");
        AdminPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, 30));

        originPlaceLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        originPlaceLabel1.setForeground(new java.awt.Color(0, 0, 0));
        originPlaceLabel1.setText("Origin Country: ");
        AdminPanel.add(originPlaceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 180, 30));

        destinationPlaceLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        destinationPlaceLabel1.setForeground(new java.awt.Color(0, 0, 0));
        destinationPlaceLabel1.setText("Destination Country: ");
        AdminPanel.add(destinationPlaceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, 30));

        AdminPanel.add(destinationAirportNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 290, 30));

        ManageFlightButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageFlightButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ManageFlightButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageFlightButton.setText("Manage Flight");
        ManageFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageFlightButonActionPerformed(evt);
            }
        });
        AdminPanel.add(ManageFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 310, 160, 50));

        searchTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextfieldKeyReleased(evt);
            }
        });
        AdminPanel.add(searchTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 300, 50));

        searchLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(0, 0, 0));
        searchLabel.setText("Search Flight:");
        AdminPanel.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/2560px-F1_light_blue_flag.svg.png"))); // NOI18N
        background.setText("jLabel1");
        AdminPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-560, -70, -1, -1));

        getContentPane().add(AdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        UserPanel.setMaximumSize(new java.awt.Dimension(1150, 700));
        UserPanel.setMinimumSize(new java.awt.Dimension(1150, 700));
        UserPanel.setName(""); // NOI18N
        UserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myTicketsLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        myTicketsLabel.setForeground(new java.awt.Color(102, 255, 255));
        myTicketsLabel.setText("My tickets");
        myTicketsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTicketsLabelMouseClicked(evt);
            }
        });
        UserPanel.add(myTicketsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buyTicketsLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buyTicketsLabel.setForeground(new java.awt.Color(102, 255, 255));
        buyTicketsLabel.setText("Buy Ticket");
        buyTicketsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyTicketsLabelMouseClicked(evt);
            }
        });
        UserPanel.add(buyTicketsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        logOutLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(102, 255, 255));
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });
        UserPanel.add(logOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        buyTicketsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuyTicketsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
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
                "Departure Time", "Arrival Time", "Origin Country", "Origin Airport Name", "Destination Country", "Destination Aiport Name", "Remaining tickets", "Flight Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        buyTicketsJscrollPane.setViewportView(BuyTicketsTable);

        buyTicketsPanel.add(buyTicketsJscrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1030, 230));

        ourDepartingFlightsLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ourDepartingFlightsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ourDepartingFlightsLabel.setText("Our departing flights");
        buyTicketsPanel.add(ourDepartingFlightsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        reservationButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reservationButton.setForeground(new java.awt.Color(0, 0, 0));
        reservationButton.setText("Reservation of seats");
        reservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationButtonActionPerformed(evt);
            }
        });
        buyTicketsPanel.add(reservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 220, 40));

        userDestinationCountryLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        userDestinationCountryLabel.setForeground(new java.awt.Color(255, 255, 255));
        userDestinationCountryLabel.setText("Destination Country: ");
        buyTicketsPanel.add(userDestinationCountryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        buyTicketsButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buyTicketsButton.setForeground(new java.awt.Color(0, 0, 0));
        buyTicketsButton.setText("Buy tickets");
        buyTicketsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyTicketsButtonActionPerformed(evt);
            }
        });
        buyTicketsPanel.add(buyTicketsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("How many tickets do you want to buy?");
        buyTicketsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        youngComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        buyTicketsPanel.add(youngComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 70, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adult (17 year+)");
        buyTicketsPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 110, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Young (12-16)");
        buyTicketsPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 110, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kid (2-11year)");
        buyTicketsPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 130, -1));

        infantComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        buyTicketsPanel.add(infantComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 70, 30));

        adultComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        buyTicketsPanel.add(adultComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 70, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Infant(Under 2 year)");
        buyTicketsPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 150, -1));

        kidComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        buyTicketsPanel.add(kidComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 70, 30));

        destinationTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        destinationTextField.setForeground(new java.awt.Color(0, 0, 0));
        destinationTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                destinationTextFieldKeyReleased(evt);
            }
        });
        buyTicketsPanel.add(destinationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 30));

        passengerData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passengerData.setForeground(new java.awt.Color(0, 0, 0));
        passengerData.setText("Passenger Data");
        buyTicketsPanel.add(passengerData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 180, 40));

        UserPanel.add(buyTicketsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 1040, 670));

        userBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/80301f1d6a1b8c3219d7cb286d58a715.jpg"))); // NOI18N
        userBackgroundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userBackgroundLabel.setMaximumSize(null);
        userBackgroundLabel.setMinimumSize(null);
        userBackgroundLabel.setName(""); // NOI18N
        userBackgroundLabel.setPreferredSize(null);
        UserPanel.add(userBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        myTicketsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        myTicketsjScrollPane.setViewportView(myTicketsTable);

        UserPanel.add(myTicketsjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 280, -1, -1));

        getContentPane().add(UserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginEmailTextFieldActionPerformed

    private void womanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womanRadioButtonActionPerformed
        if (this.womanRadioButton.isSelected()) {
            this.manRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_womanRadioButtonActionPerformed


    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        dontShowRegistrationPanel();
        ShowLoginPanel();


    }//GEN-LAST:event_backButtonMouseClicked

    private void manRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manRadioButtonActionPerformed
        if (this.manRadioButton.isSelected()) {
            this.womanRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_manRadioButtonActionPerformed


    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed

        if (isRegistrationErrorHandling() == true) {
            String firstName = firstNameTextfield.getText();
            String lastName = lastNameTextfield.getText();
            String adress = streetTextfield.getText();
            int contactNumber = Integer.parseInt(zipCodeTextfield.getText());
            String city = cityTextfield.getText();
            String country = countryTextfield.getText();
            String phoneNumber = phoneNumberTextfield.getText();
            String email = emailTextfield.getText();

            String gender = "";
            if (this.womanRadioButton.isSelected()) {
                gender = this.womanRadioButton.getText();
            } else {
                gender = this.manRadioButton.getText();
            }

            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
            }
            md.update(registrationPasswordTextField.getText().getBytes());
            byte[] digest = md.digest();

            String password = "";
            password = DatatypeConverter.printHexBinary(digest).toUpperCase();

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");

                Statement smt = con.createStatement();

                smt.executeUpdate("INSERT INTO registration_info(FirstName,LastName,Address,zipCode,City,Country,phoneNumber,Gender,Email, CustomerPassword ) VALUES ('" + firstName + "' , '" + lastName + "' , '" + adress + "' , '" + contactNumber + "' , '" + city + "' , '" + country + "' , '" + phoneNumber + "' , '" + gender + "' , '" + email + "', '" + password + "' );");

                con.close();

            } catch (Exception e) {

                System.out.println();
                System.out.println("Hiba: " + e);
            }
            succesfullRegistrationLabel.setText("Sikeres Regisztráció!");
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Sikeres Regisztráció!");
            jFrame.setLocationRelativeTo(RegistrationPanel);

        } else {

            succesfullRegistrationLabel.setText("Sikertelen Regisztráció!");
        }


    }//GEN-LAST:event_registrationButtonActionPerformed


    private void numberOfSeatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfSeatsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfSeatsTextFieldActionPerformed
    private DefaultTableModel model;

    public void keepFlightsData() {

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

            String columns[] = {addFlightTable.getColumnName(0), addFlightTable.getColumnName(1), addFlightTable.getColumnName(2), addFlightTable.getColumnName(3), addFlightTable.getColumnName(4), addFlightTable.getColumnName(5), addFlightTable.getColumnName(6)};
            String data[][] = new String[count][addFlightTable.getColumnCount()];

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

            model = new DefaultTableModel(data, columns);
            addFlightTable.setModel(model);
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    private void Filter(String text, DefaultTableModel dm) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        addFlightTable.setRowSorter(tr);
        BuyTicketsTable.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(text));

    }

    private void loadtoBuyTicketsTableData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");

            String query = "Select Departure_time,Arrival_time,Origin_place, OriginAirportName, Destination_place, DestinationAirportName, Num_of_available_seats, Flight_num_id  from flight_info";
            Statement smt = con.createStatement();
            ResultSet res = smt.executeQuery(query);
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("SELECT COUNT(*) AS rowcount FROM flight_info");
            r.next();
            int count = r.getInt("rowcount");
            r.close();

            String columns[] = {BuyTicketsTable.getColumnName(0), BuyTicketsTable.getColumnName(1), BuyTicketsTable.getColumnName(2), BuyTicketsTable.getColumnName(3), BuyTicketsTable.getColumnName(4), BuyTicketsTable.getColumnName(5), BuyTicketsTable.getColumnName(6), BuyTicketsTable.getColumnName(7)};
            String data[][] = new String[count][BuyTicketsTable.getColumnCount()];

            int i = 0;
            while (res.next()) {

                String dep = res.getString("Departure_Time");
                String ati = res.getString("Arrival_Time");
                String orc = res.getString("Origin_place");
                String ora = res.getString("OriginAirportName");
                String dec = res.getString("Destination_place");
                String dea = res.getString("DestinationAirportName");
                String nos = res.getString("Num_of_available_seats");
                String fid = res.getString("Flight_num_id");
                data[i][0] = dep;
                data[i][1] = ati;
                data[i][2] = orc;
                data[i][3] = ora;
                data[i][4] = dec;
                data[i][5] = dea;
                data[i][6] = nos;
                data[i][7] = fid;

                i++;

            }

            for (int d = 0; d < count; d++) {
                for (int j = 0; j < BuyTicketsTable.getColumnCount(); j++) {
                    if (Integer.parseInt(data[d][6]) < 0) {
                        data[d][6] = "0";
                    }
                }
            }

            model = new DefaultTableModel(data, columns);
            BuyTicketsTable.setModel(model);
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    private void logginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logginButtonActionPerformed

        boolean hibasAdat = true;

        if (checkAdmin()) {
            dontShowLoginPanel();
            dontShowRegistrationPanel();
            showAdminPanel();
            System.out.println("admin");
            keepFlightsData();
            countries();
            hibasAdat = false;
        }

        if (isCheckUserLogin()) {

            dontShowLoginPanel();
            showUserPanel();
            this.buyTicketsPanel.setOpaque(false);
            loadtoBuyTicketsTableData();
            hibasAdat = false;
        }

        belepteto(hibasAdat);

    }//GEN-LAST:event_logginButtonActionPerformed

    private void belepteto(boolean hibasAdat) {
        Connection con;
        PreparedStatement ps;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");

            Statement smt = con.createStatement();

            ps = con.prepareStatement("Select CustomerId, Email, CustomerPassword From registration_info where Email LIKE '" + loginEmailTextField.getText() + "' AND CustomerPassword Like '" + md5password() + "'");
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                System.out.println("felh");

                System.out.println(result.getString("CustomerId"));
                customerId = Integer.parseInt(result.getString("CustomerId"));
            }

            if (hibasAdat == true) {

                loginErrorLabel.setText("Hibás felhasználónév vagy jelszó!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private String md5password() {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Kezdooldal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        md.update(passwordTextField.getText().getBytes());
        byte[] digest = md.digest();
        String password = DatatypeConverter.printHexBinary(digest).toUpperCase();

        return password;
    }

    private void adminBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackButtonActionPerformed
        dontShowAdminPanel();
        ShowLoginPanel();
        this.loginEmailTextField.setText("");
        this.passwordTextField.setText("");

    }//GEN-LAST:event_adminBackButtonActionPerformed

    private void streetTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetTextfieldActionPerformed

    private void registrationPasswordAgainTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationPasswordAgainTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrationPasswordAgainTextFieldActionPerformed

    private void registrationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationLabelMouseClicked

        dontShowLoginPanel();
        showRegistrationPanel();
        luggagePic();


    }//GEN-LAST:event_registrationLabelMouseClicked

    private void adminRegisterFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRegisterFlightButtonActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        String depdate = dateFormat.format(departureTimejDateChooser.getDate()) + " " + departureTimeHourComboBox.getSelectedItem() + ":" + departureTimeMinuteComboBox.getSelectedItem();
        String arrival = dateFormat.format(arrivalTImejDateChooser.getDate()) + " " + ArrivalTimeHourComboBox.getSelectedItem() + ":" + ArrivalTimeMinComboBox.getSelectedItem();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");

            Statement smt = con.createStatement();
            adminErrorLabel.setText("");
            if (adminErrorHandling() == "") {
                smt.executeUpdate("Insert Into flight_info(Departure_time, Arrival_time, Origin_place,OriginAirportName, Destination_place,DestinationAirportName, Num_of_seats, Num_of_available_seats)  VALUES ( '" + depdate + "' , '" + arrival + "' , '" + originCountryComboBox.getSelectedItem() + "' , '" + originAirportNameComboBox.getSelectedItem() + "' , '" + destinationCountryComboBox.getSelectedItem() + "' , '" + destinationAirportNameComboBox.getSelectedItem() + "' , '" + Integer.parseInt(numberOfSeatsTextField.getText()) + "' , '" + Integer.parseInt(numberOfSeatsTextField.getText()) + "')");

                con.close();
                DefaultTableModel model = (DefaultTableModel) addFlightTable.getModel();

                model.addRow(
                        new Object[]{
                            depdate,
                            arrival,
                            originCountryComboBox.getSelectedItem(),
                            originAirportNameComboBox.getSelectedItem(),
                            destinationCountryComboBox.getSelectedItem(),
                            destinationAirportNameComboBox.getSelectedItem(),
                            Integer.parseInt(numberOfSeatsTextField.getText())}
                );
            } else {

                adminErrorLabel.setText(adminErrorHandling());
            }

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_adminRegisterFlightButtonActionPerformed
    String country;

    private void OriginAirportNames() {
        ArrayList<String> AirportNames = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();

            ResultSet rs = smt.executeQuery("SELECT distinct AirportName FROM airport_info where Country LIKE '" + country + "' order by AirportName ASC");

            while (rs.next()) {
                String orszag = "AirportName";

                AirportNames.add(rs.getString(orszag));

            }

            originAirportNameComboBox.setModel((new DefaultComboBoxModel(AirportNames.toArray())));

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void DestinationAirportNames() {
        ArrayList<String> AirportNames = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();

            ResultSet rs = smt.executeQuery("SELECT distinct AirportName FROM airport_info where Country LIKE '" + country + "' order by AirportName ASC");

            while (rs.next()) {
                String orszag = "AirportName";

                AirportNames.add(rs.getString(orszag));

            }

            destinationAirportNameComboBox.setModel((new DefaultComboBoxModel(AirportNames.toArray())));

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void countries() {

        ArrayList<String> countries = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();

            ResultSet rs = smt.executeQuery("SELECT distinct Country FROM airport_info order by Country ASC");

            while (rs.next()) {
                String orszag = "Country";

                countries.add(rs.getString(orszag));

            }

            countries.remove(0);
            originCountryComboBox.setModel(new DefaultComboBoxModel(countries.toArray()));

            destinationCountryComboBox.setModel(new DefaultComboBoxModel(countries.toArray()));
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    //EVENTES FÜGGYVÉNYEK

    private void deleteFlightButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlightButonActionPerformed

        JFrame qurstionPopUp = new JFrame();
        int result = JOptionPane.showConfirmDialog(qurstionPopUp, "Biztos, hogy törli a teljes járatot?");

        if (result == 0) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
                Statement smt = con.createStatement();

                smt.executeUpdate("DELETE FROM flight_info WHERE "
                        + "Departure_time LIKE '" + addFlightTable.getModel().getValueAt(addFlightTable.getSelectedRow(), 0).toString() + "' AND "
                        + "Arrival_time LIKE '" + addFlightTable.getModel().getValueAt(addFlightTable.getSelectedRow(), 1).toString() + "' AND "
                        + "Origin_place	LIKE '" + addFlightTable.getModel().getValueAt(addFlightTable.getSelectedRow(), 2).toString() + "' AND "
                        + "OriginAirportName LIKE '" + addFlightTable.getModel().getValueAt(addFlightTable.getSelectedRow(), 3).toString() + "' AND "
                        + "Destination_place LIKE '" + addFlightTable.getModel().getValueAt(addFlightTable.getSelectedRow(), 4).toString() + "' AND "
                        + "DestinationAirportName LIKE '" + addFlightTable.getModel().getValueAt(addFlightTable.getSelectedRow(), 5).toString() + "' AND "
                        + "Num_of_seats LIKE '" + addFlightTable.getModel().getValueAt(addFlightTable.getSelectedRow(), 6).toString() + "' ");

                ((DefaultTableModel) addFlightTable.getModel()).removeRow(addFlightTable.getSelectedRow());
                System.out.println("sikeres törlés");
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            } catch (SQLException ex) {
                System.out.println(ex);
            }

            JFrame email = new JFrame();
            JOptionPane.showMessageDialog(email, "Az emailt kiküldtük az érintett személyeknek!");
            email.setLocationRelativeTo(AdminPanel);

        } else if (result == 1) {
            System.out.println("No");
            qurstionPopUp.dispatchEvent(new WindowEvent(qurstionPopUp, WindowEvent.WINDOW_CLOSING));

        }


    }//GEN-LAST:event_deleteFlightButonActionPerformed


    private void originCountryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_originCountryComboBoxItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            country = originCountryComboBox.getSelectedItem().toString();
            originAirportNameComboBox.removeAll();
            OriginAirportNames();
        }
    }//GEN-LAST:event_originCountryComboBoxItemStateChanged

    private void originAirportNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_originAirportNameComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String airportName = originAirportNameComboBox.getSelectedItem().toString();
        }
    }//GEN-LAST:event_originAirportNameComboBoxItemStateChanged

    private void destinationCountryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinationCountryComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            country = destinationCountryComboBox.getSelectedItem().toString();
            destinationAirportNameComboBox.removeAll();
            DestinationAirportNames();
        }
    }//GEN-LAST:event_destinationCountryComboBoxItemStateChanged

    private void ManageFlightButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageFlightButonActionPerformed

        ManageFlight m = new ManageFlight();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setResizable(false);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }//GEN-LAST:event_ManageFlightButonActionPerformed


    private void searchTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextfieldKeyReleased

        Filter(searchTextfield.getText(), model);
    }//GEN-LAST:event_searchTextfieldKeyReleased


    private void myTicketsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTicketsLabelMouseClicked
        buyTicketsJscrollPane.setVisible(false);
        myTicketsjScrollPane.setVisible(true);
        buyTicketsPanel.setVisible(false);
    }//GEN-LAST:event_myTicketsLabelMouseClicked

    private void buyTicketsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketsLabelMouseClicked
        buyTicketsJscrollPane.setVisible(true);
        myTicketsjScrollPane.setVisible(false);
        buyTicketsPanel.setVisible(true);
    }//GEN-LAST:event_buyTicketsLabelMouseClicked

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        dontShowUserPanel();
        ShowLoginPanel();
        loginEmailTextField.setText("");
        passwordTextField.setText("");
        loginErrorLabel.setText("");

    }//GEN-LAST:event_logOutLabelMouseClicked

    private void destinationTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destinationTextFieldKeyReleased
        Filter(destinationTextField.getText(), model);
    }//GEN-LAST:event_destinationTextFieldKeyReleased


    private void buyTicketsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyTicketsButtonActionPerformed

        jegyekszama = Integer.parseInt(adultComboBox.getSelectedItem().toString()) + Integer.parseInt(youngComboBox.getSelectedItem().toString()) + Integer.parseInt(kidComboBox.getSelectedItem().toString()) + Integer.parseInt(infantComboBox.getSelectedItem().toString());

        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");
            Statement smt = con.createStatement();

            if (Integer.parseInt(BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 6).toString()) - jegyekszama < 0 || Integer.parseInt(BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 6).toString()) < 0) {
                BuyTicketsTable.setValueAt("Sold out!", Integer.parseInt(BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 6).toString()), 6);
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "Sold out!");

            } else {

                smt.executeUpdate("Update flight_info SET Num_of_available_seats = Num_of_available_seats - " + jegyekszama + " WHERE Departure_time LIKE  '"
                        + BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 0) + "' AND Arrival_time LIKE '"
                        + BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 1) + "' AND Origin_place LIKE '"
                        + BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 2) + "' AND OriginAirportName LIKE '"
                        + BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 3) + "' AND Destination_place LIKE '"
                        + BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 4) + "' AND DestinationAirportName LIKE '"
                        + BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 5) + "' AND Num_of_available_seats LIKE '"
                        + BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 6) + "' ");
                for (int i = 0; i < jegyekszama; i++) {
                    Passenger p = new Passenger();
                    p.setVisible(true);
                    p.setLocationRelativeTo(null);
                    p.setResizable(false);

                }
                loadtoBuyTicketsTableData();

            }

            con.close();
            smt.close();

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buyTicketsButtonActionPerformed

    private void reservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservationButtonActionPerformed

    public int getJegyekszama() {
        return jegyekszama;
    }

    //EVENTES FÜGGYVÉNYEK vége
    //Kivételek kezelése, hibavédések
    private String adminErrorHandling() {

        if (originAirportNameComboBox.getSelectedItem().equals(destinationAirportNameComboBox.getSelectedItem())) {
            System.out.println("Rossz dátumok.");
            return "Kérem válasszon egy másik uticélt.";

        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String depdate = dateFormat.format(departureTimejDateChooser.getDate()) + " " + departureTimeHourComboBox.getSelectedItem() + ":" + departureTimeMinuteComboBox.getSelectedItem();
        String arrival = dateFormat.format(arrivalTImejDateChooser.getDate()) + " " + ArrivalTimeHourComboBox.getSelectedItem() + ":" + ArrivalTimeMinComboBox.getSelectedItem();

        int usz = Integer.parseInt(numberOfSeatsTextField.getText());

        System.out.println(usz);
        try {
            if (dateFormat.parse(depdate).before(dateFormat.parse(arrival)) == false) {
                return "Rossz dátum";

            } else if (usz < 0 || usz > 230) {

                return "Hibás ülésszám!";
            } else {
                return "";
            }

        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return "";
    }

    public boolean isRegistrationErrorHandling() {

        firstNameErrorLabel.setText(stringErrorHandling(firstNameTextfield.getText()));
        lastNameErrorLabel.setText(stringErrorHandling(lastNameTextfield.getText()));

        if (!isEmailValid(emailTextfield.getText())) {
            emailErrorLabel.setText("Wrong Email!");
            return false;
        }
        if (zipCodeTextfield.getText().length() < 4) {

            zipCodeErrorLabel.setText("The zip code is too short!");
            return false;
        }
        if (zipCodeTextfield.getText().length() > 8) {
            zipCodeErrorLabel.setText("The zip code is very big!");
            return false;
        }

        if (!isPhoneNumberValid(phoneNumberTextfield.getText())) {
            phoneNumberErrorLabel.setText("Wrong phone number!");
            return false;
        }

        if (!registrationPasswordTextField.getText().matches(registrationPasswordAgainTextField.getText())) {
            registrationPasswordErrorHandlingLabel.setText("The two passwords do not match!");
            return false;
        }

        if (!manRadioButton.isSelected() && !womanRadioButton.isSelected()) {
            genderErrorLabel.setText("Hiba!");
            return false;
        }

        return true;

    }

    public boolean checkAdmin() {
        Connection con;
        PreparedStatement ps;
        try {

            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
            }
            md.update(passwordTextField.getText().getBytes());
            byte[] digest = md.digest();
            String password = DatatypeConverter.printHexBinary(digest).toUpperCase();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");

            Statement smt = con.createStatement();

            ps = con.prepareStatement("Select Email, Password From admins where Email LIKE '" + loginEmailTextField.getText() + "' AND Password Like '" + password + "'");
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return true;

            } else {
                loginErrorLabel.setText("Hibás felhasználónév vagy jelszó!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isCheckUserLogin() {
        Connection con;
        PreparedStatement ps;
        try {

            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
            }
            md.update(passwordTextField.getText().getBytes());
            byte[] digest = md.digest();
            String password = DatatypeConverter.printHexBinary(digest).toUpperCase();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/c31g202121?ServerTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", "root", "");

            Statement smt = con.createStatement();

            ps = con.prepareStatement("Select Email, CustomerPassword From registration_info where Email LIKE '" + loginEmailTextField.getText() + "' AND CustomerPassword Like '" + password + "'");
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String stringErrorHandling(String text) {

        if (text.length() > 20) {

            return "Túl hosszú a " + text;
        }

        if (!Pattern.matches("[a-zA-Z]+", text)) {
            return "Nem tartalmazhat számot!";
        }
        return "";
    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(\\+?36)?[ -]?(\\d{1,2}|(\\(\\d{1,2}\\)))/?([ -]?\\d){6,7}$");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public boolean isEmailValid(String email) {
        String emailAddress = email;
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@"
                + "[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return patternMatches(emailAddress, regexPattern);
    }
//Kivételek kezelés vége

    //Regisztráció kép betöltése
    public void luggagePic() {

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("person_at_airport_holding_coffee_and_luggage.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img.getScaledInstance(luggagePic.getWidth(), luggagePic.getHeight(),
                Image.SCALE_SMOOTH);

        ImageIcon imageIcon = new ImageIcon(dimg);

        luggagePic.setIcon(imageIcon);

    }
//Panelek, Framek eltüntetése, bekapcsolása

    public void showAdminPanel() {

        AdminPanel.show();
        System.out.println("admin panel be");
    }

    public void showUserPanel() {
        String myTickets = "<html><u>My tickets</u></html>";
        String logout = "<html><u>Log out</u></html>";
        String buyTickets = "<html><u>Buy Tickets</u></html>";

        myTicketsLabel.setText(myTickets);
        logOutLabel.setText(logout);
        buyTicketsLabel.setText(buyTickets);
        this.myTicketsLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.buyTicketsLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.logOutLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        myTicketsjScrollPane.setVisible(false);
        UserPanel.show();
        System.out.println("User panel be");
    }

    public void dontShowUserPanel() {

        UserPanel.hide();
        System.out.println("User panel ki");
    }

    public void dontShowAdminPanel() {

        AdminPanel.hide();
        System.out.println("admin panel ki");
    }

    public void dontShowRegistrationPanel() {

        RegistrationPanel.hide();
        System.out.println("registration panel ki");
    }

    public void showRegistrationPanel() {
        RegistrationPanel.show();
        System.out.println("registration panel be");
    }

    public void dontShowLoginPanel() {
        this.loginPanel.hide();
        System.out.println("login panel ki");

    }

    public void ShowLoginPanel() {

        this.loginPanel.show();
        String text = "<html><u> Regisztráció </u></html>";
        this.registrationLabel.setText(text);

        this.registrationLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        System.out.println("login panel be");
    }

    //Panelek, Framek eltüntetése, bekapcsolásának vége
    //gettterek, setterek
    public JTable getAddFlightTable() {
        return addFlightTable;
    }

    public void setAddFlightTable(JTable addFlightTable) {
        this.addFlightTable = addFlightTable;
    }

    public int getCustomerId() {
        return customerId;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JComboBox ArrivalTimeHourComboBox;
    private javax.swing.JComboBox ArrivalTimeMinComboBox;
    private javax.swing.JTable BuyTicketsTable;
    private javax.swing.JLabel ComeJlabel;
    private javax.swing.JLabel FlywithusJlabel;
    private javax.swing.JButton ManageFlightButton;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JTable addFlightTable;
    private javax.swing.JButton adminBackButton;
    private javax.swing.JLabel adminErrorLabel;
    private javax.swing.JButton adminRegisterFlightButton;
    private javax.swing.JComboBox adultComboBox;
    private javax.swing.JLabel arrHourLabel;
    private com.toedter.calendar.JDateChooser arrivalTImejDateChooser;
    private javax.swing.JLabel arrivalTimeLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bluebackgroundLabel;
    private javax.swing.JButton buyTicketsButton;
    private javax.swing.JScrollPane buyTicketsJscrollPane;
    private javax.swing.JLabel buyTicketsLabel;
    private javax.swing.JPanel buyTicketsPanel;
    private javax.swing.JLabel cityErrorLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextfield;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JLabel countryErrorLabel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTextfield;
    private javax.swing.JButton deleteButon;
    private javax.swing.JLabel depHourLabel;
    private javax.swing.JLabel depMinLabel;
    private javax.swing.JComboBox departureTimeHourComboBox;
    private javax.swing.JLabel departureTimeLabel;
    private javax.swing.JComboBox departureTimeMinuteComboBox;
    private com.toedter.calendar.JDateChooser departureTimejDateChooser;
    private javax.swing.JComboBox<String> destinationAirportNameComboBox;
    private javax.swing.JComboBox<String> destinationCountryComboBox;
    private javax.swing.JLabel destinationPlaceLabel;
    private javax.swing.JLabel destinationPlaceLabel1;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextfield;
    private javax.swing.JLabel firstNameErrorLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextfield;
    private javax.swing.JLabel genderErrorLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox infantComboBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox kidComboBox;
    private javax.swing.JLabel lastNameErrorLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextfield;
    private javax.swing.JLabel leftBackgroundLabel;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JButton logginButton;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JTextField loginEmailTextField;
    private javax.swing.JLabel loginErrorLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel luggagePic;
    private javax.swing.JRadioButton manRadioButton;
    private javax.swing.JLabel myTicketsLabel;
    private javax.swing.JTable myTicketsTable;
    private javax.swing.JScrollPane myTicketsjScrollPane;
    private javax.swing.JLabel numberOfSeats;
    private javax.swing.JTextField numberOfSeatsTextField;
    private javax.swing.JComboBox originAirportNameComboBox;
    private javax.swing.JComboBox originCountryComboBox;
    private javax.swing.JLabel originPlaceLabel;
    private javax.swing.JLabel originPlaceLabel1;
    private javax.swing.JLabel ourDepartingFlightsLabel;
    private javax.swing.JButton passengerData;
    private javax.swing.JLabel passwordAgainLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel phoneNumberErrorLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextfield;
    private javax.swing.JLabel registartionLabel;
    private javax.swing.JButton registrationButton;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JPasswordField registrationPasswordAgainTextField;
    private javax.swing.JLabel registrationPasswordErrorHandlingLabel;
    private javax.swing.JLabel registrationPasswordLabel;
    private javax.swing.JPasswordField registrationPasswordTextField;
    private javax.swing.JButton reservationButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTextfield;
    private javax.swing.JLabel streetErrorLabel;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetTextfield;
    private javax.swing.JLabel succesfullRegistrationLabel;
    private javax.swing.JLabel userBackgroundLabel;
    private javax.swing.JLabel userDestinationCountryLabel;
    private javax.swing.JRadioButton womanRadioButton;
    private javax.swing.JComboBox youngComboBox;
    private javax.swing.JLabel zipCodeErrorLabel;
    private javax.swing.JTextField zipCodeTextfield;
    // End of variables declaration//GEN-END:variables

}
