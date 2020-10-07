
package Project;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frael Campos
 */
public class Conexion {
    
    public static Connection getConnection() {
        Connection conexion = null;
        String host = "192.168.100.62";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "CAMPOS_FF", "1234");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conexion != null)
        return conexion;
        else
            return null;
    }
    
    public static Statement getStatement() throws ClassNotFoundException, SQLException{
        Statement st = null;
        st = getConnection().createStatement();
        
        return st;    
    }
    
    public static ResultSet getResult(String sql) throws ClassNotFoundException, SQLException{
        ResultSet result= null;
        result = getStatement().executeQuery(sql);
        
        return result;
    }

    
    public static void main(String a[]) throws ClassNotFoundException, SQLException{
    
        getConnection();
    }
 
}
