/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.ProfilePage;

import java.sql.*;
import smcproject.Session;
/**
 *
 * @author PRASANNA KUMAR
 */
public class ProfileDAO 
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

    public ProfileModel getProfile()throws Exception {

        Connection conn = dbConnection();

        PreparedStatement psmt =conn.prepareStatement("SELECT * FROM register_table WHERE user_name=? OR email=?");

        psmt.setString(1, Session.userName);
        psmt.setString(2, Session.userName);

        ResultSet rs = psmt.executeQuery();

        ProfileModel pm = new ProfileModel();

        if(rs.next()) {

            pm.setFullName(rs.getString("user_name"));
            pm.setEmail(rs.getString("email"));
            pm.setPhoneNumber(rs.getString("phone_number"));
        }

        return pm;
    }

    public void updateProfile(ProfileModel pm)throws Exception {

        Connection conn = dbConnection();

        PreparedStatement psmt =conn.prepareStatement("UPDATE register_table SET user_name=?,phone_number=? WHERE user_name=? OR email=?");

        psmt.setString(1, pm.getFullName());
        psmt.setString(2, pm.getPhoneNumber());

        psmt.setString(3, Session.userName);
        psmt.setString(4, Session.userName);

        psmt.executeUpdate();
    }
}
