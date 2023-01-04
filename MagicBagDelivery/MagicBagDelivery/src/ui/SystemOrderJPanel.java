/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.time.LocalDate;
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

/**
 *
 * @author evelyn
 */
public class SystemOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemMarketJPanel
     */
    OrderList history;
    Feedbacks fbs;
    markets mkts;
    customers ct;
    CompletedOrderUserComplainList finishedcomplain;
    CurrentOrderUserComplainList currentcomplain;
    public SystemOrderJPanel(OrderList history, Feedbacks fbs, CompletedOrderUserComplainList finishedcomplain,CurrentOrderUserComplainList currentcomplain, 
            markets mkts, customers ct) {
        initComponents();
        this.history = history;
        this.fbs = fbs;
        this.finishedcomplain = finishedcomplain;
        this.currentcomplain = currentcomplain;
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
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnread = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
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
        jLabel3.setBounds(330, 540, 80, 23);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("Order Type:");
        add(jLabel4);
        jLabel4.setBounds(10, 450, 110, 23);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 0));
        jLabel5.setText("Total Amount:");
        add(jLabel5);
        jLabel5.setBounds(0, 540, 130, 23);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 0));
        jLabel7.setText("Market:");
        add(jLabel7);
        jLabel7.setBounds(30, 400, 80, 23);

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

        add(jScrollPane2);
        jScrollPane2.setBounds(40, 50, 680, 237);
        add(jTextField1);
        jTextField1.setBounds(110, 300, 120, 23);

        jComboBox2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery", "Pick-up" }));
        add(jComboBox2);
        jComboBox2.setBounds(120, 450, 130, 29);
        add(jTextField2);
        jTextField2.setBounds(140, 360, 130, 23);
        add(jTextField6);
        jTextField6.setBounds(140, 410, 130, 20);
        add(jTextField5);
        jTextField5.setBounds(440, 450, 109, 23);

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completed", "Uncompleted" }));
        add(jComboBox1);
        jComboBox1.setBounds(410, 540, 140, 29);

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
        btncreate.setBounds(470, 300, 86, 29);

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
        btnupdate.setBounds(600, 300, 91, 29);

        btnread.setBackground(new java.awt.Color(204, 255, 204));
        btnread.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnread.setForeground(new java.awt.Color(102, 153, 0));
        btnread.setText("Read");
        btnread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreadActionPerformed(evt);
            }
        });
        add(btnread);
        btnread.setBounds(480, 360, 74, 29);

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
        btndelete.setBounds(600, 360, 84, 29);

        jLabel8.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel8.setText("Order Administration");
        add(jLabel8);
        jLabel8.setBounds(270, 0, 310, 50);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 0));
        jLabel9.setText("Customer:");
        add(jLabel9);
        jLabel9.setBounds(330, 450, 100, 23);
        add(jTextField7);
        jTextField7.setBounds(140, 540, 109, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 730, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Delete.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        order od = (order) model.getValueAt(SelectedRowIndex, 0);
        history.deleteOrder(od);
        populateOrderTable();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        
        order od = history.addNewOrder();
        od.setOrderDate(LocalDate.parse(jTextField1.getText()));
        od.setOrderNumber(Integer.parseInt(jTextField2.getText()));
        od.setOrderType((String) jComboBox2.getSelectedItem());
        od.setTotalAmount(Float.parseFloat(jTextField7.getText()));
        
        for (Market mk: mkts.getHistory()){
            if (mk.getMarketname().equals(jTextField6.getText())){
                od.setMarket(mk);
                break;
            }
        }
        for (customer ctm: ct.getHistory()){
            if (ctm.getUsername().equals(jTextField5.getText())){
                od.setCustomer(ctm);
            }
        }
        populateOrderTable();
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Read.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        order od = (order) model.getValueAt(SelectedRowIndex, 0);
        
        jTextField1.setText(String.valueOf(od.getOrderDate()));
        
        jTextField2.setText(String.valueOf(od.getOrderNumber()));
        
        jTextField6.setText(od.getMarket().getMarketname());
        
        jComboBox2.setSelectedItem(od.getOrderType());
        
        jTextField5.setText(od.getCustomer().getUsername());
             
        jTextField7.setText(String.valueOf(od.getTotalAmount()));
        
        jComboBox1.setSelectedItem(od.getStatus());
        }
    }//GEN-LAST:event_btnreadActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable2.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Read.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        order od = (order) model.getValueAt(SelectedRowIndex, 0);
        
        od.setOrderDate(LocalDate.parse(jTextField1.getText()));
        od.setOrderNumber(Integer.parseInt(jTextField2.getText()));
        od.setOrderType((String) jComboBox2.getSelectedItem());
        
        jTextField5.setText(od.getCustomer().getUsername());
        od.setTotalAmount(Float.parseFloat(jTextField7.getText()));
        od.setStatus((String) jComboBox1.getSelectedItem());
        
        for (Market mk : mkts.getHistory()){
            if (mk.getMarketname().equals(jTextField6.getText())){
                od.setMarket(mk);
                break;
            }
        }
        for (customer ctm : ct.getHistory()){
            if (ctm.getUsername().equals(jTextField5.getText())){
                od.setCustomer(ctm);
                break;
        }
        }
        }
        populateOrderTable();
    }//GEN-LAST:event_btnupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnread;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
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
