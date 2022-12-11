/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterpriseAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hetal
 */
public class ManageOrganizationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationsJPanel
     */
    
    /**
     * Creates new form ManageOrganizations
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    private OrganizationDirectory directory;
    public ManageOrganizationsJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.directory = directory;
        
        populateTable();
        populateCombo();
        //System.out.println(enterprise.getEnterpriseType().getValue());
    }

    @SuppressWarnings("unchecked")
    private void populateCombo(){
        cb_Org.removeAllItems();
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("NGO")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.CaseVolunteer.getValue()) || type.getValue().equals(Organization.Type.CounsellingOrganization.getValue())){
                    cb_Org.addItem(type);
                }
            }
        } else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Wellness")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.Hospital.getValue()) || type.getValue().equals(Organization.Type.Forensic.getValue())
                        || type.getValue().equals(Organization.Type.PsychiatricOrganization.getValue())){
                    cb_Org.addItem(type);
                }
            }
        } else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Justice")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.Legal.getValue())){
                    cb_Org.addItem(type);
                }
            }
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Pharmaceutical")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
                    cb_Org.addItem(type);
                }
            }
        }
        
        else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Rehabilitation")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.Rehab.getValue())){
                    cb_Org.addItem(type);
                }
            }
        }
        
        else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Psychiatrist")){
            for (Organization.Type type : Organization.Type.values()){
                if (type.getValue().equals(Organization.Type.PsychiatricOrganization.getValue())){
                    cb_Org.addItem(type);
                }
            }
        }
        
        
        
        
        /*for (Organization.Type type : Organization.Type.values()){
            if (!type.getValue().equals(Organization.Type.Admin.getValue()))
                organizationJComboBox.addItem(type);
        }*/
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableOrg.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[1];
            //row[0] = organization.getOrganizationID();
            row[0] = organization;
            
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrg = new javax.swing.JTable();
        lblOrgType = new javax.swing.JLabel();
        bt_add = new javax.swing.JButton();
        cb_Org = new javax.swing.JComboBox();
        bt_Delete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ORGANIZATION(S)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 656, 41));

        tableOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrg);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 210, 98));

        lblOrgType.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblOrgType.setForeground(new java.awt.Color(0, 0, 204));
        lblOrgType.setText("ORGANIZATION TYPE");
        jPanel2.add(lblOrgType, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, -1, 26));

        bt_add.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_add.setForeground(new java.awt.Color(0, 0, 204));
        bt_add.setText("ADD");
        bt_add.setBorderPainted(false);
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });
        jPanel2.add(bt_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        cb_Org.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cb_Org, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 155, 30));

        bt_Delete.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Delete.setForeground(new java.awt.Color(0, 0, 204));
        bt_Delete.setText("DELETE");
        bt_Delete.setBorderPainted(false);
        bt_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(bt_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 38, -1, 200));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) cb_Org.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableOrg.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Organization o = (Organization) tableOrg.getValueAt(selectedRow, 0);

            for (Organization org: directory.getOrganizationList()){
                if (o==org){
                    directory.getOrganizationList().remove(o);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateTable();
        }
    }//GEN-LAST:event_bt_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Delete;
    private javax.swing.JButton bt_add;
    private javax.swing.JComboBox cb_Org;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrgType;
    private javax.swing.JTable tableOrg;
    // End of variables declaration//GEN-END:variables
}
