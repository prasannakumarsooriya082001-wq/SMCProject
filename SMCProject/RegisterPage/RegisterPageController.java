/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.RegisterPage;

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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import smcproject.ScreenScaler;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class RegisterPageController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField phonum;
    @FXML
    private TextField email;
    @FXML
    private TextField address;
    @FXML
    private PasswordField password;
    @FXML
    private Label message;

    @FXML
    private void goToLogin(ActionEvent event)
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
    private void BackToHome(ActionEvent event)
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
    private void rAccount(ActionEvent event)
            throws IOException, ClassNotFoundException, SQLException
    {
        String user = username.getText();
        String emailID = email.getText();
        String pho_num = phonum.getText();
        String addr = address.getText();
        String pass = password.getText();
        
        RegisterModel rm = new RegisterModel(user, emailID, pho_num, addr, pass);
        
        RegisterService rs = new RegisterService();
        String mes = rs.createuser(rm);
        
        message.setText(mes);

    }
    
    
    
    
    
   
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
