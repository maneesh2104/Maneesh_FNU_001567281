/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.mycompany.assignment1.Medical;

/**
 *
 * @author maneesh
 */
public class ViewMedicalPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMedicalPanel
     */
    Medical medicalDetails;
    public ViewMedicalPanel(Medical medicalDetails) {
        initComponents();
        this.medicalDetails = medicalDetails;
        
        txtRecordNumber.setText(medicalDetails.getRecordNumber());
        txtAllergy1.setText(medicalDetails.getAllergy1());
        txtAllergy2.setText(medicalDetails.getAllergy2());
        txtAllergy3.setText(medicalDetails.getAllergy3());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRecordNumber = new javax.swing.JTextField();
        lblRoutingNumber = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        txtAllergy1 = new javax.swing.JTextField();
        txtAllergy2 = new javax.swing.JTextField();
        lblAccountBalance = new javax.swing.JLabel();
        txtAllergy3 = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();

        setBackground(new java.awt.Color(219, 219, 148));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecordNumberActionPerformed(evt);
            }
        });
        add(txtRecordNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 56, 248, -1));

        lblRoutingNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblRoutingNumber.setText("Allergy 1");
        add(lblRoutingNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 98, -1, -1));

        lblAccountNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAccountNumber.setText("Allergy 2");
        add(lblAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 136, -1, -1));
        add(txtAllergy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 94, 250, -1));
        add(txtAllergy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 132, 250, -1));

        lblAccountBalance.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAccountBalance.setText("Allergy 3");
        add(lblAccountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 174, -1, -1));
        add(txtAllergy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 250, -1));

        lblBankName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblBankName.setText("Record Number");
        add(lblBankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 60, -1, -1));

        lblHeader.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Medical information");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, 404, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecordNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecordNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAccountBalance;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtAllergy1;
    private javax.swing.JTextField txtAllergy2;
    private javax.swing.JTextField txtAllergy3;
    private javax.swing.JTextField txtRecordNumber;
    // End of variables declaration//GEN-END:variables
}
