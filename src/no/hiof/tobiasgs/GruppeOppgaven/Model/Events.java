package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Events {
    private Federation host;
    private String location, eventName, description;
    private Date date;
    private ArrayList<Athlete> participants = new ArrayList<Athlete>();
    private ArrayList<Result> results = new ArrayList<Result>();

    public Events() {
    }

    public Events(Federation host, String location, String eventName, String description, Date date) {
        this.host = host;
        this.location = location;
        this.eventName = eventName;
        this.description = description;
        this.date = date;
    }

    public void addParticipant(Athlete a){
            if (this.date.compareTo(new Date()) > 0){
                participants.add(a);
            }
    }

    public void addMultipleParticipants(ArrayList<Athlete> athletes){
        for (Athlete n:athletes
             ) {
            if (this.date.compareTo(new Date()) > 0){
                participants.add(n);
            }
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

    public ArrayList<Result> getResults() {
        return results;
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

        public int getAthleteID() {
            return athleteID;
        }

        public int getPlacement() {
            return Placement;
        }

        public Time getTime() {
            return time;
        }
    }

    @Override
    public String toString() {
        return eventName + " Hosted by: " + host.getOrganizationName() + " in: " + location;
    }
}
