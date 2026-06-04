/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.DashboardPage;

import javafx.application.Platform;
import javafx.scene.chart.PieChart;
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
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import smcproject.CustomerPage.CustomerPageController;


public class DashboardPageController implements Initializable {

    @FXML
    private TableColumn<DashboardModel, Integer> orderId;
    @FXML
    private TableColumn<DashboardModel, String> customer;
    @FXML
    private TableColumn<DashboardModel, Double> amount;
    @FXML
    private TableColumn<DashboardModel, String> status;
    @FXML
    private TableColumn<DashboardModel, Date> date;
    @FXML
    private PieChart overview;
    @FXML
    private TableView<DashboardModel> orderTable;
    
    private DashboardService ds = new DashboardService();

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

        
        ObservableList ol = null;
        
        try {
            ol = FXCollections.observableArrayList(ds.getAllOrders());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        orderTable.setItems(ol);
        
        
        try {
            int completed= ds.getStatusCount("Completed");

            int inProgress= ds.getStatusCount("In Progress");

            int pending= ds.getStatusCount("Pending");

            ObservableList<PieChart.Data> pieData= FXCollections.observableArrayList(
                            new PieChart.Data("Completed", completed),
                            new PieChart.Data("In Progress", inProgress),
                            new PieChart.Data("Pending", pending));

            overview.setData(pieData);
            
            overview.setData(pieData);

            Platform.runLater(() -> {

                for (PieChart.Data data : overview.getData()) {
                    if (data.getName().equals("Completed")) {
                        data.getNode().setStyle("-fx-pie-color: green;");
                    } else if (data.getName().equals("Pending")) {
                        data.getNode().setStyle("-fx-pie-color: red;");
                    } else if (data.getName().equals("In Progress")) {
                        data.getNode().setStyle("-fx-pie-color: orange;");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        overview.setTitle("Orders");
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
    private void notify(ActionEvent event) {
    }

    @FXML
    private void viewAllOrder(ActionEvent event) throws IOException
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
    
}
