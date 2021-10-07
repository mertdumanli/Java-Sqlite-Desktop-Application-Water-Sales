package appPack;

import DB.DB;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import props.Customer;

public class CustomerPicture extends javax.swing.JFrame {

    private final JButton jbutton;
    private final JTable jtable;
    private int selectedTable_Left = 0;
    private final JFrame dashboardJframe;
    private String satışEkle = "";

    private String telefonBilgisiNewOrder;

    public CustomerPicture(JButton jbutton, JTable jtable, JFrame dashboardJframe) {
        this.jbutton = jbutton;
        this.jtable = jtable;
        this.dashboardJframe = dashboardJframe;
        initComponents();
    }

    public CustomerPicture(JButton jbutton, JTable jtable, int selectedTable_Left, JFrame dashboardJframe) {
        this.jbutton = jbutton;
        this.jtable = jtable;
        this.selectedTable_Left = selectedTable_Left;
        this.dashboardJframe = dashboardJframe;
        initComponents();

        DB db = new DB();

        Customer customer = db.getCustomerInfo(selectedTable_Left);
        name.setText(customer.getCustomer_name());
        surname.setText(customer.getCustomer_surname());
        tel.setText(customer.getCustomer_tel());
        address.setText(customer.getCustomer_address());

        db.close();

    }

    public CustomerPicture(JButton jbutton, JTable jtable, int selectedTable_Left, JFrame dashboardJframe, String satışEkle) {
        this.jbutton = jbutton;
        this.jtable = jtable;
        this.selectedTable_Left = selectedTable_Left;
        this.dashboardJframe = dashboardJframe;
        this.satışEkle = satışEkle;
        initComponents();

        DB db = new DB();
        Customer customer = db.getCustomerInfo(selectedTable_Left);

        name.setText(customer.getCustomer_name());
        surname.setText(customer.getCustomer_surname());
        telefonBilgisiNewOrder = customer.getCustomer_tel();
        tel.setText(customer.getCustomer_address());

        name.setEditable(false);
        surname.setEditable(false);
        tel.setEditable(false);

        adı.setText("Adı");
        soyadı.setText("Soyadı");
        telefon.setText("Adres");
        adres.setText("Tutar");

        db.close();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        tel = new javax.swing.JTextField();
        tamamla = new javax.swing.JButton();
        adres = new javax.swing.JLabel();
        soyadı = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        adı = new javax.swing.JLabel();
        telefon = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        error1 = new javax.swing.JTextField();
        error2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(640, 840));
        setResizable(false);

        jPanel2.setLayout(null);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(570, 10, 53, 25);

        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telKeyReleased(evt);
            }
        });
        jPanel2.add(tel);
        tel.setBounds(100, 150, 180, 23);

        tamamla.setBackground(new java.awt.Color(255, 153, 0));
        tamamla.setForeground(new java.awt.Color(255, 255, 255));
        tamamla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check.png"))); // NOI18N
        tamamla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamamlaActionPerformed(evt);
            }
        });
        jPanel2.add(tamamla);
        tamamla.setBounds(540, 190, 65, 40);

        adres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adres.setText("Adres*");
        jPanel2.add(adres);
        adres.setBounds(350, 150, 60, 22);

        soyadı.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soyadı.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soyadı.setText("Soyadı*");
        jPanel2.add(soyadı);
        soyadı.setBounds(340, 110, 70, 22);

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressKeyReleased(evt);
            }
        });
        jPanel2.add(address);
        address.setBounds(430, 150, 180, 23);

        adı.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adı.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adı.setText("Adı*");
        jPanel2.add(adı);
        adı.setBounds(40, 110, 40, 22);

        telefon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefon.setText("Telefon*");
        jPanel2.add(telefon);
        telefon.setBounds(11, 150, 69, 22);

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        jPanel2.add(name);
        name.setBounds(100, 110, 180, 23);

        surname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                surnameKeyReleased(evt);
            }
        });
        jPanel2.add(surname);
        surname.setBounds(430, 110, 180, 23);

        error1.setEditable(false);
        error1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        error1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        error1.setBorder(null);
        error1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        error1.setOpaque(false);
        jPanel2.add(error1);
        error1.setBounds(430, 240, 180, 20);

        error2.setEditable(false);
        error2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        error2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        error2.setBorder(null);
        error2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        error2.setOpaque(false);
        jPanel2.add(error2);
        error2.setBounds(430, 270, 180, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/müşteriEkle.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 830);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        jbutton.setEnabled(true);
        dashboardJframe.setEnabled(true);
        dispose();//AddCustomer.java kapatıldı.

    }//GEN-LAST:event_exitActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        enterFncTamamla(evt, "name");
    }//GEN-LAST:event_nameKeyReleased


    private void tamamlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamamlaActionPerformed
        System.out.println("Tamamla denildi.");

        String inputName = name.getText().trim();
        String inputSurname = surname.getText().trim();
        String inputTel = tel.getText().trim();
        String inputAddress = address.getText().trim();

        inputTel = inputTel.replaceAll("\\s+", "");//444 1 444 ile 4441444 aynı numara olduğunu anlayabilmek için.

        if (inputName.isEmpty()) {
            System.out.println("Müşteri adı girilmedi.");
            //try catch almadım çünkü exception atmıyor.
            final Runnable runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
            if (runnable != null) {
                runnable.run();
            }
            name.requestFocus();
        } else if (inputSurname.isEmpty()) {
            System.out.println("Müşteri soyadı girilmedi.");
            final Runnable runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
            if (runnable != null) {
                runnable.run();
            }
            surname.requestFocus();
        } else if (inputTel.isEmpty()) {
            System.out.println("Müşteri Telefon bilgisi girilmedi.");
            final Runnable runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
            if (runnable != null) {
                runnable.run();
            }
            tel.requestFocus();
        } else if (inputAddress.isEmpty()) {
            if (satışEkle.equals("newOrder")) {
                System.out.println("Tutar bilgisi girilmedi.");
            } else {
                System.out.println("Müşteri adres bilgisi girilmedi.");
            }

            final Runnable runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
            if (runnable != null) {
                runnable.run();
            }
            address.requestFocus();
        } else {
            DefaultTableModel dtm = null;
            if (selectedTable_Left == 0) {//yeni ekle denilmiş              
                DB db = new DB();
                dtm = db.customerAdding(inputName, inputSurname, inputTel, inputAddress, error1, error2);
                db.close();
            } else {
                if (satışEkle.equals("newOrder")) {//yeni iş ekle denilmiş
                    DB db = new DB();
                    //inputName = isim
                    //inputSurname = soyadı
                    //inputTel = adres
                    //inputAddress = tutar
                    //selectedTable_Left = index no
                    //telefonBilgisiYeniOrder = telefon no
                    dtm = db.orderAdding(inputName, inputSurname, inputTel, inputAddress, telefonBilgisiNewOrder);
                    db.close();

                } else {//düzenle denilmiş
                    DB db = new DB();
                    dtm = db.customerEditing(inputName, inputSurname, inputTel, inputAddress, error1, error2, selectedTable_Left);
                    db.close();
                }

            }
            jtable.setModel(dtm);

        }


    }//GEN-LAST:event_tamamlaActionPerformed


    private void telKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyReleased
        enterFncTamamla(evt, "tel");
    }//GEN-LAST:event_telKeyReleased

    private void surnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameKeyReleased
        enterFncTamamla(evt, "surname");
    }//GEN-LAST:event_surnameKeyReleased

    private void addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyReleased
        enterFncTamamla(evt, "address");
    }//GEN-LAST:event_addressKeyReleased
    private void enterFncTamamla(KeyEvent evt, String vote) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                tamamlaActionPerformed(null);
                break;
            case KeyEvent.VK_BACK_SPACE:
            case KeyEvent.VK_DELETE:
                switch (vote) {
                    case "name":
                        if (name.getText().isEmpty()) {
                            adı.setText("Adı*");
                        }
                        break;
                    case "surname":
                        if (surname.getText().isEmpty()) {
                            soyadı.setText("Soyadı*");
                        }
                        break;
                    case "tel":
                        if (tel.getText().isEmpty()) {
                            telefon.setText("Telefon*");
                        }
                        break;
                    case "address":
                        if (address.getText().isEmpty()) {
                            if (!adres.getText().equals("Tutar")) {
                                adres.setText("Adres*");
                            }

                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                switch (vote) {
                    case "name":
                        adı.setText("Adı");
                        break;
                    case "surname":
                        soyadı.setText("Soyadı");
                        break;
                    case "tel":
                        telefon.setText("Telefon");
                        break;
                    case "address":
                        if (!adres.getText().equals("Tutar")) {
                            adres.setText("Adres");
                        }
                        break;
                    default:
                        break;
                }
                break;
        }

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            /*  JButton b = new JButton();
            JTable t = new JTable();
            new Customer(b, t).setVisible(true);
             */
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel adres;
    private javax.swing.JLabel adı;
    private javax.swing.JTextField error1;
    private javax.swing.JTextField error2;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel soyadı;
    private javax.swing.JTextField surname;
    private javax.swing.JButton tamamla;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telefon;
    // End of variables declaration//GEN-END:variables
}
