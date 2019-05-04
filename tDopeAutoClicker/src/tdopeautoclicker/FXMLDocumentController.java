/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdopeautoclicker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import static javafx.fxml.FXMLLoader.load;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jonathan
 */
public class FXMLDocumentController implements Initializable {
    
    //get the root of the window
    @FXML
    VBox rootPane;

    @FXML
    public void handleSimpleAutoClickerClicked(ActionEvent event){      
        try{
        Pane pane = FXMLLoader.load(getClass().getResource("SimpleClicker.fxml"));
        rootPane.getChildren().setAll(pane);
    
        } catch (IOException e ){
        e.printStackTrace();
        }
    }
    
    @FXML
    public void handleDoubleClickerClicked(ActionEvent event){        
        try{
        Pane pane = FXMLLoader.load(getClass().getResource("DoubleClicker.fxml"));
        rootPane.getChildren().setAll(pane);
    
        } catch (IOException e ){
        e.printStackTrace();
        }
    }
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
}
