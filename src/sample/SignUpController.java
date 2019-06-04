package sample;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpLogin;

    @FXML
    private TextField signUpPassword;

    @FXML
    private Button authSignUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpSurname;

    @FXML
    void initialize() {

        authSignUpButton.setOnAction(event -> {

            signUpNewUser();

        });

    }

    private void signUpNewUser() {

        DataBaseHandler dbHandler = new DataBaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpSurname.getText();
        String login = signUpLogin.getText();
        String password = signUpPassword.getText();
        String male = null;

        User user = new User(firstName, lastName, login, password, null);

        try {
            dbHandler.signUpUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
