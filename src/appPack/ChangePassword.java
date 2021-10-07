package appPack;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JFrame {

    public ChangePassword() {
        super("Login");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        change = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        newpass1 = new javax.swing.JPasswordField();
        message = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        newpass2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock_icon.png"))); // NOI18N

        change.setBackground(new java.awt.Color(255, 255, 90));
        change.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/run.png"))); // NOI18N
        change.setText("Change");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        jLabel3.setText("Yeni Şifre");

        newpass1.setText("123");
        newpass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newpass1KeyReleased(evt);
            }
        });

        message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("E-Mail");

        email.setText("mert@mail.com");
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        jLabel5.setText("Yeni Şifre Tekrarı");

        newpass2.setText("123");
        newpass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newpass2KeyReleased(evt);
            }
        });

        jLabel6.setText("Eski Şifre");

        oldpass.setText("123");
        oldpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                oldpassKeyReleased(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 90));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exit.setText("Back Login");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exit))
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(oldpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpass2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(change)
                                .addGap(114, 114, 114)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newpass2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed

        //email, oldpass, newpass1, newpass2 => JTextField
        //inputEmail, inputOldPass, inputNewPass1 and inputNewPass2 => String
        String inputEmail = email.getText().trim().toLowerCase();

        char[] charPass = oldpass.getPassword();
        String inputOldPass = String.valueOf(charPass).trim().toLowerCase();

        charPass = newpass1.getPassword();
        String inputNewPass1 = String.valueOf(charPass).trim().toLowerCase();

        charPass = newpass2.getPassword();
        String inputNewPass2 = String.valueOf(charPass).trim().toLowerCase();

        //kutuların doluluk kontrolü
        if (inputEmail.isEmpty()) {
            message.setText("Lütfen E-Mail Giriniz!");
            email.requestFocus();
        } else if (inputOldPass.isEmpty()) {
            message.setText("Lütfen Eski Şifreyi Giriniz!");
            oldpass.requestFocus();
        } else if (inputNewPass1.isEmpty()) {
            message.setText("Lütfen Yeni Şifreyi Giriniz!");
            newpass1.requestFocus();
        } else if (inputNewPass2.isEmpty()) {
            message.setText("Lütfen Yeni Şifrenin Tekrarını Giriniz!");
            newpass2.requestFocus();
        } else if (inputNewPass1.equals(inputNewPass2)) {
            DB db = new DB();
            boolean status = db.changePassword(inputEmail, inputOldPass, inputNewPass1);
            db.close();

            if (status) {
                message.setText("Başarılıyla şifreniz güncellendi.");
                email.setText("");
                oldpass.setText("");
                newpass1.setText("");
                newpass2.setText("");
            } else {
                message.setText("Şifreniz verdiğiniz bilgelerle değiştirilemedi. Hatalı girişleri düzeltin.");
            }
        } else {
            message.setText("Yeni şifreleriniz uyuşmadı.");
        }
    }//GEN-LAST:event_changeActionPerformed

    private void enterFnc(KeyEvent evt) {
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            changeActionPerformed(null);
        }
    }


    private void newpass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newpass1KeyReleased

        enterFnc(evt);
    }//GEN-LAST:event_newpass1KeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        enterFnc(evt);
    }//GEN-LAST:event_emailKeyReleased

    private void newpass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newpass2KeyReleased
        enterFnc(evt);
    }//GEN-LAST:event_newpass2KeyReleased

    private void oldpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oldpassKeyReleased
        enterFnc(evt);
    }//GEN-LAST:event_oldpassKeyReleased

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (reply) {
            case JOptionPane.YES_OPTION:
                Login log = new Login();
                log.setVisible(true);
                dispose();

            case JOptionPane.NO_OPTION:
                System.out.println("Hayır yanıtı verildi.");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("İptal yanıtı verildi.");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField newpass1;
    private javax.swing.JPasswordField newpass2;
    private javax.swing.JPasswordField oldpass;
    // End of variables declaration//GEN-END:variables
}
