package co.edu.uniquindio.pr3.parcial2.application;

import co.edu.uniquindio.pr3.parcial2.viewControllers.LoginViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInView.fxml"));
        Parent AnchorPane = loader.load();
        Scene scene = new Scene(AnchorPane);
        primaryStage.setScene(scene);
        LoginViewController controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.setTitle("Log In");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
