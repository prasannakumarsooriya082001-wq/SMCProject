
package smcproject.AddNewCustomer;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import smcproject.AddOrder.AddOrderModel;
import smcproject.AddOrder.AddOrderService;
import smcproject.CustomerPage.CustomerModel;
import smcproject.ScreenScaler;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class AddNewCustomerPageController implements Initializable {

    @FXML
    private Label orderId;
    @FXML
    private TextField customerName;
    @FXML
    private TextField phoneNumer;
    @FXML
    private TextField email;
    @FXML
    private TextArea address;
    @FXML
    private Label message;
    @FXML
    private Button updateBtn;
    @FXML
    private Button addBtn;

    private CustomerModel selectedCustomer;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        updateBtn.setVisible(false);

        updateBtn.setManaged(false);
    }    

    @FXML
    private void profile(ActionEvent event) throws IOException 
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/ProfilePage/ProfilePage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void notify(ActionEvent event) throws IOException 
    {
        Parent root
                = FXMLLoader.load(
                        getClass().getResource(
                                "/smcproject/Notification/NotificationPage.fxml"));

        Stage notificationStage = new Stage();

        notificationStage.setTitle("Notifications");

        notificationStage.setScene(new Scene(root));

        notificationStage.setWidth(400);

        notificationStage.setHeight(600);

        notificationStage.show();
    }

    @FXML
    private void dashboardBtn1(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/ProductsPage/ProductsPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void dashboardBtn2(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/OrdersPage1/OrdersPage1.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    private void dashboardBtn3(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/CustomerPage/CustomerPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    @FXML
    private void dashboardBtn4(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/ProductionPage/ProductionPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void dashboardBtn5(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/InventoryPage/InventoryPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void dashboardBtn6(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/ReportsPage/ReportsPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void dashboardBtn7(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/SettingsPage/SettingsPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void btn8(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/Loginpage1/Loginpage1.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void dashboardBtn(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/DashboardPage/DashboardPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void back(ActionEvent event) throws IOException 
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/CustomerPage/CustomerPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

       stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void addCustomer(ActionEvent event) throws IOException, ClassNotFoundException, SQLException, Exception 
    {
        String cusName = customerName.getText();
        String phoNum = phoneNumer.getText();
        String emailId = email.getText();
        String addr = address.getText();
        
        AddCustomerModel am = new AddCustomerModel(cusName, phoNum, emailId, addr);
        
        AddCutomerService as = new AddCutomerService();
        String mes = as.createCustomer(am);
        
        message.setText(mes);         
    }
    
    
    
    public void setData(CustomerModel cm) {
        selectedCustomer = cm;

        customerName.setText(cm.getCustomerName());

        phoneNumer.setText(cm.getPhone());

        email.setText(cm.getEmail());

        address.setText(cm.getAddress());

        addBtn.setVisible(false);

        updateBtn.setVisible(true);

        updateBtn.setManaged(true);
    }

    @FXML
    private void update(ActionEvent event) 
    {
         try {
            AddCustomerModel am
                    = new AddCustomerModel(
                            selectedCustomer.getCustomerId(),
                            customerName.getText(),
                            phoneNumer.getText(),
                            email.getText(),
                            address.getText());

            AddCutomerService as
                    = new AddCutomerService();

            String msg
                    = as.updateCustomer(am);

            message.setText(msg);

            Parent root
                    = FXMLLoader.load(
                            getClass().getResource(
                                    "/smcproject/CustomerPage/CustomerPage.fxml"));

            Stage stage
                    = (Stage) ((Node) event.getSource())
                            .getScene()
                            .getWindow();

            stage.setScene(new Scene(root));

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
