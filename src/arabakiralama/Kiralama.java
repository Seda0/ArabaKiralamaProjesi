package arabakiralama;

import java.awt.Color;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import proje.InsertUpdateDelete;
import proje.Select;

public class Kiralama extends javax.swing.JFrame {

    public Kiralama() {
        initComponents();
         AracGoster();
         Musteriler();
         KiraGoster();            
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
        txtPlaka = new javax.swing.JTextField();
        PLAKA = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnDuzenle = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtUcret = new javax.swing.JTextField();
        btnYeni = new javax.swing.JButton();
        CBMusteriAdi = new javax.swing.JComboBox<>();
        KiralamaTarihi = new com.toedter.calendar.JDateChooser();
        TeslimTarihi = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        btnTemizle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableKiralama = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnYazdir = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblArabaId = new javax.swing.JLabel();

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
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblCikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCikis)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPlaka.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtPlaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 101, 211, 29));

        PLAKA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        PLAKA.setText("Plaka");
        jPanel2.add(PLAKA, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setText("Müşteri");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel15.setText("Ödenecek Ücret");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setText("Kiralama Tarihi");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 60, -1, -1));

        btnDuzenle.setBackground(new java.awt.Color(255, 102, 0));
        btnDuzenle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDuzenle.setText("DÜZENLE");
        btnDuzenle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuzenleActionPerformed(evt);
            }
        });
        jPanel2.add(btnDuzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 161, 140, 40));

        btnKaydet.setBackground(new java.awt.Color(255, 102, 0));
        btnKaydet.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnKaydet.setText("KAYDET");
        btnKaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        jPanel2.add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, 40));

        btnVazgec.setBackground(new java.awt.Color(255, 102, 0));
        btnVazgec.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnVazgec.setText("VAZGEÇ");
        btnVazgec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });
        jPanel2.add(btnVazgec, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 161, 140, 40));

        btnSil.setBackground(new java.awt.Color(255, 102, 0));
        btnSil.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSil.setText("SİL");
        btnSil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel2.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 161, 140, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Araba Kiralama");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 11, -1, -1));

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plaka", "Marka", "Model", "Durumu", "Günlük Ücret"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 244, 1119, 229));

        txtUcret.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtUcret, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 101, 150, 29));

        btnYeni.setBackground(new java.awt.Color(255, 102, 0));
        btnYeni.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnYeni.setText("+Yeni");
        btnYeni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniActionPerformed(evt);
            }
        });
        jPanel2.add(btnYeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 161, 140, 40));

        CBMusteriAdi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(CBMusteriAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 101, 210, 29));

        KiralamaTarihi.setDateFormatString("dd.MM.yyyy");
        KiralamaTarihi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(KiralamaTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 101, 222, 29));

        TeslimTarihi.setDateFormatString("dd.MM.yyyy");
        TeslimTarihi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(TeslimTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 101, 222, 29));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel19.setText("Teslim Tarihi");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 60, -1, -1));

        btnTemizle.setBackground(new java.awt.Color(255, 0, 51));
        btnTemizle.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnTemizle.setForeground(new java.awt.Color(255, 255, 255));
        btnTemizle.setText("TEMİZLE");
        btnTemizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        jPanel2.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(996, 172, -1, -1));

        jTableKiralama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTableKiralama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kira ID", "Araba", "Müşteri", "Kiralama Tarihi", "Title 5"
            }
        ));
        jTableKiralama.setRowHeight(25);
        jTableKiralama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKiralamaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableKiralama);
        if (jTableKiralama.getColumnModel().getColumnCount() > 0) {
            jTableKiralama.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 511, 1119, 250));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Kiralanabilir Arabalar");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1099, 12, -1, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Kiralanan Arabalar");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        btnYazdir.setBackground(new java.awt.Color(0, 102, 204));
        btnYazdir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnYazdir.setForeground(new java.awt.Color(255, 255, 255));
        btnYazdir.setText("YAZDIR");
        btnYazdir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYazdirActionPerformed(evt);
            }
        });
        jPanel2.add(btnYazdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1036, 207, -1, -1));

        lblId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 13));

        lblArabaId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblArabaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 10));

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    ResultSet Rs = null;
    int duzenle=1,tablosil=0;
    java.util.Date krlmTar,tslmTar;
    java.sql.Date MyTeslimTar,MyKiralamaTar;
    double ToplamUcret=0,kirabedeli=0;
    private double ArabaUcretiBul(int gelenId){
     
    try {
        
            Rs = Select.getData("SELECT * FROM arabalar WHERE id="+gelenId+"");
            while(Rs.next()){
               kirabedeli = Rs.getDouble("UCRET");   
            }
            return kirabedeli;
            
        } catch (Exception e) {
            e.printStackTrace();
           return 0;
        }
       
    }
    
    private void UcretHesapla(){
    
    if(txtUcret.getText().isEmpty()) return;
    else{
       
        krlmTar = KiralamaTarihi.getDate();
        tslmTar = TeslimTarihi.getDate();
        long difference=tslmTar.getTime()- krlmTar.getTime();
        int alisGunSayisi=(int) (difference/(1000*60*60*24));
         if(alisGunSayisi==0)
          alisGunSayisi=1;
        else alisGunSayisi +=1;
        double fiyat=Double.valueOf(txtUcret.getText());
        ToplamUcret=Double.valueOf(alisGunSayisi*fiyat);
       
      }
    }
    private void UcretHesapla2(){
 
        krlmTar = KiralamaTarihi.getDate();
        tslmTar = TeslimTarihi.getDate();
        long difference=tslmTar.getTime()- krlmTar.getTime();
        int alisGunSayisi=(int) (difference/(1000*60*60*24));
        if(alisGunSayisi==0)
          alisGunSayisi=1;
        else alisGunSayisi +=1;
        ToplamUcret=Double.valueOf(alisGunSayisi * kirabedeli);
          
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
            btnYazdir.setVisible(durum);
            
            KiralamaTarihi.setEnabled(!durum);
            TeslimTarihi.setEnabled(!durum);
            txtPlaka.setEnabled(!durum);
            txtUcret.setEnabled(!durum);
            CBMusteriAdi.setEnabled(!durum); 
      
    }
    private void Temizle(){
       txtPlaka.setText("");
      
       CBMusteriAdi.setSelectedIndex(-1);
       txtUcret.setText("");
         SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal =Calendar.getInstance();
       KiralamaTarihi.setDate(cal.getTime());
       TeslimTarihi.setDate(cal.getTime());
    }
     
    private void Musteriler(){
        try {
            Rs = Select.getData("SELECT * FROM musteriler");
            while(Rs.next()){
                String Musteri = Rs.getString("MUSTERIADI");                
                CBMusteriAdi.addItem(Musteri);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void AracGoster(){
        String Durumu = "Mevcut";
         try {
            Rs = Select.getData("SELECT * FROM arabalar WHERE DURUMU = '"+Durumu+"'");
             jTable1.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    private void KiraGoster(){
        try {
            Rs = Select.getData("SELECT * FROM kiralama");
            jTableKiralama.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    private void ArabaDurumuKirala(){
        int id = Integer.valueOf(lblId.getText());
        
        String Durumu = "Rezerve Edildi";
        String Query ="UPDATE arabalar SET Durumu='"+Durumu+"' WHERE id="+id+"";
        InsertUpdateDelete.setData(Query,"");   
   
    }
    
    private void btnYeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniActionPerformed
        Temizle();
        Buton_Kontrol(false);
        duzenle=0;
        
         
    }//GEN-LAST:event_btnYeniActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed

       if(txtPlaka.getText().isEmpty() && CBMusteriAdi.getSelectedIndex()==-1 && txtUcret.getText().isEmpty() 
                && KiralamaTarihi.getDate().toString().isEmpty() && TeslimTarihi.getDate().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Bütün Alanlar Temiz!"); return;
        }else{
            btnVazgec.setText("VAZGEÇ");
            Temizle();
        }
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         Buton_Kontrol(true);
         duzenle=1;
         if(isVisible())
            lblArabKiralama.setForeground(Color.DARK_GRAY);
        
   
    }//GEN-LAST:event_formComponentShown

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
       if(duzenle==1){
        if(txtPlaka.getText().isEmpty() || CBMusteriAdi.getSelectedIndex()==-1 || txtUcret.getText().isEmpty() 
                || KiralamaTarihi.getDate().toString().isEmpty() || TeslimTarihi.getDate().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Alanları Doldurun!");
            return;
        }else{            
             try {
                 krlmTar = KiralamaTarihi.getDate();
                 MyKiralamaTar = new Date(krlmTar.getTime());              
                 tslmTar = TeslimTarihi.getDate();
                 MyTeslimTar = new Date(tslmTar.getTime());
                  
                 
                int id = Integer.valueOf(lblId.getText());
                UcretHesapla2();

                String Query ="UPDATE kiralama SET PLAKA='"+txtPlaka.getText()+"', MusteriAdi='"+CBMusteriAdi.getSelectedItem().toString()+"', "
                        + "KiralamaTarihi='"+MyKiralamaTar+"', TeslimTarihi='"+MyTeslimTar+"', "
                        + "KiralamaUcreti="+ToplamUcret+" WHERE id='"+id+"'";
                InsertUpdateDelete.setData(Query, "Araç Başarıyla Güncellendi!");
                ToplamUcret=0;
               
                AracGoster();
                KiraGoster();
                Temizle();          
          } catch (Exception e) {
            e.printStackTrace();
         }}
        }else{
        if(txtPlaka.getText().isEmpty() || CBMusteriAdi.getSelectedIndex()==-1 || txtUcret.getText().isEmpty() 
                || KiralamaTarihi.getDate().toString().isEmpty() || TeslimTarihi.getDate().toString().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Lütfen Tüm Alanları Doldurun!");
            return;
        }else{
            
             try {
                 krlmTar = KiralamaTarihi.getDate();
                 MyKiralamaTar = new Date(krlmTar.getTime());              
                 tslmTar = TeslimTarihi.getDate();
                 MyTeslimTar = new Date(tslmTar.getTime());
                 int Arabaid = Integer.valueOf(lblId.getText());
                 UcretHesapla();
                   
            String Query ="INSERT INTO kiralama(ArabaId,PLAKA, MusteriAdi, KiralamaTarihi, TeslimTarihi, KiralamaUcreti) "
                    + "values"
                    + "("+Arabaid+", '"+txtPlaka.getText()+"', '"+CBMusteriAdi.getSelectedItem().toString()+"','"+MyKiralamaTar.toString()+"', "
                    + "'"+ MyTeslimTar.toString()+"', "+ToplamUcret+")";
            InsertUpdateDelete.setData(Query, "Araba Başarıyla Kiralandı");
            
            ArabaDurumuKirala();
            AracGoster();
            KiraGoster();
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
       
        if(tablosil==1){
        if(txtPlaka.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Silinecek Kiralamayı Seçiniz!");
            return;
        }else{
            
             try {
                int a = JOptionPane.showConfirmDialog(null, "Seçilen Kaydı Silmek İstiyor musunuz?","Seç",JOptionPane.YES_NO_OPTION);
                    if(a==0){
                    int id = Integer.valueOf(lblId.getText());                    
                    int Arabaid = Integer.valueOf(lblArabaId.getText());

                    String Query ="DELETE FROM kiralama WHERE id="+id+"";
                    InsertUpdateDelete.setData(Query, "");
                    
                    String Durumu = "Mevcut";
                    String Query2 ="UPDATE arabalar SET Durumu='"+Durumu+"' WHERE id="+Arabaid+"";
                    InsertUpdateDelete.setData(Query2,"");  
                    
                    AracGoster();
                    KiraGoster();
                    Temizle();
        }           
        } catch (Exception e) {
            e.printStackTrace();
            
        }             
           }
        }else{
            JOptionPane.showMessageDialog(this, "Sadece Kiralama Tablosundaki Değerler Silinebilir");
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuzenleActionPerformed
        btnVazgec.setText("TAMAM");
        duzenle = 1;
        Buton_Kontrol(false); 
    }//GEN-LAST:event_btnDuzenleActionPerformed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        if(btnVazgec.getText().trim()=="TAMAM")
            btnVazgec.setText("VAZGEÇ");
            Buton_Kontrol(true);
            Temizle();
            duzenle=1;
    }//GEN-LAST:event_btnVazgecActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        try {
            if(duzenle==1) return;
        else{
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();           
        txtPlaka.setText(model.getValueAt(index, 1).toString());
        lblId.setText(model.getValueAt(index, 0).toString());
           
        txtUcret.setText(model.getValueAt(index, 5).toString()); 
        tablosil=0;
         btnSil.setEnabled(false);
        }
        } catch (Exception e) {
        }
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTableKiralamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKiralamaMouseClicked
        try {
        if(duzenle==0) return;
        else{
        int index = jTableKiralama.getSelectedRow();
        TableModel model = jTableKiralama.getModel();
        lblId.setText(model.getValueAt(index, 0).toString());
        lblArabaId.setText(model.getValueAt(index, 1).toString());
        txtPlaka.setText(model.getValueAt(index, 2).toString());        
        CBMusteriAdi.setSelectedItem(model.getValueAt(index, 3).toString()); 
        KiralamaTarihi.setDate(Date.valueOf(model.getValueAt(index, 4).toString()));        
        TeslimTarihi.setDate(Date.valueOf(model.getValueAt(index, 5).toString()));
        txtUcret.setText(model.getValueAt(index, 6).toString()); 
        btnSil.setEnabled(true);
        tablosil=1;
        ArabaUcretiBul(Integer.valueOf(lblArabaId.getText()));
      }
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jTableKiralamaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstiyor musunuz?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnYazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYazdirActionPerformed
        try {
            jTableKiralama.print();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnYazdirActionPerformed

    private void lblTeslimIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeslimIslemleriMouseClicked
        this.dispose();
        new TeslimEtme().setVisible(true);
    }//GEN-LAST:event_lblTeslimIslemleriMouseClicked

    private void lblArabaIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArabaIslemleriMouseClicked
       this.dispose();
       new Arabalar().setVisible(true);
    }//GEN-LAST:event_lblArabaIslemleriMouseClicked

    private void lblMusteriIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMusteriIslemleriMouseClicked
        this.dispose();
       new Musteriler().setVisible(true);
    }//GEN-LAST:event_lblMusteriIslemleriMouseClicked

    private void lblCikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCikisMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "Seç", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
           this.dispose();
        new Giris().setVisible(true);
        }
    }//GEN-LAST:event_lblCikisMouseClicked

    public static void main(String args[]) {
      
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
              

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kiralama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBMusteriAdi;
    private com.toedter.calendar.JDateChooser KiralamaTarihi;
    private javax.swing.JLabel PLAKA;
    private com.toedter.calendar.JDateChooser TeslimTarihi;
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JButton btnYazdir;
    private javax.swing.JButton btnYeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableKiralama;
    private javax.swing.JLabel lblArabKiralama;
    private javax.swing.JLabel lblArabaId;
    private javax.swing.JLabel lblArabaIslemleri;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMusteriIslemleri;
    private javax.swing.JLabel lblTeslimIslemleri;
    private javax.swing.JTextField txtPlaka;
    private javax.swing.JTextField txtUcret;
    // End of variables declaration//GEN-END:variables
}
