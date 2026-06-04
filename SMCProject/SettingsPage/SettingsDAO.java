
package smcproject.SettingsPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import smcproject.ProfilePage.ProfileModel;
import smcproject.Session;


public class SettingsDAO
{
    public Connection dbConnection()throws ClassNotFoundException, SQLException 
    {

        Class.forName("org.postgresql.Driver");

        String url ="jdbc:postgresql://localhost:5432/SMCProject";
        String userName = "postgres";
        String pass = "prasanna@08";

        Connection con =DriverManager.getConnection(url, userName, pass);

        return con;
    }

    public SettingsModel getProfile()throws Exception {

        Connection conn = dbConnection();

        PreparedStatement psmt =conn.prepareStatement("SELECT * FROM register_table WHERE user_name=? OR email=?");

        psmt.setString(1, Session.userName);
        psmt.setString(2, Session.email);

        ResultSet rs = psmt.executeQuery();

        SettingsModel sm = new SettingsModel();

        if(rs.next()) {

            sm.setFullName(rs.getString("user_name"));
            sm.setEmail(rs.getString("email"));
            sm.setPhoneNumber(rs.getString("phone_number"));
        }

        return sm;
    }

    public void updateProfile(SettingsModel sm)throws Exception {

        Connection conn = dbConnection();

        PreparedStatement psmt =conn.prepareStatement("UPDATE register_table SET user_name=?,phone_number=? , email =? WHERE  email=?");

        psmt.setString(1, sm.getFullName());
        psmt.setString(2, sm.getPhoneNumber());
        psmt.setString(3, sm.getEmail());
        psmt.setString(4, Session.email);

        psmt.executeUpdate(); 
    }
    
    
    public SettingsModel getComapany()throws Exception {

        Connection conn = dbConnection();

        PreparedStatement psmt =conn.prepareStatement("SELECT * FROM company");

        ResultSet rs = psmt.executeQuery();

        SettingsModel sm = new SettingsModel();

        if(rs.next()) 
        {
            sm.setCompanyName(rs.getString("com_name"));
            sm.setGstNumber(rs.getString("gst_no"));
            sm.setAddress(rs.getString("address"));
        }

        return sm;
    }
    
    
    public void updateCompany(SettingsModel sm)throws Exception {

        Connection conn = dbConnection();

        PreparedStatement psmt =conn.prepareStatement("UPDATE company SET com_name =?,gst_no=?,address=? ");

        psmt.setString(1, sm.getCompanyName());
        psmt.setString(2, sm.getGstNumber());
        psmt.setString(3, sm.getAddress());

        psmt.executeUpdate(); 
    }
}
