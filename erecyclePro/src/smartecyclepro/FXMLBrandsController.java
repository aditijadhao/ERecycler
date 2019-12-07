/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartecyclepro;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aditi
 */
public class FXMLBrandsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    String brandName = null;
    @FXML
    private AnchorPane brandsPane;
    @FXML
    private Button btnApple;
    @FXML
    private Button btnHP;
    @FXML
    private Button btnDell;
    @FXML
    private Button btnMicrosoft;
    @FXML
    private Button btnSamsung;
    @FXML
    private Button btnPhillips;
    @FXML
    private Button btnNikon;
    @FXML
    private Button btnSony;
    @FXML
    private Button btnCanon;
    @FXML
    private Button btnIntel;

    @FXML
    private void handleBtnAppleAction(ActionEvent event) throws Exception {
        brandName = "Apple";
        try {
            /*  FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();
            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnHPAction(ActionEvent event) throws Exception {
        brandName = "HP";
        try {
            /* FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnDellAction(ActionEvent event) throws Exception {
        brandName = "Dell";
        try {
            /* FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnMicrosoftAction(ActionEvent event) throws Exception {
        brandName = "Microsoft";
        try {
            /*  FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnSamsungAction(ActionEvent event) throws Exception {
        brandName = "Samsung";
        try {
            /* FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnPhillipsAction(ActionEvent event) throws Exception {
        brandName = "Phillips";
        try {
            /* FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnNikonAction(ActionEvent event) throws Exception {
        brandName = "Nikon";
        try {
            /* FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnSonyAction(ActionEvent event) throws Exception {
        brandName = "Sony";
        try {
            /* FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnCanonAction(ActionEvent event) throws Exception {
        brandName = "Canon";
        try {
            /* FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBtnIntelAction(ActionEvent event) throws Exception {
        brandName = "Intel";
        try {
            /*FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDetails.fxml"));
            Parent root = (Parent) loader.load();

            FXMLDetailsController details=loader.getController();
            details.setLableText(brandName);

            Stage stage=new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadDetails(ActionEvent event) throws IOException {
        //  System.out.println("You clicked me!");
        BrandSession.getInstance(brandName);
        try {
            Connection con = null;
            DatabaseConnection db = new DatabaseConnection();
            con = db.getDbConnection();
            PreparedStatement pst = null;
            pst = con.prepareStatement("INSERT INTO brand(brandname) VALUES(?)");
            pst.setString(1, brandName);
            pst.executeUpdate();
            AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLDetails.fxml"));
            brandsPane.getChildren().setAll(pane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        AnchorPane parentanchorpane;
    }

}
