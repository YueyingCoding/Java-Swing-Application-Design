/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Pages.Login;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CompletedOrderUserComplain;
import model.CompletedOrderUserComplainList;
import model.CurrentOrderUserComplain;
import model.CurrentOrderUserComplainList;
import model.Feedbacks;
import model.OrderList;
import model.customers;
import model.markets;
import model.order;
import projects.InsertUpdateDelete;
import projects.Select;

/**
 *
 * @author evelyn
 */
public class SystemServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemMarketJPanel
     */
  
    public SystemServiceJPanel() {
        initComponents();
        Table();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void Table(){
          //String usernameString=Login.jTextField1.getText();

        ResultSet rs=Select.getData("select * from CustomerService ");
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getInt(2),rs.getString(1),rs.getString(3),rs.getString(7),rs.getString(9),rs.getString(8)});
            }
            rs.close();

        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
     
     }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 153, 0));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Problem:");
        add(jLabel1);
        jLabel1.setBounds(40, 510, 110, 23);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("Order Number");
        add(jLabel2);
        jLabel2.setBounds(30, 390, 130, 23);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("Result:");
        add(jLabel9);
        jLabel9.setBounds(40, 620, 90, 23);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Order Type:");
        add(jLabel4);
        jLabel4.setBounds(20, 450, 110, 23);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Status:");
        add(jLabel3);
        jLabel3.setBounds(40, 560, 80, 23);

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Created", "Preparing", "Ready to pick up", "On the way", "Completed" }));
        add(jComboBox1);
        jComboBox1.setBounds(180, 560, 180, 29);

        jComboBox3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Pick-up" }));
        add(jComboBox3);
        jComboBox3.setBounds(180, 450, 130, 29);

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Number", "Customer", "Order Type", "Problem", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 760, 340);

        btncreate.setBackground(new java.awt.Color(204, 255, 204));
        btncreate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btncreate.setForeground(new java.awt.Color(102, 153, 0));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        add(btncreate);
        btncreate.setBounds(420, 620, 120, 29);

        btnupdate.setBackground(new java.awt.Color(204, 255, 204));
        btnupdate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(102, 153, 0));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate);
        btnupdate.setBounds(630, 540, 110, 29);

        btndelete.setBackground(new java.awt.Color(204, 255, 204));
        btndelete.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(102, 153, 0));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete);
        btndelete.setBounds(630, 620, 110, 29);

        jLabel7.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel7.setText("Service Administration");
        add(jLabel7);
        jLabel7.setBounds(270, 0, 310, 50);

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2);
        jComboBox2.setBounds(180, 390, 130, 30);

        jComboBox4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wrong Order", "Not Received", "Delayed", "Missing Item" }));
        add(jComboBox4);
        jComboBox4.setBounds(180, 500, 180, 29);

        jComboBox5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "10% Refund", "50% Refund", "75% Refund", "100% Refund" }));
        add(jComboBox5);
        jComboBox5.setBounds(180, 620, 140, 29);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setText("Customer:");
        add(jLabel6);
        jLabel6.setBounds(420, 460, 120, 23);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 0));
        add(jLabel8);
        jLabel8.setBounds(530, 397, 260, 30);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setText("Order Time:");
        add(jLabel10);
        jLabel10.setBounds(410, 400, 140, 23);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel11);
        jLabel11.setBounds(549, 440, 120, 30);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Read");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(420, 540, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
     int number=Integer.parseInt(jComboBox2.getSelectedItem().toString());
        String typeString=jComboBox3.getSelectedItem().toString();
     String problemString=jComboBox4.getSelectedItem().toString();
     String status=jComboBox1.getSelectedItem().toString();
     String decision=jComboBox5.getSelectedItem().toString();
      String dateString=jLabel8.getText();
        String customerString=jLabel11.getText();
   
        try{
           
                    ResultSet rs1=Select.getData("select * from orders where orderID='"+number+"' ");
                    while(rs1.next()){
                        String marketString=rs1.getString(3);
                        float price=rs1.getFloat(9);
                        String Query;
         
         Query="insert into CustomerService(user,ordernumber,ordertype,orderdate,problem,decision,status,market,total) values('"+customerString+"','"+number+"','"+typeString+"','"+dateString+"','"+problemString+"','"+decision+"','"+status+"','"+marketString+"','"+price+"')";
     
            InsertUpdateDelete.setData(Query,"Added Successfully");
            setVisible(true);
            
                    }rs1.close();
         
                }
            
  
        catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        
        
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
             int index=jTable2.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        
        int ordernumber=(int)model.getValueAt(index,0);
        String type=model.getValueAt(index, 2).toString();
        String problem=model.getValueAt(index, 3).toString();
        String status=model.getValueAt(index, 4).toString();
        //String result=model.getValueAt(index, 5).toString();
        String customerString=model.getValueAt(index, 1).toString();
        
        jComboBox2.setSelectedItem(String.valueOf(ordernumber));
        jComboBox3.setSelectedItem(type);
        jComboBox4.setSelectedItem(problem);
        jComboBox1.setSelectedItem(status);
        jLabel11.setText(customerString);
        //jComboBox5.setSelectedItem(result);
        String result=jComboBox5.getSelectedItem().toString();
        
        jComboBox2.setEditable(false);
        jComboBox3.setEditable(false);
        jComboBox4.setEditable(false);
        jComboBox1.setEditable(false);
 
            String Query;
            Query="update CustomerService set decision='"+result+"' where ordernumber='"+ordernumber+"' ";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query,"Updated Successfully");
            setVisible(true);
     
        
    
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
       
      
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Delete.");
            return;
    }
        if (SelectedRowIndex >= 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int ordernumber=(int)model.getValueAt(SelectedRowIndex,0);
        try 
        {
             String Query;
             Query="delete from CustomerService where ordernumber='"+ordernumber+"' ";
             InsertUpdateDelete.setData(Query,"Deleted Successfully!");
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
    
        }
     
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int index=jTable2.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
           if (index < 0){
             
                try 
        {
             ResultSet rs=Select.getData("select a.orderID, b.ordernumber,(a.orderID-b.ordernumber) from orders a LEFT JOIN CustomerService b on a.orderID=b.ordernumber ");
             
             while(rs.next()){
                 if(rs.getString(3)==null){
               jComboBox2.addItem(String.valueOf(rs.getInt(1)));
               //jTextField7.setText(String.valueOf(rs.getFloat(6)));
               //jTextField7.setEditable(false);
                 }
             }rs.close();
        
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
           
        
    }
           else if (index >= 0){
               jComboBox2.addItem(String.valueOf((int)model.getValueAt(index, 0)));
        //jComboBox2.setSelectedItem(String.valueOf((int)model.getValueAt(index, 0)));
        jComboBox3.setSelectedItem((String)model.getValueAt(index, 2));
        jComboBox4.setSelectedItem((String)model.getValueAt(index, 3));
        jComboBox1.setSelectedItem((String)model.getValueAt(index, 4));
        jComboBox5.setSelectedItem((String)model.getValueAt(index, 5));
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
        jComboBox4.setEnabled(false);
        jComboBox1.setEnabled(false);
        jLabel11.setText((String)model.getValueAt(index, 1));
   
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        int number=Integer.parseInt(jComboBox2.getSelectedItem().toString());
         try 
        {
             ResultSet rs=Select.getData("select * from orders where orderID='"+number+"' ");
             while(rs.next()){
              jLabel8.setText(rs.getString(1));
              jLabel11.setText(rs.getString(5));
             }rs.close();
        
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void populateServiceTable() {
        
    }
}
