
package smcproject.PasswordPage;

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
import javafx.stage.Stage;
import smcproject.ForgotPasswordPage.ForgotPasswordModel;
import smcproject.ScreenScaler;


public class PasswordPageController implements Initializable 
{

    @FXML
    private PasswordField newPassword;
    @FXML
    private PasswordField confirmPassword;
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
    private void reset(ActionEvent event) throws IOException, ClassNotFoundException, SQLException 
    
    {
        
        String email = ForgotPasswordModel.userEmail;
        
        String npass = newPassword.getText();
        String cpass = confirmPassword.getText();
        
        PasswordModel pm = new PasswordModel(npass, cpass, email);
        
        PasswordService ps = new PasswordService();
        if(npass.isEmpty() || cpass.isEmpty())
        {
            message.setText("Enter All Details!");
            return;
        }
        int res = ps.pass(pm);
        
        if(res == 1)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/smcproject/ResetPasswordPage/ResetPasswordPage.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
        stage.show();
        }
        else if(res == 0)
        {
            message.setText("Invalid Details");
        }
        else if(res == -1)
        {
            message.setText("Confirm password and New Password should be Equal!");
        }

        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
