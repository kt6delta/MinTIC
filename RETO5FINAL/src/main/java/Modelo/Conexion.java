package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jafet
 */
public class Conexion {
   private final String base = "reto_4";
   private final String user = "root";
   private final String password = "01234";
   private final String url = "jdbc:mysql://localhost:3306/" +base;
   Connection conn = null;
   
    
   
   
   public Connection getConexion(){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
       }catch (ClassNotFoundException | SQLException e){
           System.out.println("Error en el driver");
       }
   return conn;
   }
}
