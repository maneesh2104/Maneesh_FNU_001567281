/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.mycompany.assignment1.License;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author maneesh
 */
public class ViewDrivingPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDrivingPanel
     */
    License driving;
    public ViewDrivingPanel(License driving){
        initComponents();
        this.driving = driving;
        
        txtBloodType.setText(driving.getBloodType());
        txtDateOfExpiry.setText(driving.getDateOfExpiration());
        txtDateOfIssue.setText(driving.getDateOfIssue());
        txtLicenseNumber.setText(driving.getNumber());
        try {
            ImageIcon i = new ImageIcon(ImageIO.read(new File(driving.getFileName())));
            BufferedImage img = ImageIO.read(new File(driving.getFileName()));
            Image ig = img.getScaledInstance(450, 300,Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(ig);
            jLabel1.setIcon(icon);
        }
        catch (Exception ex) {
            System.out.println("ERROR");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBloodType = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        lblRoutingNumber = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        txtDateOfIssue = new javax.swing.JTextField();
        txtDateOfExpiry = new javax.swing.JTextField();
        lblAccountBalance = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(187, 187, 234));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 169, 240, -1));

        lblBankName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblBankName.setText("License Number");
        add(lblBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 60, -1, -1));

        lblHeader.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Driver's license information");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, 390, -1));

        txtLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNumberActionPerformed(evt);
            }
        });
        add(txtLicenseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 55, 241, -1));

        lblRoutingNumber.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRoutingNumber.setText("Date of Issue");
        add(lblRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 98, -1, -1));

        lblAccountNumber.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblAccountNumber.setText("Date of Expiry");
        add(lblAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 136, -1, -1));
        add(txtDateOfIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 93, 241, -1));
        add(txtDateOfExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 131, 240, -1));

        lblAccountBalance.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblAccountBalance.setText("Blood tpe");
        add(lblAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 174, -1, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 528, 178));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Uploaded Image");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 397, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAccountBalance;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtBloodType;
    private javax.swing.JTextField txtDateOfExpiry;
    private javax.swing.JTextField txtDateOfIssue;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables
}
