/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehakoe.savings.and.credit;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kananelo Tseisa
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
            @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginbtn;

    @FXML
    private Button backbtn;

    @FXML
    Parent root;
    Stage stage;
    @FXML
    void back(ActionEvent event) throws IOException {
     stage=(Stage) backbtn.getScene() .getWindow();
     stage.close();
     stage = new Stage();
     root= FXMLLoader.load(getClass().getResource("Welcome.fxml"));
     stage.setScene(new Scene(root));
     stage.show();
    }

    @FXML
    void login(ActionEvent event) throws IOException {
     stage=(Stage) loginbtn.getScene() .getWindow();
     stage.close();
     stage = new Stage();
     root= FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
     stage.setScene(new Scene(root));
     stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
