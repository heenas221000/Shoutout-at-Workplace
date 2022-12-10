/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Counsellor;

import business.EcoSystem;
import business.Encounter.EncounterCounsellor;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CounsellorWorkRequest;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hetal
 */
public class CounsellorEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CounsellarEncounterJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    CounsellorWorkRequest request;
    UserAccount userAccount;
    Network network;
    Organization organization;
    public CounsellorEncounterJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Network network, Organization organization, CounsellorWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
      
        this.userAccount = userAccount;
        this.network = network;
        this.organization=organization;
        this.request=request;
        populateName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCounsellorEncounterDetails = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblEncounterNo = new javax.swing.JLabel();
        txtEncounterNo = new javax.swing.JTextField();
        lblMinutesofMeeting = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMinutesofMeeting = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 204, 255));

        lblHeader.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 0, 204));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("ENCOUNTERS");

        lblName.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 204));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("PATIENT NAME");

        tblCounsellorEncounterDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Encounter No.", "Minutes of Meeting"
            }
        ));
        jScrollPane1.setViewportView(tblCounsellorEncounterDetails);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 204));
        btnBack.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblEncounterNo.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblEncounterNo.setForeground(new java.awt.Color(0, 0, 204));
        lblEncounterNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEncounterNo.setText("ENCOUNTER NO");

        txtEncounterNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncounterNoActionPerformed(evt);
            }
        });

        lblMinutesofMeeting.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblMinutesofMeeting.setForeground(new java.awt.Color(0, 0, 204));
        lblMinutesofMeeting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMinutesofMeeting.setText("MINUTES OF MEETING");

        txtAreaMinutesofMeeting.setColumns(20);
        txtAreaMinutesofMeeting.setRows(5);
        jScrollPane2.setViewportView(txtAreaMinutesofMeeting);

        txtName.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblEncounterNo)
                            .addComponent(lblMinutesofMeeting))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txtEncounterNo)
                            .addComponent(txtName))))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addGap(222, 222, 222))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterNo)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMinutesofMeeting)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnUpdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if(txtEncounterNo.getText().equalsIgnoreCase("") && txtAreaMinutesofMeeting.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill out the necessary fields");
        }
        else{
            EncounterCounsellor en=new EncounterCounsellor();
            en.setEn(txtEncounterNo.getText());
            en.setMinutes(txtAreaMinutesofMeeting.getText());
            request.getConslrEncounter().add(en);
            //organization.getCounsellorencounterdir().getEncounters().add(en);
            // for(CounsellarWorkRequest request : organization.getWorkQueue().getCounsellarworkRequestList()){
                //organization.getCounsellorencounterdir().getEncounterDirectory().put(request.getHelpSeekerWorkRequest().getNameofvictim(), organization.getCounsellorencounterdir().getEncounters());
                //}
            /* Object r=jTextField1.getText();
            Object s=jTextArea1.getText();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();

            model.setValueAt(r, i, 0);
            model.setValueAt(s, i, 1);
            i++;
            */
            populateName();
            txtEncounterNo.setText("");
            txtAreaMinutesofMeeting.setText("");

            /*String FromEmail="sexualawareness.help@gmail.com";
            String FromEmailPass="Fin@lProject21";
            String Subject = "Sign up successful";

            Properties properties=new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session=Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(FromEmail,FromEmailPass);
                }
            });

            try
            {
                Message msg=new MimeMessage(session);
                msg.setFrom(new InternetAddress(FromEmail));
                msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(request.getHelpSeekerWorkRequest().getEmail()));
                msg.setSubject("Invitation for a session with Counselor, " + request.getHelpSeekerWorkRequest().getNameofvictim() );
                msg.setText("Dear "+ request.getHelpSeekerWorkRequest().getNameofvictim()+"\n"+"I am here to help you. Join me through the following link for the next encounter."+"\n"+"zoom1.link"+"\n"+"Best");
                Transport.send(msg);
            }catch(Exception e)
            {
                System.out.println(""+e);
            } */

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CounsellorJPanel sysAdminwjp = (CounsellorJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEncounterNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncounterNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncounterNoActionPerformed
    private void populateName() {
        
        txtName.setText(request.getHswr().getChildName());
       
        
        DefaultTableModel model= (DefaultTableModel) tblCounsellorEncounterDetails.getModel();
        Object[] row=new Object[2];
        model.setRowCount(0);
        for (EncounterCounsellor CE: request.getConslrEncounter()){
            row[0] = CE.getEn();
            row[1] = CE.getMinutes();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEncounterNo;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMinutesofMeeting;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblCounsellorEncounterDetails;
    private javax.swing.JTextArea txtAreaMinutesofMeeting;
    private javax.swing.JTextField txtEncounterNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
