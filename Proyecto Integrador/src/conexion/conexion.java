package conexion;
import java.sql.*;

public class conexion {    
    
    public  Connection connect() {  
        Connection conn = null;  
        try {  
            Class.forName("org.sqlite.JDBC");            
            String url = "jdbc:sqlite:J:\\Ingeniería de Sistemas ciclo ll\\Programacion orientada a objetos\\poo\\mibasededatos";
            conn = DriverManager.getConnection(url);  
            System.out.println(conn);  
            System.out.println("Connection to SQLite has been established.");  
            
        } catch (SQLException | ClassNotFoundException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;
    }
    
}