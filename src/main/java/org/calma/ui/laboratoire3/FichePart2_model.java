package org.calma.ui.laboratoire3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FichePart2_model extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FichePart2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),640,480);
        stage.setScene(scene);
        stage.setTitle("FichePart2");


    }
}
