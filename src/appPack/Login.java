package appPack;

import DB.DB;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame {

    public Login() {
        super("Login");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();
        error = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setText("admin");
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(300, 30, 180, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 90, 140, 40);

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setText("admin");
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(300, 90, 180, 40);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(java.awt.Color.magenta);
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enter.png"))); // NOI18N
        login.setText("Login");
        login.setToolTipText("");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(300, 150, 180, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 30, 140, 40);

        checkBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBox.setText("show pass");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });
        checkBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkBoxKeyReleased(evt);
            }
        });
        jPanel1.add(checkBox);
        checkBox.setBounds(490, 90, 91, 40);

        error.setEditable(false);
        error.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        error.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        error.setBorder(null);
        error.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        error.setOpaque(false);
        jPanel1.add(error);
        error.setBounds(300, 190, 300, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/loginBackgroundPicture.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        if (checkBox.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        //username and password => JTextField
        //inputUsername and inputPassword => String
        String inputUsername = username.getText().trim().toLowerCase();
        char[] charPass = password.getPassword();
        String inputPass = String.valueOf(charPass).trim().toLowerCase();

        if (inputUsername.isEmpty()) {
            error.setText("Lütfen E-Mail Giriniz!");
            username.requestFocus();
        } else if (inputPass.isEmpty()) {
            error.setText("Lütfen Şifre Giriniz!");
            password.requestFocus();
        } else {
            DB db = new DB();
            boolean status = db.fncAdminLogin(inputUsername, inputPass);
            db.close();
            if (status) {
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                dispose();//Login.java kapatıldı.
            } else {
                error.setText("E-Mail yada Şifre Hatalı!");
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        enterFnc(evt);
    }//GEN-LAST:event_usernameKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        enterFnc(evt);
    }//GEN-LAST:event_passwordKeyReleased

    private void checkBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkBoxKeyReleased
        enterFnc(evt);
    }//GEN-LAST:event_checkBoxKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JTextField error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    private void enterFnc(KeyEvent evt) {
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            loginActionPerformed(null);
        }
    }
}
