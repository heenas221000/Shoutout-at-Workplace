/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Pharmacy;

import business.EcoSystem;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.Medicines;
import business.WorkQueue.PharmacistWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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
public class ViewPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPrescriptionJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    PharmacistWorkRequest request;
    UserAccount userAccount;
    public ViewPrescriptionJPanel(JPanel userProcessContainer, EcoSystem system,PharmacistWorkRequest request, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.request = request;
        this.userAccount = userAccount;
        populatereport();
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
        bt_back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Date = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_particulars = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_DocName = new javax.swing.JTextField();
        bt_process = new javax.swing.JButton();
        txt_PatientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bt_PDF = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Songti SC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRESCRIPTION");

        bt_back.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(0, 0, 204));
        bt_back.setText("BACK");
        bt_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_backMouseExited(evt);
            }
        });
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("DATE");

        txt_Date.setEnabled(false);

        tb_particulars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PARTICULARS", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_particulars);

        jLabel4.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("DOCTOR'S NAME");

        txt_DocName.setEnabled(false);

        bt_process.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_process.setForeground(new java.awt.Color(0, 0, 204));
        bt_process.setText("PROCESS");
        bt_process.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_processMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_processMouseExited(evt);
            }
        });
        bt_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_processActionPerformed(evt);
            }
        });

        txt_PatientName.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("PATIENT'S NAME");

        bt_PDF.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_PDF.setForeground(new java.awt.Color(0, 0, 204));
        bt_PDF.setText("GENERATE PDF");
        bt_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_back)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_PatientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(txt_Date, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_DocName)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bt_PDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_process, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_DocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bt_process))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_PDF)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_backMouseEntered
        bt_back.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_backMouseEntered

    private void bt_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_backMouseExited
        bt_back.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_backMouseExited

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        // TODO add your handling code here:
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //CaseRequestJPanel sysAdminwjp = (CaseRequestJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_processMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_processMouseEntered
        bt_process.setForeground(new Color(0,128,128));  // TODO add your handling code here:
    }//GEN-LAST:event_bt_processMouseEntered

    private void bt_processMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_processMouseExited
        bt_process.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_processMouseExited

    private void bt_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_processActionPerformed

        request.setStatus("Processed");
        //sendInvite(request.getDoctorWorkRequest().getCaseReporterWorkRequest());
        JOptionPane.showMessageDialog(this, "The Prescription has been processed");
        

        //JOptionPane.showMessageDialog(null,"Medicines are ready for pick-up");
    }//GEN-LAST:event_bt_processActionPerformed

    private void bt_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PDFActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
                
                jScrollPane1.print(g2);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
}
        }
        
    }//GEN-LAST:event_bt_PDFActionPerformed

    private void populatereport() {
        txt_Date.setText(request.getRequestDate().toString());
        txt_PatientName.setText(request.getDoctorWorkRequest().getCaseReporterWorkRequest().getUserName());
        txt_DocName.setText(request.getSender().toString());
        populatetable();
    }
    
    private void populatetable() {
        DefaultTableModel model= (DefaultTableModel) tb_particulars.getModel();
        Object[] row=new Object[2];
        model.setRowCount(0);
        
         for(Medicines M : request.getMedicines())
         {
         
            row[0]=M;
            row[1]=M.getAmount();
            
            model.addRow(row);
            
        }
    }
    
    private void sendInvite(CaseReporterWorkRequest request){
        String FromEmail="sexualawareness.help@gmail.com";
        String FromEmailPass="Fin@lProject21";
        String Subject = "Sign up successful";
        String ema=request.getEmail();
        String nv=request.getUserName();
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
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(ema));
            msg.setSubject("Medicines are Ready");
            msg.setText("Dear "+nv +"\n"+"Medicines are ready for pick-up. "+"\n"+"\n"+"Best,"+"\n"+userAccount.getEmp().getName());
            Transport.send(msg);
            JOptionPane.showMessageDialog(this, "Medicines are ready for pick-up. Invitation has been sent successfully.");

        }catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(this, "Incorrect E-mail id.Invitation cannot be been sent.");
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_PDF;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_process;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_particulars;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_DocName;
    private javax.swing.JTextField txt_PatientName;
    // End of variables declaration//GEN-END:variables
}
