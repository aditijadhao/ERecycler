package smartecyclepro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author aditi
 */
public class Main extends Application {

    static AnchorPane root;
    private static int idx_cur = 0;
    static List<GridPane> grid = new ArrayList<GridPane>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLMain.fxml"));
        grid.add((GridPane)FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
        grid.add((GridPane)FXMLLoader.load(getClass().getResource("FXMLBrands.fxml")));
        grid.add((GridPane)FXMLLoader.load(getClass().getResource("FXMLDetails.fxml")));
        grid.add((GridPane)FXMLLoader.load(getClass().getResource("FXMLConfirmation.fxml")));
        root.getChildren().add(grid.get(0));
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Smart Recycle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void init_app(){
        for(int i=0;i<grid.size();i++){
            
        }
    }
    public static GridPane get_pane(int idx){
        return grid.get(idx);
    }
    public static void set_pane(int idx){
        root.getChildren().remove(grid.get(idx));
        root.getChildren().add(grid.get(idx));
        idx_cur = idx;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
