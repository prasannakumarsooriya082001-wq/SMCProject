/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.ProductsPage;

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
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class ProductsPageController implements Initializable {

    @FXML
    private TextField search;
    @FXML
    private TextField searchProduct;
    @FXML
    private TableColumn<ProductsModel, String> productName;
    @FXML
    private TableColumn<ProductsModel, String> category;
    @FXML
    private TableColumn<ProductsModel, Double> price;
    @FXML
    private TableColumn<ProductsModel, Integer> stock;
    @FXML
    private TableColumn<ProductsModel, String> status;
    @FXML
    private TableView<ProductsModel> productTable;
    @FXML
    private TableColumn<ProductsModel, Integer> productID;
    
    
    private ProductsService ps = new ProductsService();
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        productID.setCellValueFactory(new PropertyValueFactory<>("productId"));
        productName.setCellValueFactory(new PropertyValueFactory<>("productName"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        stock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));
        
        ObservableList ol = null;
        
        try {
            ol = FXCollections.observableArrayList(ps.getAllProducts());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductsPageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductsPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        productTable.setItems(ol);

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
    private void backward(ActionEvent event) {
    }

    @FXML
    private void page1(ActionEvent event) {
    }

    @FXML
    private void page2(ActionEvent event) {
    }

    @FXML
    private void page3(ActionEvent event) {
    }

    @FXML
    private void page4(ActionEvent event) {
    }

    @FXML
    private void page5(ActionEvent event) {
    }


    @FXML
    private void menu1(ActionEvent event) {
    }

    @FXML
    private void menu2(ActionEvent event) {
    }

    @FXML
    private void addProduct(ActionEvent event) throws IOException 
    {
         Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/AddProduct/AddProduct.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void forward(ActionEvent event) {
    }





    
}
