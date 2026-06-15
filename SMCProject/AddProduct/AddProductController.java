/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.AddProduct;

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
import smcproject.ProductsPage.ProductsModel;
import smcproject.ScreenScaler;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class AddProductController implements Initializable {

    @FXML
    private Label orderId;
    @FXML
    private TextField productName;
    @FXML
    private TextField category;
    @FXML
    private TextField amount;
    @FXML
    private TextField stock;
    @FXML
    private ComboBox<String> status;
    @FXML
    private Label message;

    private ProductsModel selectedProduct;
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
    private void addProduct(ActionEvent event) throws ClassNotFoundException, SQLException, Exception 
    {
        if (amount.getText().trim().isEmpty()|| stock.getText().trim().isEmpty()) {
            message.setText("Enter all details");
            return;
        }
        String productname = productName.getText();
        String cate =  category.getText();
        double price = Double.parseDouble(amount.getText());
        int sto = Integer.parseInt(stock.getText());
        String stat = status.getValue();
        
        
        
        AddProductModel am = new AddProductModel(0,productname, cate, price, sto, stat);
        
        AddProductService as = new AddProductService();
        String mes = as.createuser(am);
        
        message.setText(mes);
        
        

    
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
        Parent root =
    FXMLLoader.load(
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
        FXMLLoader.load(getClass().getResource("/smcproject/ProductsPage/ProductsPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    public void setData(ProductsModel pm) {
        selectedProduct = pm;

        productName.setText(pm.getProductName());

        category.setText(pm.getCategory());

        amount.setText(String.valueOf(pm.getPrice()));

        stock.setText(String.valueOf(pm.getStock()));

        status.setValue(pm.getStatus());
        
        addBtn.setVisible(false);
        addBtn.setManaged(false);
        
        updateBtn.setVisible(true);
        updateBtn.setManaged(true);

    }

    @FXML
    private void update(ActionEvent event) 
    {
        try {
            AddProductModel am
                    = new AddProductModel(
                            selectedProduct.getProductId(),
                            productName.getText(),
                            category.getText(),
                            Double.parseDouble(amount.getText()),
                            Integer.parseInt(stock.getText()),
                            status.getValue());

            AddProductService as
                    = new AddProductService();

            String msg
                    = as.updateProduct(am);

            message.setText(msg);
            
            Parent root
                    = FXMLLoader.load(
                            getClass().getResource(
                                    "/smcproject/ProductsPage/ProductsPage.fxml"));

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
