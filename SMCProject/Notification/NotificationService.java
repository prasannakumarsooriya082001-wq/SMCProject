package smcproject.Notification;

import java.sql.*;

public class NotificationService
{
    NotificationDAO nd;

    public NotificationService()
            throws Exception
    {
        nd = new NotificationDAO();
    }

    public void addNotification(String message)throws Exception
    {
        NotificationModel nm =new NotificationModel(0,message,"Unread");

        nd.addNotification(nm);
    }
    
    public ResultSet getNotifications()throws Exception {
        return nd.getNotifications();
    }
    
    public void clearNotifications() throws Exception {
        nd.clearNotifications();
    }
}