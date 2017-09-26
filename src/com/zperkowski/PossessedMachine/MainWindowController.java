package com.zperkowski.PossessedMachine;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Locale;

public class MainWindowController {

    @FXML
    private Menu menu_file;
    @FXML
    private MenuItem menu_file_close;
    @FXML
    private Menu menu_language;
    @FXML
    private RadioMenuItem menu_language_english;
    @FXML
    private RadioMenuItem menu_language_polish;
    @FXML
    private Menu menu_help;
    @FXML
    private MenuItem menu_help_help;
    @FXML
    private MenuItem menu_help_about;
    @FXML
    private TextField textField_IP_static;
    @FXML
    private TableView tableView_IP;
    @FXML
    private TableColumn tableColumn_IP_name;
    @FXML
    private TableColumn tableColumn_IP_IP;
    @FXML
    private Button button_scanNetwork;
    @FXML
    private Button button_connect;
    @FXML
    private Button button_monitorPosition;
    @FXML
    private CheckBox checkBox_autostart;
    @FXML
    private CheckBox checkBox_autoconnect;
    @FXML
    private Label infoLabel;

    @FXML
    private void initialize() {
        bindLanguage();
        adjustColumnsWidth();
    }

    /**
     * Changes language to users choice.
     */
    private void bindLanguage() {
        menu_file.textProperty().bind(LanguageChanger.createStringBinding("file"));
        menu_file_close.textProperty().bind(LanguageChanger.createStringBinding("close"));
        menu_language.textProperty().bind(LanguageChanger.createStringBinding("language"));
        menu_language_english.textProperty().bind(LanguageChanger.createStringBinding("english"));
        menu_language_polish.textProperty().bind(LanguageChanger.createStringBinding("polish"));
        menu_help.textProperty().bind(LanguageChanger.createStringBinding("help"));
        menu_help_help.textProperty().bind(LanguageChanger.createStringBinding("help"));
        menu_help_about.textProperty().bind(LanguageChanger.createStringBinding("about"));
        textField_IP_static.tooltipProperty().set(LanguageChanger.tooltipForKey("ip_address"));
        tableColumn_IP_name.textProperty().bind(LanguageChanger.createStringBinding("ip_name"));
        tableColumn_IP_IP.textProperty().bind(LanguageChanger.createStringBinding("ip_address"));
        button_scanNetwork.textProperty().bind(LanguageChanger.createStringBinding("scan"));
        button_connect.textProperty().bind(LanguageChanger.createStringBinding("connect"));
        button_monitorPosition.textProperty().bind(LanguageChanger.createStringBinding("monitor_position"));
        checkBox_autostart.textProperty().bind(LanguageChanger.createStringBinding("autostart"));
        checkBox_autoconnect.textProperty().bind(LanguageChanger.createStringBinding("autoconnect"));
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
        About.display();
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

    @FXML
    private void radioMenu_english_selected() {
        switchLanguage(LanguageChanger.ENGLISH);
    }

    @FXML
    private void radioMenu_polish_selected() {
        switchLanguage(LanguageChanger.POLISH);
    }

    private void switchLanguage(Locale locale) {
        LanguageChanger.setLocale(locale);
    }
}
