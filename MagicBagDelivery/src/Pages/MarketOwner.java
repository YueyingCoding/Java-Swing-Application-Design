/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pages;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projects.InsertUpdateDelete;
import java.sql.*;
import projects.Select;

/**
 *
 * @author yangshuya
 */
public class MarketOwner extends javax.swing.JFrame {

    /**
     * Creates new form MarketOwner
     */
    public MarketOwner() {
        initComponents();
        Table();
        Amount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void Table(){
         
         
         String marketname=Login.jTextField1.getText();
                       
           
       ResultSet rs=Select.getData("select * from orders where market = '"+marketname+"' ");
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(5),rs.getString(7),rs.getFloat(9),rs.getString(11)});
            }
            rs.close();
                
            
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
   
    public void Amount(){
       
      String nameString=Login.jTextField1.getText();
       ResultSet rs=Select.getData("select * from market where Name='"+nameString+"'");
        try {
            while(rs.next())
            {
                jButton7.setText(String.valueOf(rs.getInt(4)));
                jButton7.setEnabled(false);
            }
            rs.close();
                
            
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
   }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MarketOwnerOrder = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btncancel1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        lblOrder1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ManageOrderJPanel = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        btncreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AmountComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ManageInfo = new javax.swing.JPanel();
        btnupdate1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        MarketOwnerOrder.setLayout(null);

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 0));
        jButton3.setText("Finished");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MarketOwnerOrder.add(jButton3);
        jButton3.setBounds(590, 530, 130, 30);

        btncancel1.setBackground(new java.awt.Color(204, 255, 204));
        btncancel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btncancel1.setForeground(new java.awt.Color(102, 153, 0));
        btncancel1.setText("Cancel");
        btncancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel1ActionPerformed(evt);
            }
        });
        MarketOwnerOrder.add(btncancel1);
        btncancel1.setBounds(590, 370, 130, 29);

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 153, 0));
        jButton5.setText("Accept");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        MarketOwnerOrder.add(jButton5);
        jButton5.setBounds(590, 450, 130, 30);

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Date", "Order Number", "Customer", "Order Type", "Price", "Status"
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

        MarketOwnerOrder.add(jScrollPane2);
        jScrollPane2.setBounds(10, 120, 790, 237);

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 204, 0));
        jButton4.setText("Manage bag");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        MarketOwnerOrder.add(jButton4);
        jButton4.setBounds(560, 20, 210, 30);

        lblOrder1.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblOrder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrder1.setText("Market Orders");
        MarketOwnerOrder.add(lblOrder1);
        lblOrder1.setBounds(0, 60, 814, 42);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 0));
        jButton2.setText("Goback");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MarketOwnerOrder.add(jButton2);
        jButton2.setBounds(30, 510, 110, 30);

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 0));
        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        MarketOwnerOrder.add(jButton6);
        jButton6.setBounds(30, 440, 110, 30);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Left Amount:");
        MarketOwnerOrder.add(jLabel3);
        jLabel3.setBounds(210, 440, 130, 40);

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 0));
        MarketOwnerOrder.add(jButton7);
        jButton7.setBounds(340, 440, 110, 40);

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 153, 0));
        jButton8.setText("Manage Information");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        MarketOwnerOrder.add(jButton8);
        jButton8.setBounds(20, 20, 220, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        MarketOwnerOrder.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 680);

        jPanel1.add(MarketOwnerOrder, "card2");

        ManageOrderJPanel.setLayout(null);

        btnupdate.setBackground(new java.awt.Color(204, 255, 204));
        btnupdate.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 204, 51));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        ManageOrderJPanel.add(btnupdate);
        btnupdate.setBounds(540, 410, 120, 29);

        btncreate.setBackground(new java.awt.Color(204, 255, 204));
        btncreate.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        btncreate.setForeground(new java.awt.Color(0, 204, 0));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        ManageOrderJPanel.add(btncreate);
        btncreate.setBounds(540, 340, 120, 29);

        jLabel4.setBackground(new java.awt.Color(51, 102, 0));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("Price:");
        ManageOrderJPanel.add(jLabel4);
        jLabel4.setBounds(270, 290, 49, 23);

        AmountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        ManageOrderJPanel.add(AmountComboBox);
        AmountComboBox.setBounds(390, 230, 120, 23);

        jLabel5.setBackground(new java.awt.Color(51, 102, 0));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("Amount:");
        ManageOrderJPanel.add(jLabel5);
        jLabel5.setBounds(250, 230, 72, 23);
        ManageOrderJPanel.add(txtprice);
        txtprice.setBounds(390, 290, 120, 23);

        jLabel6.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel6.setText("Manage food bag");
        ManageOrderJPanel.add(jLabel6);
        jLabel6.setBounds(310, 160, 200, 42);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Goback");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ManageOrderJPanel.add(jButton1);
        jButton1.setBounds(580, 50, 130, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        ManageOrderJPanel.add(jLabel7);
        jLabel7.setBounds(0, 0, 800, 680);

        jPanel1.add(ManageOrderJPanel, "card3");

        ManageInfo.setLayout(null);

        btnupdate1.setBackground(new java.awt.Color(204, 255, 204));
        btnupdate1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        btnupdate1.setForeground(new java.awt.Color(0, 204, 51));
        btnupdate1.setText("Update");
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });
        ManageInfo.add(btnupdate1);
        btnupdate1.setBounds(590, 500, 120, 29);

        jLabel8.setBackground(new java.awt.Color(51, 102, 0));
        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 0));
        jLabel8.setText("Address:");
        ManageInfo.add(jLabel8);
        jLabel8.setBounds(270, 310, 90, 23);

        jLabel9.setBackground(new java.awt.Color(51, 102, 0));
        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 0));
        jLabel9.setText("Type:");
        ManageInfo.add(jLabel9);
        jLabel9.setBounds(300, 240, 70, 30);

        jLabel10.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel10.setText("Manage Information");
        ManageInfo.add(jLabel10);
        jLabel10.setBounds(260, 50, 220, 42);

        jButton9.setBackground(new java.awt.Color(204, 255, 204));
        jButton9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 51, 51));
        jButton9.setText("Goback");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        ManageInfo.add(jButton9);
        jButton9.setBounds(580, 50, 130, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ManageInfo.add(jScrollPane1);
        jScrollPane1.setBounds(380, 320, 234, 91);

        jLabel12.setBackground(new java.awt.Color(51, 102, 0));
        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 0));
        jLabel12.setText("Name:");
        ManageInfo.add(jLabel12);
        jLabel12.setBounds(290, 160, 70, 30);

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 51, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        ManageInfo.add(jTextField2);
        jTextField2.setBounds(380, 160, 110, 30);

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bakery", "Restaurant", "Grocery" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        ManageInfo.add(jComboBox1);
        jComboBox1.setBounds(380, 240, 150, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        ManageInfo.add(jLabel11);
        jLabel11.setBounds(0, 0, 800, 680);

        jPanel1.add(ManageInfo, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
          if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Delete.");
            
    }
          else{
        int ordernumber=(int)model.getValueAt(SelectedRowIndex,1);
        String status=(String)model.getValueAt(SelectedRowIndex, 5);
        if(status.equals("Created") ||status.equals("Preparing")){
        

        String Query;
        Query = "update orders set status ='Ready to pick up' where orderID='"+ordernumber+"' ";
        InsertUpdateDelete.setData(Query, "Order is finished!");
        setVisible(true);
        }
        else{
            JOptionPane.showConfirmDialog(null, "This order has been finished!");
        }
          }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btncancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel1ActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        String nameString=Login.jTextField1.getText();

        if(jTable2.getSelectedRowCount()==1){
            
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            int ordernumber=(int)model.getValueAt(SelectedRowIndex,1);
            if(model.getValueAt(SelectedRowIndex, 5).toString().equals("Created")){
            try
            {
                String Query;
                Query="delete from orders where orderID='"+ordernumber+"' ";
                InsertUpdateDelete.setData(Query,"Order conceled successfully!");
                
                String Query1;
                Query1="update market set amount=amount+1 where Name='"+nameString+"' ";
                InsertUpdateDelete.setData(Query1,"");
                

            } catch (Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);

            }
            }
            else{
                JOptionPane.showConfirmDialog(null, "You cannot cancel this order!");
            }
        }
        else{
            if(jTable2.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");

            }
            else{
                JOptionPane.showMessageDialog(this,"Please select a order to cancel.");
            }
        }
    }//GEN-LAST:event_btncancel1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // TODO add your handling code here:
        

        int SelectedRowIndex = jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
          if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a order.");
            
    }
          else{
        String status=(String)model.getValueAt(SelectedRowIndex, 5);
        int ordernumber=(int)model.getValueAt(SelectedRowIndex,1);
        if(!status.equals("Created")){
            JOptionPane.showConfirmDialog(null, "This order already accepted!");
        }
        else{

        String Query;
        Query = "update orders set status ='Preparing' where orderID='"+ordernumber+"' ";
        InsertUpdateDelete.setData(Query, "Order is accepted!");
        setVisible(true);
        }
          }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ManageOrderJPanel.setVisible(true);
        MarketOwnerOrder.setVisible(false);
        ManageInfo.setVisible(false);
        String nameString=Login.jTextField1.getText();
       ResultSet rs=Select.getData("select * from market where Name='"+nameString+"'");
        try {
            while(rs.next())
            {
               AmountComboBox.setSelectedItem(String.valueOf(rs.getInt(4)));
               txtprice.setText(String.valueOf(rs.getFloat(6)));
            }
            rs.close();
                
            
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int amount =Integer.parseInt((String)AmountComboBox.getSelectedItem());

        float price=Float.parseFloat(txtprice.getText());

        String name=Login.jTextField1.getText();

        if(String.valueOf(price).equals(""))
        JOptionPane.showConfirmDialog(null, "Price is Required!");
        else
        {
            String Query;
            Query="update market set amount='"+amount+"', Price='"+price+"' where Name='"+name+"' ";

            InsertUpdateDelete.setData(Query,"Updated Successfully");
            setVisible(true);

        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        int amount =Integer.parseInt((String)AmountComboBox.getSelectedItem());

        float price=Float.parseFloat(txtprice.getText());

        String name=Login.jTextField1.getText();

        if(String.valueOf(price).equals(""))
        JOptionPane.showConfirmDialog(null, "Price is Required!");
        else
        {
            String Query;
            Query="update market set amount='"+amount+"',Price='"+price+"' where Name='"+name+"' ";

            InsertUpdateDelete.setData(Query,"Added Successfully");
            setVisible(true);

        }
    }//GEN-LAST:event_btncreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MarketOwnerOrder.setVisible(true);
        ManageOrderJPanel.setVisible(false);
        ManageInfo.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        Table();
        Amount();
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
        // TODO add your handling code here:
     
        String nameString=Login.jTextField1.getText();
        String typeString=jComboBox1.getSelectedItem().toString();
        String addressString=jTextArea1.getText();
          String Query;
            Query="update market set Category='"+typeString+"',Address='"+addressString+"' where Name='"+nameString+"' ";

            InsertUpdateDelete.setData(Query,"Updated Successfully");
            
            
            if(typeString.equals("Bakery")){
                String Query1;
                Query1="update person set role='Bakery Owner' where username='"+nameString+"' ";
                InsertUpdateDelete.setData(Query1,"");
                
            }
            else if(typeString.equals("Restaurant")){
                String Query2;
                Query2="update person set role='Restaurant Owner' where username='"+nameString+"' ";
                InsertUpdateDelete.setData(Query2,"");
                
            }
            else if(typeString.equals("Grocery")){
                String Query3;
                Query3="update person set role='Grocery Store Owner' where username='"+nameString+"' ";
                InsertUpdateDelete.setData(Query3,"");
     
            }
            
            setVisible(true);
        
        
        
    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         MarketOwnerOrder.setVisible(true);
        ManageOrderJPanel.setVisible(false);
        ManageInfo.setVisible(false);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText(Login.jTextField1.getText());
        String name=jTextField2.getText();
        jTextField2.setEditable(false);
        ManageInfo.setVisible(true);
        MarketOwnerOrder.setVisible(false);
        ManageOrderJPanel.setVisible(false);
        ResultSet rs=Select.getData("select * from market where Name='"+name+"' ");
        try 
        {
            while(rs.next())
            {
                jTextArea1.setText(rs.getString(2));
                jComboBox1.setSelectedItem(rs.getString(3));
            } rs.close();
            
        } catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
       
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(MarketOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AmountComboBox;
    private javax.swing.JPanel ManageInfo;
    private javax.swing.JPanel ManageOrderJPanel;
    private javax.swing.JPanel MarketOwnerOrder;
    private javax.swing.JButton btncancel1;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblOrder1;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
