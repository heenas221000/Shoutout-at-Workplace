/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sysadmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heenashah
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateComboBox();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb_Enterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network.getNameOfNetwork();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    
        private void populateComboBox() {
        comboBoxNetworkName.removeAllItems();
        cb_EnterpriseName.removeAllItems();

        for (Network network : system.getNetworkList()) {
            comboBoxNetworkName.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (!type.getValue().equals(Enterprise.EnterpriseType.CaseReporter.getValue())){
                 if (!type.getValue().equals(Enterprise.EnterpriseType.Psychiatrist.getValue())){
                cb_EnterpriseName.addItem(type);
            }}
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxNetworkName = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_NetworkName = new javax.swing.JComboBox();
        cb_EnterpriseName = new javax.swing.JComboBox();
        txt_EnterpriseName = new javax.swing.JTextField();
        bt_submit = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Enterprise = new javax.swing.JTable();

        comboBoxNetworkName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxNetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNetworkNameActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        jLabel1.setText("MANAGE ENTERPRISES");

        jLabel2.setText("NETWORK");

        jLabel3.setText("ENTERPRISE");

        jLabel4.setText("NAME");

        cb_NetworkName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_NetworkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_NetworkNameActionPerformed(evt);
            }
        });

        cb_EnterpriseName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_EnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_EnterpriseNameActionPerformed(evt);
            }
        });

        bt_submit.setBackground(new java.awt.Color(51, 102, 255));
        bt_submit.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_submit.setForeground(new java.awt.Color(255, 255, 255));
        bt_submit.setText("SUBMIT");
        bt_submit.setBorderPainted(false);
        bt_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_submitMouseExited(evt);
            }
        });
        bt_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_submitActionPerformed(evt);
            }
        });

        bt_delete.setBackground(new java.awt.Color(51, 102, 255));
        bt_delete.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(255, 255, 255));
        bt_delete.setText("DELETE");
        bt_delete.setBorderPainted(false);
        bt_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_deleteMouseExited(evt);
            }
        });
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        tb_Enterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ENTERPRISE", "NETWORK", "TYPE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_Enterprise);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb_NetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_EnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_EnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_delete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_NetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cb_EnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_submit)
                    .addComponent(bt_delete))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxNetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNetworkNameActionPerformed

    private void cb_NetworkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_NetworkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_NetworkNameActionPerformed

    private void cb_EnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_EnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_EnterpriseNameActionPerformed

    private void bt_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_submitMouseExited
        bt_submit.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_submitMouseExited

    private void bt_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_submitMouseEntered
        bt_submit.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_submitMouseEntered

    private void bt_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_submitActionPerformed
        // TODO add your handling code here:
        if( txt_EnterpriseName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        Network network = (Network) comboBoxNetworkName.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cb_EnterpriseName.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = txt_EnterpriseName.getText();

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

        populateTable();
        txt_EnterpriseName.setText("");
    }//GEN-LAST:event_bt_submitActionPerformed

    private void bt_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_deleteMouseExited

    private void bt_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_deleteMouseEntered

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:

        int selectedRow = tb_Enterprise.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Enterprise p = (Enterprise) tb_Enterprise.getValueAt(selectedRow, 0);
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                    if(p==enterprise){
                        network.getEnterpriseDirectory().getEnterpriseList().remove(p);
                        break;
                    }

                }
            }
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateTable();
        }
    }//GEN-LAST:event_bt_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_submit;
    private javax.swing.JComboBox cb_EnterpriseName;
    private javax.swing.JComboBox cb_NetworkName;
    private javax.swing.JComboBox comboBoxNetworkName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Enterprise;
    private javax.swing.JTextField txt_EnterpriseName;
    // End of variables declaration//GEN-END:variables
}
