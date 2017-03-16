package javafxreix;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class FXMLController implements Initializable {
    List<String> userList = new ArrayList<>();
    @FXML
    private AnchorPane myAnchorPane;
    
    @FXML
    TextField elefSU,elefield,elef;
       
    @FXML
    Button bt,gobt;

    @FXML
    private List<String> go(ActionEvent event) {
        String data = elef.getText()+elefSU.getText()+elefield.getText();
        userList.add(elef.getText());
        userList.add(elefSU.getText());
        userList.add(elefield.getText());
        System.out.println("Datos@elef : \n"+elef.getText() +"\n" +elefSU.getText()+"\n"+elefield.getText());
        System.out.println("Datos ligados : " +data);
        return userList;
    }

    @FXML
    private void close(ActionEvent event) {
        System.out.println("Cierrar la aplicacion.");
        Stage stage = (Stage) myAnchorPane.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
