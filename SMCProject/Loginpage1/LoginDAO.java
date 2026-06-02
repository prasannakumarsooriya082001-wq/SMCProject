
package smcproject.Loginpage1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import smcproject.RegisterPage.RegisterModel;


public class LoginDAO 
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
    
    public int userLogin(LoginModel lm) throws ClassNotFoundException, SQLException
    {
        Connection conn = dbConnection();
        
        PreparedStatement psmt = conn.prepareStatement("Select *from register_table where (user_name = ? or email = ?) and pass_word =?" );
        psmt.setString(1, lm.getUserName());
        psmt.setString(2, lm.getUserName());
        psmt.setString(3, lm.getPassWord());

        
        ResultSet rs = psmt.executeQuery();
        
        if(rs.next())
        {
            return 1;
        }
        else{
            return 0;
        } 
    }
}
