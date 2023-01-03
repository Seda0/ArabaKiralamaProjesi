package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Baglanti {
    public static final String username="root";
    public static final String parola="";
    public  static final String url="jdbc:mysql://localhost:3306/arabakiralama";
    
    public Connection getCon() throws SQLException{
        return (Connection) DriverManager.getConnection(url,username,parola);
    
    }
     public void ShowError(SQLException exception){
        System.out.println("Hata" + exception.getMessage());
        System.out.println("Hata kodu" + exception.getErrorCode());
}
}
