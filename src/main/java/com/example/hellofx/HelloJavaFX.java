package com.example.hellofx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        Label message = new Label("Welcome Melissa!");
        Button button = new Button("start");
        Button reset = new Button ("reset");
        button.setOnAction(event ->
                message.setText("Great! You clicked the button.")
        );
        reset.setOnAction(event ->message.setText("Welcome to JavaFX!"));
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(message, button,reset);
        Scene scene = new Scene(layout, 500, 300);
        stage.setTitle("202402571 My First JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {launch(args);
    }
}