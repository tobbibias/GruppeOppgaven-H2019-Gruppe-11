package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Events {
    private Federation host;
    private String location, eventName, description;
    private Date date;
    private ArrayList<Athlete> participants;
    private ArrayList<Result> results;

    public Events(Federation host, String location, String eventName, String description, Date date) {
        this.host = host;
        this.location = location;
        this.eventName = eventName;
        this.description = description;
        this.date = date;
    }

    public void addParticipant(Athlete a){
        if(this.date.getSeconds() > (System.currentTimeMillis() / 60)){
            participants.add(a);
        }
    }

    public void addMultipleParticipants(ArrayList<Athlete> athletes){
        if(this.date.getSeconds() > (System.currentTimeMillis() / 60)){
            participants.addAll(athletes);
        }
    }

    public ArrayList<Athlete> getParticipants(){
        return participants;
    }

    public void addResults(Athlete a, int p){
        if (participants.contains(a)){
            results.add(new Result(a.getUserCode(),p));
        }
    }

    public Federation getHost() {
        return host;
    }

    public String getLocation() {
        return location;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public class Result{

        private int athleteID;
        private int Placement;
        private Time time;

        public Result(int athleteID, int placement) {
            this.athleteID = athleteID;
            Placement = placement;
        }
        public Result(int athleteID, int placement, Time time) {
            this.athleteID = athleteID;
            Placement = placement;
            this.time = time;
        }
    }

}
