/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Market;
import model.OrderList;
import model.deliveryperson;
import model.deliverypersons;
import model.markets;
import model.order;

/**
 *
 * @author evelyn
 */
public class SystemRankingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemMarketJPanel
     */
    markets markethistory;
    deliverypersons dphistory;
    OrderList orderhistory;
    public SystemRankingJPanel(markets markethistory,deliverypersons dphistory,OrderList orderhistory) {
        initComponents();
        this.markethistory= markethistory;
        this.dphistory=dphistory;
        this.orderhistory = orderhistory;
        Table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnread = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 153, 0));
        setLayout(null);

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order Number", "Score of Market", "Score of Delivery Person"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(160, 40, 452, 231);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("Order Number:");
        add(jLabel1);
        jLabel1.setBounds(40, 300, 127, 23);
        add(jTextField1);
        jTextField1.setBounds(190, 300, 120, 23);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("Score about delivery person:");
        add(jLabel4);
        jLabel4.setBounds(40, 380, 245, 23);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        add(jComboBox2);
        jComboBox2.setBounds(320, 380, 72, 23);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 0));
        jLabel7.setText("Score about market:");
        add(jLabel7);
        jLabel7.setBounds(40, 340, 173, 23);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        add(jComboBox3);
        jComboBox3.setBounds(320, 340, 72, 23);

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
        jLabel8.setText("Ranking Administration");
        add(jLabel8);
        jLabel8.setBounds(230, 0, 310, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 730, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreadActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed
 public void Table(){
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
            
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnread;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
