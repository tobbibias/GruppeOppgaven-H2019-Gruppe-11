package no.hiof.tobiasgs.GruppeOppgaven.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import no.hiof.tobiasgs.GruppeOppgaven.Data.Datahandler;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Athlete;


public class MainAthleteController {

    @FXML
    private Button teambtn,memberBtn,resultbtn,leaveTeamBtn,joinTeambtn,registerbtn1,profileBtn,logoutBtn;
    @FXML
    private ListView teamListView,eventListView;

    private Datahandler d;


    public void initialize(){
        Athlete testUser = new Athlete("Jonathan","Password","Jonathan","Smith","jon@email.com");
        d.addUser(testUser);

        loadUser(testUser);
    }

    private void loadUser(Athlete testUser) {

    }


}
