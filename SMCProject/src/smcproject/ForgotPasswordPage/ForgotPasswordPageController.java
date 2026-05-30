/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package smcproject.ForgotPasswordPage;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PRASANNA KUMAR
 */
public class ForgotPasswordPageController  {

    @FXML
    private TextField emailId;
    @FXML
    private Label message;

    
    
    
    
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
    private void VCode(ActionEvent event) throws IOException, ClassNotFoundException, SQLException
    {
        String email = emailId.getText();
        
        ForgotPasswordModel.userEmail = email;
        
        ForgotPasswordModel fm = new ForgotPasswordModel(email);
        
        ForgotPasswordService fs = new ForgotPasswordService();
        int res = fs.changePass(fm);
        
        if(res == 1)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/smcproject/PasswordPage/PasswordPage.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
            stage.show();
        }
        else if(res == 0)
        {
            message.setText("Invalid EmailId!");
        }
        else if(res == -1)
        {
            message.setText("Please enter your email id!");
        }

        
    }
    
    
    
    @FXML
    private void flogin(ActionEvent event) throws IOException {

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
    
    
    
    
    
    
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
