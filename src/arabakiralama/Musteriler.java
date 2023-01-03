
package arabakiralama;

import java.awt.Color;
import proje.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Musteriler extends javax.swing.JFrame {

    public Musteriler() {
        initComponents();
          MusteriGoster();
    }
    @SuppressWarnings("unchecked")
            
     ResultSet Rs = null;
    
    int duzenle=1;
    private void MusteriGoster(){
        try {
            Rs = Select.getData("SELECT * FROM musteriler");
            jTable1.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
     private void Temizle(){
       txtAdi.setText("");
       txtAdres.setText("");
       txteposta.setText("");
       txttelefon.setText("");
       txtMusID.setText("");
    }     
    private void Buton_Kontrol(boolean durum)
    {
            BtnDuzenle.setEnabled(durum);
            BtnSil.setEnabled(durum);
            btnKaydet.setEnabled(!durum);
            BtnVazgec.setEnabled(!durum);
            btnYeni.setEnabled(durum);
            btnTemizle.setEnabled(!durum);
            btnTemizle.setVisible(!durum);                   
            
            txtAdi.setEnabled(!durum);
            txtAdres.setEnabled(!durum);
            txtMusID.setEnabled(false);
            txteposta.setEnabled(!durum);
            txttelefon.setEnabled(!durum);
            
    }
   
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
        txtMusID = new javax.swing.JTextField();
        txtAdi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAdres = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txteposta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BtnDuzenle = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        BtnVazgec = new javax.swing.JButton();
        BtnSil = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txttelefon = new javax.swing.JTextField();
        btnYeni = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        lblArabaIslemleri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArabaIslemleriMouseClicked(evt);
            }
        });

        lblMusteriIslemleri.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblMusteriIslemleri.setText("Müşteri İşlemleri");

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

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Müşteri Listesi");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("Müşteri ID");

        txtMusID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        txtAdi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel13.setText("Adı-Soyadı");

        txtAdres.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Adres");

        txteposta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel15.setText("E-Posta");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Telefon");

        BtnDuzenle.setBackground(new java.awt.Color(255, 102, 0));
        BtnDuzenle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BtnDuzenle.setText("DÜZENLE");
        BtnDuzenle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDuzenleActionPerformed(evt);
            }
        });

        btnKaydet.setBackground(new java.awt.Color(255, 102, 0));
        btnKaydet.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnKaydet.setText("KAYDET");
        btnKaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        BtnVazgec.setBackground(new java.awt.Color(255, 102, 0));
        BtnVazgec.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BtnVazgec.setText("VAZGEÇ");
        BtnVazgec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVazgecActionPerformed(evt);
            }
        });

        BtnSil.setBackground(new java.awt.Color(255, 102, 0));
        BtnSil.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BtnSil.setText("SİL");
        BtnSil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSilActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Müşteri Yönetimi");

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri ID", "Adı-Soyadı", "Adres", "Telefon", "E-Posta"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txttelefon.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        btnYeni.setBackground(new java.awt.Color(255, 102, 0));
        btnYeni.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnYeni.setText("+YENİ");
        btnYeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jLabel17)
                        .addGap(485, 485, 485)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel14)
                        .addGap(232, 232, 232)
                        .addComponent(jLabel16)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtMusID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txteposta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnYeni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnTemizle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel17))
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMusID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txteposta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnYeni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnTemizle)))
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
      Temizle();
        Buton_Kontrol(false);
        duzenle=0;
        txtMusID.setText("Boş bırakın");
    }//GEN-LAST:event_btnYeniActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed

        if(txtAdi.getText().isEmpty() && txtAdres.getText().isEmpty() && txtMusID.getText().isEmpty() && txteposta.getText().isEmpty() && txttelefon.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Bütün Alanlar Temiz!"); return;
        }else{
            BtnVazgec.setText("VAZGEÇ");
            Temizle();
        }
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
       if(duzenle==1){
        if(txtAdi.getText().isEmpty() || txtAdres.getText().isEmpty() || txteposta.getText().isEmpty() || txttelefon.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Alanları Doldurun!");
            return;
        }else{
             try {
            String musid = txtMusID.getText().toString(); 
            String Query ="UPDATE musteriler SET  MUSTERIADI='"+txtAdi.getText()+"', ADRES='"+txtAdres.getText()+"', TELEFON='"+txttelefon.getText()+"',  EPOSTA='"+txteposta.getText()+"' WHERE MUSTID="+musid+"";
            InsertUpdateDelete.setData(Query, "Müşteri Başarıyla Güncellendi!");              
            MusteriGoster();
            Temizle();          
        } catch (Exception e) {
            e.printStackTrace();
        }}
        }else{
        if(txtAdi.getText().isEmpty() || txtAdres.getText().isEmpty() || txteposta.getText().isEmpty() || txttelefon.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Alanları Doldurun!");
            return;
        }else{
            
         try {             
            String Query ="insert into musteriler(MUSTERIADI, ADRES, TELEFON, EPOSTA) values('"+txtAdi.getText()+"', '"+txtAdres.getText()+"','"+txttelefon.getText()+"','"+txteposta.getText()+"')";
            InsertUpdateDelete.setData(Query, "Müşteri Başarıyla Eklendi!");
            MusteriGoster();
            Temizle();
            Buton_Kontrol(true);
            duzenle=1;
            
        } catch (Exception e) {
            e.printStackTrace();   
         
        }}
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Buton_Kontrol(true);
        duzenle=1;
           if(isVisible())
            lblMusteriIslemleri.setForeground(Color.DARK_GRAY);
        else lblMusteriIslemleri.setForeground(Color.WHITE);
    }//GEN-LAST:event_formComponentShown

    private void BtnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDuzenleActionPerformed
        BtnVazgec.setText("TAMAM");
        duzenle =1;
        Buton_Kontrol(false); 
    }//GEN-LAST:event_BtnDuzenleActionPerformed

    private void BtnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSilActionPerformed
      int a = JOptionPane.showConfirmDialog(null, "Müşteriyi Silmek İstiyor musunuz?","Seç",JOptionPane.YES_NO_OPTION);
        if(a==0){
        if(txtMusID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Silinecek Müşteriyi Seçiniz!");
            return;
        }else{
                  
             try {
                 
            String musid = txtMusID.getText().toString();
            String Query ="DELETE FROM musteriler WHERE MUSTID="+musid+"";
            InsertUpdateDelete.setData(Query, "");
            MusteriGoster();
            Temizle();
            Buton_Kontrol(true);
            MusteriGoster();
            Temizle();
            
        } catch (Exception e) {
            e.printStackTrace();    
          }
        }
      }
    }//GEN-LAST:event_BtnSilActionPerformed

    private void BtnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVazgecActionPerformed
        if(BtnVazgec.getText().trim()=="TAMAM")
            BtnVazgec.setText("VAZGEÇ");
        duzenle=1;
        Buton_Kontrol(true);
        Temizle();
    }//GEN-LAST:event_BtnVazgecActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(duzenle==0) return;
        else{
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
            
        txtMusID.setText(model.getValueAt(index, 0).toString());
        txtAdi.setText(model.getValueAt(index, 1).toString());        
        txtAdres.setText(model.getValueAt(index, 2).toString());        
        txttelefon.setText(model.getValueAt(index, 3).toString());       
        txteposta.setText(model.getValueAt(index, 4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstiyor musunuz?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblTeslimIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeslimIslemleriMouseClicked
        this.dispose();
        new TeslimEtme().setVisible(true);
    }//GEN-LAST:event_lblTeslimIslemleriMouseClicked

    private void lblArabaIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArabaIslemleriMouseClicked
        this.dispose();
        new Arabalar().setVisible(true);
    }//GEN-LAST:event_lblArabaIslemleriMouseClicked

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
                new Musteriler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDuzenle;
    private javax.swing.JButton BtnSil;
    private javax.swing.JButton BtnVazgec;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnYeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblArabKiralama;
    private javax.swing.JLabel lblArabaIslemleri;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblMusteriIslemleri;
    private javax.swing.JLabel lblTeslimIslemleri;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtAdres;
    private javax.swing.JTextField txtMusID;
    private javax.swing.JTextField txteposta;
    private javax.swing.JTextField txttelefon;
    // End of variables declaration//GEN-END:variables
}
