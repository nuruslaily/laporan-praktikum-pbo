package unittest1841720049Nurus;
import java.sql.*;
/**
 *
 * @author Nurus Laily
 */
public class DBHelper1841720049Nurus {
    private static Connection mKoneksi;
    public static void bukaKoneksi(){ 
        if(mKoneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/dbperpus";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mKoneksi = DriverManager.getConnection(url, user, password);
            }
            catch(SQLException t){
                System.out.println("Error koneksi!");
            }
        }
    }
    public static int insertQueryGetId(String query){
        bukaKoneksi();
        int num = 0;
        int result = -1;
        try{
            Statement stmt = mKoneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                result = rs.getInt(1);
               
            }
            rs.close();
            stmt.close();
        }
        catch(Exception e){
            e.printStackTrace();
            result = -1;
        }
        return result;
    }
    public static boolean executeQuery(String query){
        bukaKoneksi();
        boolean result = false;
        
        try{
            Statement stmt = mKoneksi.createStatement();
            stmt.executeUpdate(query);
            
            result = true;
            stmt.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public static ResultSet selectQuery(String query){
        bukaKoneksi();
        ResultSet rs = null;
        
        try{
            Statement stmt = mKoneksi.createStatement();
            rs = stmt.executeQuery(query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
