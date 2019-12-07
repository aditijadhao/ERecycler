/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartecyclepro;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aditi
 */
public class FXMLPickupController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Integer userId;
    Integer pid;
    @FXML
    private Label lblProductID;
    @FXML
    private TextField txtFName;
    @FXML
    private TextField txtLName;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtZipCode;
    @FXML
    private JFXDatePicker datePickerAct;
    @FXML
    private JFXTimePicker timePickerAct;
    @FXML
    private AnchorPane pickupPane;
    @FXML
    private Button btnDone;

    @FXML
    private void handlingDoneBtn(ActionEvent event) throws Exception {
        Integer productId = 0;
        Connection con = null;
        DatabaseConnection db = new DatabaseConnection();
        String txtFirstName1 = txtFName.getText();
        String txtLastName1 = txtFName.getText();
        String txtAddress1 = txtAddress.getText();
        String txtCity1 = txtCity.getText();
        String txtZipCode1 = txtZipCode.getText();
        String productID2 = lblProductID.getText();
        pid = Integer.parseInt(productID2);
        String datePickerAct1 = (datePickerAct.getValue()!=null ? datePickerAct.getValue().toString():"");
        if(datePickerAct1.equals("")){
           System.out.println("Please select date");
        }
        String timePickerAct1 = (timePickerAct.getValue()!=null?timePickerAct.getValue().toString():"");
        if(timePickerAct1.equals("")){
            System.out.println("Please select time");
        }
        try {
            //Integer pid = Integer.parseInt(productId);
            con = db.getDbConnection();
            PreparedStatement pst = null;
            pst = con.prepareStatement("INSERT INTO userdetails(pid,fname,lname,address,city,zipcode,udate,utime) VALUES(?,?,?,?,?,?,?,?)");
            pst.setInt(1, pid);
            pst.setString(2, txtFirstName1);
            pst.setString(3, txtLastName1);
            pst.setString(4, txtAddress1);
            pst.setString(5, txtCity1);
            pst.setString(6, txtZipCode1);
            pst.setString(7, datePickerAct1);
            pst.setString(8, timePickerAct1);
            pst.executeUpdate();
            Statement stm = null;
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT uid FROM userdetails");
            while (rs.next()) {
                userId = rs.getInt(1);

            }
            System.out.println(productId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            loadDetails(event);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      try{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getDbConnection();
        Statement stm = null;
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT pid FROM product");
            while (rs.next()) {
                pid = rs.getInt(1);

            }
            PreparedStatement pst = con.prepareStatement("delete from brand");
            pst.executeUpdate();
      }
      catch(Exception e){
          e.printStackTrace();
      }
        System.out.print("pid ="+pid);
        lblProductID.setText(pid.toString());
        // TODO
    }

     @FXML
    private void loadDetails(ActionEvent event) throws IOException {
        //  System.out.println("You clicked me!");
      
            AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLConfirmation.fxml"));
            pickupPane.getChildren().setAll(pane);
        
    }

}
