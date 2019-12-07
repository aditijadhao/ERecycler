/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartecyclepro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author aditi
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button btnGetStart;

    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        System.out.println("You clicked me!");
         AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLBrands.fxml"));
        rootPane.getChildren().setAll(pane);
    /*  BrandNames brandName = new BrandNames();
        Stage stage = new Stage();*/
        //SmartecyclePro sm = new SmartecyclePro();
        //sm.close(stage);
      /* brandName.start(stage);
        stage.show();*/
    //  Main.set_pane(1);
        

    }
    @FXML
  /*  private void loadSecond(ActionEvent event) throws IOException{
       
    }*/

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
