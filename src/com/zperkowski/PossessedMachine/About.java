package com.zperkowski.PossessedMachine;

import javafx.scene.control.Alert;

public class About {
    public static void display() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Possessed Machine");
        alert.contentTextProperty().bind(LanguageChanger.createStringBinding("authorAndMore"));
        alert.showAndWait();
    }
}
