package tdopeautoclicker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Jonathan
 */
public class SimpleClickerController implements Initializable {
    

    @FXML
    public Button close;
    @FXML
    public TextField delay = new TextField();
    int msDelay;
    Click click = new Click(msDelay);

    @FXML
    public void handleAutoClickerStart(ActionEvent event) {
       msDelay = Integer.parseInt(delay.getText());
       /*
        Thread t1 = new Thread(new Click(lengthOfDelay));
        t1.start();
    */
       click.startClicker(msDelay);


    }
    
    @FXML
    public void handleAutoClickerStop(ActionEvent event){
    click.stopClicker();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }

    
}
