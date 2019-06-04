package sample;

import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.stage.FileChooser;

import javax.swing.*;


public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton chooseIKV;

    @FXML
    private Button simpleFileChooseButton;

    @FXML
    private ListView listWiew;

    public void chooseBtnAction(ActionEvent event){
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);

        if(selectedFile != null){
            listWiew.getItems().add(selectedFile.getName());
        } else {
            System.out.printf("file is bad");
        }
    }

    @FXML
    void initialize() {

    }
}
