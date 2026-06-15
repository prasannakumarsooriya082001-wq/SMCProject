/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.AddMaterial;


import javafx.scene.control.ComboBox;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
import smcproject.AddNewCustomer.AddCustomerModel;
import smcproject.AddNewCustomer.AddCutomerService;
import smcproject.InventoryPage.InventoryModel;
import smcproject.ScreenScaler;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class AddMaterialPageController implements Initializable {

    
    @FXML
    private TextField materialName;
    @FXML
    private TextField category;
    @FXML
    private TextField unit;
    @FXML
    private TextField stock;
    @FXML
    private ComboBox<String> status;
    @FXML
    private Label orderId;
    @FXML
    private Label message;
    @FXML
    private Button updateBtn;

    private InventoryModel selectedMaterial;
    @FXML
    private Button addBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
        status.getItems().addAll(
                "Available",
                "Low Stock",
                "Out of Stock"
        );
        status.setValue("Available");
        updateBtn.setVisible(false);

        updateBtn.setManaged(false);
    }    
    
    @FXML
    private void addProduct(ActionEvent event) throws ClassNotFoundException, SQLException, Exception 
    {
        String mateName = materialName.getText();
        String cate = category.getText();
        String units = unit.getText();
        int stocks = Integer.parseInt(stock.getText());
        String stat = status.getValue();
        
        AddMaterialModel am = new AddMaterialModel(mateName, cate, units, stocks,stat);
        
        AddMaterialService as = new AddMaterialService();
        String mes = as.addMaterial(am);
        
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
        getClass().getResource("/smcproject/InventoryPage/InventoryPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    
    public void setData(InventoryModel im) {
        selectedMaterial = im;

        materialName.setText(im.getMaterial_name());

        category.setText(im.getCategory());

        unit.setText(im.getUnit());

        stock.setText(String.valueOf(im.getStock()));

        status.setValue(im.getStatus());

        addBtn.setVisible(false);

        addBtn.setManaged(false);

        updateBtn.setVisible(true);

        updateBtn.setManaged(true);
    }

    @FXML
    private void update(ActionEvent event) 
    {
        try {
            AddMaterialModel am
                    = new AddMaterialModel(
                            selectedMaterial.getId(),
                            materialName.getText(),
                            category.getText(),
                            unit.getText(),
                            Integer.parseInt(stock.getText()),
                            status.getValue());

            AddMaterialService as
                    = new AddMaterialService();

            String msg
                    = as.updateMaterial(am);

            message.setText(msg);

            Parent root
                    = FXMLLoader.load(
                            getClass().getResource(
                                    "/smcproject/InventoryPage/InventoryPage.fxml"));

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
