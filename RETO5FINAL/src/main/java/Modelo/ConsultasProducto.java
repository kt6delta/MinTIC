package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jafet
 */
public class ConsultasProducto extends Conexion{
    public boolean registrar(Producto pro){
        PreparedStatement ps = null; 
        Connection conn = getConexion();
        
        String sql = "INSERT INTO producto (idProducto, nombre, precio) VALUES (?,?,?)"; 
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pro.getIdProducto());
            ps.setString(2, pro.getNombre());
            ps.setFloat(3, pro.getPrecio());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
                try{
                    conn.close();
            }catch (SQLException e){
            System.err.println(e);
            } 
       }
    }
    public boolean modificar(Producto pro){
        PreparedStatement ps = null; 
        Connection conn = getConexion();
        
        String sql = "UPDATE producto SET idProducto=?, nombre=?, precio=? WHERE idProducto=?"; 
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pro.getIdProducto()); 
            ps.setString(2, pro.getNombre());
            ps.setFloat(3, pro.getPrecio());
            ps.setInt(4, pro.getIdProducto()); 
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
                try{
                    conn.close();
            }catch (SQLException e){
            System.err.println(e);
            } 
       }
    }
    public boolean eliminar(Producto pro){
        PreparedStatement ps = null; 
        Connection conn = getConexion();
        
        String sql = "DELETE FROM producto WHERE idProducto=?"; 
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pro.getIdProducto());          
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
                try{
                    conn.close();
            }catch (SQLException e){
            System.err.println(e);
            } 
       }
    }
    public boolean buscar(Producto pro){
        PreparedStatement ps = null; 
        Connection conn = getConexion();
        ResultSet rs = null;
        String sql = "SELECT * FROM producto WHERE idProducto=?"; 
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pro.getIdProducto());          
            rs = ps.executeQuery();
            
            if (rs.next()){
                pro.setIdProducto(rs.getInt("idProducto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(rs.getFloat("precio"));
                return true;
            }
            return false;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
                try{
                    conn.close();
            }catch (SQLException e){
            System.err.println(e);
            } 
       }
    } 
}
