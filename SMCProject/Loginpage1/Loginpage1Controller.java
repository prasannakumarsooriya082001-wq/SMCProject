/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.Loginpage1;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import smcproject.Session;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class Loginpage1Controller implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Label message;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
     @FXML
    private void BackToHome(ActionEvent event)
            throws IOException {

        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/MainPage1/MainPage1.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.show();
    }
    
    
    @FXML
    private void forgotPass(ActionEvent event) throws IOException {

        Parent root
                = FXMLLoader.load(
                        getClass().getResource("/smcproject/ForgotPasswordpage/ForgotPasswordPage.fxml"));

        Stage stage
                = (Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void register(ActionEvent event) throws IOException {

        Parent root
                = FXMLLoader.load(
                        getClass().getResource("/smcproject/RegisterPage/RegisterPage.fxml"));

        Stage stage
                = (Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void dashboard(ActionEvent event) throws IOException, ClassNotFoundException, SQLException 
    
    {
        String user = username.getText();
        String pass = password.getText();
        
        LoginModel lm =new LoginModel(user, pass);
        
        LoginService ls = new LoginService();
        int res = ls.login(lm);
        
        if (res >0)
        {
            Session.userName = username.getText();
            
            
            Parent root = FXMLLoader.load(getClass().getResource("/smcproject/DashboardPage/DashboardPage.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();          
        }
        else if(res == 0)
        {
            message.setText("Invalid Username or password !");
        }
        else
        {
            message.setText("Enter all Deatils!");
        }
        
        
        
    }
    
    
    
}
