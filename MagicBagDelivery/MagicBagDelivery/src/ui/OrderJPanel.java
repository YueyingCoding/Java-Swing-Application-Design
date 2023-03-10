/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
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

/**
 *
 * @author chengzhishi
 */
public class OrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderJPanel
     */
    OrderList history;
    Feedbacks fbs;
    CompletedOrderUserComplainList finishedcomplain;
    CurrentOrderUserComplainList currentcomplain;
    public OrderJPanel(OrderList history, Feedbacks fbs, CompletedOrderUserComplainList finishedcomplain,CurrentOrderUserComplainList currentcomplain) {
        initComponents();
        this.history = history;
        this.fbs = fbs;
        this.finishedcomplain = finishedcomplain;
        this.currentcomplain = currentcomplain;
        OrderJPanel.setVisible(true);
        FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(false);
        populateOrderTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderJPanel = new javax.swing.JPanel();
        lblOrder1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FeedbackCSJPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        btnconfirm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        OrderJPanel.setLayout(null);

        lblOrder1.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblOrder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrder1.setText("Order");
        OrderJPanel.add(lblOrder1);
        lblOrder1.setBounds(-20, 60, 814, 42);

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Date", "Order Number", "Market", "Order Type", "Total Amount", "Status"
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

        OrderJPanel.add(jScrollPane2);
        jScrollPane2.setBounds(6, 175, 790, 237);

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 153, 0));
        jButton6.setText("Customer Service");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        OrderJPanel.add(jButton6);
        jButton6.setBounds(580, 100, 182, 29);

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
        jButton7.setBounds(650, 470, 89, 29);

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 153, 0));
        jButton8.setText("Tip");
        OrderJPanel.add(jButton8);
        jButton8.setBounds(530, 470, 89, 29);

        jButton9.setBackground(new java.awt.Color(204, 255, 204));
        jButton9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 153, 0));
        jButton9.setText("Track");
        OrderJPanel.add(jButton9);
        jButton9.setBounds(400, 470, 89, 29);

        jButton10.setBackground(new java.awt.Color(204, 255, 204));
        jButton10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 153, 0));
        jButton10.setText("Feedback");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        OrderJPanel.add(jButton10);
        jButton10.setBounds(350, 100, 182, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        OrderJPanel.add(jLabel2);
        jLabel2.setBounds(-6, -4, 830, 610);

        add(OrderJPanel, "card10");

        FeedbackCSJPanel.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setText("Delivery Comment:");
        FeedbackCSJPanel.add(jLabel3);
        jLabel3.setBounds(200, 130, 170, 23);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("Score about delivery person:");
        FeedbackCSJPanel.add(jLabel4);
        jLabel4.setBounds(200, 320, 245, 23);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        FeedbackCSJPanel.add(jComboBox2);
        jComboBox2.setBounds(460, 320, 72, 23);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 0));
        jLabel6.setText("Score about market:");
        FeedbackCSJPanel.add(jLabel6);
        jLabel6.setBounds(270, 360, 245, 23);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        FeedbackCSJPanel.add(jComboBox3);
        jComboBox3.setBounds(460, 360, 72, 23);
        FeedbackCSJPanel.add(jTextField2);
        jTextField2.setBounds(370, 130, 260, 80);

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
        btnconfirm.setBounds(440, 420, 110, 29);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 0));
        jLabel7.setText("Market Comment:");
        FeedbackCSJPanel.add(jLabel7);
        jLabel7.setBounds(200, 220, 170, 23);
        FeedbackCSJPanel.add(jTextField3);
        jTextField3.setBounds(370, 220, 260, 80);

        jLabel5.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel5.setText("Order Feedback");
        FeedbackCSJPanel.add(jLabel5);
        jLabel5.setBounds(310, 60, 310, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        FeedbackCSJPanel.add(jLabel8);
        jLabel8.setBounds(0, 0, 740, 570);

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
        lblOrderDate.setBounds(482, 142, 127, 23);
        FileComplainJPanel.add(jTextField5);
        jTextField5.setBounds(663, 144, 114, 23);

        lblMarket.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMarket.setForeground(new java.awt.Color(51, 102, 0));
        lblMarket.setText("Market:");
        FileComplainJPanel.add(lblMarket);
        lblMarket.setBounds(97, 226, 127, 23);
        FileComplainJPanel.add(jTextField6);
        jTextField6.setBounds(242, 228, 114, 23);

        lblProblem.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblProblem.setForeground(new java.awt.Color(51, 102, 0));
        lblProblem.setText("Problem:");
        FileComplainJPanel.add(lblProblem);
        lblProblem.setBounds(500, 230, 127, 23);

        cmbProblem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wrong Order", "Not Received", "Delayed", "Missing Item" }));
        FileComplainJPanel.add(cmbProblem);
        cmbProblem.setBounds(661, 228, 114, 23);

        jComboBox4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Pick-up" }));
        FileComplainJPanel.add(jComboBox4);
        jComboBox4.setBounds(230, 140, 130, 29);

        lblDetail.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDetail.setForeground(new java.awt.Color(51, 102, 0));
        lblDetail.setText("Details:");
        FileComplainJPanel.add(lblDetail);
        lblDetail.setBounds(97, 397, 127, 23);

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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Image Proof:");
        FileComplainJPanel.add(jLabel1);
        jLabel1.setBounds(482, 309, 127, 23);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Photo Here");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FileComplainJPanel.add(jLabel9);
        jLabel9.setBounds(615, 311, 162, 177);

        btnUpload.setBackground(new java.awt.Color(204, 255, 204));
        btnUpload.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(102, 204, 0));
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        FileComplainJPanel.add(btnUpload);
        btnUpload.setBounds(390, 541, 91, 29);

        jLabel10.setForeground(new java.awt.Color(51, 102, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        FileComplainJPanel.add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 600);

        add(FileComplainJPanel, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        OrderJPanel.setVisible(false);
        FeedbackCSJPanel.setVisible(true);
        FileComplainJPanel.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        OrderJPanel.setVisible(false);
        FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(true);
        
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to File a Complain.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        order od = (order) model.getValueAt(SelectedRowIndex, 0);
        
        jTextField1.setText(od.getCustomer().getUsername());
        jTextField1.setEditable(false);
        
        
        jTextField4.setText(String.valueOf(od.getOrderNumber()));
        jTextField4.setEditable(false);
        
        jComboBox4.setSelectedItem(od.getOrderType());
        jComboBox4.setEnabled(false);
        
        jTextField5.setText(String.valueOf(od.getOrderDate()));
        jTextField5.setEditable(false);
        
        jTextField6.setText(od.getMarket().getMarketname());
        jTextField6.setEditable(false);
        
        
        jTextField7.setText(String.valueOf(od.getTotalAmount()));
        jTextField7.setEditable(false);
        
        if (od.getStatus().equals("Completed")){
            CompletedOrderUserComplain couc = finishedcomplain.addNewCOUC();
            couc.setCustomer(od.getCustomer());
            couc.setOrder(od);
            couc.setProblem((String) cmbProblem.getSelectedItem());
            couc.setDetails(jTextArea1.getText());
            couc.setImage((ImageIcon) jLabel9.getIcon());
        }
        else{
            CurrentOrderUserComplain couc = currentcomplain.addNewCOUC();
            couc.setCustomer(od.getCustomer());
            couc.setOrder(od);
            couc.setProblem((String) cmbProblem.getSelectedItem());
            couc.setDetails(jTextArea1.getText());
            couc.setImage((ImageIcon) jLabel9.getIcon());
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select an Order to Cancel.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        order Order = (order) model.getValueAt(SelectedRowIndex, 0);
        if (Order.getStatus().equals("Order Placed")){
            history.deleteOrder(Order);
        }
        else{
            JOptionPane.showMessageDialog(this, "Unsuccessful! Your order is already in progress!");
        }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select an Order to Cancel.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        order Order = (order) model.getValueAt(SelectedRowIndex, 0);
        Feedback fb = fbs.addNewFeedback();
        fb.setMarket(Order.getMarket());
        fb.setCustomer(Order.getCustomer());
        fb.setOrder(Order);
        fb.setCommentDP(jTextField2.getText());
        fb.setCommentMKT(jTextField3.getText());
        fb.setScoreDP((int) jComboBox2.getSelectedItem());
        fb.setScoreMKT((int) jComboBox3.getSelectedItem());
        }
        
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("4 Extensions Supported", "jpg", "png", "jpeg", "gif");
        filechooser.setFileFilter(filter);
        int selected = filechooser.showOpenDialog(null);
        if (selected == JFileChooser.APPROVE_OPTION){
            File file = filechooser.getSelectedFile();
            
            String getselectedImage = file.getAbsolutePath();
            JOptionPane.showMessageDialog(null, "Image Uploaded.");
            
            ImageIcon imIco = new ImageIcon(getselectedImage);
            Image imFit = imIco.getImage();
            Image imgFit = imFit.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
            jLabel9.setIcon(new ImageIcon(imgFit));
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to File a Complain.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        order od = (order) model.getValueAt(SelectedRowIndex, 0);
        
        if (od.getStatus().equals("Completed")){
            CompletedOrderUserComplain couc = finishedcomplain.addNewCOUC();
            couc.setCustomer(od.getCustomer());
            couc.setOrder(od);
            couc.setProblem((String) cmbProblem.getSelectedItem());
            couc.setDetails(jTextArea1.getText());
            couc.setImage((ImageIcon) jLabel9.getIcon());
        }
        else{
            CurrentOrderUserComplain couc = currentcomplain.addNewCOUC();
            couc.setCustomer(od.getCustomer());
            couc.setOrder(od);
            couc.setProblem((String) cmbProblem.getSelectedItem());
            couc.setDetails(jTextArea1.getText());
            couc.setImage((ImageIcon) jLabel9.getIcon());
        }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        OrderJPanel.setVisible(true);
        FeedbackCSJPanel.setVisible(false);
        FileComplainJPanel.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FeedbackCSJPanel;
    private javax.swing.JPanel FileComplainJPanel;
    private javax.swing.JPanel OrderJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JComboBox<String> cmbProblem;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblComplain;
    private javax.swing.JLabel lblDetail;
    private javax.swing.JLabel lblMarket;
    private javax.swing.JLabel lblOrder1;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblOrderType;
    private javax.swing.JLabel lblProblem;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
private void populateOrderTable() {
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
            
    }
}
