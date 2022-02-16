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
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Juhász Levente
 */
public class Kezdooldal extends javax.swing.JFrame {

    private ArrayList<User> users;

    public Kezdooldal() {
        initComponents();

    }

    public void showAdminPanel() {

        AdminPanel.show();
        System.out.println("admin panel be");
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

    public boolean isPhoneNumberValid(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(\\+?36)?[ -]?(\\d{1,2}|(\\(\\d{1,2}\\)))/?([ -]?\\d){6,7}$");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whiteBackgroundLabel = new javax.swing.JLabel();
        flightsManagementPanel = new javax.swing.JPanel();
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
        flightNumLabel1 = new javax.swing.JLabel();
        departureTimeLabel = new javax.swing.JLabel();
        arrivalTimeLabel = new javax.swing.JLabel();
        originPlaceLabel = new javax.swing.JLabel();
        destinationPlaceLabel = new javax.swing.JLabel();
        numberOfSeats = new javax.swing.JLabel();
        flightNumTextField = new javax.swing.JTextField();
        departureTimeTextField = new javax.swing.JTextField();
        arrivalTimeTextField = new javax.swing.JTextField();
        originPlaceTextField = new javax.swing.JTextField();
        destinationPlaceTextfield = new javax.swing.JTextField();
        numberOfSeatsTextField = new javax.swing.JTextField();
        adminRegisterFlightButton = new javax.swing.JButton();
        adminBackButton = new javax.swing.JButton();
        addRowButton = new javax.swing.JButton();
        deleteButon = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addFlightTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        whiteBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/305614_2.jpg"))); // NOI18N
        whiteBackgroundLabel.setText("jLabel2");

        flightsManagementPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
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
        loginPanel.add(leftBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 700));

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
        loginPanel.add(bluebackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -10, 710, 710));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

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
        firstNameTextfield.setText("Juhász");
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
        RegistrationPanel.add(genderErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, -1));
        RegistrationPanel.add(luggagePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        getContentPane().add(RegistrationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

        AdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flightNumLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        flightNumLabel1.setForeground(new java.awt.Color(0, 0, 0));
        flightNumLabel1.setText("Flight Number: ");
        AdminPanel.add(flightNumLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 40));

        departureTimeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        departureTimeLabel.setForeground(new java.awt.Color(0, 0, 0));
        departureTimeLabel.setText("Departure Time: ");
        AdminPanel.add(departureTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        arrivalTimeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        arrivalTimeLabel.setForeground(new java.awt.Color(0, 0, 0));
        arrivalTimeLabel.setText("Arrival Time: ");
        AdminPanel.add(arrivalTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        originPlaceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        originPlaceLabel.setForeground(new java.awt.Color(0, 0, 0));
        originPlaceLabel.setText("Origin Place: ");
        AdminPanel.add(originPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        destinationPlaceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        destinationPlaceLabel.setForeground(new java.awt.Color(0, 0, 0));
        destinationPlaceLabel.setText("Destination Place: ");
        AdminPanel.add(destinationPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        numberOfSeats.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numberOfSeats.setForeground(new java.awt.Color(0, 0, 0));
        numberOfSeats.setText("Number of Seats: ");
        AdminPanel.add(numberOfSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        flightNumTextField.setText("13424");
        AdminPanel.add(flightNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 200, 30));

        departureTimeTextField.setText("2022.11.01 12:50");
        AdminPanel.add(departureTimeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, 30));

        arrivalTimeTextField.setText("2022.11.03 13:40");
        AdminPanel.add(arrivalTimeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, 30));

        originPlaceTextField.setText("Hungary");
        AdminPanel.add(originPlaceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, 30));

        destinationPlaceTextfield.setText("Flo Rida");
        AdminPanel.add(destinationPlaceTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 30));

        numberOfSeatsTextField.setText("100");
        numberOfSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfSeatsTextFieldActionPerformed(evt);
            }
        });
        AdminPanel.add(numberOfSeatsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 50, -1));

        adminRegisterFlightButton.setBackground(new java.awt.Color(0, 0, 0));
        adminRegisterFlightButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adminRegisterFlightButton.setForeground(new java.awt.Color(255, 255, 255));
        adminRegisterFlightButton.setText("Register");
        adminRegisterFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRegisterFlightButtonActionPerformed(evt);
            }
        });
        AdminPanel.add(adminRegisterFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, 50));

        adminBackButton.setBackground(new java.awt.Color(0, 0, 0));
        adminBackButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        adminBackButton.setForeground(new java.awt.Color(255, 255, 255));
        adminBackButton.setText("Back");
        adminBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackButtonActionPerformed(evt);
            }
        });
        AdminPanel.add(adminBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 100, 40));

        addRowButton.setBackground(new java.awt.Color(0, 0, 0));
        addRowButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addRowButton.setForeground(new java.awt.Color(255, 255, 255));
        addRowButton.setText("Add row");
        addRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowButtonActionPerformed(evt);
            }
        });
        AdminPanel.add(addRowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, -1, 40));

        deleteButon.setBackground(new java.awt.Color(0, 0, 0));
        deleteButon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteButon.setForeground(new java.awt.Color(255, 255, 255));
        deleteButon.setText("Delete Flight");
        AdminPanel.add(deleteButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 140, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AdminPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 70, 30));

        addFlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Departure Time", "Arrival Time", "Origin Place", "Destination Place", "Number of Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(addFlightTable);

        AdminPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 690, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/white-color-solid-background-1920x1080.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        AdminPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -20, -1, -1));

        getContentPane().add(AdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 700));

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

    public String stringErrorHandling(String text) {

        if (text.length() > 20) {

            return "Túl hosszú a " + text;
        }

        if (!Pattern.matches("[a-zA-Z]+", text)) {
            // Do something
            return "Nem tartalmazhat számot!";
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

//            loginErrorLabel.setText("Hibás felhasználónév vagy jelszó!");
            ps = con.prepareStatement("Select Email, Password From admins where Email LIKE '" + loginEmailTextField.getText() + "' AND Password Like '" + password + "'");
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void logginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logginButtonActionPerformed

        if (checkAdmin()) {
            dontShowLoginPanel();
            dontShowRegistrationPanel();
            showAdminPanel();
            System.out.println("admin");
        }

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

//                loginErrorLabel.setText("Hibás felhasználónév vagy jelszó!");
            ps = con.prepareStatement("Select Email, CustomerPassword From registration_info where Email LIKE '" + loginEmailTextField.getText() + "' AND CustomerPassword Like '" + password + "'");
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                System.out.println("felh");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Kezdooldal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_logginButtonActionPerformed

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public boolean isEmailValid(String email) {
        String emailAddress = email;
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@"
                + "[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return patternMatches(emailAddress, regexPattern);
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

    private void addRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowButtonActionPerformed

        System.out.println("asdasd");
    }//GEN-LAST:event_addRowButtonActionPerformed

    private void adminRegisterFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRegisterFlightButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) addFlightTable.getModel();

        model.addRow(
                new Object[]{
                    flightNumTextField.getText(),
                    departureTimeTextField.getText(),
                    arrivalTimeTextField.getText(),
                    originPlaceTextField.getText(),
                    arrivalTimeTextField.getText(),
                    numberOfSeatsTextField.getText()}
        );

//        addFlightTable.setModel(model);
        System.out.println("sadasdasdas");


    }//GEN-LAST:event_adminRegisterFlightButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kezdooldal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kezdooldal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kezdooldal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kezdooldal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JLabel ComeJlabel;
    private javax.swing.JLabel FlywithusJlabel;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JTable addFlightTable;
    private javax.swing.JButton addRowButton;
    private javax.swing.JButton adminBackButton;
    private javax.swing.JButton adminRegisterFlightButton;
    private javax.swing.JLabel arrivalTimeLabel;
    private javax.swing.JTextField arrivalTimeTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bluebackgroundLabel;
    private javax.swing.JLabel cityErrorLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextfield;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JLabel countryErrorLabel;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTextfield;
    private javax.swing.JButton deleteButon;
    private javax.swing.JLabel departureTimeLabel;
    private javax.swing.JTextField departureTimeTextField;
    private javax.swing.JLabel destinationPlaceLabel;
    private javax.swing.JTextField destinationPlaceTextfield;
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextfield;
    private javax.swing.JLabel firstNameErrorLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextfield;
    private javax.swing.JLabel flightNumLabel1;
    private javax.swing.JTextField flightNumTextField;
    private javax.swing.JPanel flightsManagementPanel;
    private javax.swing.JLabel genderErrorLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameErrorLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextfield;
    private javax.swing.JLabel leftBackgroundLabel;
    private javax.swing.JButton logginButton;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JTextField loginEmailTextField;
    private javax.swing.JLabel loginErrorLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel luggagePic;
    private javax.swing.JRadioButton manRadioButton;
    private javax.swing.JLabel numberOfSeats;
    private javax.swing.JTextField numberOfSeatsTextField;
    private javax.swing.JLabel originPlaceLabel;
    private javax.swing.JTextField originPlaceTextField;
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
    private javax.swing.JLabel streetErrorLabel;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetTextfield;
    private javax.swing.JLabel succesfullRegistrationLabel;
    private javax.swing.JLabel whiteBackgroundLabel;
    private javax.swing.JRadioButton womanRadioButton;
    private javax.swing.JLabel zipCodeErrorLabel;
    private javax.swing.JTextField zipCodeTextfield;
    // End of variables declaration//GEN-END:variables

}
