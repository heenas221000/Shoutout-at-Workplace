/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.sysadmin;

import java.awt.Color;

/**
 *
 * @author heenashah
 */
import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Role.HealthAdminRole;
import business.Role.LegalAdminRole;
import business.Role.RehabAdminRole;
import business.Role.NGOAdminRole;
import business.Role.PharmacyAdminRole;
import business.Role.PsychiatristRole;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }
    
    
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tableEnterpriseAdmins.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccntList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getName();
                    row[1] = network.getNameOfNetwork();
                    row[2] = userAccount;
                    row[3] =userAccount.getPwd();
                    System.out.println(userAccount.getUsername());
                       System.out.println(userAccount.getPwd());
                    model.addRow(row);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void populateNetworkComboBox(){
        comboBoxSelectNetwork.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            comboBoxSelectNetwork.addItem(network);
        }
    }
    
    @SuppressWarnings("unchecked")
    private void populateEnterpriseComboBox(Network network){
        comboBoxSelectEnterprise.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            comboBoxSelectEnterprise.addItem(enterprise);
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

        lblManageEnterpriseAdmins = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnterpriseAdmins = new javax.swing.JTable();
        lblSelectEnterprise = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNameOfAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        comboBoxSelectNetwork = new javax.swing.JComboBox();
        comboBoxSelectEnterprise = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageEnterpriseAdmins.setBackground(new java.awt.Color(255, 255, 255));
<<<<<<< Updated upstream
        lblManageEnterpriseAdmins.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        lblManageEnterpriseAdmins.setForeground(new java.awt.Color(230, 126, 34));
=======
        lblManageEnterpriseAdmins.setFont(new java.awt.Font("Songti SC", 1, 24)); // NOI18N
        lblManageEnterpriseAdmins.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        lblManageEnterpriseAdmins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageEnterpriseAdmins.setText("Manage Enterprise Administrators");
        add(lblManageEnterpriseAdmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 687, 40));

        tableEnterpriseAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEnterpriseAdmins);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 490, 190));

<<<<<<< Updated upstream
        lblSelectEnterprise.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
=======
        lblSelectEnterprise.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblSelectEnterprise.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        lblSelectEnterprise.setText("Select Enterprise:");
        add(lblSelectEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

<<<<<<< Updated upstream
        lblNetwork.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
=======
        lblNetwork.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        lblNetwork.setText("Select Network:");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

<<<<<<< Updated upstream
        jLabel4.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
=======
        jLabel4.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        jLabel4.setText("Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 71, -1));
        add(txtNameOfAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, -1));

<<<<<<< Updated upstream
        jLabel5.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
=======
        jLabel5.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        jLabel5.setText("Set Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 110, 26));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 130, -1));

<<<<<<< Updated upstream
        jLabel6.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
=======
        jLabel6.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        jLabel6.setText("Set Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, -1));

<<<<<<< Updated upstream
        btnSubmit.setBackground(new java.awt.Color(51, 102, 255));
        btnSubmit.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
=======
        btnSubmit.setBackground(new java.awt.Color(204, 255, 51));
        btnSubmit.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        btnSubmit.setText("Submit");
        btnSubmit.setBorderPainted(false);
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 130, -1));
=======
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 380, 90, 40));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 130, -1));
>>>>>>> Stashed changes

        comboBoxSelectNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxSelectNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSelectNetworkActionPerformed(evt);
            }
        });
        add(comboBoxSelectNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, -1));

        comboBoxSelectEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboBoxSelectEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, -1));

<<<<<<< Updated upstream
        btnDelete.setBackground(new java.awt.Color(51, 102, 255));
        btnDelete.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
=======
        btnDelete.setBackground(new java.awt.Color(204, 255, 51));
        btnDelete.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 102, 255));
>>>>>>> Stashed changes
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));
=======
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 100, 40));
>>>>>>> Stashed changes
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
            btnSubmit.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
            btnSubmit.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseExited

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        if( txtUsername.getText().isEmpty()||String.valueOf(txtPassword.getPassword()).isEmpty()|| txtNameOfAdmin.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        
        Enterprise enterprise = (Enterprise) comboBoxSelectEnterprise.getSelectedItem();
        
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        String name = txtNameOfAdmin.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Wellness")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new HealthAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txtPassword.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new HealthAdminRole());
        } else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Justice")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new LegalAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txtPassword.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new RehabAdminRole());
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("NGO")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new NGOAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txtPassword.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new NGOAdminRole());
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Pharmaceutical")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new PharmacyAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txtPassword.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new PharmacyAdminRole());
        }
        else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Rehabilitation")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new RehabAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txtPassword.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new PharmacyAdminRole());
        }
        //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new AdminRole());
        populateTable();
        txtUsername.setText("");
        txtPassword.setText("");
        txtNameOfAdmin.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboBoxSelectNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSelectNetworkActionPerformed

        Network network = (Network) comboBoxSelectNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_comboBoxSelectNetworkActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableEnterpriseAdmins.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
            UserAccount p = (UserAccount) tableEnterpriseAdmins.getValueAt(selectedRow, 2);
            
            for (Network network : system.getNetworkList()) 
            {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
                {
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccntList())
                    {
                        if (p == userAccount) {
                            enterprise.getUserAccountDirectory().getUserAccntList().remove(p);
                            break;
                        }

                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Account successfully deleted!");
            populateTable();
            
        }

    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboBoxSelectEnterprise;
    private javax.swing.JComboBox comboBoxSelectNetwork;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageEnterpriseAdmins;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblSelectEnterprise;
    private javax.swing.JTable tableEnterpriseAdmins;
    private javax.swing.JTextField txtNameOfAdmin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
