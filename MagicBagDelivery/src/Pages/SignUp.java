/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Validation;
import projects.InsertUpdateDelete;
import projects.Select;

/**
 *
 * @author yangshuya
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnconfirm = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 0));
        jLabel2.setText("Address:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 210, 180, 23);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 204, 0));
        jLabel8.setText("Password:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 160, 120, 23);

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 0));
        jLabel4.setText("User Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 110, 120, 23);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(350, 160, 207, 23);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 0));
        jLabel5.setText("Phone number:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 250, 170, 30);

        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(350, 110, 207, 23);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(350, 210, 207, 23);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(350, 260, 207, 23);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(350, 420, 207, 23);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 204, 0));
        jLabel6.setText("Role:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 470, 180, 30);

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Delivery Person", "Restaurant Owner", "Bakery Owner", "Grocery Store Owner" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(350, 470, 210, 30);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 0));
        jLabel9.setText("Email address:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(210, 410, 130, 23);

        btnconfirm.setBackground(new java.awt.Color(204, 255, 204));
        btnconfirm.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(102, 204, 0));
        btnconfirm.setText("Confirm");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnconfirm);
        btnconfirm.setBounds(610, 560, 120, 29);

        btnback.setBackground(new java.awt.Color(204, 255, 204));
        btnback.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(102, 204, 0));
        btnback.setText("Goback to Login");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback);
        btnback.setBounds(560, 20, 200, 29);

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(350, 310, 130, 29);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 0));
        jLabel10.setText("Zipcode:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(250, 360, 120, 23);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(350, 360, 207, 23);

        jLabel3.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel3.setText("Create a user");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 70, 180, 30);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 0));
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(269, 310, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:

        String Username = jTextField7.getText();
        String PostalCode =jTextField8.getText();
        //int zip=Integer.parseInt(PostalCode);
        String PhoneNum = jTextField2.getText();
        String Password = jTextField6.getText();
        String Address = jTextField5.getText();
        String Gender = (String) jComboBox2.getSelectedItem();
        String EmailAdd = jTextField3.getText();
        String Role = (String) jComboBox1.getSelectedItem();
        ResultSet rs=Select.getData("select * from person where username='"+Username+"'");
        

        //        customer ct = history.addNewCustomer();
        //        ct.setUsername(Username);
        //        ct.setPostalCode(PostalCode);
        //        ct.setPhoneNum(PhoneNum);
        //        ct.setPassword(Password);
        //        ct.setAddress(Address);
        //        ct.setGender(Gender);
        //        ct.setEmailAdd(EmailAdd);

        // Validation!!!!
        try{
            if(rs.next()){
                
                    JOptionPane.showConfirmDialog(null, "This user already existed, please input another one!");
                }
            else if(Username.equals("")|| PostalCode.equals("") ||PhoneNum.equals("") ||Password.equals("") ||Address.equals("") ||EmailAdd.equals(""))
                    {
               
        JOptionPane.showConfirmDialog(null, "Every Filed is Required!");
            }
            else if(Validation.isName(Username)==false){
               JOptionPane.showMessageDialog(this, "Name should be letters.");
            }
              else if(Validation.isPhone(jTextField2.getText())==false){
               JOptionPane.showMessageDialog(this, "Phone number should be 10 numbers.");
            }
              else if(Validation.isZipcode(jTextField8.getText())==false){
               JOptionPane.showMessageDialog(this, "Postalcode should be 5 numbers.");
            }
               else if(Validation.isEmail(jTextField3.getText())==false){
               JOptionPane.showMessageDialog(this, "Email address should be correct format.");
            }
               
            else{
                String Query;
            Query="insert into person values('"+Username+"','"+PostalCode+"','"+PhoneNum+"','"+Password+"','"+Address+"','"+Gender+"','"+EmailAdd+"','"+Role+"')";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query,"Registered Successfully");
            setVisible(true);
                
            }
        }
        catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
        
       

        
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        setVisible(false);
        new Login().setVisible(true);
        // TODO add your handling code here;

    }//GEN-LAST:event_btnbackActionPerformed

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
     
            
        
    }//GEN-LAST:event_jTextField7FocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}