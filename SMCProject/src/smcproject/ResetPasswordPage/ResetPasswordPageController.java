/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.ResetPasswordPage;

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
import javafx.stage.Stage;


public class ResetPasswordPageController implements Initializable 
{

    @FXML
    private void fgoLogin(ActionEvent event) throws IOException {

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
    private void login(ActionEvent event) throws IOException {

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
    
    
    
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
