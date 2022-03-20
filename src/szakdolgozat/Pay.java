/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakdolgozat;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

/**
 *
 * @author User
 */
public class Pay extends javax.swing.JFrame {

    public Pay() {
        initComponents();
        payNowButton.setBounds(70, 80, 100, 30);
        payNowButton.setBorder(new RoundedBorder(15));
        mozgato();
        designPaymentInterface();
    }

    private void designPaymentInterface() {
        this.cancelPaymentsLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        limittexfieldnumbers(first4CardNumber, 4);
        limittexfieldnumbers(second4CardNumber, 4);
        limittexfieldnumbers(third4CardNumber, 4);
        limittexfieldnumbers(last4CardNumber, 4);
        limittexfieldnumbers(monthTextfield, 2);
        limittexfieldnumbers(yearTextfield, 2);
        limittexfieldnumbers(cvcTextField, 3);

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
        payNowButton = new javax.swing.JButton();
        cardholderlabel = new javax.swing.JLabel();
        cardnumberlabel = new javax.swing.JLabel();
        cvcLabel = new javax.swing.JLabel();
        cvcTextField = new javax.swing.JTextField();
        monthTextfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cardIconLabel = new javax.swing.JLabel();
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
        yearTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextfieldActionPerformed(evt);
            }
        });
        jPanel1.add(yearTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 30, 20));

        expireslabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        expireslabel.setForeground(new java.awt.Color(255, 255, 255));
        expireslabel.setText("Expires");
        jPanel1.add(expireslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        payNowButton.setBackground(new java.awt.Color(0, 255, 51));
        payNowButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        payNowButton.setForeground(new java.awt.Color(255, 255, 255));
        payNowButton.setText("Pay now");
        payNowButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));
        payNowButton.setBorderPainted(false);
        payNowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payNowButtonMouseClicked(evt);
            }
        });
        jPanel1.add(payNowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 450, 50));

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

        whitebackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/szakdolgozat/white-color-solid-background-1920x1080.png"))); // NOI18N
        whitebackground.setText("jLabel4");
        jPanel1.add(whitebackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelPaymentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelPaymentsLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelPaymentsLabelMouseClicked

    private void payNowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payNowButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_payNowButtonMouseClicked

    private void yearTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextfieldActionPerformed

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
    private javax.swing.JButton payNowButton;
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

class RoundedBorder implements Border {

    private int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
