package arabakiralama;

import java.awt.Color;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import proje.InsertUpdateDelete;
import proje.Select;

public class TeslimEtme extends javax.swing.JFrame {
   
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
        jLabel17 = new javax.swing.JLabel();
        txtMusteri = new javax.swing.JTextField();
        PLAKA = new javax.swing.JLabel();
        TeslimTarihi = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        PLAKA1 = new javax.swing.JLabel();
        txtToplamTutar = new javax.swing.JTextField();
        txtHasar = new javax.swing.JTextField();
        PLAKA2 = new javax.swing.JLabel();
        btnTeslimAl = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableKiralama = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTeslimEtme = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnYazdir = new javax.swing.JButton();
        lblHesapla = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblArabaId = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblMustId = new javax.swing.JLabel();
        txtPlaka = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        KiralamaTarihi = new com.toedter.calendar.JDateChooser();

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
        lblTeslimIslemleri.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Teslim İşlemleri");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        txtMusteri.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtMusteri, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 214, 222, 29));

        PLAKA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        PLAKA.setText("Plaka");
        jPanel2.add(PLAKA, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 103, -1, -1));

        TeslimTarihi.setDateFormatString("dd.MM.yyyy");
        TeslimTarihi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(TeslimTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 386, 222, 29));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel19.setText("Teslim Tarihi");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 345, -1, -1));

        PLAKA1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        PLAKA1.setText("Hasar Ücreti");
        jPanel2.add(PLAKA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 435, -1, -1));

        txtToplamTutar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtToplamTutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 556, 222, 29));

        txtHasar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtHasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 480, 222, 29));

        PLAKA2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        PLAKA2.setText("Toplam Tutar");
        jPanel2.add(PLAKA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 515, -1, -1));

        btnTeslimAl.setBackground(new java.awt.Color(255, 102, 0));
        btnTeslimAl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnTeslimAl.setText("TESLİM AL");
        btnTeslimAl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTeslimAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeslimAlActionPerformed(evt);
            }
        });
        jPanel2.add(btnTeslimAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 130, 40));

        jTableKiralama.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTableKiralama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Araba ID", "Araba", "Musteri Adı", "Kiralama Tarihi", "Teslim Tarihi", "Kiralama Ücreti"
            }
        ));
        jTableKiralama.setRowHeight(25);
        jTableKiralama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKiralamaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableKiralama);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 122, 828, 293));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1099, 12, -1, -1));

        jTableTeslimEtme.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTableTeslimEtme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kira ID", "Araba", "Müşteri", "Kiralama Tarihi", "Teslim Tarihi", "Ücret"
            }
        ));
        jTableTeslimEtme.setRowHeight(25);
        jTableTeslimEtme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTeslimEtmeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableTeslimEtme);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 466, 830, 280));

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Teslim Edilenler");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 429, -1, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Kiralanan Arabalar");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 85, -1, -1));

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
        jPanel2.add(btnYazdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, -1, -1));

        lblHesapla.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblHesapla.setText("Hesapla");
        lblHesapla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHesapla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHesaplaMouseClicked(evt);
            }
        });
        jPanel2.add(lblHesapla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, -1));

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 80, 47, 17));

        lblArabaId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblArabaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 79, 47, 18));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel14.setText("Müşteri");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 180, -1, -1));

        lblMustId.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblMustId, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 79, 47, 18));

        txtPlaka.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(txtPlaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 145, 222, 29));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel22.setText("Kiralama Tarihi");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 264, -1, -1));

        KiralamaTarihi.setDateFormatString("dd.MM.yyyy");
        KiralamaTarihi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(KiralamaTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 298, 222, 29));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblCikis)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 504, Short.MAX_VALUE)
                .addComponent(lblCikis)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    ResultSet Rs = null;
    double Ucret=0,HasarBedeli=0,ToplamUcret, kirabedeli=0;
    java.util.Date tslmTar,krlmTar;
    java.sql.Date MyTeslimTar;
   
      private void Temizle(){
      txtHasar.setText(String.valueOf(0));
      txtToplamTutar.setText("");
      txtPlaka.setText("");
      txtMusteri.setText("");
    }
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
    
    public TeslimEtme() {
        initComponents();
         KiraGoster();
         TeslimGoster();
       
       txtMusteri.setEditable(false);
       txtPlaka.setEditable(false);
       txtToplamTutar.setEditable(false);
       KiralamaTarihi.setEnabled(false);
       int a=0;
       a+=1;
        System.out.println(a);
 
    }
     private void UcretHesapla(){
 
        krlmTar = KiralamaTarihi.getDate();
        tslmTar = TeslimTarihi.getDate();
        long difference=tslmTar.getTime()- krlmTar.getTime();
        int alisGunSayisi=(int) (difference/(1000*60*60*24));
        if(alisGunSayisi==0)
          alisGunSayisi=1;
        else alisGunSayisi +=1;
        ToplamUcret=Double.valueOf(alisGunSayisi * kirabedeli);
          
    }
    private void KiraGoster(){
        try {
            Rs = Select.getData("SELECT * FROM kiralama");
            jTableKiralama.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    private void TeslimGoster(){
        try {
            Rs = Select.getData("SELECT * FROM teslim");
            jTableTeslimEtme.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    private void btnTeslimAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeslimAlActionPerformed
        if(txtPlaka.getText().isEmpty() || txtToplamTutar.getText().isEmpty() || txtHasar.getText().isEmpty() || txtPlaka.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Teslim Alınacak Arabayı Seçiniz!");
            return;
        }else{  
            
              try {
                   int a = JOptionPane.showConfirmDialog(null, "Seçilen Aracı Teslim Almak İstiyor musunuz?","Seç",JOptionPane.YES_NO_OPTION);
                    if(a==0){             
                 tslmTar = TeslimTarihi.getDate();
                 MyTeslimTar = new Date(tslmTar.getTime());
                 int id = Integer.valueOf(lblId.getText());
                 int Arabaid = Integer.valueOf(lblArabaId.getText());
                 
          
            String Query ="INSERT INTO teslim(PLAKA, MusteriAdi, TeslimTarihi, Gecikme, ToplamUcret) "
                    + "values"
                    + "('"+txtPlaka.getText()+"', '"+txtMusteri.getText().toString()+"',"
                    + "'"+ MyTeslimTar.toString()+"', "+Integer.valueOf(txtHasar.getText())+", "+ToplamUcret+")";
            InsertUpdateDelete.setData(Query, "Araba Teslim Alındı");
            
            String Query2 ="DELETE FROM kiralama WHERE id="+id+"";
                    InsertUpdateDelete.setData(Query2, "");
           
            String Durumu = "Mevcut";
            String Query3 ="UPDATE arabalar SET Durumu='"+Durumu+"' WHERE id="+Arabaid+"";
                  InsertUpdateDelete.setData(Query3,""); 
                    Temizle();
            KiraGoster();
            TeslimGoster();
                    }          
          } catch (Exception e) {
            e.printStackTrace();
         }
        }
    }//GEN-LAST:event_btnTeslimAlActionPerformed

    private void jTableKiralamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKiralamaMouseClicked
       
        try {
        int index = jTableKiralama.getSelectedRow();
        TableModel model = jTableKiralama.getModel();       
        lblId.setText(model.getValueAt(index, 0).toString());
        lblArabaId.setText(model.getValueAt(index, 1).toString());
        txtPlaka.setText(model.getValueAt(index, 2).toString());
        txtMusteri.setText(model.getValueAt(index, 3).toString());
        KiralamaTarihi.setDate(Date.valueOf(model.getValueAt(index, 4).toString()));
        Ucret = Double.valueOf(model.getValueAt(index, 6).toString());
        TeslimTarihi.requestFocusInWindow();
        ArabaUcretiBul(Integer.valueOf(lblArabaId.getText()));
        ToplamUcret=0;
        txtHasar.setText("0");
     
        } catch (Exception e) {
        }     
        
    }//GEN-LAST:event_jTableKiralamaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         int a = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstiyor musunuz?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTableTeslimEtmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTeslimEtmeMouseClicked
      
    }//GEN-LAST:event_jTableTeslimEtmeMouseClicked

    private void btnYazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYazdirActionPerformed
        try {
            jTableTeslimEtme.print();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnYazdirActionPerformed
  
    private void lblHesaplaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHesaplaMouseClicked
       
        if(Ucret==0){
            JOptionPane.showMessageDialog(this, "Lütfen Araç Seçiniz");
        }else{
            if(txtHasar.getText().isEmpty())return;
            else{
                UcretHesapla();
             HasarBedeli= Double.valueOf(txtHasar.getText());
             ToplamUcret =  HasarBedeli + ToplamUcret;
             txtToplamTutar.setText(String.valueOf(ToplamUcret));
            }
        }
    }//GEN-LAST:event_lblHesaplaMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
     if(isVisible())
         lblTeslimIslemleri.setForeground(Color.DARK_GRAY);
  
    }//GEN-LAST:event_formComponentShown

    private void lblArabKiralamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArabKiralamaMouseClicked
        this.dispose();
        new Kiralama().setVisible(true);
    }//GEN-LAST:event_lblArabKiralamaMouseClicked

    private void lblArabaIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArabaIslemleriMouseClicked
        this.dispose();
        new Arabalar().setVisible(true);
    }//GEN-LAST:event_lblArabaIslemleriMouseClicked

    private void lblCikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCikisMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "Seç", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
           this.dispose();
        new Giris().setVisible(true);
        }
    }//GEN-LAST:event_lblCikisMouseClicked

    private void lblMusteriIslemleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMusteriIslemleriMouseClicked
         this.dispose();
        new Musteriler().setVisible(true);
    }//GEN-LAST:event_lblMusteriIslemleriMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeslimEtme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser KiralamaTarihi;
    private javax.swing.JLabel PLAKA;
    private javax.swing.JLabel PLAKA1;
    private javax.swing.JLabel PLAKA2;
    private com.toedter.calendar.JDateChooser TeslimTarihi;
    private javax.swing.JButton btnTeslimAl;
    private javax.swing.JButton btnYazdir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableKiralama;
    private javax.swing.JTable jTableTeslimEtme;
    private javax.swing.JLabel lblArabKiralama;
    private javax.swing.JLabel lblArabaId;
    private javax.swing.JLabel lblArabaIslemleri;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblHesapla;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMustId;
    private javax.swing.JLabel lblMusteriIslemleri;
    private javax.swing.JLabel lblTeslimIslemleri;
    private javax.swing.JTextField txtHasar;
    private javax.swing.JTextField txtMusteri;
    private javax.swing.JTextField txtPlaka;
    private javax.swing.JTextField txtToplamTutar;
    // End of variables declaration//GEN-END:variables
}
