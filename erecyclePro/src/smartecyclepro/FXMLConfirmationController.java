/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartecyclepro;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author aditi
 */
public class FXMLConfirmationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    String uid;
    String dateTime1;
    String udate;
    String utime;
    @FXML
    private Label lblPickupSchedule;
    @FXML
    private Label lblConfirmationNumber;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getDbConnection();
        Statement stm = null;
        stm = con.createStatement();
        ResultSet rs = stm.executeQuery("SELECT uid,udate,utime FROM userdetails");
        while (rs.next()) {
           uid = rs.getString(1);
           udate = rs.getString(2);
           utime = rs.getString(3);

        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        dateTime1 = udate +" "+utime;
        lblPickupSchedule.setText(dateTime1);
        lblConfirmationNumber.setText(uid);
    }

   /* @FXML
    void setLableText(Integer userId, String dateTime3) {
        uid = userId.toString();
        dateTime1 = dateTime3;
        System.out.println(uid + " " + dateTime1);
        lblPickupSchedule.setText(dateTime1);
        lblConfirmationNumber.setText(uid);
        System.out.println("test:" + uid + " " + dateTime1);
    }*/

}
