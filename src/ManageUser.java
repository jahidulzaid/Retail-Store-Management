
import dba.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Jahid
 */
public class ManageUser extends javax.swing.JFrame {

    private int appuserpk = 0;

    /**
     * Creates new form ManageUser
     */
    public ManageUser() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !txtName.getText().equals("") && !txtMobileNumber.getText().equals("") && !txtEmail.getText().equals("") && !txtAddress.getText().equals("")) {
            return false;

        } else if (formType.equals("new") && !txtName.getText().equals("") && !txtMobileNumber.getText().equals("") && !txtEmail.getText().equals("") && !txtAddress.getText().equals("")) {
            return false;

        } else {
            return true;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage User Role");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 440, 50));

        tableUser.setBackground(new java.awt.Color(153, 255, 204));
        tableUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Email", "Address", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 320, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        txtMobileNumber.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 320, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 320, 60));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Status");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        ComboBoxStatus.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        ComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxStatusActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 320, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 320, -1));

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        btnReset.setText("Reset");
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        btnClose.setText("Close");
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manageUser.jpg"))); // NOI18N
        jLabel8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel8ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 30, 1040, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxStatusActionPerformed

    private void jLabel8ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel8ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableUser.getModel();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from appuser where userRole='Admin'");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("appuser_pk"), rs.getString("name"), rs.getString("mobileNumber"), rs.getString("email"), rs.getString("address"), rs.getString("status")});

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        btnUpdate.setEnabled(false);


    }//GEN-LAST:event_formComponentShown

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxStatus;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}