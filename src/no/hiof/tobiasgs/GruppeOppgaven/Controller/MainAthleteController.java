package no.hiof.tobiasgs.GruppeOppgaven.Controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import no.hiof.tobiasgs.GruppeOppgaven.Data.Datahandler;
import no.hiof.tobiasgs.GruppeOppgaven.Data.EventDatahandler;
import no.hiof.tobiasgs.GruppeOppgaven.Data.FederationDatahandler;
import no.hiof.tobiasgs.GruppeOppgaven.Data.SportsclubDataHandler;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Athlete;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Events;
import no.hiof.tobiasgs.GruppeOppgaven.Model.SportsClub;

import java.util.Date;


public class MainAthleteController {

    @FXML
    private Button teambtn,memberBtn,leaveTeamBtn,joinTeambtn,registerbtn1,profileBtn,logoutBtn,yourEventBtn,allEventsBtn,resultbtn;
    @FXML
    private ListView teamListView,eventListView;

    private Datahandler d_Athletes;
    private EventDatahandler d_Events;
    private SportsclubDataHandler d_Sportsclub;
    private ObservableList<Events> events = FXCollections.observableArrayList();
    private ObservableList<SportsClub> sportsClubs = FXCollections.observableArrayList();
    private Athlete testUser = d_Athletes.getUserArrayList().get(0);

    private SportsClub selectedTeam;
    private ObservableList<Athlete> athletesInSelectedTeam = FXCollections.observableArrayList();
    private ObservableList<Events> registeredEvents = FXCollections.observableArrayList();
    private ObservableList<Events.Result> results = FXCollections.observableArrayList();
    private Events selectedEvent;

    public void initialize(){
        sportsClubs.addAll(d_Sportsclub.getSportsClubArrayList());
        events.addAll(d_Events.getEventsArrayList());

       updateTeamView();
       updateEventView();

       // setts the function on the buttons.
       teambtn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               teamListView.setItems(sportsClubs);
           }
       });
       memberBtn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               viewMembers();
           }
       });
       joinTeambtn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
                if(!selectedTeam.getMembers().contains(testUser) && testUser.getSportsClub() == null){
                    selectedTeam.addMember(testUser);
                    testUser.setSportsClub(selectedTeam);
                    // alert the user that he has joined the team
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("You have joined " + selectedTeam.getOrganizationName());
                    alert.show();

                }else {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You can't join this team! You are already in a team!");
                    alert.show();

                }
           }
       });
       leaveTeamBtn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               if (testUser.getSportsClub() != null){
                   testUser.getSportsClub().removeMember(testUser);
                   testUser.leaveTeam();
                   Alert alert = new Alert(Alert.AlertType.INFORMATION);
                   alert.setContentText("You have left " + selectedTeam.getOrganizationName());
                   alert.show();

               }else {
                   Alert alert = new Alert(Alert.AlertType.WARNING);
                   alert.setTitle("Warning");
                   alert.setContentText("You dont have a team to leave");
                   alert.show();

               }
           }
       });
       yourEventBtn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
                registeredEvents.removeAll(registeredEvents);
                registeredEvents.addAll(testUser.getRegisteredEvents());
                eventListView.setItems(registeredEvents);
           }
       });
       allEventsBtn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               eventListView.setItems(events);
           }
       });
       registerbtn1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
               if (!selectedEvent.getParticipants().contains(testUser)){
                   selectedEvent.addParticipant(testUser);
                   testUser.addEvent(selectedEvent);
               }
           }
       });
        resultbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                results.removeAll(results);
                results.addAll(selectedEvent.getResults());
                eventListView.setItems(results);
            }
        });
    }

    private void viewMembers() {
        // removes the members so that the list is clean and ready to take in a new team rooster.
        athletesInSelectedTeam.removeAll(athletesInSelectedTeam);
        // fills the list wiht the new rooster.
        athletesInSelectedTeam.addAll(selectedTeam.getMembers());
        // sets the listview.
        teamListView.setItems(athletesInSelectedTeam);
    }

    private void updateEventView() {
        eventListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                if (t1.getClass().isInstance(new Events())) {
                    selectedEvent = (Events) eventListView.getSelectionModel().getSelectedItem();
                }
            }
        });
        eventListView.setItems(events);
    }

    private void updateTeamView() {
        teamListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                if (t1.getClass().isInstance(new SportsClub())) {
                    selectedTeam = (SportsClub) teamListView.getSelectionModel().getSelectedItem();
                }
            }

        });
        teamListView.setItems(sportsClubs);
    }




}
