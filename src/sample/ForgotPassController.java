package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ForgotPassController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane ів;

    @FXML
    private TextField fgPassLoginField;

    @FXML
    private TextField fgPassLastestPassField;

    @FXML
    private Button fgPassRenewBtn;

    @FXML
    private TextField fgPassYourLnameField;

    @FXML
    private Button fgPassLoginBtn;

    @FXML
    void initialize() {
        assert ів != null : "fx:id=\"ів\" was not injected: check your FXML file 'Untitled'.";
        assert fgPassLoginField != null : "fx:id=\"fgPassLoginField\" was not injected: check your FXML file 'Untitled'.";
        assert fgPassLastestPassField != null : "fx:id=\"fgPassLastestPassField\" was not injected: check your FXML file 'Untitled'.";
        assert fgPassRenewBtn != null : "fx:id=\"fgPassRenewBtn\" was not injected: check your FXML file 'Untitled'.";
        assert fgPassYourLnameField != null : "fx:id=\"fgPassYourLnameField\" was not injected: check your FXML file 'Untitled'.";
        assert fgPassLoginBtn != null : "fx:id=\"fgPassLoginBtn\" was not injected: check your FXML file 'Untitled'.";

    }
}
