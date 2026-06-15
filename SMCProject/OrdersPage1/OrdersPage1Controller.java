/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.OrdersPage1;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Date;
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
import smcproject.AddOrder.AddOrderPageController;
import smcproject.CustomerPage.CustomerModel;
import smcproject.CustomerPage.CustomerPageController;
import smcproject.CustomerPage.CustomerService;
import smcproject.ProductsPage.ProductsModel;
import smcproject.ScreenScaler;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class OrdersPage1Controller implements Initializable {

    @FXML
    private TextField searchProduct;
    @FXML
    private TableColumn<OrdersModel,Integer> orderId;
    @FXML
    private TableColumn<OrdersModel, String> customer;
    @FXML
    private TableColumn<OrdersModel, Double> amount;
    @FXML
    private TableColumn<OrdersModel, Date> date;
    @FXML
    private TableColumn<OrdersModel, String> status;
    @FXML
    private TableView<OrdersModel> orderTable;
    @FXML
    private Button deleteBtn;
    @FXML
    private Button updateBtn;
    
    private OrdersService os = new OrdersService();
    
    ObservableList<OrdersModel> originalList = FXCollections.observableArrayList();
    

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
        orderId.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customer.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        date.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));

        
        
        
        try {
            originalList = FXCollections.observableArrayList(os.getAllOrders());
            
            orderTable.setItems(originalList);
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
        orderTable.getSelectionModel()
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
    private void newOrder(ActionEvent event) throws IOException 
    
    {
        
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/AddOrder/AddOrderPage.fxml"));

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
            orderTable.setItems(originalList);
            return;
        }

        ObservableList<OrdersModel> filteredList = FXCollections.observableArrayList();

        for (OrdersModel p : originalList) {
            if (p.getCustomerName().toLowerCase().contains(text)) {
                filteredList.add(p);
            }
        }

        orderTable.setItems(filteredList);
    }

    @FXML
    private void delete(ActionEvent event) 
    {
        try {
            OrdersModel selected
                    = orderTable.getSelectionModel()
                            .getSelectedItem();

            if (selected != null) {
                OrdersService os = new  OrdersService();

                os.deleteProduct(
                        selected.getOrderId());

                orderTable.getItems()
                        .remove(selected);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void update(ActionEvent event) {
        try {
            OrdersModel selected
                    = orderTable.getSelectionModel()
                            .getSelectedItem();

            if (selected == null) {
                return;
            }

            FXMLLoader loader
                    = new FXMLLoader(
                            getClass().getResource(
                                    "/smcproject/AddOrder/AddOrderPage.fxml"));

            Parent root = loader.load();

            AddOrderPageController controller
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
