package com.zperkowski.PossessedMachine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Possessed Machine");
        primaryStage.setScene(new Scene(root, 610, 400));
        primaryStage.setMinWidth(610);
        primaryStage.setMinHeight(420);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
