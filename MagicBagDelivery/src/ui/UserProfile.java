/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Pages.Login;
import javax.swing.JOptionPane;
import model.Validation;
import model.customer;
import model.customers;
import projects.InsertUpdateDelete;

/**
 *
 * @author evelyn
 */
public class UserProfile extends javax.swing.JPanel {

    /**
     * Creates new form Order
     */
    
    public UserProfile() {
        initComponents();
        jTextField7.setText(Login.jTextField1.getText());
        jTextField7.setEditable(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnconfirm = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 0));
        jLabel2.setText("Address:");
        add(jLabel2);
        jLabel2.setBounds(260, 210, 180, 23);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 204, 0));
        jLabel8.setText("Password:");
        add(jLabel8);
        jLabel8.setBounds(250, 160, 120, 23);

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 0));
        jLabel4.setText("User Name:");
        add(jLabel4);
        jLabel4.setBounds(240, 110, 120, 23);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6);
        jTextField6.setBounds(350, 160, 207, 30);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 0));
        jLabel5.setText("Phone number:");
        add(jLabel5);
        jLabel5.setBounds(210, 250, 170, 30);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        add(jTextField7);
        jTextField7.setBounds(350, 110, 207, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        add(jTextField5);
        jTextField5.setBounds(350, 210, 207, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(350, 260, 207, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3);
        jTextField3.setBounds(350, 410, 207, 30);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 0));
        jLabel9.setText("Email address:");
        add(jLabel9);
        jLabel9.setBounds(210, 410, 130, 23);

        btnconfirm.setBackground(new java.awt.Color(204, 255, 204));
        btnconfirm.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(51, 102, 0));
        btnconfirm.setText("Update");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        add(btnconfirm);
        btnconfirm.setBounds(550, 540, 120, 29);

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        add(jComboBox2);
        jComboBox2.setBounds(350, 310, 130, 29);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 0));
        jLabel10.setText("Zipcode:");
        add(jLabel10);
        jLabel10.setBounds(260, 360, 120, 23);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        add(jTextField8);
        jTextField8.setBounds(350, 360, 207, 30);

        jLabel3.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel3.setText("update information");
        add(jLabel3);
        jLabel3.setBounds(330, 50, 260, 50);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 0));
        jLabel7.setText("Gender:");
        add(jLabel7);
        jLabel7.setBounds(270, 310, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
        
        
        //jTextField7.setText(Login.jTextField1.getText());
        
        jTextField7.setText(Login.jTextField1.getText());
        jTextField7.setEditable(false);
        String Username = jTextField7.getText();
        
        String PostalCode = jTextField8.getText();
        //int zip=Integer.parseInt(PostalCode);
        String PhoneNum = jTextField2.getText();
        String Password = jTextField6.getText();
        String Address = jTextField5.getText();
        String Gender = (String)jComboBox2.getSelectedItem();
        String EmailAdd = jTextField3.getText();
        //String role=(String)jComboBox1.getSelectedItem();
        
        /*customer ct = history.addNewCustomer();
        ct.setUsername(Username);
        ct.setPostalCode(PostalCode);
        ct.setPhoneNum(PhoneNum);
        ct.setPassword(Password);
        ct.setAddress(Address);
        ct.setGender(Gender);
        ct.setEmailAdd(EmailAdd);*/
        
        // Validation!!!!
         if(String.valueOf(PostalCode).equals("") ||PhoneNum.equals("") ||Password.equals("") ||Address.equals("") ||EmailAdd.equals(""))
            JOptionPane.showConfirmDialog(null, "Every Filed is Required!");
       
              else if(Validation.isPhone(jTextField2.getText())==false){
               JOptionPane.showMessageDialog(this, "Phone number should be 10 numbers.");
            }
              else if(Validation.isZipcode(jTextField8.getText())==false){
               JOptionPane.showMessageDialog(this, "Postalcode should be 5 numbers.");
            }
               else if(Validation.isEmail(jTextField3.getText())==false){
               JOptionPane.showMessageDialog(this, "Email address should be correct format.");
            }
        else
        {
            String Query;
            Query="update person set zipcode='"+PostalCode+"', phonenumber='"+PhoneNum+"',password='"+Password+"',address='"+Address+"',gender='"+Gender+"',email='"+EmailAdd+"' where username='"+Username+"' and role='Customer' ";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query,"Updated Successfully");
            setVisible(true);
     
        }
        
    }//GEN-LAST:event_btnconfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirm;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
