/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author chengzhishi
 */
public class CustomerServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerServiceJPanel
     */
    public CustomerServiceJPanel() {
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

        lblServiceInProgress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblServiceInProgress.setFont(new java.awt.Font("Kokonor", 3, 24)); // NOI18N
        lblServiceInProgress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServiceInProgress.setText("Customer Service Overview");
        add(lblServiceInProgress);
        lblServiceInProgress.setBounds(-20, 70, 800, 42);

        jTable2.setBackground(new java.awt.Color(204, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 110, 788, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/picture/1-1024x1024.jpeg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 610);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblServiceInProgress;
    // End of variables declaration//GEN-END:variables
}
