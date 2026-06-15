package smcproject;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ScreenScaler {

    public static void applyScaling(Stage stage, Parent root) {

        double baseWidth = 1280;
        double baseHeight = 720;

        Rectangle2D screenBounds =
                Screen.getPrimary().getVisualBounds();

        double scaleX =
                screenBounds.getWidth() / baseWidth;

        double scaleY =
                screenBounds.getHeight() / baseHeight;

        double scale =Math.min(scaleX, scaleY) * 0.92;

        root.setScaleX(scale);
        root.setScaleY(scale);

        StackPane wrapper = new StackPane(root);
        wrapper.setAlignment(Pos.CENTER);

        Scene scene = new Scene(
                wrapper,
                screenBounds.getWidth(),
                screenBounds.getHeight()
        );

        stage.setScene(scene);
        stage.setMaximized(true);
    }
}