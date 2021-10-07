package appPack;

import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard(String name) {
        super("Dashboard");
        initComponents();
        userName.setText(name);
        refreshProduct();
    }

    private void refreshProduct() {
        DB db = new DB();
        table.setModel(db.allProduct());
        db.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        detail = new javax.swing.JTextField();
        ekle = new javax.swing.JButton();
        düzenle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Not Ekle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel3.setText("Detay");

        ekle.setBackground(new java.awt.Color(90, 255, 255));
        ekle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        ekle.setText("Ekle");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        düzenle.setBackground(new java.awt.Color(90, 255, 255));
        düzenle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        düzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil.png"))); // NOI18N
        düzenle.setText("Düzenle");
        düzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                düzenleActionPerformed(evt);
            }
        });

        sil.setBackground(new java.awt.Color(90, 255, 255));
        sil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        sil.setText("Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        jLabel4.setText("Başlık");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(düzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(detail))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ekle)
                        .addComponent(düzenle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sil)
                        .addContainerGap())))
        );

        userName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        userName.setForeground(new java.awt.Color(0, 102, 51));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userName.setToolTipText("");

        exit.setBackground(new java.awt.Color(255, 255, 90));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exit.setText("Çıkış Yap");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (reply) {
            case JOptionPane.YES_OPTION:
                System.exit(0);
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

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed

        if (nid > 0) {
//            String inputTitle = title.getText().trim();
            //           String inputDetail = detail.getText().trim();
            DB db = new DB();
            int status = db.productDelete(nid);
            db.close();
            if (status > 0) {
                title.setText("");
                detail.setText("");
                title.requestFocus();
                refreshProduct();
                System.out.println("düzenleme başarılı");
            }

            if (status == - 1) {
                JOptionPane.showMessageDialog(rootPane, "Bu ürün adı daha önce kayıt edilmiş!");
            }
            nid = 0;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        }

    }//GEN-LAST:event_silActionPerformed

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
        String inputTitle = title.getText().trim();
        String inputDetail = detail.getText().trim();

        if (inputTitle.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen başlık kısmını doldurun!");
            title.requestFocus();

        } else if (inputDetail.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen detaylar kısmını doldurun!");
            detail.requestFocus();
        } else {
            DB db = new DB();
            int status = db.productInsert(inputTitle, inputDetail);
            db.close();
            if (status > 0) {
                title.setText("");
                detail.setText("");
                title.requestFocus();
                refreshProduct();
            }
            if (status == - 1) {
                JOptionPane.showMessageDialog(rootPane, "Bu ürün adı daha önce kayıt edilmiş!");
            }
        }
    }//GEN-LAST:event_ekleActionPerformed

    private void düzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_düzenleActionPerformed
        if (nid > 0) {
            String inputTitle = title.getText().trim();
            String inputDetail = detail.getText().trim();
            int status = 0;
            if(!inputTitle.isEmpty() && !inputDetail.isEmpty()){
           DB db = new DB();
            status = db.productUpdate(nid, inputTitle, inputDetail);
            db.close();
            }
            
            if(status == 0){
                 JOptionPane.showMessageDialog(rootPane, "Başlık ve detay doldurulmalı.");
            }

            if (status > 0) {
                title.setText("");
                detail.setText("");
                title.requestFocus();
                refreshProduct();
                System.out.println("düzenleme başarılı");
            }
            if (status == - 1) {
                JOptionPane.showMessageDialog(rootPane, "Bu ürün adı daha önce kayıt edilmiş!");
            }
            nid = 0;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen seçim yapınız!");
        }
    }//GEN-LAST:event_düzenleActionPerformed
    int nid = 0;
    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased

        int row = table.getSelectedRow();
        nid = (int) table.getValueAt(row, 0);
        String selectedTitle = (String) table.getValueAt(row, 1);
        String selectedDetail = (String) table.getValueAt(row, 2);
        title.setText(selectedTitle);
        detail.setText(selectedDetail);

    }//GEN-LAST:event_tableMouseReleased

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField detail;
    private javax.swing.JButton düzenle;
    private javax.swing.JButton ekle;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sil;
    private javax.swing.JTable table;
    private javax.swing.JTextField title;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
