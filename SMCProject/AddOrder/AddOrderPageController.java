
package smcproject.AddOrder;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import smcproject.AddProduct.AddProductModel;
import smcproject.AddProduct.AddProductService;
import smcproject.OrdersPage1.OrdersModel;
import smcproject.ScreenScaler;


public class AddOrderPageController implements Initializable 
{
    @FXML
    private DatePicker orderDate;
    @FXML
    private TextField quantity;
    @FXML
    private TextField amount;
    @FXML
    private ComboBox<String> status;
    @FXML
    private Label message;
    @FXML
    private Label orderId;
    @FXML
    private TextField cusId;
    @FXML
    private TextField proId;
    
    private OrdersModel selectedOrder;
    @FXML
    private Button updateBtn;
    @FXML
    private Button addBtn;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        status.getItems().addAll(
                "Completed",
                "In Progress",
                "Pending"
        );
        status.setValue("Completed");
        updateBtn.setVisible(false);

        updateBtn.setManaged(false);
    }   
    
    @FXML
    private void createOrder(ActionEvent event) throws ClassNotFoundException, SQLException, Exception 
    {
        if (amount.getText().trim().isEmpty()
                || quantity.getText().trim().isEmpty())
        {
            message.setText("Enter all details");
            return;
        }
        int cusid = Integer.parseInt(cusId.getText());
        int proid = Integer.parseInt(proId.getText());
        int quan = Integer.parseInt(quantity.getText());
        double price = Double.parseDouble(amount.getText());    
        String stat = status.getValue();
        LocalDate odate = orderDate.getValue();
        
        
        AddOrderModel am = new AddOrderModel(cusid, proid, quan, price, stat, odate);
        
        AddOrderService as = new AddOrderService();
        String mes = as.createOrder(am);
        
        message.setText(mes);
    }

    @FXML
    private void profile(ActionEvent event) throws IOException 
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/ProfilePage/ProfilePage.fxml"));

        Stage notificationStage = new Stage();

        notificationStage.setTitle("Notifications");

        notificationStage.setScene(new Scene(root));

        notificationStage.setWidth(400);

        notificationStage.setHeight(600);

        notificationStage.show();
    }

    @FXML
    private void notify(ActionEvent event) throws IOException 
    {
        Parent root =
    FXMLLoader.load(
    getClass().getResource(
    "/smcproject/Notification/NotificationPage.fxml"));

    Stage stage =
    (Stage)((Node)event.getSource())
    .getScene()
    .getWindow();

    stage.setScene(new Scene(root));

    stage.show();
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
        getClass().getResource("/smcproject/OrdersPage1/OrdersPage1.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    
    public void setData(OrdersModel om) {
        selectedOrder = om;

        cusId.setText(
                String.valueOf(om.getCustomerId()));

        proId.setText(
                String.valueOf(om.getProductId()));

        quantity.setText(
                String.valueOf(om.getQuantity()));

        amount.setText(
                String.valueOf(om.getAmount()));

        status.setValue(
                om.getStatus());

        orderDate.setValue(
                om.getOrderDate());

        addBtn.setVisible(false);

        updateBtn.setVisible(true);

        updateBtn.setManaged(true);
    }

    @FXML
    private void update(ActionEvent event) {
        try {
            AddOrderModel am
                    = new AddOrderModel(
                            selectedOrder.getOrderId(),
                            Integer.parseInt(cusId.getText()),
                            Integer.parseInt(proId.getText()),
                            Integer.parseInt(quantity.getText()),
                            Double.parseDouble(amount.getText()),
                            status.getValue(),
                            orderDate.getValue());

            AddOrderService as
                    = new AddOrderService();

            String msg
                    = as.updateOrder(am);

            message.setText(msg);

            Parent root
                    = FXMLLoader.load(
                            getClass().getResource(
                                    "/smcproject/OrdersPage1/OrdersPage1.fxml"));

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
