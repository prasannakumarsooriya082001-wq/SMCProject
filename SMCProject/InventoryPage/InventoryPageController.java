/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.InventoryPage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import smcproject.AddMaterial.AddMaterialPageController;
import smcproject.CustomerPage.CustomerPageController;
import smcproject.OrdersPage1.OrdersModel;
import smcproject.OrdersPage1.OrdersService;
import smcproject.ScreenScaler;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class InventoryPageController implements Initializable {

    @FXML
    private TableColumn<InventoryModel, String> materialName;
    @FXML
    private TableColumn<InventoryModel, String> category;
    @FXML
    private TableColumn<InventoryModel, String> unit;
    @FXML
    private TableColumn<InventoryModel, Integer>stock;
    @FXML
    private TableColumn<InventoryModel, String> status;
    @FXML
    private TableView<InventoryModel> inventoryTable;
    
    private InventoryService is = new InventoryService();
    @FXML
    private Button deleteBtn;
    @FXML
    private Button updateBtn;

    
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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        materialName.setCellValueFactory(new PropertyValueFactory<>("material_name"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        unit.setCellValueFactory(new PropertyValueFactory<>("unit"));
        stock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));

        
        ObservableList ol = null;
        
        try {
            ol = FXCollections.observableArrayList(is.getAllMaterials());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        inventoryTable.setItems(ol);
        
        
        
        //update or delete
        updateBtn.setDisable(true);

        deleteBtn.setDisable(true);
        
        
        //listener
        inventoryTable.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldSelection, newSelection)
                        -> {
                    if (newSelection != null) {
                        updateBtn.setDisable(false);

                        deleteBtn.setDisable(false);
                    }
                });
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
    private void addMaterial(ActionEvent event) throws IOException 
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/AddMaterial/AddMaterialPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void delete(ActionEvent event) 
    {
        try {
            InventoryModel selected
                    = inventoryTable.getSelectionModel()
                            .getSelectedItem();

            if (selected != null) {
                InventoryService os = new InventoryService();

                os.deleteProduct(
                        selected.getMaterial_name());

                inventoryTable.getItems()
                        .remove(selected);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void update(ActionEvent event) 
    {
        
        try {
            InventoryModel selected
                    = inventoryTable.getSelectionModel()
                            .getSelectedItem();

            if (selected == null) {
                return;
            }

            FXMLLoader loader
                    = new FXMLLoader(
                            getClass().getResource(
                                    "/smcproject/AddMaterial/AddMaterialPage.fxml"));

            Parent root = loader.load();

            AddMaterialPageController controller
                    = loader.getController();

            controller.setData(selected);

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
