/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehakoe.savings.and.credit;

import java.awt.event.MouseEvent;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kananelo Tseisa
 */
public class DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */

        @FXML
    private ImageView addcard;

    @FXML
    private AnchorPane currentcard;

    @FXML
    private AnchorPane savingscard;

    @FXML
    private AnchorPane chequecard;

    @FXML
    private AnchorPane loancard;

    @FXML
    private Button depositbtn;

    @FXML
    private Button withdrawbtn;

    @FXML
    private Button balancebtn;
    
    @FXML
    private Button quitbtn;

    @FXML
    Stage stage;
    
    @FXML
    Parent root;
    @FXML
    void balance(ActionEvent event) {

    }
    
    @FXML
    void deposit(ActionEvent event) throws IOException {
     stage=(Stage) depositbtn.getScene() .getWindow();
     stage.close();
     stage = new Stage();
     root= FXMLLoader.load(getClass().getResource("Deposit.fxml"));
     stage.setScene(new Scene(root));
     stage.show();
    }
    @FXML
    void withdraw(ActionEvent event) throws IOException {
     stage=(Stage) withdrawbtn.getScene() .getWindow();
     stage.close();
     stage = new Stage();
     root= FXMLLoader.load(getClass().getResource("Deposit.fxml"));
     stage.setScene(new Scene(root));
     stage.show();
    }
    
   @FXML
    void close(ActionEvent event) throws IOException {
     stage=(Stage) withdrawbtn.getScene() .getWindow();
     stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
