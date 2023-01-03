package proje;

import java.sql.*;
import javax.swing.JOptionPane;


public class InsertUpdateDelete {

    public static void setData(String Query, String msj) {
        Connection connect = null;
        Statement st = null;
        Baglanti baglan = new Baglanti();

        try {
            connect = baglan.getCon();
            st = connect.createStatement();
            st.executeUpdate(Query);
            if (!msj.equals("")) {
                JOptionPane.showMessageDialog(null, msj);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {

            } catch (Exception e) {

            }
        }
    }
}
