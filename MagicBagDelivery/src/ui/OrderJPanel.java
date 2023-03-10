/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Pages.CustomerMainPage;
import Pages.Login;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.CompletedOrderUserComplain;
import model.CompletedOrderUserComplainList;
import model.CurrentOrderUserComplain;
import model.CurrentOrderUserComplainList;
import model.Feedback;
import model.Feedbacks;
import model.OrderList;
import model.order;
import projects.InsertUpdateDelete;
import projects.Select;

/**
 *
 * @author chengzhishi
 */
public class OrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderJPanel
     */
    /*OrderList history;
    Feedbacks fbs;
    CompletedOrderUserComplainList finishedcomplain;
    CurrentOrderUserComplainList currentcomplain;*/
    public OrderJPanel() {
        initComponents();
        Table();
        Table1();
        /*this.history = history;
        this.fbs = fbs;
        this.finishedcomplain = finishedcomplain;
        this.currentcomplain = currentcomplain;
        OrderJPanel.setVisible(true);
        FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(false);
        populateOrderTable();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        public void Table(){
         
         
           String usernameString=Login.jTextField1.getText();
                       
           
       ResultSet rs=Select.getData("select * from orders where customer = '"+usernameString+"' ");
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(5),rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(7),rs.getFloat(9),rs.getString(11)});
            }
            rs.close();
                
            
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
        
        public void Table1(){
            String usernameString=Login.jTextField1.getText();
                       
           
       ResultSet rs=Select.getData("select * from CustomerService where user = '"+usernameString+"' ");
        DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getString(7),rs.getString(9),rs.getString(8)});
            }
            rs.close();
                
            
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderJPanel = new javax.swing.JPanel();
        lblOrder1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FeedbackCSJPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        btnconfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FileComplainJPanel = new javax.swing.JPanel();
        lblComplain = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblOrderNumber = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lblOrderType = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        lblMarket = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        lblProblem = new javax.swing.JLabel();
        cmbProblem = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        lblDetail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblTotalAmount = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        lblProblem1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        HistoryProblem = new javax.swing.JPanel();
        lblServiceInProgress = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        OrderJPanel.setLayout(null);

        lblOrder1.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblOrder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrder1.setText("Order");
        OrderJPanel.add(lblOrder1);
        lblOrder1.setBounds(0, 30, 814, 42);

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Order Date", "Order Number", "Market", "Order Type", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable2ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        OrderJPanel.add(jScrollPane2);
        jScrollPane2.setBounds(6, 175, 790, 237);

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 153, 0));
        jButton6.setText("Contact Customer Service");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        OrderJPanel.add(jButton6);
        jButton6.setBounds(510, 100, 270, 29);

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 153, 0));
        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        OrderJPanel.add(jButton7);
        jButton7.setBounds(650, 470, 100, 29);

        jButton10.setBackground(new java.awt.Color(204, 255, 204));
        jButton10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 153, 0));
        jButton10.setText("Grade");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        OrderJPanel.add(jButton10);
        jButton10.setBounds(370, 100, 100, 29);

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 0));
        jButton3.setText("History Problem Orders");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        OrderJPanel.add(jButton3);
        jButton3.setBounds(70, 100, 240, 30);

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 0));
        jButton4.setText("Get it!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        OrderJPanel.add(jButton4);
        jButton4.setBounds(470, 470, 120, 30);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        OrderJPanel.add(jLabel2);
        jLabel2.setBounds(-6, -4, 800, 750);

        add(OrderJPanel, "card10");

        FeedbackCSJPanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("OrderNumber:");
        FeedbackCSJPanel.add(jLabel4);
        jLabel4.setBounds(200, 130, 180, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        FeedbackCSJPanel.add(jComboBox2);
        jComboBox2.setBounds(390, 210, 80, 30);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Market score:");
        FeedbackCSJPanel.add(jLabel6);
        jLabel6.setBounds(210, 290, 160, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        FeedbackCSJPanel.add(jComboBox3);
        jComboBox3.setBounds(390, 293, 80, 30);

        btnconfirm.setBackground(new java.awt.Color(204, 255, 204));
        btnconfirm.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(153, 204, 0));
        btnconfirm.setText("Confirm");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        FeedbackCSJPanel.add(btnconfirm);
        btnconfirm.setBounds(270, 370, 180, 29);

        jLabel5.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel5.setText("Order Feedback");
        FeedbackCSJPanel.add(jLabel5);
        jLabel5.setBounds(280, 60, 310, 50);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 0));
        jButton1.setText("Goback");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FeedbackCSJPanel.add(jButton1);
        jButton1.setBounds(570, 40, 120, 29);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Delivery person score:");
        FeedbackCSJPanel.add(jLabel7);
        jLabel7.setBounds(110, 200, 270, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        FeedbackCSJPanel.add(jTextField2);
        jTextField2.setBounds(390, 140, 80, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        FeedbackCSJPanel.add(jLabel8);
        jLabel8.setBounds(0, 0, 800, 740);

        add(FeedbackCSJPanel, "card3");

        FileComplainJPanel.setLayout(null);

        lblComplain.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblComplain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComplain.setText("File A Complain");
        FileComplainJPanel.add(lblComplain);
        lblComplain.setBounds(0, 0, 867, 42);

        lblUser.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(51, 102, 0));
        lblUser.setText("User:");
        FileComplainJPanel.add(lblUser);
        lblUser.setBounds(97, 60, 127, 23);
        FileComplainJPanel.add(jTextField1);
        jTextField1.setBounds(242, 62, 114, 23);

        lblOrderNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOrderNumber.setForeground(new java.awt.Color(51, 102, 0));
        lblOrderNumber.setText("Order Number:");
        FileComplainJPanel.add(lblOrderNumber);
        lblOrderNumber.setBounds(480, 60, 127, 23);
        FileComplainJPanel.add(jTextField4);
        jTextField4.setBounds(663, 62, 114, 23);

        lblOrderType.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOrderType.setForeground(new java.awt.Color(51, 102, 0));
        lblOrderType.setText("Order Type:");
        FileComplainJPanel.add(lblOrderType);
        lblOrderType.setBounds(97, 142, 127, 23);

        lblOrderDate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOrderDate.setForeground(new java.awt.Color(51, 102, 0));
        lblOrderDate.setText("Order Date:");
        FileComplainJPanel.add(lblOrderDate);
        lblOrderDate.setBounds(500, 180, 127, 23);
        FileComplainJPanel.add(jTextField5);
        jTextField5.setBounds(660, 300, 114, 23);

        lblMarket.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMarket.setForeground(new java.awt.Color(51, 102, 0));
        lblMarket.setText("Market:");
        FileComplainJPanel.add(lblMarket);
        lblMarket.setBounds(97, 226, 127, 23);
        FileComplainJPanel.add(jTextField6);
        jTextField6.setBounds(242, 228, 114, 23);

        lblProblem.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblProblem.setForeground(new java.awt.Color(51, 102, 0));
        lblProblem.setText("Status:");
        FileComplainJPanel.add(lblProblem);
        lblProblem.setBounds(540, 300, 90, 23);

        cmbProblem.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        cmbProblem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wrong Order", "Not Received", "Delayed", "Food spoilage" }));
        FileComplainJPanel.add(cmbProblem);
        cmbProblem.setBounds(624, 400, 160, 24);

        jComboBox4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Pick-up" }));
        FileComplainJPanel.add(jComboBox4);
        jComboBox4.setBounds(240, 150, 130, 29);

        lblDetail.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDetail.setForeground(new java.awt.Color(51, 102, 0));
        lblDetail.setText("Problem Details:");
        FileComplainJPanel.add(lblDetail);
        lblDetail.setBounds(74, 397, 150, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        FileComplainJPanel.add(jScrollPane1);
        jScrollPane1.setBounds(242, 397, 234, 91);

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 204, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        FileComplainJPanel.add(btnBack);
        btnBack.setBounds(655, 541, 91, 29);

        btnSubmit.setBackground(new java.awt.Color(204, 255, 204));
        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(102, 204, 0));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        FileComplainJPanel.add(btnSubmit);
        btnSubmit.setBounds(528, 541, 91, 29);

        lblTotalAmount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTotalAmount.setForeground(new java.awt.Color(51, 102, 0));
        lblTotalAmount.setText("Total Amount:");
        FileComplainJPanel.add(lblTotalAmount);
        lblTotalAmount.setBounds(97, 309, 127, 23);
        FileComplainJPanel.add(jTextField7);
        jTextField7.setBounds(242, 311, 114, 23);

        lblProblem1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblProblem1.setForeground(new java.awt.Color(51, 102, 0));
        lblProblem1.setText("Problem:");
        FileComplainJPanel.add(lblProblem1);
        lblProblem1.setBounds(530, 400, 127, 23);
        FileComplainJPanel.add(jTextField8);
        jTextField8.setBounds(660, 180, 114, 23);

        jLabel10.setForeground(new java.awt.Color(51, 102, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        FileComplainJPanel.add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 740);

        add(FileComplainJPanel, "card4");

        HistoryProblem.setLayout(null);

        lblServiceInProgress.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblServiceInProgress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServiceInProgress.setText("Customer Service Overview");
        HistoryProblem.add(lblServiceInProgress);
        lblServiceInProgress.setBounds(-20, 70, 800, 42);

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Goback");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        HistoryProblem.add(jButton2);
        jButton2.setBounds(620, 50, 120, 29);

        jTable3.setBackground(new java.awt.Color(204, 255, 204));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Number", "Order Type", "Problem", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable3ComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        HistoryProblem.add(jScrollPane3);
        jScrollPane3.setBounds(0, 200, 788, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        HistoryProblem.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 740);

        add(HistoryProblem, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
       
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to give a grading.");
           
    }
        else if (SelectedRowIndex >= 0){
             DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
             if(model.getValueAt(SelectedRowIndex, 6).toString().equals("Completed")){
              OrderJPanel.setVisible(false);
        FeedbackCSJPanel.setVisible(true);
        FileComplainJPanel.setVisible(false);
        //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
         int ordernumber=(int)model.getValueAt(SelectedRowIndex, 2);
         if(model.getValueAt(SelectedRowIndex, 4).toString().equals("Pick-up"))
         {
          jTextField2.setText(String.valueOf(ordernumber));
        jTextField2.setEditable(false);
        jComboBox2.setEnabled(false);
         
         }
         else{
                jTextField2.setText(String.valueOf(ordernumber));
        jTextField2.setEditable(false);
        jComboBox2.setEnabled(true);
         }  
         }
             else {
                 JOptionPane.showConfirmDialog(null, "Please granding when the order completed.");
             }
         }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
      int SelectedRowIndex = jTable2.getSelectedRow();
      DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
      if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a order to give your feedback.");
            
    }
     
        
        //int SelectedRowIndex = jTable2.getSelectedRow();
        
      else if (SelectedRowIndex >= 0){
        //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        //order od = (order) model.getValueAt(SelectedRowIndex, 0);
         if(model.getValueAt(SelectedRowIndex, 6).toString().equals("On the way") || model.getValueAt(SelectedRowIndex, 6).toString().equals("Completed")  ){
          OrderJPanel.setVisible(false);
        FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(true);
        String date=(String)model.getValueAt(SelectedRowIndex, 1);
        int ordernumber=(int)model.getValueAt(SelectedRowIndex, 2);
        String market=(String)model.getValueAt(SelectedRowIndex, 3);
        String type=(String)model.getValueAt(SelectedRowIndex, 4);
        float total=(float)model.getValueAt(SelectedRowIndex, 5);
        String status=(String)model.getValueAt(SelectedRowIndex, 6);
        String user=(String)model.getValueAt(SelectedRowIndex, 0);

        
        
        jTextField1.setText(user);
        jTextField1.setEditable(false);
     
        jTextField4.setText(String.valueOf(ordernumber));
        jTextField4.setEditable(false);
        
        jTextField5.setText(status);
        jTextField5.setEditable(false);
        
        jComboBox4.setSelectedItem(type);
        jComboBox4.setEnabled(false);
        
        jTextField8.setText(date);
        jTextField8.setEditable(false);
        
        jTextField6.setText(market);
        jTextField6.setEditable(false);
        
        
        jTextField7.setText(String.valueOf(total));
        jTextField7.setEditable(false);
      
        }
         else{
          JOptionPane.showConfirmDialog(null, "You cannot feedback problems for the preparing order!");
          
      }
       
      }
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow(); 
       
     

        if(jTable2.getSelectedRowCount()==1){
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int ordernumber=(int)model.getValueAt(SelectedRowIndex,2);
        String marketString=model.getValueAt(SelectedRowIndex, 3).toString();
        
        if(model.getValueAt(SelectedRowIndex, 6).toString().equals("Created"))
        {
                    try 
        {
             String Query;
             Query="delete from orders where orderID='"+ordernumber+"' ";
             InsertUpdateDelete.setData(Query,"Conceled order successfully!");
             
             String Query1;
            Query1="update market set amount=amount+1 where Name='"+marketString+"'";
            InsertUpdateDelete.setData(Query1, "");
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
            
            
        }
        else {
            JOptionPane.showConfirmDialog(null, "Sorry, you cannot cancel this order!");
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
     
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
      int SelectedRowIndex = jTable2.getSelectedRow(); 
      DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int marketscore=Integer.parseInt((String)jComboBox2.getSelectedItem());
      //int deliveryscore=Integer.parseInt((String)jComboBox3.getSelectedItem());
      int ordernumber=Integer.parseInt((String)jTextField2.getText());
      String typeString=model.getValueAt(SelectedRowIndex, 4).toString();
      if(typeString.equals("Delivery")){
          int deliveryscore=Integer.parseInt((String)jComboBox3.getSelectedItem());
      String Query;
            Query="update orders set marketscore='"+marketscore+"', Deliveryscore='"+deliveryscore+"'  where orderID='"+ordernumber+"' ";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query,"Thanks for your feedback!");
            //setVisible(true);
      }
      else{
          String Query1;
          Query1="update orders set marketscore='"+marketscore+"' where orderID='"+ordernumber+"' ";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query1,"Thanks for your feedback!");
          
      }
      setVisible(true);
            
      
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String date=jTextField8.getText();
        int ordernumber=Integer.parseInt(jTextField4.getText());
        String market=jTextField6.getText();
        String type=(String)jComboBox4.getSelectedItem();
        float total=Float.parseFloat(jTextField7.getText());
        String status=jTextField5.getText();
        String user=jTextField1.getText();
        String problemString=(String)cmbProblem.getSelectedItem();
        String detailsString=(String)jTextArea1.getText();
        
        String Query;
            Query="insert into CustomerService(user,ordernumber,ordertype,orderdate,market,total,problem,status,details) values('"+user+"','"+ordernumber+"','"+type+"','"+date+"','"+market+"','"+total+"','"+problemString+"','"+status+"','"+detailsString+"')";
            //Query="insert into person(username,zipcode,phone number,password,address,gender,email,role)values(?,?,?,?,?,?,?,?)";
            InsertUpdateDelete.setData(Query,"We have received your problems!");
            setVisible(true);
      
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OrderJPanel.setVisible(true);
        HistoryProblem.setVisible(false);
        FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTable2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable2ComponentShown
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTable2ComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrderJPanel.setVisible(true);
        HistoryProblem.setVisible(false);
         FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(false);
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           OrderJPanel.setVisible(true);
           HistoryProblem.setVisible(false);
         FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable3ComponentShown
        // TODO add your handling code here:
        String usernameString=Login.jTextField1.getText();
                       
           
       ResultSet rs=Select.getData("select * from CustomerService where user = '"+usernameString+"' ");
        DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
        try {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getInt(2),rs.getString(3),rs.getString(7),rs.getString(9),rs.getString(8)});
            }
            rs.close();
                
            
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
    }//GEN-LAST:event_jTable3ComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        OrderJPanel.setVisible(false);
        FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(false);
        HistoryProblem.setVisible(true);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow(); 
       
        if(jTable2.getSelectedRowCount()==1){
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int ordernumber=(int)model.getValueAt(SelectedRowIndex,2);
        //String marketString=model.getValueAt(SelectedRowIndex, 3).toString();
        
        if(model.getValueAt(SelectedRowIndex, 4).toString().equals("Pick-up") && model.getValueAt(SelectedRowIndex, 6).toString().equals("Ready to pick up"))
        {
                    try 
        {
           
             String Query1;
            Query1="update orders set status='Completed' where orderID='"+ordernumber+"'";
            InsertUpdateDelete.setData(Query1, "This order completed!");
       
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
            
        }
            
            
        }
        else {
            JOptionPane.showConfirmDialog(null, "Sorry, you cannot change the status!");
        }
           
        }
        else{
            if(jTable2.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
         
            }
            else{
                JOptionPane.showMessageDialog(this,"Please select a order to get.");
            }
        }
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        Table();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FeedbackCSJPanel;
    private javax.swing.JPanel FileComplainJPanel;
    private javax.swing.JPanel HistoryProblem;
    private javax.swing.JPanel OrderJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JComboBox<String> cmbProblem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblComplain;
    private javax.swing.JLabel lblDetail;
    private javax.swing.JLabel lblMarket;
    private javax.swing.JLabel lblOrder1;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblOrderType;
    private javax.swing.JLabel lblProblem;
    private javax.swing.JLabel lblProblem1;
    private javax.swing.JLabel lblServiceInProgress;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
private void populateOrderTable() {
        /*DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
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
        }*/
            
    }
}
