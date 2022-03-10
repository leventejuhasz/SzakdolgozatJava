/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakdolgozat;

import com.mysql.cj.Session;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.security.AuthProvider;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Pattern;
import jdk.nashorn.internal.codegen.CompilerConstants;

import javax.mail.*;

/**
 *
 * @author User
 */
public class ForgotPassword extends javax.swing.JFrame {

    public ForgotPassword() {
        initComponents();
    }

    private int randomCode;

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public void testUsingSimpleRegex() {
        String emailAddress = forgotPasswordTextfield.getText();
        String regexPattern = "^(.+)@(\\S+)$";
        if (patternMatches(emailAddress, regexPattern)) {
            resultLabel.setText("We have send the verification code!");
            System.out.println("sadas");
        } else {
            resultLabel.setText("Invalid email format!");
            System.out.println("dsada");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        forgotPasswordTextfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(forgotPasswordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 360, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Please write your email here so we can send a varification code!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        sendButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sendButton.setForeground(new java.awt.Color(0, 0, 0));
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        resultLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 310, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        testUsingSimpleRegex();

        Properties prop = new Properties();

        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", 587);

        String myAccountsEmail = "xxxx@gmail.com";
        String myPassword = "xxxxxxxxxxx";
        



    }//GEN-LAST:event_sendButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField forgotPasswordTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
