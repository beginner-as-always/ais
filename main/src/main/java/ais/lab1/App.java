package ais.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Objects.requireNonNull(getClass().getResource("main.fxml")));

        Parent root = loader.load();
        Scene scene = new Scene(root, 500, 300);

        stage.setScene(scene);
        stage.setTitle("AIS #1");
        stage.setResizable(false);
        stage.show();
    }
}
