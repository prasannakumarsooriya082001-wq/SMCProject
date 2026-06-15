/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.CustomerPage;

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
import smcproject.AddNewCustomer.AddNewCustomerPageController;
import smcproject.ProductsPage.ProductsModel;
import smcproject.ProductsPage.ProductsPageController;
import smcproject.ProductsPage.ProductsService;
import smcproject.ScreenScaler;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class CustomerPageController implements Initializable {

    @FXML
    private TextField searchProduct;
    @FXML
    private TableColumn<CustomerModel, String> customerName;
    @FXML
    private TableColumn<CustomerModel, String> email;
    @FXML
    private TableColumn<CustomerModel, String> phone;
    @FXML
    private TableColumn<CustomerModel, String> orders;
    @FXML
    private TableView<CustomerModel> tableview;
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
    
    
    private CustomerService cs = new CustomerService();
    
    ObservableList<CustomerModel> originalList = FXCollections.observableArrayList();
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        customerName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        orders.setCellValueFactory(new PropertyValueFactory<>("orders"));
        
        
        
        
        try {
            originalList = FXCollections.observableArrayList(cs.getAllCustomers());
            tableview.setItems(originalList);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        searchProduct.textProperty().addListener((obs, oldValue, newValue) -> 
        {searchItem();
        });
        
        
        //update or delete
        updateBtn.setDisable(true);

        deleteBtn.setDisable(true);
        
        
        //listener
        tableview.getSelectionModel()
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
    private void addNewCustomer(ActionEvent event) throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/AddNewCustomer/AddNewCustomerPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void searchItem() 
    {
        String text = searchProduct.getText().toLowerCase();

        if (text.isEmpty()) {
            tableview.setItems(originalList);
            return;
        }

        ObservableList<CustomerModel> filteredList = FXCollections.observableArrayList();

        for (CustomerModel p : originalList) {
            if (p.getCustomerName().toLowerCase().contains(text)) {
                filteredList.add(p);
            }
        }

        tableview.setItems(filteredList);
    }
    
    public void clearSearch()
    {
        searchProduct.clear();      // search box clear
        tableview.setItems(originalList); // full data again show
    }

    @FXML
    private void delete(ActionEvent event) 
    {
        try {
            CustomerModel selected
                    = tableview.getSelectionModel()
                            .getSelectedItem();

            if (selected != null) {
                CustomerService ps
                        = new CustomerService();

                ps.deleteProduct(
                        selected.getCustomerId());

                tableview.getItems()
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
            CustomerModel selected
                    = tableview.getSelectionModel()
                            .getSelectedItem();

            if (selected == null) {
                return;
            }

            FXMLLoader loader
                    = new FXMLLoader(
                            getClass().getResource(
                                    "/smcproject/AddNewCustomer/AddNewCustomerPage.fxml"));

            Parent root
                    = loader.load();

            AddNewCustomerPageController controller
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
