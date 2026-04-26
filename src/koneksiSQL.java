import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ega Silfiha
 */
public class koneksiSQL {
    
    private static Connection koneksi;

    public static Connection getConfig() throws SQLException {
        try {
            // URL format: jdbc:mysql://localhost:port/nama_database
            String url = "jdbc:mysql://localhost:3306/oop_db_sql"; 
            String user = "root"; 
            String pass = "";     

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
            
            System.out.println("Koneksi Berhasil!");
        } catch (Exception e) {
            System.err.println("Koneksi Gagal: " + e.getMessage());
        }
        return koneksi;
    }
    
}
