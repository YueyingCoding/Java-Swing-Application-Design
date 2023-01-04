/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CompletedOrderUserComplain;
import model.CompletedOrderUserComplainList;
import model.CurrentOrderUserComplain;
import model.CurrentOrderUserComplainList;

/**
 *
 * @author chengzhishi
 */
public class CurrentOrderCSJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CompletedOrderComplains
     */
    CurrentOrderUserComplainList history;
    public CurrentOrderCSJPanel(CurrentOrderUserComplainList history) {
        initComponents();
        this.history = history;
        populateInprogressTable();
        populateFinishedTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CurrentOrderCSJPanel = new javax.swing.JPanel();
        lblServiceInProgress2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        lblServiceInProgress3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        btnview1 = new javax.swing.JButton();
        btnback1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CurrentOrderComplainsJPanel = new javax.swing.JPanel();
        lblComplain = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblOrderNumber = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblOrderType = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblMarket = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        lblProblem = new javax.swing.JLabel();
        cmbProblem = new javax.swing.JComboBox<>();
        lblTotalAmount = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        lblDetail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblDecision = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        CurrentOrderCSJPanel.setLayout(null);

        lblServiceInProgress2.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblServiceInProgress2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServiceInProgress2.setText("In Progress");
        CurrentOrderCSJPanel.add(lblServiceInProgress2);
        lblServiceInProgress2.setBounds(0, 6, 800, 42);

        jTable4.setBackground(new java.awt.Color(204, 255, 204));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Number", "Order Type", "Total Amount", "Problem", "Decision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        CurrentOrderCSJPanel.add(jScrollPane4);
        jScrollPane4.setBounds(6, 66, 788, 169);

        lblServiceInProgress3.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblServiceInProgress3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServiceInProgress3.setText("Finished");
        CurrentOrderCSJPanel.add(lblServiceInProgress3);
        lblServiceInProgress3.setBounds(6, 253, 788, 42);

        jTable5.setBackground(new java.awt.Color(204, 255, 204));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Number", "Order Type", "Total Amount", "Problem", "Decision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        CurrentOrderCSJPanel.add(jScrollPane5);
        jScrollPane5.setBounds(6, 313, 788, 169);

        btnview1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnview1.setForeground(new java.awt.Color(51, 204, 0));
        btnview1.setText("Back");
        CurrentOrderCSJPanel.add(btnview1);
        btnview1.setBounds(670, 540, 80, 30);

        btnback1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnback1.setForeground(new java.awt.Color(51, 204, 0));
        btnback1.setText("View");
        btnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback1ActionPerformed(evt);
            }
        });
        CurrentOrderCSJPanel.add(btnback1);
        btnback1.setBounds(670, 500, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        CurrentOrderCSJPanel.add(jLabel2);
        jLabel2.setBounds(-5, -3, 810, 610);

        add(CurrentOrderCSJPanel, "card9");

        CurrentOrderComplainsJPanel.setLayout(null);

        lblComplain.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblComplain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComplain.setText("User Complain");
        CurrentOrderComplainsJPanel.add(lblComplain);
        lblComplain.setBounds(6, 10, 788, 42);

        lblUser.setBackground(new java.awt.Color(204, 255, 204));
        lblUser.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 102, 0));
        lblUser.setText("User:");
        CurrentOrderComplainsJPanel.add(lblUser);
        lblUser.setBounds(120, 90, 87, 23);
        CurrentOrderComplainsJPanel.add(jTextField1);
        jTextField1.setBounds(190, 90, 115, 23);

        lblOrderNumber.setBackground(new java.awt.Color(204, 255, 204));
        lblOrderNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOrderNumber.setForeground(new java.awt.Color(0, 102, 0));
        lblOrderNumber.setText("Order Number:");
        CurrentOrderComplainsJPanel.add(lblOrderNumber);
        lblOrderNumber.setBounds(430, 80, 127, 23);
        CurrentOrderComplainsJPanel.add(jTextField2);
        jTextField2.setBounds(590, 80, 115, 23);

        lblOrderType.setBackground(new java.awt.Color(204, 255, 204));
        lblOrderType.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOrderType.setForeground(new java.awt.Color(0, 102, 0));
        lblOrderType.setText("Order Type:");
        CurrentOrderComplainsJPanel.add(lblOrderType);
        lblOrderType.setBounds(70, 160, 160, 23);

        lblOrderDate.setBackground(new java.awt.Color(204, 255, 204));
        lblOrderDate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblOrderDate.setForeground(new java.awt.Color(0, 102, 0));
        lblOrderDate.setText("Order Date:");
        CurrentOrderComplainsJPanel.add(lblOrderDate);
        lblOrderDate.setBounds(460, 150, 150, 23);
        CurrentOrderComplainsJPanel.add(jTextField4);
        jTextField4.setBounds(589, 150, 115, 23);

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Pick-up" }));
        CurrentOrderComplainsJPanel.add(jComboBox2);
        jComboBox2.setBounds(190, 160, 130, 29);

        lblMarket.setBackground(new java.awt.Color(204, 255, 204));
        lblMarket.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMarket.setForeground(new java.awt.Color(0, 102, 0));
        lblMarket.setText("Market:");
        CurrentOrderComplainsJPanel.add(lblMarket);
        lblMarket.setBounds(100, 240, 110, 23);
        CurrentOrderComplainsJPanel.add(jTextField5);
        jTextField5.setBounds(190, 240, 115, 23);

        lblProblem.setBackground(new java.awt.Color(204, 255, 204));
        lblProblem.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblProblem.setForeground(new java.awt.Color(0, 102, 0));
        lblProblem.setText("Problem:");
        CurrentOrderComplainsJPanel.add(lblProblem);
        lblProblem.setBounds(480, 230, 110, 23);

        cmbProblem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wrong Order", "Not Received", "Delayed", "Missing Item" }));
        CurrentOrderComplainsJPanel.add(cmbProblem);
        cmbProblem.setBounds(588, 232, 115, 23);

        lblTotalAmount.setBackground(new java.awt.Color(204, 255, 204));
        lblTotalAmount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTotalAmount.setForeground(new java.awt.Color(0, 102, 0));
        lblTotalAmount.setText("Total Amount:");
        CurrentOrderComplainsJPanel.add(lblTotalAmount);
        lblTotalAmount.setBounds(50, 320, 170, 23);
        CurrentOrderComplainsJPanel.add(jTextField6);
        jTextField6.setBounds(190, 320, 115, 23);

        lblDetail.setBackground(new java.awt.Color(204, 255, 204));
        lblDetail.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDetail.setForeground(new java.awt.Color(0, 102, 0));
        lblDetail.setText("Details:");
        CurrentOrderComplainsJPanel.add(lblDetail);
        lblDetail.setBounds(100, 400, 87, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        CurrentOrderComplainsJPanel.add(jScrollPane1);
        jScrollPane1.setBounds(190, 400, 234, 91);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Image Proof:");
        CurrentOrderComplainsJPanel.add(jLabel1);
        jLabel1.setBounds(460, 340, 160, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Photo Here");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CurrentOrderComplainsJPanel.add(jLabel3);
        jLabel3.setBounds(590, 330, 162, 177);

        btnSubmit.setBackground(new java.awt.Color(204, 255, 204));
        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(102, 153, 0));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        CurrentOrderComplainsJPanel.add(btnSubmit);
        btnSubmit.setBounds(440, 610, 120, 29);

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 153, 0));
        btnBack.setText("Back");
        CurrentOrderComplainsJPanel.add(btnBack);
        btnBack.setBounds(590, 610, 120, 29);

        lblDecision.setBackground(new java.awt.Color(204, 255, 204));
        lblDecision.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDecision.setForeground(new java.awt.Color(0, 102, 0));
        lblDecision.setText("Decision:");
        CurrentOrderComplainsJPanel.add(lblDecision);
        lblDecision.setBounds(80, 530, 130, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "10% Refund", "50% Refund", "75% Refund", "100% Refund" }));
        CurrentOrderComplainsJPanel.add(jComboBox1);
        jComboBox1.setBounds(190, 530, 115, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        CurrentOrderComplainsJPanel.add(jLabel4);
        jLabel4.setBounds(0, -3, 800, 700);

        add(CurrentOrderComplainsJPanel, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback1ActionPerformed
        // TODO add your handling code here:
        CurrentOrderCSJPanel.setVisible(false);
        CurrentOrderComplainsJPanel.setVisible(true);
        
        int SelectedRowIndex1 = jTable4.getSelectedRow();
        int SelectedRowIndex2 = jTable5.getSelectedRow();
        if (SelectedRowIndex1 < 0 & SelectedRowIndex2 < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to View.");
            return;
    }
        if (SelectedRowIndex1 > 0){
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        CompletedOrderUserComplain couc = (CompletedOrderUserComplain) model.getValueAt(SelectedRowIndex1, 0);
        
        jTextField1.setText(couc.getCustomer().getUsername());
        jTextField1.setEditable(false);
        
        jTextField2.setText(String.valueOf(couc.getOrder().getOrderNumber()));
        jTextField2.setEditable(false);
        
        jComboBox2.setSelectedItem(couc.getOrder().getOrderType());
        jComboBox2.setEditable(false);
        
        jTextField4.setText(String.valueOf(couc.getOrder().getOrderDate()));
        jTextField4.setEditable(false);
        
        jTextField5.setText(couc.getOrder().getMarket().getMarketname());
        jTextField5.setEditable(false);
        
        cmbProblem.setSelectedItem(couc.getProblem());
        cmbProblem.setEnabled(false);
        
        jTextField6.setText(String.valueOf(couc.getOrder().getTotalAmount()));
        jTextField6.setEditable(false);
        
        jTextArea1.setText(couc.getDetails());
        jTextArea1.setEditable(false);
        
        jLabel3.setIcon(couc.getImage());
        
        jComboBox1.setSelectedIndex(0);
        jComboBox1.setEnabled(true);
        
        }
        else if (SelectedRowIndex2 > 0){
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        CompletedOrderUserComplain couc = (CompletedOrderUserComplain) model.getValueAt(SelectedRowIndex2, 0);
        
        jTextField1.setText(couc.getCustomer().getUsername());
        jTextField1.setEditable(false);
        
        jTextField2.setText(String.valueOf(couc.getOrder().getOrderNumber()));
        jTextField2.setEditable(false);
        
        jComboBox2.setSelectedItem(couc.getOrder().getOrderType());
        jComboBox2.setEditable(false);
        
        jTextField4.setText(String.valueOf(couc.getOrder().getOrderDate()));
        jTextField4.setEditable(false);
        
        jTextField5.setText(couc.getOrder().getMarket().getMarketname());
        jTextField5.setEditable(false);
        
        cmbProblem.setSelectedItem(couc.getProblem());
        cmbProblem.setEnabled(false);
        
        jTextField6.setText(String.valueOf(couc.getOrder().getTotalAmount()));
        jTextField6.setEditable(false);
        
        jTextArea1.setText(couc.getDetails());
        jTextArea1.setEditable(false);
        
        jLabel3.setIcon(couc.getImage());
        
        jComboBox1.setSelectedItem(couc.getDecision());
        jComboBox1.setEnabled(true);
        }
    }//GEN-LAST:event_btnback1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex1 = jTable4.getSelectedRow();
        int SelectedRowIndex2 = jTable5.getSelectedRow();
        if (SelectedRowIndex1 < 0 & SelectedRowIndex2 < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to View.");
            return;
    }
        if (SelectedRowIndex1 > 0){
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        CurrentOrderUserComplain couc = (CurrentOrderUserComplain) model.getValueAt(SelectedRowIndex1, 0);
        
        couc.setDecision((String) jComboBox1.getSelectedItem());
        }
        if (SelectedRowIndex2 > 0){
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        CurrentOrderUserComplain couc = (CurrentOrderUserComplain) model.getValueAt(SelectedRowIndex2, 0);
        
        couc.setDecision((String) jComboBox1.getSelectedItem());
        }
        populateInprogressTable();
        populateFinishedTable();
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CurrentOrderCSJPanel;
    private javax.swing.JPanel CurrentOrderComplainsJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btnview1;
    private javax.swing.JComboBox<String> cmbProblem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblComplain;
    private javax.swing.JLabel lblDecision;
    private javax.swing.JLabel lblDetail;
    private javax.swing.JLabel lblMarket;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblOrderType;
    private javax.swing.JLabel lblProblem;
    private javax.swing.JLabel lblServiceInProgress2;
    private javax.swing.JLabel lblServiceInProgress3;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
private void populateInprogressTable() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);
        
        for (CurrentOrderUserComplain couc : history.getHistory()) {
            
            if (couc.getDecision().isEmpty()) {
            
                Object[] row = new Object[5];
                row[0] = couc;
                row[1] = couc.getOrder().getOrderType();
                row[2] = couc.getOrder().getTotalAmount();
                row[3] = couc.getProblem();
                row[4] = couc.getDecision();
                
                model.addRow(row);
        }
        }
            
    }
    
    private void populateFinishedTable() {
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        model.setRowCount(0);
        
        for (CurrentOrderUserComplain couc : history.getHistory()) {
            
            if (!couc.getDecision().isEmpty()) {
            
                Object[] row = new Object[5];
                row[0] = couc;
                row[1] = couc.getOrder().getOrderType();
                row[2] = couc.getOrder().getTotalAmount();
                row[3] = couc.getProblem();
                row[4] = couc.getDecision();
                
                model.addRow(row);
        }
        }
            
    }
}
