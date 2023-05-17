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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Kananelo Tseisa
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private ImageView imageView;
    @FXML
    private Button loginbtn;

    @FXML
    private Button registerbtn;
    
    @FXML
    private AnchorPane screen;
    
    Stage stage;
    Parent root;
    @FXML
    void register(ActionEvent event) throws IOException {
     stage=(Stage) registerbtn.getScene() .getWindow();
     stage.close();
     stage = new Stage();
     root= FXMLLoader.load(getClass().getResource("register.fxml"));
     stage.setScene(new Scene(root));
     stage.show();
    }
    
    @FXML
    void login(ActionEvent event) throws IOException {
        stage=(Stage) loginbtn.getScene().getWindow();
        stage.close();
        stage = new Stage();
        root= FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      //  Image image = new Image("images/welcomecover.jpg",false);
     //   ImageView imageView = new ImageView();
      //  imageView.setImage(image);
    }    
    
}
