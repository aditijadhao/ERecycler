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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aditi
 */
public class FXMLDetailsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //public String brandName = null;
    ObservableList<String> year = FXCollections.observableArrayList("2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006");
    ObservableList<String> condition = FXCollections.observableArrayList("Fairly Used", "Good", "Excellent");
    Integer productId = 0;
    @FXML
    private Label lblBrandName;
    @FXML
    private ChoiceBox choiceCategory;
    @FXML
    private TextField txtProductName;
    @FXML
    private ChoiceBox choiceYear;
    @FXML
    private ChoiceBox choiceCondition;
    @FXML
    private Label lblEstimate;
    @FXML
    private AnchorPane detailsPane;
    @FXML
    private Button btnEstimate;
    @FXML
    private Button btnContinue;

    /* public void setValue(String brandName1) {
        brandName = brandName1;
        //lblBrandName.setText(this.brandName);
        System.out.println(brandName+"2");
    }*/
    public void setLableText() {

    }

    @FXML
    private void handlingEstimateValueBtn(ActionEvent event) throws Exception {
        String brandName1 = lblBrandName.getText();
        String category1 = (String) choiceCategory.getSelectionModel().getSelectedItem();
        String year1 = (String) choiceYear.getSelectionModel().getSelectedItem();
        String condition1 = (String) choiceCondition.getSelectionModel().getSelectedItem();
        String productName = txtProductName.getText();
        System.out.println(brandName1 + " " + category1 + " " + year1 + " " + condition1 + " " + productName);
        if (brandName1.equalsIgnoreCase("apple")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("HP")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("Dell")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("Microsoft")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("samsung")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("philips")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Camera")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("Nikon")) {
            if (category1.equalsIgnoreCase("Camera")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("Sony")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Camera")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("Canon")) {
            if (category1.equalsIgnoreCase("Camera")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
        if (brandName1.equalsIgnoreCase("Intel")) {
            if (category1.equalsIgnoreCase("mobile")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 50;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 10;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 20;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 30;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 5;
                    lblEstimate.setText(price.toString() + "$");
                }
            } else if (category1.equalsIgnoreCase("Laptop")) {
                Integer year2 = Integer.parseInt(year1);
                if (year2 >= 2018) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 100;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 120;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 140;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2018 && year2 >= 2016) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 80;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 90;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else if (year2 < 2016 && year2 >= 2014) {
                    if (condition1.equalsIgnoreCase("Fairly Used")) {
                        Integer price = 40;
                        lblEstimate.setText(price.toString() + "$");
                    } else if (condition1.equalsIgnoreCase("Good")) {
                        Integer price = 60;
                        lblEstimate.setText(price.toString() + "$");
                    } else {
                        Integer price = 70;
                        lblEstimate.setText(price.toString() + "$");
                    }
                } else {
                    Integer price = 25;
                    lblEstimate.setText(price.toString() + "$");
                }
            }
        }
    }

    @FXML
    private void handlingContinueBtn(ActionEvent event) throws Exception {
        Connection con = null;
        DatabaseConnection db = new DatabaseConnection();
        String brandName1 = lblBrandName.getText();
        String category1 = (String) choiceCategory.getSelectionModel().getSelectedItem();
        String year1 = (String) choiceYear.getSelectionModel().getSelectedItem();
        String condition1 = (String) choiceCondition.getSelectionModel().getSelectedItem();
        String productName = txtProductName.getText();
        String estimatePrice = lblEstimate.getText();
        try {
            con = db.getDbConnection();
            PreparedStatement pst = null;
            pst = con.prepareStatement("INSERT INTO product(brand,productname,myear,pcondition,eprice) VALUES(?,?,?,?,?)");
            pst.setString(1, brandName1);
            pst.setString(2, productName);
            pst.setString(3, year1);
            pst.setString(4, condition1);
            pst.setString(5, estimatePrice);
            pst.executeUpdate();
            Statement stm = null;
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT pid FROM product");
            while (rs.next()) {
                productId = rs.getInt(1);

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
    private void loadDetails(ActionEvent event) throws IOException {
        //  System.out.println("You clicked me!");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLPickup.fxml"));
        detailsPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        /*   BrandValues bv = new BrandValues();
        String brandName1 = bv.getBrandName();
        lblBrandName.setText(brandName1);
        System.out.print(brandName1 + "3");*/
        String brandName = null;
        try {
            Connection con = null;
            DatabaseConnection db = new DatabaseConnection();
            con = db.getDbConnection();
            Statement stm = null;
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT brandname FROM brand");
            while (rs.next()) {
                brandName = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        lblBrandName.setText(brandName);
        choiceCategory.setValue("Select");
        if (brandName.equalsIgnoreCase("Apple")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("hp")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("Dell")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("Microsoft")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("Samsung")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("phillips")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop", "Camera");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("Nikon")) {
            ObservableList<String> category = FXCollections.observableArrayList("Camera");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("Sony")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop", "Camera");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("Canon")) {
            ObservableList<String> category = FXCollections.observableArrayList("Camera");
            choiceCategory.setItems(category);
        }
        if (brandName.equalsIgnoreCase("Intel")) {
            ObservableList<String> category = FXCollections.observableArrayList("Mobile", "Laptop");
            choiceCategory.setItems(category);
        }
        choiceYear.setValue("Select");
        choiceYear.setItems(year);
        choiceCondition.setValue("Select");
        choiceCondition.setItems(condition);
    }

}
