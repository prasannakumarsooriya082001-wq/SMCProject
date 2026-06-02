
package smcproject.RegisterPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterDAO
{
    public Connection dbConnection() throws ClassNotFoundException, SQLException
    {  
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/SMCProject";
        String userName = "postgres";
        String pass = "prasanna@08";
        Connection con = DriverManager.getConnection(url, userName, pass);
       
       return con;
    }
    
    public int insertuser(RegisterModel rm) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("Insert into register_table values(?,?,?,?,?)");
        psmt.setString(1, rm.getUsername());
        psmt.setString(2, rm.getEmail());
        psmt.setString(3, rm.getPhonumber());
        psmt.setString(4, rm.getAddress());
        psmt.setString(5, rm.getPassword());
        
        int result = psmt.executeUpdate();
        
        return result;
    }
}
