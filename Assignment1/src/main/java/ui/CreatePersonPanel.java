/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.mycompany.assignment1.Person;

/**
 *
 * @author maneesh
 */
public class CreatePersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonPanel
     */
    Person person;
    public CreatePersonPanel(Person person) {
        initComponents();
        this.person = person;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(201, 103, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Fill personal details");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 21, 399, -1));

        lblLastName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblLastName.setText("Last Name");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 99, -1, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPhoneNumber.setText("Phone Number");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 143, -1, -1));

        lblDob.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblDob.setText("Date Of Birth");
        add(lblDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 187, -1, -1));

        lblAge.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 231, -1, -1));

        lblHeight.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblHeight.setText("Height");
        add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 268, -1, -1));

        lblWeight.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblWeight.setText("Weight");
        add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 312, -1, -1));

        lblSsn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblSsn.setText("SSN");
        add(lblSsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 350, -1, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 94, 244, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 138, 244, -1));
        add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 182, 244, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 226, 244, -1));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 263, 244, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 307, 244, -1));
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 345, 244, -1));

        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 383, 399, -1));

        lblFirstName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblFirstName.setText("First Name");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 60, -1, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 55, 244, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        person.setAge(txtAge.getText());
        person.setDob(txtDob.getText());
        person.setFirst_name(txtFirstName.getText());
        person.setLast_name(txtLastName.getText());
        person.setSsn(txtSSN.getText());
        person.setHeight(txtHeight.getText());
        person.setWeight(txtWeight.getText());
        person.setPhone_number(txtPhoneNumber.getText());
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
