package proje;
import java.sql.*;
import javax.swing.JOptionPane;


public class Select {
    public static ResultSet getData(String Query){
         Connection connect = null;
         Statement st = null;
         ResultSet rs = null;
        Baglanti baglan = new Baglanti();
        
        try{
            connect=baglan.getCon();           
           st = connect.createStatement();
           rs = st.executeQuery(Query);
           return rs;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
