package szakdolgozat;

import java.sql.Connection;
import java.awt.Cursor;

import java.awt.Image;

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

import java.awt.Color;

import java.awt.event.ItemEvent;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.TableRowSorter;
import javax.xml.bind.DatatypeConverter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

import java.time.LocalDateTime;

import javax.swing.border.LineBorder;

import static szakdolgozat.Passenger.numberOfTickets;
import static szakdolgozat.ManageFlight.closeManageFlighFrametLabel;

/**
 *
 * @author Juhász Levente
 */
public class Kezdooldal extends javax.swing.JFrame implements iDatabase {

    private int jegyekszama;

    public static int total;
    public static int customerId;
    public static String Origin_country, Destination_country, Departure_time, Arrival_time, OriginAirportName, DestinationAirportName;
    public static String flightNum;
    public static int seatnum;
    public static int basePrice;
    public static JTable cartTable;

    public Kezdooldal() {
        initComponents();
        mozgato();
        closeProgramIcons();

    }

    private void closeProgramIcons() {
        setCursorOnLabel(closeProgramIconOnLoginPanel);
        setCursorOnLabel(closeProgramIconOnRegistration);
        setCursorOnLabel(closeProgramIconOnUserPanel);
        setCursorOnLabel(closeProgramIconOnAdminPanel);
        cartTable = cartTableUserPanel;
    }

    public void hallgato() {

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
        forgotPasswordLabel = new javax.swing.JLabel();
        closeProgramIconOnLoginPanel = new javax.swing.JLabel();
        bluebackgroundLabel = new javax.swing.JLabel();
        RegistrationPanel = new javax.swing.JPanel();
        streetTextfield = new javax.swing.JTextField();
        cityTextfield = new javax.swing.JTextField();
        zipCodeTextfield = new javax.swing.JTextField();
        lastNameTextfield = new javax.swing.JTextField();
        firstNameTextfield = new javax.swing.JTextField();
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
        emailTextfield = new javax.swing.JTextField();
        registrationPasswordAgainTextField = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        registrationPasswordTextField = new javax.swing.JPasswordField();
        registrationPasswordLabel = new javax.swing.JLabel();
        registrationPasswordErrorHandlingLabel = new javax.swing.JLabel();
        genderErrorLabel = new javax.swing.JLabel();
        closeProgramIconOnRegistration = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox();
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
        destinationCountryComboBox = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addFlightTable = new javax.swing.JTable();
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
        depminLabel = new javax.swing.JLabel();
        originPlaceLabel1 = new javax.swing.JLabel();
        destinationPlaceLabel1 = new javax.swing.JLabel();
        destinationAirportNameComboBox = new javax.swing.JComboBox<String>();
        ManageFlightButton = new javax.swing.JButton();
        searchTextfield = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        closeProgramIconOnAdminPanel = new javax.swing.JLabel();
        numberOfSeats1 = new javax.swing.JLabel();
        priceOfTheFlightTextField = new javax.swing.JTextField();
        EURlabel = new javax.swing.JLabel();
        promotionLabel = new javax.swing.JLabel();
        promotionTextField = new javax.swing.JTextField();
        szazalek = new javax.swing.JLabel();
        numberOfSeats2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        UserPanel = new javax.swing.JPanel();
        closeProgramIconOnUserPanel = new javax.swing.JLabel();
        buyTicketsLabel = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        buyTicketsPanel = new javax.swing.JPanel();
        buyTicketsJscrollPane = new javax.swing.JScrollPane();
        BuyTicketsTable = new javax.swing.JTable();
        ourDepartingFlightsLabel = new javax.swing.JLabel();
        reservationButton = new javax.swing.JButton();
        userDestinationCountryLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numOfticketstoBuyTextfield = new javax.swing.JComboBox();
        destinationTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cartTablePanel = new javax.swing.JPanel();
        cartJtable = new javax.swing.JScrollPane();
        cartTableUserPanel = new javax.swing.JTable();
        totalPay = new javax.swing.JLabel();
        numOfTicketsLabel = new javax.swing.JLabel();
        deletePassenger = new javax.swing.JButton();
        buyTicketsButton = new javax.swing.JButton();
        SettingsPanel = new javax.swing.JPanel();
        genderIcon = new javax.swing.JLabel();
        changeEmailButton = new javax.swing.JButton();
        changePhoneNumberButton = new javax.swing.JButton();
        settingsEmailAddressTextfield = new javax.swing.JTextField();
        settingsPhoneNumberTextfield = new javax.swing.JTextField();
        saveSettingsNumberSettingsButton = new javax.swing.JButton();
        namelab = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        AboutUsPanel = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        aboutUsText = new javax.swing.JLabel();
        cartLabel = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        myTickets = new javax.swing.JLabel();
        contactAddressLabel = new javax.swing.JLabel();
        emailAddressLabel = new javax.swing.JLabel();
        ContactPhoneNumberLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        blackBackgroundLabel = new javax.swing.JLabel();
        aboutUs = new javax.swing.JLabel();
        userBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1150, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setMinimumSize(new java.awt.Dimension(1150, 700));
        loginPanel.setPreferredSize(new java.awt.Dimension(1150, 700));
        loginPanel.setVerifyInputWhenFocusTarget(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLabel.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("password: ");
        passwordLabel.setToolTipText("");
        loginPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 190, 30));

        loginEmailLabel.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        loginEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginEmailLabel.setText("Email:");
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
        loginPanel.add(loginEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 320, 30));

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        passwordTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginPanel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 320, 30));

        logginButton.setBackground(new java.awt.Color(0, 0, 0));
        logginButton.setForeground(new java.awt.Color(255, 255, 255));
        logginButton.setText("Login");
        logginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logginButtonActionPerformed(evt);
            }
        });
        loginPanel.add(logginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 90, 40));

        leftBackgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/LeftPanelBackGround.jpg"))); // NOI18N
        loginPanel.add(leftBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 700));

        registrationLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registrationLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrationLabel.setText("Registration");
        registrationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationLabelMouseClicked(evt);
            }
        });
        loginPanel.add(registrationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 650, -1, -1));

        loginErrorLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginErrorLabel.setForeground(new java.awt.Color(255, 0, 51));
        loginPanel.add(loginErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        forgotPasswordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        forgotPasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        forgotPasswordLabel.setText("Forgot Password? Click Here.");
        forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordLabelMouseClicked(evt);
            }
        });
        loginPanel.add(forgotPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        closeProgramIconOnLoginPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/X11-icon.png"))); // NOI18N
        closeProgramIconOnLoginPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramIconOnLoginPanelMouseClicked(evt);
            }
        });
        loginPanel.add(closeProgramIconOnLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, -1, -1));

        bluebackgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bluebackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/asd.jpg"))); // NOI18N
        loginPanel.add(bluebackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 750, 700));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        RegistrationPanel.setMaximumSize(new java.awt.Dimension(1150, 700));
        RegistrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        streetTextfield.setBackground(new java.awt.Color(51, 51, 51));
        streetTextfield.setForeground(new java.awt.Color(255, 255, 255));
        streetTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        streetTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        streetTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(streetTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 240, 30));

        cityTextfield.setBackground(new java.awt.Color(51, 51, 51));
        cityTextfield.setForeground(new java.awt.Color(255, 255, 255));
        cityTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cityTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cityTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(cityTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 30));

        zipCodeTextfield.setBackground(new java.awt.Color(51, 51, 51));
        zipCodeTextfield.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        zipCodeTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zipCodeTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(zipCodeTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 240, 30));

        lastNameTextfield.setBackground(new java.awt.Color(51, 51, 51));
        lastNameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        lastNameTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastNameTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lastNameTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(lastNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 240, 30));

        firstNameTextfield.setBackground(new java.awt.Color(51, 51, 51));
        firstNameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        firstNameTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstNameTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        firstNameTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(firstNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 240, 30));

        phoneNumberTextfield.setBackground(new java.awt.Color(51, 51, 51));
        phoneNumberTextfield.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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

        emailTextfield.setBackground(new java.awt.Color(51, 51, 51));
        emailTextfield.setForeground(new java.awt.Color(255, 255, 255));
        emailTextfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTextfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailTextfield.setCaretColor(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(emailTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 240, 30));

        registrationPasswordAgainTextField.setBackground(new java.awt.Color(51, 51, 51));
        registrationPasswordAgainTextField.setForeground(new java.awt.Color(255, 255, 255));
        registrationPasswordAgainTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrationPasswordAgainTextField.setCaretColor(new java.awt.Color(255, 255, 255));
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
        registrationPasswordTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrationPasswordTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        registrationPasswordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        registrationPasswordTextField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
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

        closeProgramIconOnRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/X11-icon.png"))); // NOI18N
        closeProgramIconOnRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramIconOnRegistrationMouseClicked(evt);
            }
        });
        RegistrationPanel.add(closeProgramIconOnRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, -1, -1));

        countryComboBox.setBackground(new java.awt.Color(51, 51, 51));
        countryComboBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        countryComboBox.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationPanel.add(countryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 240, 30));
        RegistrationPanel.add(luggagePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 710));

        getContentPane().add(RegistrationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        AdminPanel.setMaximumSize(new java.awt.Dimension(1150, 700));
        AdminPanel.setMinimumSize(new java.awt.Dimension(1150, 700));
        AdminPanel.setPreferredSize(new java.awt.Dimension(1150, 700));
        AdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        departureTimeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        departureTimeLabel.setForeground(new java.awt.Color(204, 204, 204));
        departureTimeLabel.setText("Departure Time: ");
        AdminPanel.add(departureTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        arrivalTimeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        arrivalTimeLabel.setForeground(new java.awt.Color(204, 204, 204));
        arrivalTimeLabel.setText("Arrival Time: ");
        AdminPanel.add(arrivalTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        originPlaceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        originPlaceLabel.setForeground(new java.awt.Color(204, 204, 204));
        originPlaceLabel.setText("Origin Airport Name: ");
        AdminPanel.add(originPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 200, 30));

        destinationPlaceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        destinationPlaceLabel.setForeground(new java.awt.Color(204, 204, 204));
        destinationPlaceLabel.setText("Destination Airport Name: ");
        AdminPanel.add(destinationPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 190, 30));

        numberOfSeats.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numberOfSeats.setForeground(new java.awt.Color(204, 204, 204));
        numberOfSeats.setText("Number of Seats: ");
        AdminPanel.add(numberOfSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, 30));

        numberOfSeatsTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        numberOfSeatsTextField.setText("100");
        AdminPanel.add(numberOfSeatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 50, -1));

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
        AdminPanel.add(adminBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

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

        destinationCountryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destinationCountryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinationCountryComboBoxItemStateChanged(evt);
            }
        });
        AdminPanel.add(destinationCountryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 290, 30));

        addFlightTable.setBackground(new java.awt.Color(255, 255, 255));
        addFlightTable.setForeground(new java.awt.Color(0, 0, 0));
        addFlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Departure Time", "Arrival Time", "Origin Place", "Origin Airport Name", "Destination Airport Name", "Destination Place", "Number of max Seats", "Number of available Seats", "Base price", "Flight Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        addFlightTable.setGridColor(new java.awt.Color(51, 0, 255));
        addFlightTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        addFlightTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(addFlightTable);

        AdminPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1150, 210));

        originAirportNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                originAirportNameComboBoxItemStateChanged(evt);
            }
        });
        AdminPanel.add(originAirportNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 290, 30));
        AdminPanel.add(departureTimejDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 210, -1));
        AdminPanel.add(arrivalTImejDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 210, -1));

        departureTimeHourComboBox.setMaximumRowCount(24);
        departureTimeHourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        departureTimeHourComboBox.setSelectedIndex(17);
        AdminPanel.add(departureTimeHourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 60, 30));

        departureTimeMinuteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        AdminPanel.add(departureTimeMinuteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 60, 30));

        ArrivalTimeHourComboBox.setMaximumRowCount(24);
        ArrivalTimeHourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        ArrivalTimeHourComboBox.setSelectedIndex(17);
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
        depHourLabel.setForeground(new java.awt.Color(204, 204, 204));
        depHourLabel.setText("Hour:");
        AdminPanel.add(depHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, 30));

        depMinLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        depMinLabel.setForeground(new java.awt.Color(204, 204, 204));
        depMinLabel.setText("Minute:");
        AdminPanel.add(depMinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, 30));

        arrHourLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        arrHourLabel.setForeground(new java.awt.Color(204, 204, 204));
        arrHourLabel.setText("Hour:");
        AdminPanel.add(arrHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, 30));

        depminLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        depminLabel.setForeground(new java.awt.Color(204, 204, 204));
        depminLabel.setText("Minute: ");
        AdminPanel.add(depminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, 30));

        originPlaceLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        originPlaceLabel1.setForeground(new java.awt.Color(204, 204, 204));
        originPlaceLabel1.setText("Origin Country: ");
        AdminPanel.add(originPlaceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 180, 30));

        destinationPlaceLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        destinationPlaceLabel1.setForeground(new java.awt.Color(204, 204, 204));
        destinationPlaceLabel1.setText("Destination Country: ");
        AdminPanel.add(destinationPlaceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, 30));

        destinationAirportNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinationAirportNameComboBoxItemStateChanged(evt);
            }
        });
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
        searchLabel.setForeground(new java.awt.Color(204, 204, 204));
        searchLabel.setText("Search Flight:");
        AdminPanel.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        closeProgramIconOnAdminPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/X11-icon.png"))); // NOI18N
        closeProgramIconOnAdminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramIconOnAdminPanelMouseClicked(evt);
            }
        });
        AdminPanel.add(closeProgramIconOnAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, -1, -1));

        numberOfSeats1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numberOfSeats1.setForeground(new java.awt.Color(204, 204, 204));
        numberOfSeats1.setText(" The price of the flight: ");
        AdminPanel.add(numberOfSeats1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, 30));

        priceOfTheFlightTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        priceOfTheFlightTextField.setText("30");
        AdminPanel.add(priceOfTheFlightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 100, -1));

        EURlabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        EURlabel.setForeground(new java.awt.Color(255, 255, 255));
        EURlabel.setText("EUR");
        AdminPanel.add(EURlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, -1, -1));

        promotionLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        promotionLabel.setForeground(new java.awt.Color(204, 204, 204));
        promotionLabel.setText("Promotion: ");
        AdminPanel.add(promotionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, -1, -1));

        promotionTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        promotionTextField.setForeground(new java.awt.Color(0, 0, 0));
        promotionTextField.setText("10");
        promotionTextField.setToolTipText("");
        AdminPanel.add(promotionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 30, -1));

        szazalek.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        szazalek.setForeground(new java.awt.Color(204, 204, 204));
        szazalek.setText("%");
        AdminPanel.add(szazalek, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, -1, 90));

        numberOfSeats2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numberOfSeats2.setForeground(new java.awt.Color(204, 204, 204));
        numberOfSeats2.setText("(max: 230)");
        AdminPanel.add(numberOfSeats2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, -1, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/microsoft-flight-simulator-6.jpg"))); // NOI18N
        background.setText("jLabel1");
        AdminPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -120, -1, 1310));

        getContentPane().add(AdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        UserPanel.setMaximumSize(new java.awt.Dimension(1150, 700));
        UserPanel.setMinimumSize(new java.awt.Dimension(1150, 700));
        UserPanel.setName(""); // NOI18N
        UserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeProgramIconOnUserPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/X11-icon.png"))); // NOI18N
        closeProgramIconOnUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramIconOnUserPanelMouseClicked(evt);
            }
        });
        UserPanel.add(closeProgramIconOnUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, -1, -1));

        buyTicketsLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buyTicketsLabel.setForeground(new java.awt.Color(102, 255, 255));
        buyTicketsLabel.setText("Buy Ticket");
        buyTicketsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyTicketsLabelMouseClicked(evt);
            }
        });
        UserPanel.add(buyTicketsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        logOutLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(102, 255, 255));
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });
        UserPanel.add(logOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        buyTicketsPanel.setOpaque(false);
        buyTicketsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuyTicketsTable.setForeground(new java.awt.Color(0, 0, 0));
        BuyTicketsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
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
                "Departure Time", "Arrival Time", "Origin Country", "Origin Airport Name", "Destination Country", "Destination Aiport Name", "Remaining tickets", "Price", "Flight Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BuyTicketsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BuyTicketsTable.setGridColor(new java.awt.Color(51, 51, 255));
        BuyTicketsTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        BuyTicketsTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        buyTicketsJscrollPane.setViewportView(BuyTicketsTable);

        buyTicketsPanel.add(buyTicketsJscrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1150, 230));

        ourDepartingFlightsLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ourDepartingFlightsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ourDepartingFlightsLabel.setText("Our departing flights");
        buyTicketsPanel.add(ourDepartingFlightsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        reservationButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reservationButton.setForeground(new java.awt.Color(0, 0, 0));
        reservationButton.setText("Add Passengers");
        reservationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationButtonMouseClicked(evt);
            }
        });
        buyTicketsPanel.add(reservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 220, 40));

        userDestinationCountryLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        userDestinationCountryLabel.setForeground(new java.awt.Color(255, 255, 255));
        userDestinationCountryLabel.setText("Destination Country: ");
        buyTicketsPanel.add(userDestinationCountryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("How many tickets do you want to buy?");
        buyTicketsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number of tickets");
        buyTicketsPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 130, -1));

        numOfticketstoBuyTextfield.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        numOfticketstoBuyTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfticketstoBuyTextfieldActionPerformed(evt);
            }
        });
        buyTicketsPanel.add(numOfticketstoBuyTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 110, 30));

        destinationTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        destinationTextField.setForeground(new java.awt.Color(0, 0, 0));
        destinationTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                destinationTextFieldKeyReleased(evt);
            }
        });
        buyTicketsPanel.add(destinationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Discounts:");
        buyTicketsPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2-14 year: 15%");
        buyTicketsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Under 2 years: 20%");
        buyTicketsPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("14-17 year: 10%");
        buyTicketsPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        UserPanel.add(buyTicketsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1150, 500));

        cartTablePanel.setOpaque(false);
        cartTablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartJtable.setBackground(new java.awt.Color(0, 0, 0));
        cartJtable.setForeground(new java.awt.Color(0, 0, 0));

        cartTableUserPanel.setForeground(new java.awt.Color(51, 51, 255));
        cartTableUserPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        cartTableUserPanel.setOpaque(false);
        cartTableUserPanel.setSelectionBackground(new java.awt.Color(51, 153, 255));
        cartTableUserPanel.setSelectionForeground(new java.awt.Color(51, 51, 51));
        cartJtable.setViewportView(cartTableUserPanel);

        cartTablePanel.add(cartJtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 170));

        totalPay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        totalPay.setForeground(new java.awt.Color(255, 255, 255));
        totalPay.setText("To be paid in total: ");
        cartTablePanel.add(totalPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        numOfTicketsLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numOfTicketsLabel.setForeground(new java.awt.Color(255, 255, 255));
        numOfTicketsLabel.setText("Number of Tickets: ");
        cartTablePanel.add(numOfTicketsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        numOfTicketsLabel.getAccessibleContext().setAccessibleDescription("");

        deletePassenger.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deletePassenger.setText("Delete passenger from cart");
        deletePassenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePassengerMouseClicked(evt);
            }
        });
        cartTablePanel.add(deletePassenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 320, 40));

        buyTicketsButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buyTicketsButton.setForeground(new java.awt.Color(0, 0, 0));
        buyTicketsButton.setText("Buy tickets");
        buyTicketsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyTicketsButtonMouseClicked(evt);
            }
        });
        cartTablePanel.add(buyTicketsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 40));

        UserPanel.add(cartTablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1150, 370));

        SettingsPanel.setOpaque(false);
        SettingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genderIcon.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        SettingsPanel.add(genderIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 340, 240));

        changeEmailButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        changeEmailButton.setForeground(new java.awt.Color(0, 0, 0));
        changeEmailButton.setText("change");
        changeEmailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeEmailButtonMouseClicked(evt);
            }
        });
        SettingsPanel.add(changeEmailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 90, 30));

        changePhoneNumberButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        changePhoneNumberButton.setForeground(new java.awt.Color(0, 0, 0));
        changePhoneNumberButton.setText("change");
        changePhoneNumberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePhoneNumberButtonMouseClicked(evt);
            }
        });
        SettingsPanel.add(changePhoneNumberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 90, 30));

        settingsEmailAddressTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        settingsEmailAddressTextfield.setForeground(new java.awt.Color(102, 255, 255));
        settingsEmailAddressTextfield.setBorder(null);
        settingsEmailAddressTextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        settingsEmailAddressTextfield.setInheritsPopupMenu(true);
        settingsEmailAddressTextfield.setOpaque(false);
        SettingsPanel.add(settingsEmailAddressTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 230, 30));

        settingsPhoneNumberTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        settingsPhoneNumberTextfield.setForeground(new java.awt.Color(102, 255, 255));
        settingsPhoneNumberTextfield.setText(" ");
        settingsPhoneNumberTextfield.setBorder(null);
        settingsPhoneNumberTextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        settingsPhoneNumberTextfield.setOpaque(false);
        SettingsPanel.add(settingsPhoneNumberTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 230, 30));

        saveSettingsNumberSettingsButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saveSettingsNumberSettingsButton.setForeground(new java.awt.Color(0, 0, 0));
        saveSettingsNumberSettingsButton.setText("Save Settings ");
        saveSettingsNumberSettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveSettingsNumberSettingsButtonMouseClicked(evt);
            }
        });
        SettingsPanel.add(saveSettingsNumberSettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 140, 30));

        namelab.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        namelab.setForeground(new java.awt.Color(102, 255, 255));
        namelab.setText("Email address: ");
        SettingsPanel.add(namelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email address: ");
        SettingsPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone number: ");
        SettingsPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        UserPanel.add(SettingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1150, 530));

        AboutUsPanel.setOpaque(false);
        AboutUsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/airport-medical-aid_300.jpg"))); // NOI18N
        AboutUsPanel.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, -1));

        aboutUsText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        aboutUsText.setForeground(new java.awt.Color(102, 255, 255));
        aboutUsText.setText("<html>Budapest International Airport Our airport is here to help you get wherever you want to go. Start here, go anywhere.\n\nOur Impact: \n\nOur Airport provides a significant contribution to the Southern Ontario economy. The Airport is financially self-sustaining and does not rely on any subsidy or financial benefit from any level of government. In 2021 we will pay close to $950,000 in municipal taxes to the City of London. Below are some of the highlights of our economic contribution to our region.\n\nThe first airport in Budapest was established in 1928 on a grass field located south of the city. In 1939, land was purchased at the present site and construction of a more advanced facility began.  \n\nDuring the second world war, Budapest Airport was used extensively as a military training base. Work started on the RCAF Station Crumlin in November 1939, and it became a major centre for the Hungarian Commonwealth Air Training Plan. In 1945, Transport Germany assumed operations of the airport and embarked upon a major expansion program during the following three decades. From 1974 to 1998 construction programs costing more than $12 million were undertaken to upgrade and renovate airport facilities, runways, etc. \n\nIn 1994 the Government of Germany announced the implementation of a National Airports Policy. This policy supported the federal government’s withdrawal as operators of airports. The top twenty-six Hungarian airports, including Budapest, were eligible for a long-term lease to local Airport Authorities.  \n\n\n</html>");
        AboutUsPanel.add(aboutUsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 780, 440));

        UserPanel.add(AboutUsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1130, 540));

        cartLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cartLabel.setForeground(new java.awt.Color(102, 255, 255));
        cartLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/shopping-cart.png"))); // NOI18N
        cartLabel.setText("CART");
        cartLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartLabelMouseClicked(evt);
            }
        });
        UserPanel.add(cartLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 90, 40));

        Settings.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Settings.setForeground(new java.awt.Color(102, 255, 255));
        Settings.setText("Settings");
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
        });
        UserPanel.add(Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 70, -1));

        myTickets.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        myTickets.setForeground(new java.awt.Color(102, 255, 255));
        myTickets.setText("My Tickets");
        myTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTicketsMouseClicked(evt);
            }
        });
        UserPanel.add(myTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 90, -1));

        contactAddressLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contactAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactAddressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/icons8-place-marker-50.png"))); // NOI18N
        contactAddressLabel.setText("1053 Budapest, Kossuth Lajos street 7-9.");
        UserPanel.add(contactAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        emailAddressLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        emailAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailAddressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/icons8-email-50.png"))); // NOI18N
        emailAddressLabel.setText("info@airline.hu");
        UserPanel.add(emailAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, -1, -1));

        ContactPhoneNumberLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ContactPhoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        ContactPhoneNumberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/icons8-phone-50.png"))); // NOI18N
        ContactPhoneNumberLabel.setText("(36) 1 510 0550");
        UserPanel.add(ContactPhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/icons8-vertical-line-48.png"))); // NOI18N
        UserPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 50, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/icons8-vertical-line-48.png"))); // NOI18N
        UserPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 50, 80));

        blackBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/black-color-solid-background-1920x1080.png"))); // NOI18N
        blackBackgroundLabel.setText("jLabel6");
        UserPanel.add(blackBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1150, 80));

        aboutUs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        aboutUs.setForeground(new java.awt.Color(102, 255, 255));
        aboutUs.setText("About us");
        aboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsMouseClicked(evt);
            }
        });
        UserPanel.add(aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 70));

        userBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/80301f1d6a1b8c3219d7cb286d58a715.jpg"))); // NOI18N
        userBackgroundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userBackgroundLabel.setMaximumSize(null);
        userBackgroundLabel.setMinimumSize(null);
        userBackgroundLabel.setName(""); // NOI18N
        userBackgroundLabel.setPreferredSize(null);
        UserPanel.add(userBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(UserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    //sql Update, Delete, insert into utasitasok hivo metodusa
    private void sqlUpdate(String sql) throws ClassNotFoundException, SQLException {

        connectToDatabase().executeUpdate(sql);

    }

    //csatlakozás az adatbázishoz
    private Statement connectToDatabase() throws ClassNotFoundException, SQLException {
        Class.forName(CONNECTION);
        Connection con = DriverManager.getConnection(CONNECT_TO_LOCALHOST, USER, PASSWORD);

        Statement smt = con.createStatement();

        return smt;
    }

    //md5 password kódja
    private void md5PasswordCode(String password) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }

        md.update(password.getBytes());
        byte[] digest = md.digest();
        password = DatatypeConverter.printHexBinary(digest).toUpperCase();
    }

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed

        if (isRegistrationErrorHandling()) {
            String gender = "";
            if (this.womanRadioButton.isSelected()) {
                gender = this.womanRadioButton.getText();
            } else {
                gender = this.manRadioButton.getText();
            }

            String password = registrationPasswordTextField.getText();
            md5PasswordCode(password);

            try {
                String sql = "INSERT INTO registration_info(FirstName,LastName,Address,zipCode,City,Country,phoneNumber,Gender,Email, CustomerPassword ) VALUES ('" + firstNameTextfield.getText() + "' , '" + lastNameTextfield.getText() + "' , '" + streetTextfield.getText() + "' , '" + Integer.parseInt(zipCodeTextfield.getText()) + "' , '" + cityTextfield.getText() + "' , '" + countryComboBox.getSelectedItem() + "' , '" + phoneNumberTextfield.getText() + "' , '" + gender + "' , '" + emailTextfield.getText() + "', '" + md5password(registrationPasswordTextField.getText()) + "' );";
                sqlUpdate(sql);

            } catch (Exception e) {

                System.out.println("Hiba: " + e);
            }
            sikerespopUp("Registration succesfull!");

        }


    }//GEN-LAST:event_registrationButtonActionPerformed

    //limmitálja a karakterek számát amit be lehet érni egy textfieldbe
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

    //lekerdezest indit az adatbazisban és visszatér az eredményyel, ha van
    private ResultSet lekerdezes(String sql) throws ClassNotFoundException, SQLException {
        Statement smt = connectToDatabase();

        ResultSet res = smt.executeQuery(sql);

        return res;

    }

    //a járat megadásakor
    private DefaultTableModel FlightTablemodel;

    //járatok frissítése, megtartása az admin táblázatbans
    public void keepFlightsData() {

        try {

            String query = "Select Departure_time,Arrival_time,Origin_country, OriginAirportName, Destination_country, DestinationAirportName, Num_of_max_seats, Flight_num_id, Num_of_available_seats,Base_Price from flight_info";

            ResultSet s = lekerdezes(query);

            String sqlcountrow = "SELECT COUNT(*) AS rowcount FROM flight_info";
            ResultSet s2 = lekerdezes(sqlcountrow);
            s2.next();
            int count = s2.getInt("rowcount");
            s2.close();

            String columns[] = {addFlightTable.getColumnName(0), addFlightTable.getColumnName(1), addFlightTable.getColumnName(2), addFlightTable.getColumnName(3), addFlightTable.getColumnName(4), addFlightTable.getColumnName(5), addFlightTable.getColumnName(6), addFlightTable.getColumnName(7), addFlightTable.getColumnName(8), addFlightTable.getColumnName(9)};
            String data[][] = new String[count][addFlightTable.getColumnCount()];

            int i = 0;
            while (s.next()) {

                String dep = s.getString("Departure_Time");
                boolean kesobbi = false;
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                try {
                    if (dep != "") {

                        if (dateFormat.parse(maiDatum()).after(dateFormat.parse(dep))) {
                            String sql = "Delete FROM flight_info where Departure_time like '" + dep + "'";
                            sqlUpdate(sql);
                            kesobbi = true;
                        }
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
                }
                String ati = s.getString("Arrival_Time");
                String orc = s.getString("Origin_country");
                String ora = s.getString("OriginAirportName");
                String dec = s.getString("Destination_country");
                String dea = s.getString("DestinationAirportName");
                String nos = s.getString("Num_of_max_seats");
                String nofav = s.getString("Num_of_available_seats");
                String bp = s.getString("Base_Price") + " EUR";
                String fnid = s.getString("Flight_num_id");

                if (kesobbi == false) {
                    data[i][0] = dep;

                    data[i][1] = ati;
                    data[i][2] = orc;
                    data[i][3] = ora;
                    data[i][4] = dec;
                    data[i][5] = dea;
                    data[i][6] = nos;
                    data[i][7] = nofav;
                    data[i][8] = bp;
                    data[i][9] = fnid;
                }
                i++;
            }
            FlightTablemodel = new DefaultTableModel(data, columns) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                }
            };
            addFlightTable.setSelectionModel(new ForcedListSelectionModel());
            addFlightTable.setModel(FlightTablemodel);
            s.close();
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
    DefaultTableModel vasarloiTablaModel;

    private void loadtoBuyTicketsTableData() {
        try {

            String query = "Select Departure_time,Arrival_time,Origin_country, OriginAirportName, Destination_country, DestinationAirportName, Num_of_available_seats, Base_Price, Flight_num_id from flight_info";
            ResultSet s = lekerdezes(query);

            String sqlcountrow = "SELECT COUNT(*) AS rowcount FROM flight_info";
            ResultSet s2 = lekerdezes(sqlcountrow);
            s2.next();
            int count = s2.getInt("rowcount");
            s2.close();

            String columns[] = {BuyTicketsTable.getColumnName(0), BuyTicketsTable.getColumnName(1), BuyTicketsTable.getColumnName(2), BuyTicketsTable.getColumnName(3), BuyTicketsTable.getColumnName(4), BuyTicketsTable.getColumnName(5), BuyTicketsTable.getColumnName(6), BuyTicketsTable.getColumnName(7), BuyTicketsTable.getColumnName(8)};
            String data[][] = new String[count][BuyTicketsTable.getColumnCount()];

            int i = 0;
            while (s.next()) {

                String dep = s.getString("Departure_Time");
                String ati = s.getString("Arrival_Time");
                String orc = s.getString("Origin_country");
                String ora = s.getString("OriginAirportName");
                String dec = s.getString("Destination_country");
                String dea = s.getString("DestinationAirportName");
                String nos = s.getString("Num_of_available_seats");
                String price = s.getString("Base_Price") + " EUR";
                String fid = s.getString("Flight_num_id");
                data[i][0] = dep;
                data[i][1] = ati;
                data[i][2] = orc;
                data[i][3] = ora;
                data[i][4] = dec;
                data[i][5] = dea;
                data[i][6] = nos;
                data[i][7] = price;
                data[i][8] = fid;

                i++;

            }

            for (int d = 0; d < count; d++) {
                for (int j = 0; j < BuyTicketsTable.getColumnCount(); j++) {
                    if (Integer.parseInt(data[d][6]) < 0) {
                        data[d][6] = "0";
                    }
                }
            }
            vasarloiTablaModel = new DefaultTableModel(data, columns) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                }
            };
            BuyTicketsTable.setSelectionModel(new ForcedListSelectionModel());
            BuyTicketsTable.setModel(vasarloiTablaModel);
            s.close();
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
            keepFlightsData();
            countries();

            hibasAdat = false;

        }

        if (isCheckUserLogin()) {
            dontShowLoginPanel();
            showUserPanel();
            this.buyTicketsPanel.show();
            this.BuyTicketsTable.show();
            this.cartTablePanel.hide();
            loadtoBuyTicketsTableData();
            hibasAdat = false;
        }

        belepteto(hibasAdat);

    }//GEN-LAST:event_logginButtonActionPerformed

    private void belepteto(boolean hibasAdat) {

        try {

            String query = "Select Customer_id, Email, FirstName, LastName, CustomerPassword From registration_info where Email LIKE '" + loginEmailTextField.getText() + "' AND CustomerPassword Like '" + md5password(passwordTextField.getText()) + "'";
            ResultSet s = lekerdezes(query);
            if (s.next()) {

                customerId = Integer.parseInt(s.getString("Customer_id"));

                String kapcsolattarto = s.getString("FirstName");
                kapcsolattarto += " " + s.getString("LastName");
            }

            if (hibasAdat == true) {

                loginErrorLabel.setText("Wrong Email or password!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    //atalakítani md5 kódra a jelszót

    private String md5password(String text) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Kezdooldal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        md.update(text.getBytes());
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
    String[] countries = new String[]{"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"};
    private void registrationLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationLabelMouseClicked
        dontShowLoginPanel();
        showRegistrationPanel();
        luggagePic();

        for (int i = 0; i < countries.length; i++) {
            countryComboBox.addItem(countries[i]);
        }


    }//GEN-LAST:event_registrationLabelMouseClicked


    private void adminRegisterFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRegisterFlightButtonActionPerformed

        try {

            int s = 100 - Integer.parseInt(promotionTextField.getText());

            int amount = (s * Integer.parseInt(priceOfTheFlightTextField.getText())) / 100;
            if (adminErrorHandling()) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");

                String depdate = dateFormat.format(departureTimejDateChooser.getDate()) + " " + departureTimeHourComboBox.getSelectedItem() + ":" + departureTimeMinuteComboBox.getSelectedItem() + ":00";
                String arrival = dateFormat.format(arrivalTImejDateChooser.getDate()) + " " + ArrivalTimeHourComboBox.getSelectedItem() + ":" + ArrivalTimeMinComboBox.getSelectedItem() + ":00";
                String sql = "Insert Into flight_info(Departure_time, Arrival_time, Origin_country,OriginAirportName, Destination_country,DestinationAirportName, Num_of_max_seats, Num_of_available_seats,Base_Price)  VALUES ( '" + depdate + "' , '" + arrival + "' , '" + originCountryComboBox.getSelectedItem() + "' , '" + originAirportNameComboBox.getSelectedItem() + "' , '" + destinationCountryComboBox.getSelectedItem() + "' , '" + destinationAirportNameComboBox.getSelectedItem() + "' , '" + Integer.parseInt(numberOfSeatsTextField.getText()) + "' , '" + Integer.parseInt(numberOfSeatsTextField.getText()) + "' , '" + amount + "' )";
                sqlUpdate(sql);
                DefaultTableModel model = (DefaultTableModel) addFlightTable.getModel();

                String sql2 = "SELECT Flight_num_id FROM flight_info order by Flight_num_id DESC limit 1";
                ResultSet rs = lekerdezes(sql2);
                int flightnumid = 0;
                boolean elso = false;
                while (rs.next()) {
                    flightnumid = Integer.parseInt(rs.getString("Flight_num_id"));
                    elso = true;
                }

                if (!elso) {
                    flightnumid = 1;
                }

                model.addRow(
                        new Object[]{
                            depdate,
                            arrival,
                            originCountryComboBox.getSelectedItem(),
                            originAirportNameComboBox.getSelectedItem(),
                            destinationCountryComboBox.getSelectedItem(),
                            destinationAirportNameComboBox.getSelectedItem(),
                            Integer.parseInt(numberOfSeatsTextField.getText()),
                            Integer.parseInt(numberOfSeatsTextField.getText()),
                            amount + " EUR",
                            flightnumid}
                );
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
            String sql = "SELECT distinct AirportName FROM airport_info where Country LIKE '" + country + "' order by AirportName ASC";

            ResultSet rs = lekerdezes(sql);

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

            ResultSet rs = lekerdezes("SELECT distinct AirportName FROM airport_info where Country LIKE '" + country + "' order by AirportName ASC");

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

            String sql = "SELECT distinct Country FROM airport_info order by Country ASC";

            ResultSet rs = lekerdezes(sql);

            while (rs.next()) {
                String orszag = "Country";

                countries.add(rs.getString(orszag));

            }

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

        if (addFlightTable.getSelectionModel().isSelectionEmpty()) {
            errorPopUp("Please select a flight!");
        } else {
            JFrame qurstionPopUp = new JFrame();
            int result = JOptionPane.showConfirmDialog(qurstionPopUp, "Are you sure you want to delete this flight?");
            if (result == 0) {

                try {

                    String sql = "DELETE FROM flight_info WHERE Flight_num_id =" + addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 9);

                    sqlUpdate(sql);
                    ((DefaultTableModel) addFlightTable.getModel()).removeRow(addFlightTable.getSelectedRow());

                } catch (ClassNotFoundException ex) {
                    System.out.println(ex);
                } catch (SQLException ex) {
                    System.out.println(ex);
                }

            } else if (result == 1) {
                qurstionPopUp.dispatchEvent(new WindowEvent(qurstionPopUp, WindowEvent.WINDOW_CLOSING));

            }
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

    //adatok kimentése, a kiválasztatott járatról a MaangeFlight osztályra
    public static String deptime, arrtime, orcountry, destcountry, orairport, destairport, maxnumofseats;
    public static String adminflightnum, availableseats, promotion;
    public static Kezdooldal k;
    private void ManageFlightButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageFlightButonActionPerformed

        if (!addFlightTable.getSelectionModel().isSelectionEmpty()) {
            deptime = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 0);
            arrtime = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 1);
            orcountry = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 2);
            orairport = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 3);
            destcountry = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 4);
            destairport = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 5);
            maxnumofseats = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 6);
            availableseats = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 7);
            adminflightnum = (String) addFlightTable.getValueAt(addFlightTable.getSelectedRow(), 9);
            if (Integer.parseInt(promotionTextField.getText()) >= 0) {
                promotion = promotionTextField.getText();
            } else {

                errorPopUp("Promotion can't be negative!");
            }

            ManageFlight m = new ManageFlight();
            m.setLocationRelativeTo(null);
            m.setVisible(true);
            m.setResizable(false);

            closeManageFlighFrametLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    keepFlightsData();
                }

            });

        } else {
            errorPopUp("Please Select a flight!");
        }


    }//GEN-LAST:event_ManageFlightButonActionPerformed


    private void searchTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextfieldKeyReleased

        Filter(searchTextfield.getText(), FlightTablemodel);
    }//GEN-LAST:event_searchTextfieldKeyReleased


    private void buyTicketsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketsLabelMouseClicked
        loadtoBuyTicketsTableData();
        buyTicketsJscrollPane.setVisible(true);

        buyTicketsPanel.setVisible(true);
        this.cartTablePanel.hide();
        this.SettingsPanel.hide();
        this.AboutUsPanel.hide();
    }//GEN-LAST:event_buyTicketsLabelMouseClicked

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        dontShowUserPanel();
        ShowLoginPanel();

        loginEmailTextField.setText("");
        passwordTextField.setText("");
        loginErrorLabel.setText("");

    }//GEN-LAST:event_logOutLabelMouseClicked

    private void destinationTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destinationTextFieldKeyReleased
        Filter(destinationTextField.getText(), vasarloiTablaModel);
    }//GEN-LAST:event_destinationTextFieldKeyReleased

    private void getDataFromBuyTicketsTableToPassenger() {

        Origin_country = (String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 2);
        Destination_country = (String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 4);
        OriginAirportName = (String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 3);
        DestinationAirportName = (String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 5);
        Departure_time = (String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 0);
        Arrival_time = (String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 1);
    }

    //megnézi, hogy van-e kiválasztott járat a vásárláskor
    private String notselectedFlight() {

        if (BuyTicketsTable.getSelectionModel().isSelectionEmpty()) {

            return "Please select a flight!";
        }
        if (numOfticketstoBuyTextfield.getSelectedItem() == "0") {
            return "Please choose how many tickets do you want to buy.";
        }

        return "";
    }

    private void forgotPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLabelMouseClicked
        ForgotPassword p = new ForgotPassword();
        p.setVisible(true);
        p.setResizable(false);
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_forgotPasswordLabelMouseClicked

    private void utasletrehozas(String cim) {
        Passenger p = new Passenger();
        p.setVisible(true);
        p.setLocationRelativeTo(null);

        p.setResizable(false);
        p.setTitle(cim);

    }

    //Frame mozgatása
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


    private void reservationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationButtonMouseClicked

        if (notselectedFlight() != "") {

            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, notselectedFlight());
        } else {

            getDataFromBuyTicketsTableToPassenger();

            basePrice = Integer.parseInt((String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 7).toString().replaceAll(" EUR", ""));
            jegyekszama = Integer.parseInt(numOfticketstoBuyTextfield.getSelectedItem().toString());

            if (Integer.parseInt(BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 6).toString()) - jegyekszama < 0 || Integer.parseInt(BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 6).toString()) < 0) {

                errorPopUp("Sold out!");

            } else {

                flightNum = (String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 8);

                for (int i = 1; i < jegyekszama + 1; i++) {
                    utasletrehozas("Passenger no." + i);
                }

                loadtoBuyTicketsTableData();

            }

        }


    }//GEN-LAST:event_reservationButtonMouseClicked

    private void exitQuestion() {

        int n = JOptionPane.showConfirmDialog(
                this,
                "Are you sure want to exit?",
                "Exit guestion", JOptionPane.YES_NO_OPTION);

        if (n == 0) {
            System.exit(0);
        }
    }

    private void closeProgramIconOnLoginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramIconOnLoginPanelMouseClicked

        exitQuestion();

    }//GEN-LAST:event_closeProgramIconOnLoginPanelMouseClicked

    private void closeProgramIconOnRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramIconOnRegistrationMouseClicked

        exitQuestion();
    }//GEN-LAST:event_closeProgramIconOnRegistrationMouseClicked

    private void closeProgramIconOnUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramIconOnUserPanelMouseClicked
        exitQuestion();
    }//GEN-LAST:event_closeProgramIconOnUserPanelMouseClicked

    private void closeProgramIconOnAdminPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramIconOnAdminPanelMouseClicked
        exitQuestion();
    }//GEN-LAST:event_closeProgramIconOnAdminPanelMouseClicked

    //Kosár frissítése
    private void cartLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartLabelMouseClicked

        this.buyTicketsPanel.hide();
        this.cartTablePanel.show();
        this.SettingsPanel.hide();
        this.AboutUsPanel.hide();

        numOfTicketsLabel.setText("Number of Tickets: " + numberOfTickets);
        int tesztCount = 0;
        for (int i = 0; i < cartTable.getRowCount(); i++) {
            tesztCount += Integer.parseInt((String) cartTable.getValueAt(i, 7).toString().replaceAll(" EUR", ""));
        }

        if (tesztCount > total || total == 0) {
            for (int i = 0; i < cartTable.getRowCount(); i++) {
                total += Integer.parseInt((String) cartTable.getValueAt(i, 7).toString().replaceAll(" EUR", ""));
            }
        }

        totalPay.setText("To be pay in total: " + total + " EUR");

    }//GEN-LAST:event_cartLabelMouseClicked

    private void numOfticketstoBuyTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfticketstoBuyTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfticketstoBuyTextfieldActionPerformed

    private void myTicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTicketsMouseClicked

        MyTickets.getObj().setVisible(true);
        MyTickets.getObj().loadMyTickets();
        MyTickets.getObj().setLocationRelativeTo(null);


    }//GEN-LAST:event_myTicketsMouseClicked


    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked

        buyTicketsPanel.hide();
        cartTablePanel.hide();
        SettingsPanel.show();
        this.AboutUsPanel.hide();

        try {
            String sql2 = "Select Email from registration_info where Customer_id = " + customerId;
            ResultSet r = lekerdezes(sql2);
            String email = "";
            while (r.next()) {
                email = r.getString("Email");
            }

            String sql = "Select FirstName, LastName, Email, phoneNumber,  Gender From registration_info where Email LIKE '" + email + "' AND CustomerPassword Like '" + md5password(passwordTextField.getText()) + "'";

            ResultSet result = lekerdezes(sql);
            String kapcsolattarto = "";
            String email2 = null, phonenumber = null, gender = null;
            if (result.next()) {
                kapcsolattarto = result.getString("FirstName");
                kapcsolattarto += " " + result.getString("LastName");
                email2 = result.getString("Email");
                phonenumber = result.getString("phoneNumber");
                gender = result.getString("Gender");

            }

            namelab.setText(kapcsolattarto);
            settingsEmailAddressTextfield.setText(email);
            settingsPhoneNumberTextfield.setText(phonenumber);
            settingsEmailAddressTextfield.setEditable(false);
            settingsPhoneNumberTextfield.setEditable(false);

            if (gender.matches("Woman")) {
                URL img2 = this.getClass().getResource("/szakdolgozat/woman.png");
                ImageIcon imgThisImg = new ImageIcon(img2);
                genderIcon.setIcon(imgThisImg);
            } else {
                URL img2 = this.getClass().getResource("/szakdolgozat/man.png");
                ImageIcon imgThisImg = new ImageIcon(img2);
                genderIcon.setIcon(imgThisImg);

            }
            cartTableUserPanel.setSelectionModel(new ForcedListSelectionModel());
        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_SettingsMouseClicked

    //kosár kezelése, ha törlünk egy jegyet
    private void deletePassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePassengerMouseClicked

        if (!cartTable.getSelectionModel().isSelectionEmpty()) {

            DefaultTableModel model = (DefaultTableModel) cartTableUserPanel.getModel();

            int selectedPassengerPrice = Integer.parseInt((String) cartTable.getValueAt(cartTable.getSelectedRow(), 7).toString().replace(" EUR", ""));

            total = total - selectedPassengerPrice;
            model.removeRow(cartTableUserPanel.getSelectedRow());
            numberOfTickets = cartTable.getRowCount();
            numOfTicketsLabel.setText("Number of Tickets: " + numberOfTickets);

            totalPay.setText("To be pay in total: " + total + " EUR");

        } else {
            errorPopUp("Please select a passenger!");
        }


    }//GEN-LAST:event_deletePassengerMouseClicked

    private void buyTicketsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketsButtonMouseClicked

        if (cartTable.getRowCount() == 0) {

            errorPopUp("No ticket in the cart!");
        } else {
            Pay.getObj().setVisible(true);

            Pay.getObj().setLocationRelativeTo(null);

        }


    }//GEN-LAST:event_buyTicketsButtonMouseClicked

    //settings, beállításokban textfield megváltoztatására hívófüggyvény
    int changecounter = 0;

    private void changeTextfield(JTextField textfield) {
        changecounter++;
        if (changecounter % 2 == 1) {
            textfield.setEditable(true);
            textfield.setOpaque(true);
            textfield.setBorder(new LineBorder(Color.BLACK));
            textfield.setForeground(Color.black);
            textfield.setCaretColor(Color.BLACK);
        } else {
            saveTextField(textfield);

        }

    }
//settings, beállításokban textfield megváltoztatásának visszavonása,  hívófüggyvény

    private void saveTextField(JTextField textfield) {
        textfield.setText(textfield.getText());
        textfield.setOpaque(false);
        textfield.setEditable(false);
        textfield.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        textfield.setForeground(new Color(102, 255, 255));
        textfield.setCaretColor(new Color(102, 255, 255));

    }

    //feldob egy ablakot egy információ ikonnal és megadhatunk neki egy szöveget is.
    public void sikerespopUp(String text) {
        JOptionPane.showMessageDialog(this,
                text);

    }

//telefonszama és email cím mentése
    private void saveSettingsNumberSettingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveSettingsNumberSettingsButtonMouseClicked

        String sql = null;

        String teloesemail = "Select phoneNumber, Email from registration_info where Customer_id = " + customerId;
        String telo = "", email = "";
        try {
            ResultSet r = lekerdezes(teloesemail);

            while (r.next()) {
                telo = r.getString("phoneNumber");
                email = r.getString("Email");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!telo.equals(settingsPhoneNumberTextfield.getText())) {

            if (!isPhoneAlreadyRegistered(settingsPhoneNumberTextfield.getText())) {

                if (isPhoneNumberValid(settingsPhoneNumberTextfield.getText())) {
                    if (settingsPhoneNumberTextfield.getText().matches("")) {
                        errorPopUp("Phone number is missing!");

                    } else {
                        sql = "Update registration_info SET phoneNumber = '" + settingsPhoneNumberTextfield.getText() + "' where Customer_id= " + customerId;
                        sikerespopUp("New phone number saved!");
                        saveTextField(settingsPhoneNumberTextfield);
                    }

                } else {

                    errorPopUp("Wrong phone number format!");
                }

            } else {
                errorPopUp("This phone number is already registered!");
            }
        }
        String sql2 = null;
        if (!email.matches(settingsEmailAddressTextfield.getText())) {

            if (!isEmailAlreadyRegistered(settingsEmailAddressTextfield.getText())) {
                if (isEmailValid(settingsEmailAddressTextfield.getText())) {
                    if (settingsEmailAddressTextfield.getText().matches("")) {
                        errorPopUp("Email is missing!");
                    } else {
                        sql2 = "Update registration_info SET email = '" + settingsEmailAddressTextfield.getText() + "' where Customer_id= " + customerId;
                        sikerespopUp("New email saved!");
                        saveTextField(settingsEmailAddressTextfield);
                    }

                } else {
                    errorPopUp("Wrong email format!");
                }

            } else {
                errorPopUp("This email is already registered!");
            }
        }

        try {
            if (sql != null) {
                sqlUpdate(sql);
            }

            if (sql2 != null) {
                sqlUpdate(sql2);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_saveSettingsNumberSettingsButtonMouseClicked


    private void changePhoneNumberButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePhoneNumberButtonMouseClicked
        changeTextfield(settingsPhoneNumberTextfield);
    }//GEN-LAST:event_changePhoneNumberButtonMouseClicked

    private void changeEmailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeEmailButtonMouseClicked
        changeTextfield(settingsEmailAddressTextfield);
    }//GEN-LAST:event_changeEmailButtonMouseClicked

    private void AboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseClicked
        this.AboutUsPanel.show();
        this.SettingsPanel.hide();
        this.buyTicketsPanel.hide();
        this.cartTablePanel.hide();

        System.out.println(maiDatum());
    }//GEN-LAST:event_AboutUsMouseClicked

    private void registrationPasswordAgainTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationPasswordAgainTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrationPasswordAgainTextFieldActionPerformed

    private void destinationAirportNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinationAirportNameComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String airportName = destinationAirportNameComboBox.getSelectedItem().toString();
        }
    }//GEN-LAST:event_destinationAirportNameComboBoxItemStateChanged

    private String maiDatum() {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int min = now.getMinute();
        int sec = now.getSecond();
        String mai = year + "-" + month + "-" + day + " " + hour + ":" + min + ":" + sec;

        return mai;
    }

    //Kivételek kezelése, hibavédések
    private boolean adminErrorHandling() {

        try {
            if (departureTimejDateChooser.getDate() != null && arrivalTImejDateChooser.getDate() != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                String arrival = dateFormat.format(arrivalTImejDateChooser.getDate()) + " " + ArrivalTimeHourComboBox.getSelectedItem() + ":" + ArrivalTimeMinComboBox.getSelectedItem() + ":" + "00";
                String depdate = dateFormat.format(departureTimejDateChooser.getDate()) + " " + departureTimeHourComboBox.getSelectedItem() + ":" + departureTimeMinuteComboBox.getSelectedItem() + ":00";

                System.out.println(depdate);
                SimpleDateFormat hasonlito = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                if (hasonlito.parse(maiDatum()).after(hasonlito.parse(depdate)) || hasonlito.parse(maiDatum()).after(hasonlito.parse(arrival)) || hasonlito.parse(depdate).after(hasonlito.parse(arrival))) {
                    errorPopUp("You cant give a date like that!");
                    return false;
                }

            } else {

                errorPopUp("Please enter the travel frame!");
                return false;
            }

            if (originAirportNameComboBox.getSelectedItem() == "") {
                errorPopUp("Origin airport name is missing!");
                return false;
            }
            if (destinationAirportNameComboBox.getSelectedItem() == "") {

                errorPopUp("Destination airport name is missing!");
                return false;
            }
            int usz = Integer.parseInt(numberOfSeatsTextField.getText());
            if (usz < 0 || usz > 230) {

                errorPopUp("Maximum number of seats can't be more than 230!");
                return false;
            }
            if (originAirportNameComboBox.getSelectedItem() != null && destinationAirportNameComboBox.getSelectedItem() != null) {

                if (originAirportNameComboBox.getSelectedItem().equals(destinationAirportNameComboBox.getSelectedItem())) {
                    errorPopUp("Please select another destination.");

                    return false;

                }

            } else {
                errorPopUp("Please select airports!");
                return false;
            }

            if (Integer.parseInt(promotionTextField.getText()) <= 0) {
                errorPopUp("The discount cannot be negativ!");
                return false;
            }
            if (Integer.parseInt(priceOfTheFlightTextField.getText()) < 0) {
                errorPopUp("The price cannot be negativ!");
                return false;
            }

        } catch (ParseException ex) {
            System.out.println(ex);
        }

        return true;
    }

    public boolean onlyNumber(String text) {
        boolean result = text.matches("[0-9]+");
        return result;
    }

    public void errorPopUp(String text) {
        JOptionPane.showMessageDialog(this,
                text,
                "Error",
                JOptionPane.ERROR_MESSAGE);

    }

    public boolean isRegistrationErrorHandling() {

        if (firstNameTextfield.getText().matches("")) {
            errorPopUp("Please write a first name!");
            return false;
        }

        if (lastNameTextfield.getText().matches("")) {
            errorPopUp("Please write a last name!");
            return false;
        }
        if (stringErrorHandling(firstNameTextfield.getText(), firstNameLabel) != "") {
            errorPopUp(stringErrorHandling(firstNameTextfield.getText(), firstNameLabel));
            return false;
        }

        if (stringErrorHandling(lastNameTextfield.getText(), lastNameLabel) != "") {
            errorPopUp(stringErrorHandling(lastNameTextfield.getText(), lastNameLabel));
            return false;
        }

        if (zipCodeTextfield.getText().matches("")) {
            errorPopUp("Zip code is missing!");
            return false;
        }
        if (!onlyNumber(zipCodeTextfield.getText())) {
            errorPopUp("Zip code can contains only numbers!");
            return false;
        }

        if (zipCodeTextfield.getText().length() < 4 || zipCodeTextfield.getText().length() > 8) {
            errorPopUp("Wrong zip code length!");
            return false;
        }

        if (cityTextfield.getText().matches("")) {
            errorPopUp("City is missing!");
            return false;
        }

        if (stringErrorHandling(cityTextfield.getText(), cityLabel) != "") {
            errorPopUp(stringErrorHandling(cityTextfield.getText(), cityLabel));
            return false;
        }

        if (streetTextfield.getText().matches("")) {
            errorPopUp("Street is missing!");
            return false;
        }
        if (countryComboBox.getSelectedItem().equals("")) {
            errorPopUp("Country is missing!");
            return false;
        }
        if (stringErrorHandling((String) countryComboBox.getSelectedItem(), countryLabel) != "") {
            errorPopUp(stringErrorHandling((String) countryComboBox.getSelectedItem(), countryLabel));
            return false;
        }

        if (phoneNumberTextfield.getText().matches("")) {
            errorPopUp("Phone number is missing!");
            return false;
        }
        if (!isPhoneNumberValid(phoneNumberTextfield.getText())) {
            errorPopUp("Wrong phone number!");
            return false;
        }

        if (emailTextfield.getText().matches("")) {
            errorPopUp("Email is missing");
            return false;
        }

        if (!isEmailValid(emailTextfield.getText())) {
            errorPopUp("Wrong Email!");
            return false;
        }
        if (registrationPasswordTextField.getText().matches("")) {
            errorPopUp("Please write a password!");
            return false;

        }

        if (!registrationPasswordTextField.getText().matches(registrationPasswordAgainTextField.getText())) {
            errorPopUp("The two passwords do not match!");

            return false;
        }

        if (!manRadioButton.isSelected() && !womanRadioButton.isSelected()) {
            errorPopUp("Please select a gender!");

            return false;
        }
        if (isEmailAlreadyRegistered(emailTextfield.getText()) == true) {
            errorPopUp("Have already registered with this email address");
            return false;
        }
        if (isPhoneAlreadyRegistered(phoneNumberTextfield.getText()) == true) {
            errorPopUp("Have already registered with this phone number!");
            return false;
        }

        return true;

    }

    private boolean isPhoneAlreadyRegistered(String phone) {

        try {
            String sql = "SELECT phoneNumber FROM registration_info WHERE phoneNumber LIKE '" + phone + "'";

            ResultSet rs = lekerdezes(sql);

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean isEmailAlreadyRegistered(String email) {

        try {
            String sql = "SELECT Email FROM registration_info WHERE Email LIKE '" + email + "'";

            ResultSet rs = lekerdezes(sql);

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isSeatsAvailable() {

        if ((String) BuyTicketsTable.getValueAt(BuyTicketsTable.getSelectedRow(), 6) == "0") {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkAdmin() {

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
            String sql = "Select Email, Password From admins where Email LIKE '" + loginEmailTextField.getText() + "' AND Password Like '" + password + "'";

            ResultSet result = lekerdezes(sql);
            if (result.next()) {

                return true;

            } else {
                loginErrorLabel.setText("Wrong email or password!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean isCheckUserLogin() {

        try {

            String sql = "Select Email, CustomerPassword From registration_info where Email LIKE '" + loginEmailTextField.getText() + "' AND CustomerPassword Like '" + md5password(passwordTextField.getText()) + "'";

            ResultSet result = lekerdezes(sql);
            if (result.next()) {
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean containsUpperCaseLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public String stringErrorHandling(String text, JLabel l) {

        if (text.length() > 20) {

            return "Text is too long" + text;
        }

        String labeltext = l.getText().replaceAll(":", "");
        char[] chars = text.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {

                return labeltext + " can contains only letters!";

            }
        }

        if (!containsUpperCaseLetter(text)) {
            return labeltext + " needs to start with uppercase!";
        }

        return "";
    }

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public static boolean patternMatches1(String phoneNum, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(phoneNum)
                .matches();
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        String regexpattern = "^(\\+?36)?[ -]?(\\d{1,2}|(\\(\\d{1,2}\\)))/?([ -]?\\d){6,7}$";

        return patternMatches1(phoneNumber, regexpattern);
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
        URL img2 = this.getClass().getResource("/szakdolgozat/person_at_airport_holding_coffee_and_luggage.jpg");

        BufferedImage img = null;
        try {

            img = ImageIO.read(img2);
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
        limittexfieldnumbers(numberOfSeatsTextField, 3);
        limittexfieldnumbers(priceOfTheFlightTextField, 3);
        limittexfieldnumbers(promotionTextField, 2);

    }

    public void setCursorOnLabel(JLabel label) {

        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public String alahuzva(String text) {

        return "<html><u>" + text + "</u></html>";
    }

    public void showUserPanel() {
        cartLabel.setText(alahuzva("Cart"));
        logOutLabel.setText(alahuzva("Log out"));
        buyTicketsLabel.setText(alahuzva("Buy Tickets"));
        aboutUs.setText(alahuzva("About Us"));
        Settings.setText(alahuzva("Settings"));
        myTickets.setText(alahuzva("My Tickets"));
        setCursorOnLabel(cartLabel);
        setCursorOnLabel(buyTicketsLabel);
        setCursorOnLabel(logOutLabel);
        setCursorOnLabel(Settings);
        setCursorOnLabel(cartLabel);
        setCursorOnLabel(aboutUs);
        setCursorOnLabel(myTickets);

        BuyTicketsTable.show();
        UserPanel.show();
        SettingsPanel.hide();
        AboutUsPanel.hide();

    }

    public void dontShowUserPanel() {

        UserPanel.hide();

    }

    public void dontShowAdminPanel() {

        AdminPanel.hide();

    }

    public void dontShowRegistrationPanel() {

        RegistrationPanel.hide();

    }

    public void showRegistrationPanel() {
        RegistrationPanel.show();

    }

    public void dontShowLoginPanel() {
        this.loginPanel.hide();

    }

    public void ShowLoginPanel() {

        this.loginPanel.show();

        this.registrationLabel.setText(alahuzva("Registration"));
        setCursorOnLabel(registrationLabel);
        this.forgotPasswordLabel.setText(alahuzva("Forgot password? Click Here."));
        setCursorOnLabel(forgotPasswordLabel);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutUsPanel;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JComboBox ArrivalTimeHourComboBox;
    private javax.swing.JComboBox ArrivalTimeMinComboBox;
    private javax.swing.JTable BuyTicketsTable;
    private javax.swing.JLabel ComeJlabel;
    private javax.swing.JLabel ContactPhoneNumberLabel;
    private javax.swing.JLabel EURlabel;
    private javax.swing.JLabel FlywithusJlabel;
    private javax.swing.JButton ManageFlightButton;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JLabel Settings;
    private javax.swing.JPanel SettingsPanel;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JLabel aboutUs;
    private javax.swing.JLabel aboutUsText;
    private javax.swing.JTable addFlightTable;
    private javax.swing.JButton adminBackButton;
    private javax.swing.JButton adminRegisterFlightButton;
    private javax.swing.JLabel arrHourLabel;
    private com.toedter.calendar.JDateChooser arrivalTImejDateChooser;
    private javax.swing.JLabel arrivalTimeLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel blackBackgroundLabel;
    private javax.swing.JLabel bluebackgroundLabel;
    private javax.swing.JButton buyTicketsButton;
    private javax.swing.JScrollPane buyTicketsJscrollPane;
    private javax.swing.JLabel buyTicketsLabel;
    private javax.swing.JPanel buyTicketsPanel;
    private javax.swing.JScrollPane cartJtable;
    private javax.swing.JLabel cartLabel;
    private javax.swing.JPanel cartTablePanel;
    private javax.swing.JTable cartTableUserPanel;
    private javax.swing.JButton changeEmailButton;
    private javax.swing.JButton changePhoneNumberButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextfield;
    private javax.swing.JLabel closeProgramIconOnAdminPanel;
    private javax.swing.JLabel closeProgramIconOnLoginPanel;
    private javax.swing.JLabel closeProgramIconOnRegistration;
    private javax.swing.JLabel closeProgramIconOnUserPanel;
    private javax.swing.JLabel contactAddressLabel;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JComboBox countryComboBox;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton deleteButon;
    private javax.swing.JButton deletePassenger;
    private javax.swing.JLabel depHourLabel;
    private javax.swing.JLabel depMinLabel;
    private javax.swing.JComboBox departureTimeHourComboBox;
    private javax.swing.JLabel departureTimeLabel;
    private javax.swing.JComboBox departureTimeMinuteComboBox;
    private com.toedter.calendar.JDateChooser departureTimejDateChooser;
    private javax.swing.JLabel depminLabel;
    private javax.swing.JComboBox<String> destinationAirportNameComboBox;
    private javax.swing.JComboBox<String> destinationCountryComboBox;
    private javax.swing.JLabel destinationPlaceLabel;
    private javax.swing.JLabel destinationPlaceLabel1;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextfield;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextfield;
    private javax.swing.JLabel forgotPasswordLabel;
    private javax.swing.JLabel genderErrorLabel;
    private javax.swing.JLabel genderIcon;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel myTickets;
    private javax.swing.JLabel namelab;
    public static javax.swing.JLabel numOfTicketsLabel;
    private javax.swing.JComboBox numOfticketstoBuyTextfield;
    private javax.swing.JLabel numberOfSeats;
    private javax.swing.JLabel numberOfSeats1;
    private javax.swing.JLabel numberOfSeats2;
    private javax.swing.JTextField numberOfSeatsTextField;
    private javax.swing.JComboBox originAirportNameComboBox;
    private javax.swing.JComboBox originCountryComboBox;
    private javax.swing.JLabel originPlaceLabel;
    private javax.swing.JLabel originPlaceLabel1;
    private javax.swing.JLabel ourDepartingFlightsLabel;
    private javax.swing.JLabel passwordAgainLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextfield;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField priceOfTheFlightTextField;
    private javax.swing.JLabel promotionLabel;
    private javax.swing.JTextField promotionTextField;
    private javax.swing.JLabel registartionLabel;
    private javax.swing.JButton registrationButton;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JPasswordField registrationPasswordAgainTextField;
    private javax.swing.JLabel registrationPasswordErrorHandlingLabel;
    private javax.swing.JLabel registrationPasswordLabel;
    private javax.swing.JPasswordField registrationPasswordTextField;
    private javax.swing.JButton reservationButton;
    private javax.swing.JButton saveSettingsNumberSettingsButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTextfield;
    private javax.swing.JTextField settingsEmailAddressTextfield;
    private javax.swing.JTextField settingsPhoneNumberTextfield;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetTextfield;
    private javax.swing.JLabel szazalek;
    public static javax.swing.JLabel totalPay;
    private javax.swing.JLabel userBackgroundLabel;
    private javax.swing.JLabel userDestinationCountryLabel;
    private javax.swing.JRadioButton womanRadioButton;
    private javax.swing.JTextField zipCodeTextfield;
    // End of variables declaration//GEN-END:variables

}
