package smcproject.MainPage1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainPage1Controller implements Initializable {

    @FXML
    private Button accessBtn;   
    @FXML
    private ImageView image;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        accessBtn.setOnMouseEntered(e -> {

            TranslateTransition up =
                    new TranslateTransition(
                            Duration.millis(150),
                            accessBtn);

            up.setToY(-5);
            up.play();
        });

        accessBtn.setOnMouseExited(e -> {

            TranslateTransition down =
                    new TranslateTransition(
                            Duration.millis(150),
                            accessBtn);

            down.setToY(0);
            down.play();
        });
        
        
        TranslateTransition tt = new TranslateTransition();

        tt.setNode(image);

        tt.setDuration(Duration.seconds(2));

        tt.setByY(-20); // move up

        tt.setCycleCount(TranslateTransition.INDEFINITE);

        tt.setAutoReverse(true);

        tt.play();
    }

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
    private void login(ActionEvent event)
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
    private void about(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/AboutPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void about1(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/AboutPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    @FXML
    private void about2(ActionEvent event)
            throws IOException
    {
        Parent root =
        FXMLLoader.load(
        getClass().getResource("/smcproject/AboutPage.fxml"));

        Stage stage =
        (Stage)((Node)event.getSource())
        .getScene()
        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
    
    
    
    
    
}