
package Project;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Frael Campos
 */
public class Conexion {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conexion = null;
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "CAMPOS_FF", "1234");
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
