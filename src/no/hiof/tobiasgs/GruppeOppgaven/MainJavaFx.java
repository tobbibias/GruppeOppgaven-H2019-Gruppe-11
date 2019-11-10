package no.hiof.tobiasgs.GruppeOppgaven;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;


public class MainJavaFx extends Application {
    private  Stage primaryStage;
    private static MainJavaFx minapp;

    @Override
    public void start(Stage stage) throws Exception{
        this.primaryStage = stage;
        this.openMainView();
        minapp = this;
    }

    public void openMainView() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("View/MainView.fxml"));
            Parent root = fxmlLoader.load();
            Scene mainScene = new Scene(root);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Login Screen");
            primaryStage.show();
        }catch (IOException ioex){
            System.out.println(ioex.getMessage());
        }
    }
    public void openAthleteView(){
    try{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("View/MainAthleteView.fxml"));
        Parent root = fxmlLoader.load();
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Athlete profile");
        primaryStage.show();
    }catch (IOException ioex){
        System.out.println(ioex.getMessage());
    }

    }

    public static MainJavaFx getMinapp() {
        return minapp;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void CloseView() {
        primaryStage.close();
        openMainView();
    }
}
