/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Dialog;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CompletedOrderUserComplain;
import model.CompletedOrderUserComplainList;
import model.CurrentOrderUserComplain;
import model.CurrentOrderUserComplainList;
import model.Feedbacks;
import model.Market;
import model.OrderList;
import model.customer;
import model.customers;
import model.markets;
import model.order;
import projects.InsertUpdateDelete;
import projects.Select;

/**
 *
 * @author evelyn
 */
public class SystemOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemMarketJPanel
     */
    public SystemOrderJPanel() {
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
       ResultSet rs=Select.getData("select * from orders");
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(5),rs.getString(3),rs.getString(7),rs.getFloat(9),rs.getString(11)});
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 153, 0));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("Order Date:");
        add(jLabel1);
        jLabel1.setBounds(4, 300, 100, 23);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 0));
        jLabel2.setText("Order Number:");
        add(jLabel2);
        jLabel2.setBounds(0, 360, 140, 23);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setText("Status:");
        add(jLabel3);
        jLabel3.setBounds(360, 620, 80, 23);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("Order Type:");
        add(jLabel4);
        jLabel4.setBounds(10, 550, 110, 23);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 0));
        jLabel5.setText("Price:");
        add(jLabel5);
        jLabel5.setBounds(60, 480, 50, 23);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 0));
        jLabel7.setText("Market:");
        add(jLabel7);
        jLabel7.setBounds(40, 420, 80, 23);

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order Date", "Order Number", "Customer", "Market", "Order Type", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(20, 50, 750, 237);
        add(jTextField1);
        jTextField1.setBounds(140, 300, 230, 30);

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Pick-up" }));
        add(jComboBox2);
        jComboBox2.setBounds(140, 550, 170, 29);
        add(jTextField2);
        jTextField2.setBounds(140, 360, 230, 30);
        add(jTextField5);
        jTextField5.setBounds(140, 620, 170, 30);

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Created", "Preparing", "Ready to pick up", "On the way", "Completed" }));
        add(jComboBox1);
        jComboBox1.setBounds(450, 620, 140, 29);

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
        btncreate.setBounds(480, 390, 120, 29);

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
        btnupdate.setBounds(650, 390, 110, 29);

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
        btndelete.setBounds(650, 470, 110, 29);

        jLabel8.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel8.setText("Order Administration");
        add(jLabel8);
        jLabel8.setBounds(270, 0, 310, 50);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 0));
        jLabel9.setText("Customer:");
        add(jLabel9);
        jLabel9.setBounds(20, 620, 100, 23);
        add(jTextField7);
        jTextField7.setBounds(140, 480, 170, 30);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 0));
        jButton1.setText("Read");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(480, 470, 120, 30);

        jComboBox3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        add(jComboBox3);
        jComboBox3.setBounds(140, 420, 230, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
            int SelectedRowIndex = jTable2.getSelectedRow();
       
      
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Delete.");
            return;
    }
        if (SelectedRowIndex >= 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int ordernumber=(int)model.getValueAt(SelectedRowIndex,1);
        try 
        {
             String Query;
             Query="delete from orders where orderID='"+ordernumber+"' ";
             InsertUpdateDelete.setData(Query,"Deleted Successfully!");
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
    
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
         String date = jTextField1.getText();
        int orderID =Integer.parseInt(jTextField2.getText());
        //jTextField1.setText(String.valueOf(date));
        //jTextField1.setEditable(false);
        //jTextField2.setText(String.valueOf(orderID));
        //jTextField2.setEditable(false);
     String markeString=(String)jComboBox3.getSelectedItem();
     String type=(String)jComboBox2.getSelectedItem();
     String customer=jTextField5.getText();
     String status=(String)jComboBox1.getSelectedItem();
     
     
     float price=Float.parseFloat(jTextField7.getText());
     
        if(customer.equals(""))
            JOptionPane.showConfirmDialog(null, "Every Filed is Required!");
        else
        {
            String Query;
            Query="insert into orders(ordertime,orderID,market,customer,method,price,status) values('"+date+"','"+orderID+"','"+markeString+"','"+customer+"','"+type+"','"+price+"','"+status+"')";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query,"Added order Successfully");
            setVisible(true);
     
        }
        
        
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
          /*int index=jTable2.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        String dateString=model.getValueAt(index,0).toString();
        int ordernumber=(int)model.getValueAt(index,1);
        String marketString=model.getValueAt(index, 3).toString();
        String customerString=model.getValueAt(index, 2).toString();
        jTextField1.setText(dateString);
        jTextField1.setEditable(false);
        jTextField2.setText(String.valueOf(ordernumber));
        jTextField2.setEditable(false);
        jTextField6.setText(marketString);
        jTextField6.setEditable(false);
        jTextField5.setText(customerString);
        jTextField5.setEditable(false);
        */

     String type=(String)jComboBox2.getSelectedItem();
     //String customer=jTextField5.getText();
     String status=(String)jComboBox1.getSelectedItem();
     String nameString=jTextField5.getText();
     int ordernumber=Integer.parseInt(jTextField2.getText());
     float price=Float.parseFloat(jTextField7.getText());
     
     
        if(nameString.equals(""))
            JOptionPane.showConfirmDialog(null, "Every Filed is Required!");
        else
        {
            String Query;
            Query="update orders set method='"+type+"', status='"+status+"',customer='"+nameString+"', price='"+price+"' where orderID='"+ordernumber+"' ";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query,"Updated order Successfully");
            setVisible(true);
     
        }
     
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int index=jTable2.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
           if (index < 0){
               Date ordertime= new Date();
               jTextField1.setText(String.valueOf(ordertime));
               jTextField1.setEditable(false);
               int orderID = (int) (Math.random() * 100000);
               jTextField2.setText(String.valueOf(orderID));
               jTextField2.setEditable(false);
                try 
        {
             ResultSet rs=Select.getData("select * from market");
             while(rs.next()){
               jComboBox3.addItem(rs.getString(1));
               //jTextField7.setText(String.valueOf(rs.getFloat(6)));
               //jTextField7.setEditable(false);
             }rs.close();
        
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
           
        
    }
           else if (index >= 0){
        //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        jTextField1.setText((String)model.getValueAt(index, 0));
               jTextField1.setEditable(false);
       
               jTextField2.setText(String.valueOf((int)model.getValueAt(index, 1)));
               jTextField2.setEditable(false);
               jComboBox2.setSelectedItem((String)model.getValueAt(index,4));
               jTextField5.setText((String)model.getValueAt(index, 2));
               jComboBox1.setSelectedItem((String)model.getValueAt(index,6));
               jTextField7.setText(String.valueOf((float)model.getValueAt(index, 5)));
               jTextField7.setEditable(false);
                try 
        {
              ResultSet rs=Select.getData("select * from market");
              while(rs.next()){
               jComboBox3.addItem(rs.getString(1));
               jComboBox3.setSelectedItem((String)model.getValueAt(index, 3));
               jComboBox3.setEditable(false);
              }rs.close();
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
    
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        String market=(String)jComboBox3.getSelectedItem();
        try 
        {
              ResultSet rs=Select.getData("select * from market where Name='"+market+"' ");
              while(rs.next()){
             jTextField7.setText(String.valueOf(rs.getFloat(6)));
             jTextField7.setEditable(false);
              }rs.close();
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
        
        
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

   /* private void populateOrderTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        
        for (order Order : history.getHistory()) {
            
            if (Order.getCustomer().getUsername().equals("TBD")) {
            
                Object[] row = new Object[6];
                row[0] = Order;
                row[1] = Order.getOrderNumber();
                row[2] = Order.getMarket().getMarketname();
                row[3] = Order.getOrderType();
                row[4] = Order.getTotalAmount();
                row[5] = Order.getStatus();
                
                model.addRow(row);
        }
        }
            
    }*/
}