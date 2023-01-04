/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Market;
import model.markets;
import model.order;

/**
 *
 * @author evelyn
 */
public class SystemMarketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemMarketJPanel
     */
    markets markethistory;
    public SystemMarketJPanel(markets markethistory) {
        initComponents();
        this.markethistory=markethistory;
        Table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void Table(){
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Market mkt : markethistory.getHistory()) {
            
            
                Object[] row = new Object[6];
                row[0] = mkt.getMarketname();
                row[1] = mkt.getAddress();
                row[2] = mkt.getType();
                row[3] = mkt.getBagname();
                row[4] = mkt.getAmount();
                
                
                model.addRow(row);
        } 
            
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        TypeCombo = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnread = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 153, 0));
        setLayout(null);

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Type", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(160, 60, 452, 231);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("Name:");
        add(jLabel1);
        jLabel1.setBounds(40, 300, 54, 23);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 0));
        jLabel2.setText("Address:");
        add(jLabel2);
        jLabel2.setBounds(43, 351, 76, 23);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setText("Type:");
        add(jLabel3);
        jLabel3.setBounds(50, 400, 46, 23);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 0));
        jLabel5.setText("Amount:");
        add(jLabel5);
        jLabel5.setBounds(40, 450, 72, 23);

        jLabel7.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel7.setText("Market Administration");
        add(jLabel7);
        jLabel7.setBounds(270, 0, 310, 50);
        add(jTextField1);
        jTextField1.setBounds(110, 300, 120, 23);
        add(jTextField2);
        jTextField2.setBounds(131, 353, 104, 23);

        TypeCombo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        TypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bakery", "Restaurant", "Grocery", " " }));
        add(TypeCombo);
        TypeCombo.setBounds(130, 400, 120, 29);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        add(jComboBox1);
        jComboBox1.setBounds(130, 450, 72, 23);

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
        btncreate.setBounds(450, 390, 86, 29);

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
        btnupdate.setBounds(570, 390, 91, 29);

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
        btnread.setBounds(460, 470, 74, 29);

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
        btndelete.setBounds(570, 470, 84, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 730, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int SelectedRowIndex = jTable1.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Delete.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Market mkt = (Market) model.getValueAt(SelectedRowIndex, 0);
        markethistory.deleteMarket(mkt);
        Table();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         int SelectedRowIndex = jTable1.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Update.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Market mkt = (Market) model.getValueAt(SelectedRowIndex, 0);
        
        mkt.setMarketname(jTextField1.getText());
        mkt.setAddress(jTextField2.getText());
        mkt.setType((String) TypeCombo.getSelectedItem());
       
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
        // TODO add your handling code here:
         int SelectedRowIndex = jTable1.getSelectedRow();
        if (SelectedRowIndex < 0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row to Read.");
            return;
    }
        if (SelectedRowIndex > 0){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Market mkt = (Market) model.getValueAt(SelectedRowIndex, 0);
        
        jTextField1.setText(mkt.getMarketname());
        
        jTextField2.setText(mkt.getAddress());
        
        TypeCombo.setSelectedItem(mkt.getType());
        
     
       
        }
    }//GEN-LAST:event_btnreadActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        Market mkt = new Market();
        mkt.setMarketname(jTextField1.getText());
        mkt.setAddress(jTextField2.getText());
        mkt.setType((String) TypeCombo.getSelectedItem());
       
        
        markethistory.addNewMarket();
    }//GEN-LAST:event_btncreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TypeCombo;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnread;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}