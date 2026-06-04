/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.SettingsPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import smcproject.ProfilePage.ProfileModel;
import smcproject.ProfilePage.ProfileService;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class SettingsPageController implements Initializable {

    @FXML
    private TextField fullName;
    @FXML
    private TextField email;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField companyName;
    @FXML
    private TextField gstNumber;
    @FXML
    private TextField address;

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
        try 
        {
        SettingsService ss = new SettingsService();

        SettingsModel sm =ss.profileData();

        fullName.setText(sm.getFullName());
        email.setText(sm.getEmail());
        phoneNumber.setText(sm.getPhoneNumber());
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        
        
        try 
        {
        SettingsService ss = new SettingsService();

        SettingsModel sm =ss.companyData();

        companyName.setText(sm.getCompanyName());
        gstNumber.setText(sm.getGstNumber());
        address.setText(sm.getAddress());
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        
        
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
    private void profileSave(ActionEvent event) 
    {
        try 
        {

        SettingsModel sm = new SettingsModel();
        sm.setFullName(fullName.getText());
        sm.setPhoneNumber(phoneNumber.getText());
        sm.setEmail(email.getText());
        SettingsService ss = new SettingsService();
        ss.update(sm);
        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Profile Updated");
        alert.show();

        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }

    @FXML
    private void companySave(ActionEvent event) throws Exception 
    {
        try 
        {

        SettingsModel sm =  new SettingsModel();
        sm.setCompanyName(companyName.getText());
        sm.setGstNumber(gstNumber.getText());
        sm.setAddress(address.getText());
        
        SettingsService ss = new SettingsService();
        ss.updatecomapny(sm);
        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Company Updated");
        alert.show();

        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        
        
        
        
    }
    
}
