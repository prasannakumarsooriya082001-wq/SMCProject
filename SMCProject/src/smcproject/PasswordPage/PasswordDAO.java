
package smcproject.PasswordPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import smcproject.ForgotPasswordPage.ForgotPasswordModel;


public class PasswordDAO 
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
    
    public int setPassword(PasswordModel pm) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("update register_table set pass_word = ? where email =?");
        psmt.setString(2, pm.getEmail());
        psmt.setString(1, pm.getNewpass());
        
        int res = psmt.executeUpdate();
        
        return res;
    }
}
