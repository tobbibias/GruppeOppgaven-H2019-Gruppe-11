package no.hiof.tobiasgs.GruppeOppgaven.Controller;

import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import no.hiof.tobiasgs.GruppeOppgaven.MainJavaFx;

public class MainController {

    @FXML
    private Button loginBtn;
    private ObservableList<String> options;


    public void initialize(){
        // setting up the buttons to change to their respective views
       loginBtn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
                MainJavaFx.getMinapp().openAthleteView();
           }
       });
    }






}
