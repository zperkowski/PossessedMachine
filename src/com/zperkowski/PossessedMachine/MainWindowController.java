package com.zperkowski.PossessedMachine;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainWindowController {

    @FXML
    private Label infoLabel;
    @FXML
    private TextField textField_IP_static;
    @FXML
    private TableView tableView_IP;
    @FXML
    private TableColumn tableColumn_IP_name;
    @FXML
    private TableColumn tableColumn_IP_IP;
    @FXML
    private CheckBox checkBox_autostart;
    @FXML
    private CheckBox checkBox_autoconnect;

    @FXML
    private void initialize() {
        adjustColumnsWidth();
    }

    /**
     * Sets column width by using 50% of the window with for each column.
     */
    private void adjustColumnsWidth() {
        tableColumn_IP_IP.prefWidthProperty().bind(tableView_IP.widthProperty().divide(2));
        tableColumn_IP_name.prefWidthProperty().bind(tableView_IP.widthProperty().divide(2));
    }

    @FXML
    private void menuBar_File_Close_Clicked() {

    }

    @FXML
    private void menuBar_Help_Help_Clicked() {

    }

    @FXML
    private void menuBar_Help_About_Clicked() {

    }

    @FXML
    private void button_scanNetwork_clicked() {

    }

    @FXML
    private void button_connect_clicked() {

    }

    @FXML
    private void button_monitorPosition_clicked() {

    }

    @FXML
    private void checkBox_autostart_clicked() {

    }

    @FXML
    private void checkBox_autoconnect_clicked() {

    }
}
