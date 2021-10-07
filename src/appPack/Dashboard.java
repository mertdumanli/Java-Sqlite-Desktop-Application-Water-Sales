package appPack;

import DB.DB;
import Threads.EditCustomerThread;
import Threads.AddOrderThread;
import Threads.AddCustomerThread;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    int selectedTable_Left = 0;
    int selectedTable_Right = 0;

    public Dashboard() {

        super("Panel");
        initComponents();

        refreshTable1();
        refreshTable2();
    }

    private void refreshTable1() {
        DB db = new DB();
        table1.setModel(db.allProductLeft());
        db.close();
    }

    private void refreshTable2() {
        DB db = new DB();
        table2.setModel(db.allProductRight());
        db.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        adminName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        müşteriAdı = new javax.swing.JTextField();
        müşteriSoyadı = new javax.swing.JTextField();
        ara = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        müşteriEkle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        müşteriDüzenle = new javax.swing.JButton();
        müşteriSil = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        buGününSiparişleriniGetir = new javax.swing.JButton();
        seçiliOlanıSil = new javax.swing.JButton();
        tümünüSil = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        yolaÇıktı = new javax.swing.JButton();
        yeniSipariş = new javax.swing.JButton();
        teslimEdildi = new javax.swing.JButton();
        yenile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        jPanel1.setLayout(null);

        exit.setBackground(new java.awt.Color(255, 255, 90));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exit.setText("Çıkış Yap");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(1070, 10, 110, 30);

        adminName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        adminName.setForeground(new java.awt.Color(0, 102, 51));
        adminName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adminName.setToolTipText("");
        jPanel1.add(adminName);
        adminName.setBounds(900, 10, 160, 30);
        adminName.setText(DB.admin.getAdmin_name());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Müşteri Soyadı");

        müşteriAdı.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                müşteriAdıKeyReleased(evt);
            }
        });

        müşteriSoyadı.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                müşteriSoyadıKeyReleased(evt);
            }
        });

        ara.setBackground(new java.awt.Color(90, 255, 255));
        ara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/find.png"))); // NOI18N
        ara.setText("Ara");
        ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Müşteri Adı");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(müşteriAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(müşteriSoyadı, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(müşteriAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(müşteriSoyadı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 50, 509, 77);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteriler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setOpaque(false);

        müşteriEkle.setBackground(new java.awt.Color(90, 255, 255));
        müşteriEkle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        müşteriEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-group.png"))); // NOI18N
        müşteriEkle.setContentAreaFilled(false);
        müşteriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                müşteriEkleActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        müşteriDüzenle.setBackground(new java.awt.Color(90, 255, 255));
        müşteriDüzenle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        müşteriDüzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pen-filled-writing-tool.png"))); // NOI18N
        müşteriDüzenle.setContentAreaFilled(false);
        müşteriDüzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                müşteriDüzenleActionPerformed(evt);
            }
        });

        müşteriSil.setBackground(new java.awt.Color(90, 255, 255));
        müşteriSil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        müşteriSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mop.png"))); // NOI18N
        müşteriSil.setContentAreaFilled(false);
        müşteriSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                müşteriSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(müşteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(müşteriDüzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(müşteriSil, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(müşteriEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(müşteriDüzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(müşteriSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 160, 488, 498);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tablo İşlemleri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel4.setOpaque(false);

        buGününSiparişleriniGetir.setBackground(new java.awt.Color(90, 255, 255));
        buGününSiparişleriniGetir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buGününSiparişleriniGetir.setText("Bu günün Siparişlerini Getir");
        buGününSiparişleriniGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buGününSiparişleriniGetirActionPerformed(evt);
            }
        });

        seçiliOlanıSil.setBackground(new java.awt.Color(90, 255, 255));
        seçiliOlanıSil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seçiliOlanıSil.setText("Seçili olanı Sil");
        seçiliOlanıSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seçiliOlanıSilActionPerformed(evt);
            }
        });

        tümünüSil.setBackground(new java.awt.Color(90, 255, 255));
        tümünüSil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tümünüSil.setText("Tümünü Sil");
        tümünüSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tümünüSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seçiliOlanıSil, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tümünüSil, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buGününSiparişleriniGetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buGününSiparişleriniGetir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(seçiliOlanıSil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tümünüSil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(540, 50, 499, 77);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Siparişler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel5.setOpaque(false);

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table2MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(table2);

        yolaÇıktı.setBackground(new java.awt.Color(90, 255, 255));
        yolaÇıktı.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yolaÇıktı.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/car.png"))); // NOI18N
        yolaÇıktı.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yolaÇıktı.setContentAreaFilled(false);
        yolaÇıktı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yolaÇıktıActionPerformed(evt);
            }
        });

        yeniSipariş.setBackground(new java.awt.Color(90, 255, 255));
        yeniSipariş.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yeniSipariş.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus.png"))); // NOI18N
        yeniSipariş.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yeniSipariş.setContentAreaFilled(false);
        yeniSipariş.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniSiparişActionPerformed(evt);
            }
        });

        teslimEdildi.setBackground(new java.awt.Color(90, 255, 255));
        teslimEdildi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teslimEdildi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cool.png"))); // NOI18N
        teslimEdildi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teslimEdildi.setContentAreaFilled(false);
        teslimEdildi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teslimEdildiActionPerformed(evt);
            }
        });

        yenile.setText("Yenile");
        yenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenileActionPerformed(evt);
            }
        });

        jLabel2.setText("Yeni Sipariş");

        jLabel3.setText("Yola Çıktı");

        jLabel4.setText("Teslim Edildi");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yeniSipariş, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yenile))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(yolaÇıktı, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teslimEdildi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yenile)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yolaÇıktı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yeniSipariş, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(teslimEdildi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(540, 160, 516, 494);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ali-abdul-rahman-Xva-TYqwHhA-unsplash (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 0, 1230, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            System.out.println("Hayır yanıtı verildi.");
        }


    }//GEN-LAST:event_exitActionPerformed

    private void araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araActionPerformed
        resetSelected();

        String inputMüşteriAdı = müşteriAdı.getText().trim();
        String inputMüşteriSoyadı = müşteriSoyadı.getText().trim();

        if (inputMüşteriAdı.isEmpty() && inputMüşteriSoyadı.isEmpty()) {
            müşteriAdı.requestFocus();
            refreshTable1();
        } else {
            DB db = new DB();
            DefaultTableModel dtm = db.customerSearching(inputMüşteriAdı, inputMüşteriSoyadı);
            db.close();
            table1.setModel(dtm);
        }

    }//GEN-LAST:event_araActionPerformed

    private void müşteriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_müşteriEkleActionPerformed

        resetSelected();
        resetSelectedInfo();

        AddCustomerThread addCustomerThread = new AddCustomerThread(müşteriEkle, table1, this);
        Thread th1 = new Thread(addCustomerThread);
        th1.start();

        setEnabled(false);
        müşteriEkle.setEnabled(false);


    }//GEN-LAST:event_müşteriEkleActionPerformed

    private void resetSelected() {
        selectedTable_Left = 0;
        selectedTable_Right = 0;
    }

    private void resetSelectedInfo() {
        müşteriAdı.setText("");
        müşteriSoyadı.setText("");
    }

    private void table1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseReleased
        int row = table1.getSelectedRow();
        selectedTable_Left = (int) table1.getValueAt(row, 0);

        müşteriAdı.setText((String) table1.getValueAt(row, 1));
        müşteriSoyadı.setText((String) table1.getValueAt(row, 2));

        //System.out.println("Sol tabloda seçim yapıldı. idNo: " + selectedTable_Left);
    }//GEN-LAST:event_table1MouseReleased

    private void müşteriDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_müşteriDüzenleActionPerformed
        resetSelectedInfo();
        if (selectedTable_Left == 0) {
            JOptionPane.showMessageDialog(rootPane, "Müşteriler tablosundan seçim yapınız.");
            //System.out.println("Seçim yap");
        } else {

            EditCustomerThread editCustomerThread = new EditCustomerThread(müşteriDüzenle, table1, selectedTable_Left, this);
            Thread th1 = new Thread(editCustomerThread);
            th1.start();

            setEnabled(false);
            müşteriDüzenle.setEnabled(false);
        }
        resetSelected();
    }//GEN-LAST:event_müşteriDüzenleActionPerformed

    private void müşteriSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_müşteriSilActionPerformed
        resetSelectedInfo();
        if (selectedTable_Left == 0) {
            JOptionPane.showMessageDialog(rootPane, "Müşteriler tablosundan seçim yapınız.");
            //System.out.println("Seçim yap");
        } else {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                DB db = new DB();
                db.customerDeleting(selectedTable_Left);
                db.close();
                JOptionPane.showMessageDialog(rootPane, "Silindi.");
            } else {
                System.out.println("Hayır yanıtı verildi.");
            }
        }
        refreshTable1();
        resetSelected();
    }//GEN-LAST:event_müşteriSilActionPerformed

    private void yeniSiparişActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniSiparişActionPerformed
        resetSelectedInfo();
        if (selectedTable_Left == 0) {

            JOptionPane.showMessageDialog(rootPane, "Müşteriler tablosundan seçim yapınız.");
            //System.out.println("Müşteri tablosundan seçim yapılmadı.");

        } else {//müşteri seçildiyse devam

            AddOrderThread addOrderThread = new AddOrderThread(yeniSipariş, table2, selectedTable_Left, this, "newOrder");
            Thread th1 = new Thread(addOrderThread);
            th1.start();

            setEnabled(false);
            yeniSipariş.setEnabled(false);
        }

        resetSelected();
    }//GEN-LAST:event_yeniSiparişActionPerformed

    private void table2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseReleased
        int row = table2.getSelectedRow();
        selectedTable_Right = (int) table2.getValueAt(row, 0);

        //System.out.println("Sağ tabloda seçim yapıldı. idNo: " + selectedTable_Right);
    }//GEN-LAST:event_table2MouseReleased

    private void yolaÇıktıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yolaÇıktıActionPerformed
        resetSelectedInfo();
        if (selectedTable_Right == 0) {

            //System.out.println("Siparişler tablosundan seçim yapılmadı.");
            JOptionPane.showMessageDialog(rootPane, "Siparişler tablosundan seçim yapınız.");

        } else {//sipariş seçildiyse devam

            DB db = new DB();
            db.setOff(selectedTable_Right, 1);
            db.close();

        }
        refreshTable2();
        resetSelected();


    }//GEN-LAST:event_yolaÇıktıActionPerformed

    private void teslimEdildiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teslimEdildiActionPerformed
        resetSelectedInfo();
        if (selectedTable_Right == 0) {
            JOptionPane.showMessageDialog(rootPane, "Siparişler tablosundan seçim yapınız.");
            //System.out.println("Siparişler tablosundan seçim yapılmadı.");

        } else {//sipariş seçildiyse devam

            DB db = new DB();
            db.setOff(selectedTable_Right, 2);
            db.close();

        }
        refreshTable2();
        resetSelected();
    }//GEN-LAST:event_teslimEdildiActionPerformed

    private void yenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenileActionPerformed
        refreshTable2();
    }//GEN-LAST:event_yenileActionPerformed

    private void müşteriAdıKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_müşteriAdıKeyReleased
        enterFncAra(evt);
    }//GEN-LAST:event_müşteriAdıKeyReleased

    private void müşteriSoyadıKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_müşteriSoyadıKeyReleased
        enterFncAra(evt);
    }//GEN-LAST:event_müşteriSoyadıKeyReleased

    private void seçiliOlanıSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seçiliOlanıSilActionPerformed

        if (selectedTable_Right == 0) {
            //System.out.println("Seçim yap");
            JOptionPane.showMessageDialog(rootPane, "Siparişler tablosundan seçim yapınız.");
        } else {

            int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {
                DB db = new DB();
                db.orderDeleting(selectedTable_Right);
                db.close();
            } else {
                System.out.println("Hayır yanıtı verildi.");
            }

        }
        refreshTable2();
        resetSelected();

    }//GEN-LAST:event_seçiliOlanıSilActionPerformed

    private void tümünüSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tümünüSilActionPerformed

        int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            DB db = new DB();
            db.orderAllDeleting();
            db.close();
        } else {
            System.out.println("Hayır yanıtı verildi.");
        }

        refreshTable2();
        resetSelected();

    }//GEN-LAST:event_tümünüSilActionPerformed

    private void buGününSiparişleriniGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buGününSiparişleriniGetirActionPerformed
        String currentTime = java.time.LocalDate.now().toString();

        DB db = new DB();
        db.listTodaysOrders(currentTime, table2);
        db.close();

        resetSelected();
    }//GEN-LAST:event_buGününSiparişleriniGetirActionPerformed

    private void enterFncAra(KeyEvent evt) {
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            araActionPerformed(null);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminName;
    private javax.swing.JButton ara;
    private javax.swing.JButton buGününSiparişleriniGetir;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField müşteriAdı;
    private javax.swing.JButton müşteriDüzenle;
    private javax.swing.JButton müşteriEkle;
    private javax.swing.JButton müşteriSil;
    private javax.swing.JTextField müşteriSoyadı;
    private javax.swing.JButton seçiliOlanıSil;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JButton teslimEdildi;
    private javax.swing.JButton tümünüSil;
    private javax.swing.JButton yeniSipariş;
    private javax.swing.JButton yenile;
    private javax.swing.JButton yolaÇıktı;
    // End of variables declaration//GEN-END:variables
}
