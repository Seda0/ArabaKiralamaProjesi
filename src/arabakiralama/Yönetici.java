
package arabakiralama;

import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proje.InsertUpdateDelete;
import proje.Select;

public class Yönetici extends javax.swing.JFrame {


    public Yönetici() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCikis = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblCikis1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtisimoremail = new javax.swing.JTextField();
        btnara = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCikis.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCikis.setText("ÇIKIŞ");
        lblCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCikisMouseClicked(evt);
            }
        });
        jPanel1.add(lblCikis, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 716, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        lbl.setBackground(new java.awt.Color(0, 0, 0));
        lbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbl.setText("Hoşgeldiniz");
        lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl2.setBackground(new java.awt.Color(0, 0, 0));
        lbl2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbl2.setText("Yönetici Sayfasına");
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbl2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl2)
                .addGap(18, 18, 18)
                .addComponent(lbl)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 220, 250));

        lblCikis1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCikis1.setForeground(new java.awt.Color(255, 255, 255));
        lblCikis1.setText("ÇIKIŞ");
        lblCikis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCikis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCikis1MouseClicked(evt);
            }
        });
        jPanel1.add(lblCikis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 716, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("İsim veya Email Ara");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 30));

        txtisimoremail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtisimoremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 114, 250, -1));

        btnara.setBackground(new java.awt.Color(255, 102, 0));
        btnara.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnara.setText("Ara");
        btnara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaraActionPerformed(evt);
            }
        });
        jPanel2.add(btnara, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        btnSil.setBackground(new java.awt.Color(255, 0, 51));
        btnSil.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel2.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 80, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İsim", "E-Posta", "Guv. Sorusu", "Adres", "Telefon", "Statü"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1120, 597));

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("jLabel3");
        jPanel2.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCikisMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "Seç", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
            new Giris().setVisible(true);
        }
    }//GEN-LAST:event_lblCikisMouseClicked

    private void btnaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaraActionPerformed
     
        String isimOrEmail = txtisimoremail.getText();
        ResultSet rs = Select.getData("select * from kullanicilar where isim like '%" + isimOrEmail + "%' or email like '%" + isimOrEmail + "%' ");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                  model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), 
                   rs.getString(7),rs.getString(8),rs.getString(9)});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnaraActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Uygulamayı Kapatmak İstiyor musunuz?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
       if(lblId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Lütfen Silinecek Kullanıcıyı Seçiniz!");
            return;
        }else{
            
             try {
                int a = JOptionPane.showConfirmDialog(null, "Seçilen Kaydı Silmek İstiyor musunuz?","Seç",JOptionPane.YES_NO_OPTION);
                    if(a==0){
                    int id = Integer.valueOf(lblId.getText());                    
                
                    String Query ="DELETE FROM kullanicilar WHERE id="+id+"";
                    InsertUpdateDelete.setData(Query, "");
                     setVisible(false);
                    new Yönetici().setVisible(true);
                        
        }           
        } catch (Exception e) {
            e.printStackTrace();         
        }             
           }
    }//GEN-LAST:event_btnSilActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
          ResultSet rs = Select.getData("select * from kullanicilar");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), 
                   rs.getString(7),rs.getString(8),rs.getString(9)});
              
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void lblCikis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCikis1MouseClicked
       int a = JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "Seç", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
           this.dispose();
        new Giris().setVisible(true);
        }
    }//GEN-LAST:event_lblCikis1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         try {
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();       
        lblId.setText(model.getValueAt(index, 0).toString());
        String email = model.getValueAt(index, 2).toString();
        String status = model.getValueAt(index, 6).toString();
          if (status.equals("true")) {
              try {
                 status = "false"; 
                int b = JOptionPane.showConfirmDialog(null, "" + email + " Statüsünü Değiştirmek İstiyor musunuz", "Seç", JOptionPane.YES_NO_OPTION);
                if (b == 0) {
                    InsertUpdateDelete.setData("update kullanicilar set statu='" + status + "' where email='" + email + "'", "Statü Başarıyla Değiştirildi");
                    setVisible(false);
                    new Yönetici().setVisible(true);
                }    
                } catch (Exception e) {
                     JOptionPane.showMessageDialog(null, e);
              }
        
        } else {
            status = "true";
            try {
                int a = JOptionPane.showConfirmDialog(null, "" + email + " Statüsünü Değiştirmek İstiyor musunuz", "Seç", JOptionPane.YES_NO_OPTION);
                if (a == 0) {
                    InsertUpdateDelete.setData("update kullanicilar set statu='" + status + "' where email='" + email + "'", "Statü Başarıyla Değiştirildi");
                    setVisible(false);
                    new Yönetici().setVisible(true);
                }
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
     
        } catch (Exception e) {
        } 
    }//GEN-LAST:event_jTable1MouseClicked

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yönetici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yönetici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblCikis1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtisimoremail;
    // End of variables declaration//GEN-END:variables
}
