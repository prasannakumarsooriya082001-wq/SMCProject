
package smcproject.ForgotPasswordPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import smcproject.RegisterPage.RegisterModel;


public class ForgotPasswordDAO
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
    
    public int setPassword(ForgotPasswordModel fm) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("select *from register_table where email = ?");
        psmt.setString(1, fm.getEmail());
        
        ResultSet rs = psmt.executeQuery();
        
        if(rs.next())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
