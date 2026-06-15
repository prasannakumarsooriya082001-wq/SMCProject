
package smcproject.Notification;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.sql.*;
import javafx.event.ActionEvent;


public class NotificationPageController implements Initializable {

    @FXML
    private ListView<String> notificationList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try {
            NotificationService ns
                    = new NotificationService();

            ResultSet rs
                    = ns.getNotifications();

            while (rs.next()) 
            {
                String msg= rs.getString("message");

                notificationList .getItems().add(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

    @FXML
    private void clearNotifications(ActionEvent event) 
    {
        try {
            NotificationService ns
                    = new NotificationService();

            ns.clearNotifications();

            notificationList.getItems().clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
