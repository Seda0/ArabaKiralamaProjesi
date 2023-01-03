
package arabakiralama;

import java.awt.Color;
import java.io.File;
import java.sql.*;
import javafx.scene.control.TitledPane;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import proje.*;


public class Arabalar extends javax.swing.JFrame {

    public Arabalar() {
        initComponents();
        AracGoster();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCikis = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblArabKiralama = new javax.swing.JLabel();
        lblTeslimIslemleri = new javax.swing.JLabel();
        lblArabaIslemleri = new javax.swing.JLabel();
        lblMusteriIslemleri = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtKayitNumarasi = new javax.swing.JTextField();
        txtMarka = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUcret = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CBDurumu = new javax.swing.JComboBox<>();
        btnDuzenle = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnYeni = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        lblCikis.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCikis.setText("ÇIKIŞ");
        lblCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCikisMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        lblArabKiralama.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblArabKiralama.setText("Araba Kiralama");
        lblArabKiralama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblArabKiralama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArabKiralamaMouseClicked(evt);
            }
        });

        lblTeslimIslemleri.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTeslimIslemleri.setText("Teslim İşlemleri");
        lblTeslimIslemleri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTeslimIslemleri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeslimIslemleriMouseClicked(evt);
            }
        });

        lblArabaIslemleri.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblArabaIslemleri.setText("Araba İşlemleri");
        lblArabaIslemleri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblMusteriIslemleri.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMusteriIslemleri.setText("Müşteri İşlemleri");
        lblMusteriIslemleri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMusteriIslemleri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMusteriIslemleriMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArabaIslemleri)
                    .addComponent(lblTeslimIslemleri)
                    .addComponent(lblMusteriIslemleri)
                    .addComponent(lblArabKiralama))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(lblArabKiralama)
                .addGap(18, 18, 18)
                .addComponent(lblTeslimIslemleri)
                .addGap(18, 18, 18)
                .addComponent(lblArabaIslemleri)
                .addGap(18, 18, 18)
                .addComponent(lblMusteriIslemleri)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblCikis)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCikis)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Araba Listesi");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 248, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("Plaka");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 91, -1, -1));

        txtKayitNumarasi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtKayitNumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 125, 200, 29));

        txtMarka.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtMarka, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 125, 200, 29));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Marka");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 91, -1, -1));

        txtModel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 125, 200, 29));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Model");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 91, -1, -1));

        txtUcret.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtUcret, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 125, 200, 29));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel15.setText("Günlük Ücret");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(893, 84, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Durumu");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 84, -1, -1));

        CBDurumu.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBDurumu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rezerve Edildi", "Mevcut" }));
        jPanel2.add(CBDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 125, 200, 29));

        btnDuzenle.setBackground(new java.awt.Color(255, 102, 0));
        btnDuzenle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDuzenle.setText("DÜZENLE");
        btnDuzenle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });
        jPanel2.add(btnDuzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 172, 140, 40));

        btnKaydet.setBackground(new java.awt.Color(255, 102, 0));
        btnKaydet.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnKaydet.setText("KAYDET");
        btnKaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        jPanel2.add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 172, 140, 40));

        btnVazgec.setBackground(new java.awt.Color(255, 102, 0));
        btnVazgec.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnVazgec.setText("VAZGEÇ");
        btnVazgec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });
        jPanel2.add(btnVazgec, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 172, 140, 40));

        btnSil.setBackground(new java.awt.Color(255, 102, 0));
        btnSil.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSil.setText("SİL");
        btnSil.setBorder(null);
        btnSil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel2.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 172, 140, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Araba Yönetimi");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 31, -1, -1));

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Marka", "Model", "Durumu", "Ücret"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 297, 1101, 460));

        btnYeni.setBackground(new java.awt.Color(255, 102, 0));
        btnYeni.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnYeni.setText("+YENİ");
        btnYeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });
        jPanel2.add(btnYeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 172, 140, 40));

        btnTemizle.setBackground(new java.awt.Color(255, 0, 51));
        btnTemizle.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnTemizle.setForeground(new java.awt.Color(255, 255, 255));
        btnTemizle.setText("Temizle");
        btnTemizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        jPanel2.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1016, 183, -1, -1));

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 29, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ResultSet Rs = null;
    int duzenle=1;
 
    
    private void AracGoster(){
        try {
            Rs = Select.getData("SELECT * FROM arabalar");
            jTable1.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     private void Temizle(){
       txtKayitNumarasi.setText("");
       txtMarka.setText("");
       txtModel.setText("");
       CBDurumu.setSelectedIndex(-1);
       txtUcret.setText("");
    }
    private void Buton_Kontrol(boolean durum)
    {
            btnDuzenle.setEnabled(durum);
            btnSil.setEnabled(durum);
            btnKaydet.setEnabled(!durum);
            btnVazgec.setEnabled(!durum);
            btnYeni.setEnabled(durum);
            btnTemizle.setEnabled(!durum);
            btnTemizle.setVisible(!durum);                   
            
            txtKayitNumarasi.setEnabled(!durum);
            txtMarka.setEnabled(!durum);
            txtModel.setEnabled(!durum);
            txtUcret.setEnabled(!durum);
            CBDurumu.setEnabled(!durum); 
            
    }
     
    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
       
        if(duzenle==1){
        if(txtKayitNumarasi.getText().isEmpty() || txtMarka.getText().isEmpty() || txtModel.getText().isEmpty() || CBDurumu.getSelectedIndex()==-1 || txtUcret.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Alanları Doldurun!");
            return;
        }else{
            
             try {
            int id = Integer.valueOf(lblId.getText());
            double ucret=  Double.valueOf(txtUcret.getText());
            String Query ="UPDATE arabalar SET PLAKA='"+txtKayitNumarasi.getText()+"', MARKA='"+txtMarka.getText()+"', MODEL='"+txtModel.getText()+"', DURUMU='"+CBDurumu.getSelectedItem().toString()+"', UCRET="+ucret+" WHERE id='"+id+"'";
              InsertUpdateDelete.setData(Query, "Araç Başarıyla Güncellendi!");   
            AracGoster();
            Temizle();          
        } catch (Exception e) {
            e.printStackTrace();
        }}
        }else{
        if(txtKayitNumarasi.getText().isEmpty() || txtMarka.getText().isEmpty() || txtModel.getText().isEmpty() || CBDurumu.getSelectedIndex()==-1 || txtUcret.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Alanları Doldurun!");
            return;
        }else{
            
             try {
                 
            double ucret=  Double.valueOf(txtUcret.getText());
            String Query ="insert into arabalar(PLAKA, MARKA, MODEL, DURUMU,UCRET) values('"+txtKayitNumarasi.getText()+"', '"+txtMarka.getText()+"','"+txtModel.getText()+"', '"+CBDurumu.getSelectedItem().toString()+"', "+ucret+")";
            InsertUpdateDelete.setData(Query, "Araba Başarıyla Eklendi");
            AracGoster();
            Temizle();
            Buton_Kontrol(true);
            duzenle=1;
            
        } catch (Exception e) {
            e.printStackTrace();   
        }
        }
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
      int a = JOptionPane.showConfirmDialog(null, "Seçili Aracı Silmek İstiyor musunuz?","Seç",JOptionPane.YES_NO_OPTION);
        if(a==0){
        if(txtKayitNumarasi.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Silinecek Arabayı Seçiniz!");
            return;
        }else{
                  
             try {        
            String plaka = txtKayitNumarasi.getText().toString();
            String Query ="DELETE FROM arabalar WHERE PLAKA='"+plaka+"'";
            InsertUpdateDelete.setData(Query, "");
            AracGoster();
            Temizle();
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        }
      }
    }//GEN-LAST:event_btnSilActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
         if(duzenle==0) return;
        else{
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        lblId.setText(model.getValueAt(index, 0).toString());
        txtKayitNumarasi.setText(model.getValueAt(index, 1).toString());
        txtMarka.setText(model.getValueAt(index, 2).toString());        
        txtModel.setText(model.getValueAt(index, 3).toString());        
        CBDurumu.setSelectedItem(model.getValueAt(index, 4).toString());        
        txtUcret.setText(model.getValueAt(index, 5).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
        Temizle();
        Buton_Kontrol(false);
        duzenle=0;
             
    }//GEN-LAST:event_btnYeniActionPerformed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        if(btnVazgec.getText().trim()=="TAMAM")
            btnVazgec.setText("VAZGEÇ");
            Buton_Kontrol(true);
            Temizle();
            duzenle=1;
    }//GEN-LAST:event_btnVazgecActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Buton_Kontrol(true);
        duzenle=1;
        if(isVisible())
            lblArabaIslemleri.setForeground(Color.DARK_GRAY);
        else lblArabaIslemleri.setForeground(Color.WHITE);
       
    }//GEN-LAST:event_formComponentShown

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
    
        if(txtKayitNumarasi.getText().isEmpty() && txtMarka.getText().isEmpty() && txtModel.getText().isEmpty() && CBDurumu.getSelectedIndex()==-1 && txtUcret.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Bütün Alanlar Temiz!"); return;
        }else{
             btnVazgec.setText("VAZGEÇ");
            Temizle();
            
        } 
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed
        btnVazgec.setText("TAMAM");
        duzenle = 1;
        Buton_Kontrol(false);
       
        
    }//GEN-LAST:event_btnDuzenleActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstiyor musunuz?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lblTeslimIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeslimIslemleriMouseClicked
        this.dispose();
        new TeslimEtme().setVisible(true);
    }//GEN-LAST:event_lblTeslimIslemleriMouseClicked

    private void lblMusteriIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMusteriIslemleriMouseClicked
        this.dispose();
        new Musteriler().setVisible(true);
    }//GEN-LAST:event_lblMusteriIslemleriMouseClicked

    private void lblArabKiralamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArabKiralamaMouseClicked
        this.dispose();
        new Kiralama().setVisible(true);
    }//GEN-LAST:event_lblArabKiralamaMouseClicked

    private void lblCikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCikisMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "Seç", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
           this.dispose();
        new Giris().setVisible(true);
        }
    }//GEN-LAST:event_lblCikisMouseClicked

    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arabalar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBDurumu;
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JButton btnYeni;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblArabKiralama;
    private javax.swing.JLabel lblArabaIslemleri;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMusteriIslemleri;
    private javax.swing.JLabel lblTeslimIslemleri;
    private javax.swing.JTextField txtKayitNumarasi;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtUcret;
    // End of variables declaration//GEN-END:variables
}
