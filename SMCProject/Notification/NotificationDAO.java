package smcproject.Notification;

import java.sql.*;


public class NotificationDAO
{
    Connection con;

    public NotificationDAO() throws Exception
    {
        Class.forName("org.postgresql.Driver");

        con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/SMCProject",
                "postgres",
                "prasanna@08");
    }

    public void addNotification(NotificationModel nm)throws Exception
    {
        String query ="insert into notifications(message,status) values(?,?)";

        PreparedStatement ps =con.prepareStatement(query);

        ps.setString(1, nm.getMessage());

        ps.setString(2, nm.getStatus());

        ps.executeUpdate();
    }
    
    public ResultSet getNotifications() throws Exception 
    {
        String query  = "select * from notifications order by id desc";

        PreparedStatement ps = con.prepareStatement(query);

        return ps.executeQuery();
    }
    
    public void clearNotifications() throws Exception {
        String query = "delete from notifications";

        PreparedStatement ps
                = con.prepareStatement(query);

        ps.executeUpdate();
    }
}