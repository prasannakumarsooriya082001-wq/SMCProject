package smcproject;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SMCProject extends Application
{

    @Override
    public void start(Stage primaryStage) throws IOException
    {

        Parent root = FXMLLoader.load(SMCProject.class.getResource("MainPage1/MainPage1.fxml"));
        
        Scene scene = new Scene(root,1280,720);
        
        primaryStage.setTitle("SMC Project");
        primaryStage.setScene(scene);
        primaryStage.show();

        
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}