/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CaseVolunteer;
import javax.swing.JPanel; 
import business.EcoSystem;
import business.Network.Network;
import business.Organization.CaseVolunteerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.CounsellorWorkRequest;
import business.WorkQueue.DrWorkRequest;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.CaretakerWorkRequest;
import business.WorkQueue.PsychiatristWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hetal
 */
public class CaseRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaseRequestJPanel
     */
     JPanel userProcessContainer;
    EcoSystem system;
    Organization organization; 
    UserAccount userAccount;
    Network network; 
    
    public CaseRequestJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization,UserAccount userAccount,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization=(CaseVolunteerOrganization)organization;
        this.userAccount=userAccount;
        this.network = network;
        
        popTable();
        lbl_Receiver.setVisible(false);
        lbl_Status.setVisible(false);
        lbl_Date.setVisible(false);
        lbl_Doctor.setVisible(false);
        lbl_Counsellar.setVisible(false);
        lbl_Lawyer.setVisible(false);
        lbl_Caretaker.setVisible(false);
        lbl_Psychiatrist.setVisible(false);
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
        lbl_CaseReq = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaseRequest = new javax.swing.JTable();
        btn_AssignRequest = new javax.swing.JButton();
        btn_ViewCaseReport = new javax.swing.JButton();
        btn_CheckStatus = new javax.swing.JButton();
        txt_PsychDate = new javax.swing.JLabel();
        txt_LawyerReceiver = new javax.swing.JLabel();
        txt_LawyerDate = new javax.swing.JLabel();
        txt_CousellarStatus = new javax.swing.JLabel();
        txt_CounsellarReceiver = new javax.swing.JLabel();
        txt_CounsellarDate = new javax.swing.JLabel();
        lbl_Psychiatrist = new javax.swing.JLabel();
        lbl_Doctor = new javax.swing.JLabel();
        lbl_Lawyer = new javax.swing.JLabel();
        txt_PsychStatus = new javax.swing.JLabel();
        txt_LawyerStatus = new javax.swing.JLabel();
        lbl_Counsellar = new javax.swing.JLabel();
        lbl_Status = new javax.swing.JLabel();
        lbl_Receiver = new javax.swing.JLabel();
        lbl_Date = new javax.swing.JLabel();
        txt_PsychReceiver = new javax.swing.JLabel();
        txt_DocStatus = new javax.swing.JLabel();
        txt_DocReceiver = new javax.swing.JLabel();
        txt_DoctorDate = new javax.swing.JLabel();
        lbl_Caretaker = new javax.swing.JLabel();
        txt_CaretakerDate = new javax.swing.JLabel();
        txt_CaretakerReceiver = new javax.swing.JLabel();
        txt_CaretakerStatus = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(244, 241, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

<<<<<<< Updated upstream
        lblCaseReq.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblCaseReq.setForeground(new java.awt.Color(61, 64, 91));
        lblCaseReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaseReq.setText("Case Requests");
        lblCaseReq.setToolTipText("");
        lblCaseReq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaseReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, 879, -1));
=======
        lbl_CaseReq.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        lbl_CaseReq.setForeground(new java.awt.Color(0, 0, 204));
        lbl_CaseReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_CaseReq.setText("CASE REQUESTS");
        lbl_CaseReq.setToolTipText("");
        lbl_CaseReq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_CaseReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 879, -1));
>>>>>>> Stashed changes

        tblCaseRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name ", "Location", "Status", "Assigned To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCaseRequest);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 490, 130));

<<<<<<< Updated upstream
        btnAssignRequest.setBackground(new java.awt.Color(129, 178, 154));
        btnAssignRequest.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnAssignRequest.setForeground(new java.awt.Color(61, 64, 91));
        btnAssignRequest.setText("Assign Request");
        btnAssignRequest.setBorderPainted(false);
        btnAssignRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
=======
        btn_AssignRequest.setBackground(new java.awt.Color(0, 0, 204));
        btn_AssignRequest.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        btn_AssignRequest.setForeground(new java.awt.Color(255, 255, 255));
        btn_AssignRequest.setText("ASSIGN REQUEST");
        btn_AssignRequest.setBorderPainted(false);
        btn_AssignRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_AssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
>>>>>>> Stashed changes
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AssignRequestMouseExited(evt);
            }
        });
        btn_AssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AssignRequestActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        jPanel1.add(btnAssignRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 89, 170, 42));

        btnViewCaseReport.setBackground(new java.awt.Color(129, 178, 154));
        btnViewCaseReport.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnViewCaseReport.setForeground(new java.awt.Color(61, 64, 91));
        btnViewCaseReport.setText("View Case Report");
        btnViewCaseReport.setBorderPainted(false);
        btnViewCaseReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewCaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
=======
        jPanel1.add(btn_AssignRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 89, 170, 40));

        btn_ViewCaseReport.setBackground(new java.awt.Color(0, 0, 204));
        btn_ViewCaseReport.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        btn_ViewCaseReport.setForeground(new java.awt.Color(255, 255, 255));
        btn_ViewCaseReport.setText("VIEW CASE REPORT");
        btn_ViewCaseReport.setBorderPainted(false);
        btn_ViewCaseReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ViewCaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
>>>>>>> Stashed changes
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ViewCaseReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ViewCaseReportMouseExited(evt);
            }
        });
        btn_ViewCaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewCaseReportActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        jPanel1.add(btnViewCaseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 38));

        btnCheckStatus.setBackground(new java.awt.Color(129, 178, 154));
        btnCheckStatus.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnCheckStatus.setForeground(new java.awt.Color(61, 64, 91));
        btnCheckStatus.setText("Check Status");
        btnCheckStatus.setBorderPainted(false);
        btnCheckStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheckStatus.addMouseListener(new java.awt.event.MouseAdapter() {
=======
        jPanel1.add(btn_ViewCaseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 40));

        btn_CheckStatus.setBackground(new java.awt.Color(0, 0, 204));
        btn_CheckStatus.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        btn_CheckStatus.setForeground(new java.awt.Color(255, 255, 255));
        btn_CheckStatus.setText("CHECK STATUS");
        btn_CheckStatus.setBorderPainted(false);
        btn_CheckStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_CheckStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CheckStatusMouseEntered(evt);
            }
>>>>>>> Stashed changes
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CheckStatusMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckStatusMouseEntered(evt);
            }
        });
        btn_CheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckStatusActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        jPanel1.add(btnCheckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 143, 42));
        jPanel1.add(txtPsyhDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 93, 26));
        jPanel1.add(txtLawyerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, 24));
        jPanel1.add(txtLawyerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 94, 27));
        jPanel1.add(txtCousellarStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 126, 32));
        jPanel1.add(txtCounsellarReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 126, 29));
        jPanel1.add(txtCounsellarDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 118, 27));

        lblPsychiatrist.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblPsychiatrist.setForeground(new java.awt.Color(224, 122, 95));
        lblPsychiatrist.setText("Psychiatrist");
        jPanel1.add(lblPsychiatrist, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        lblDoctor.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblDoctor.setForeground(new java.awt.Color(224, 122, 95));
        lblDoctor.setText("Doctor");
        jPanel1.add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 103, -1));

        lblLawyer.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblLawyer.setForeground(new java.awt.Color(224, 122, 95));
        lblLawyer.setText("Lawyer");
        jPanel1.add(lblLawyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 102, -1));
        jPanel1.add(txtPsychStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 92, 32));
        jPanel1.add(txtLawyerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 100, 30));

        lblCounsellar.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblCounsellar.setForeground(new java.awt.Color(224, 122, 95));
        lblCounsellar.setText("Counsellar");
        jPanel1.add(lblCounsellar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 93, -1));

        lblStatus.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(61, 64, 91));
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 100, 32));

        lblReceiver.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblReceiver.setForeground(new java.awt.Color(61, 64, 91));
        lblReceiver.setText("Receiver:");
        jPanel1.add(lblReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 104, 28));

        lblDate.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(61, 64, 91));
        lblDate.setText("Date:");
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 104, 20));
        jPanel1.add(txtPsychReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 93, 28));
        jPanel1.add(txtDocStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 117, 32));
        jPanel1.add(txtDocReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 117, 29));
        jPanel1.add(txtDoctorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 122, 20));

        lblCaretaker.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblCaretaker.setForeground(new java.awt.Color(224, 122, 95));
        lblCaretaker.setText("Caretaker");
        jPanel1.add(lblCaretaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 102, -1));
        jPanel1.add(txtCaretakerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 94, 27));
        jPanel1.add(txtCaretakerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 100, 24));
        jPanel1.add(txtCaretakerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 100, 30));
=======
        jPanel1.add(btn_CheckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 40));
        jPanel1.add(txt_PsychDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 93, 26));
        jPanel1.add(txt_LawyerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, 24));
        jPanel1.add(txt_LawyerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 94, 27));
        jPanel1.add(txt_CousellarStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 126, 32));
        jPanel1.add(txt_CounsellarReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 126, 29));
        jPanel1.add(txt_CounsellarDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 118, 27));

        lbl_Psychiatrist.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Psychiatrist.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Psychiatrist.setText("PSYCHIATRIST");
        jPanel1.add(lbl_Psychiatrist, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        lbl_Doctor.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Doctor.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Doctor.setText("DOCTOR");
        jPanel1.add(lbl_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 103, -1));

        lbl_Lawyer.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Lawyer.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Lawyer.setText("LAWYER");
        jPanel1.add(lbl_Lawyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 102, -1));
        jPanel1.add(txt_PsychStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 92, 32));
        jPanel1.add(txt_LawyerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 100, 30));

        lbl_Counsellar.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Counsellar.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Counsellar.setText("COUNSELLOR");
        jPanel1.add(lbl_Counsellar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 120, -1));

        lbl_Status.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Status.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_Status.setText("Status:");
        jPanel1.add(lbl_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 100, 32));

        lbl_Receiver.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Receiver.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Receiver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_Receiver.setText("Receiver:");
        jPanel1.add(lbl_Receiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 104, 28));

        lbl_Date.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Date.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_Date.setText("Date:");
        jPanel1.add(lbl_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 104, 20));
        jPanel1.add(txt_PsychReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 93, 28));
        jPanel1.add(txt_DocStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 117, 32));
        jPanel1.add(txt_DocReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 117, 29));
        jPanel1.add(txt_DoctorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 122, 20));

        lbl_Caretaker.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lbl_Caretaker.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Caretaker.setText("CARETAKER");
        jPanel1.add(lbl_Caretaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 110, -1));
        jPanel1.add(txt_CaretakerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 94, 27));
        jPanel1.add(txt_CaretakerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 100, 24));
        jPanel1.add(txt_CaretakerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 100, 30));
>>>>>>> Stashed changes

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AssignRequestMouseEntered
        btn_AssignRequest.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AssignRequestMouseEntered

    private void btn_AssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AssignRequestMouseExited
        btn_AssignRequest.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AssignRequestMouseExited

    private void btn_AssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AssignRequestActionPerformed

        int i=1;
        if(i<5)
        {
            int selectedRow = tblCaseRequest.getSelectedRow();

            if (selectedRow < 0){
                return;
            }

            WorkRequest request = (CaseReporterWorkRequest)tblCaseRequest.getValueAt(selectedRow, 2);
            request.setReceiver(userAccount);
            request.setStatus("Accepted");

            popTable();
            i++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Only 4 cases can be handled");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AssignRequestActionPerformed

    private void btn_ViewCaseReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewCaseReportMouseEntered
        btn_ViewCaseReport.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ViewCaseReportMouseEntered

    private void btn_ViewCaseReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewCaseReportMouseExited
        btn_ViewCaseReport.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ViewCaseReportMouseExited

    private void btn_ViewCaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewCaseReportActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCaseRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        CaseReporterWorkRequest request = (CaseReporterWorkRequest)tblCaseRequest.getValueAt(selectedRow, 2);

        if (request.getReceiver()!=userAccount){
            JOptionPane.showMessageDialog(this, "You cannot view the report of the case. Access Denied.");
        }else{

            CaseReportJPanel caseReportJPanel = new CaseReportJPanel(userProcessContainer,system,request,userAccount,network);
            userProcessContainer.add("caseReportJPanel", caseReportJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            /*CaseReportJPanel casereportJPanel=new CaseReportJPanel(userProcessContainer,system,request);
            casereportJPanel.setVisible(true);*/
        }
    }//GEN-LAST:event_btn_ViewCaseReportActionPerformed

    private void btn_CheckStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CheckStatusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CheckStatusMouseExited

    private void btn_CheckStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CheckStatusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CheckStatusMouseEntered

    private void btn_CheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckStatusActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblCaseRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        if (selectedRow >= 0) {
            lbl_Receiver.setVisible(true);
            lbl_Status.setVisible(true);
            lbl_Date.setVisible(true);
            lbl_Doctor.setVisible(true);
            lbl_Counsellar.setVisible(true);
            lbl_Lawyer.setVisible(true);
            lbl_Caretaker.setVisible(true);
            lbl_Psychiatrist.setVisible(true);
            CaseReporterWorkRequest  CRWorkReq  = (CaseReporterWorkRequest) tblCaseRequest.getValueAt(selectedRow, 2);

            if(CRWorkReq.getDoctorWorkRequest()!=null){
                DrWorkRequest D = CRWorkReq.getDoctorWorkRequest();
                txt_DoctorDate.setText(D.getRequestDate().toString());
                if(D.getReceiver()==null){
                    txt_DocReceiver.setText("Not Assigned");
                }else{
                    txt_DocReceiver.setText(D.getReceiver().toString());
                }
                txt_DocStatus.setText(D.getStatus());
            }else{
                txt_DoctorDate.setText("-");
                txt_DocReceiver.setText("-");
                txt_DocStatus.setText("-");
            }

            if(CRWorkReq.getCounsellorWorkRequest()!=null){
                CounsellorWorkRequest C = CRWorkReq.getCounsellorWorkRequest();
                txt_CounsellarDate.setText(C.getRequestDate().toString());
                if(C.getReceiver()==null){
                    txt_CounsellarReceiver.setText("Not Assigned");
                }else{
                    txt_CounsellarReceiver.setText(C.getReceiver().toString());
                }
                txt_CousellarStatus.setText(C.getStatus());
            }else{
                txt_CounsellarDate.setText("-");
                txt_CounsellarReceiver.setText("-");
                txt_CousellarStatus.setText("-");
            }

            if(CRWorkReq.getHpWorkRequest()!=null){
                PsychiatristWorkRequest P = CRWorkReq.getHpWorkRequest();
                txt_PsychDate.setText(P.getRequestDate().toString());
                if(P.getReceiver()==null){
                    txt_PsychReceiver.setText("Not Assigned");
                }else{
                    txt_PsychReceiver.setText(P.getReceiver().toString());
                }
                txt_PsychStatus.setText(P.getStatus());
            }else{
                txt_PsychStatus.setText("-");
                txt_PsychDate.setText("-");
                txt_PsychReceiver.setText("-");
            }

            if(CRWorkReq.getLawyerWorkRequest()!=null){
                LawyerWorkRequest L = CRWorkReq.getLawyerWorkRequest();
                txt_LawyerDate.setText(L.getRequestDate().toString());
                if(L.getReceiver()==null){
                    txt_LawyerReceiver.setText("Not Assigned");
                }else{
                    txt_LawyerReceiver.setText(L.getReceiver().toString());
                }
                txt_LawyerStatus.setText(L.getStatus());
            }else{
                txt_LawyerDate.setText("-");
                txt_LawyerReceiver.setText("-");
                txt_LawyerStatus.setText("-");
            }

            if(CRWorkReq.getCaretakerWorkRequest()!=null){
                CaretakerWorkRequest L = CRWorkReq.getCaretakerWorkRequest();
                txt_CaretakerDate.setText(L.getRequestDate().toString());
                if(L.getReceiver()==null){
                    txt_CaretakerReceiver.setText("Not Assigned");
                }else{
                    txt_CaretakerReceiver.setText(L.getReceiver().toString());
                }
                txt_CaretakerStatus.setText(L.getStatus());
            }else{
                txt_CaretakerDate.setText("-");
                txt_CaretakerReceiver.setText("-");
                txt_CaretakerStatus.setText("-");
            }

        }
        
        
    }//GEN-LAST:event_btn_CheckStatusActionPerformed
    private void popTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblCaseRequest.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(CaseReporterWorkRequest request : organization.getWorkQueue().getCaseReporterWorkRequestList())
         {
         
            row[0] = request.getChildName();
            row[1] = request.getLocation();
            row[2] = request;
            if (request.getReceiver()==null){
                row[3] = "Not Assigned";
            }else{
                row[3] = request.getReceiver();
            }
         
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AssignRequest;
    private javax.swing.JButton btn_CheckStatus;
    private javax.swing.JButton btn_ViewCaseReport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Caretaker;
    private javax.swing.JLabel lbl_CaseReq;
    private javax.swing.JLabel lbl_Counsellar;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JLabel lbl_Doctor;
    private javax.swing.JLabel lbl_Lawyer;
    private javax.swing.JLabel lbl_Psychiatrist;
    private javax.swing.JLabel lbl_Receiver;
    private javax.swing.JLabel lbl_Status;
    private javax.swing.JTable tblCaseRequest;
    private javax.swing.JLabel txt_CaretakerDate;
    private javax.swing.JLabel txt_CaretakerReceiver;
    private javax.swing.JLabel txt_CaretakerStatus;
    private javax.swing.JLabel txt_CounsellarDate;
    private javax.swing.JLabel txt_CounsellarReceiver;
    private javax.swing.JLabel txt_CousellarStatus;
    private javax.swing.JLabel txt_DocReceiver;
    private javax.swing.JLabel txt_DocStatus;
    private javax.swing.JLabel txt_DoctorDate;
    private javax.swing.JLabel txt_LawyerDate;
    private javax.swing.JLabel txt_LawyerReceiver;
    private javax.swing.JLabel txt_LawyerStatus;
    private javax.swing.JLabel txt_PsychDate;
    private javax.swing.JLabel txt_PsychReceiver;
    private javax.swing.JLabel txt_PsychStatus;
    // End of variables declaration//GEN-END:variables
}
