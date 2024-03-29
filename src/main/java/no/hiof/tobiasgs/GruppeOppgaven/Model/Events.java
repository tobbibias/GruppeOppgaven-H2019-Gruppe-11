package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.sql.Time;
import java.time.LocalDate;
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
            if (this.date.compareTo(new Date(LocalDate.now().getYear(),LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth())) > 0){
                participants.add(a);
            }
    }

    public void addMultipleParticipants(ArrayList<Athlete> athletes){
        for (Athlete n:athletes) {
            addParticipant(n);
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

    public void removeParticipant(Athlete testUser) {
        if (participants.contains(testUser)){
            participants.remove(testUser);
        }
    }


    public class Result{

        private int athleteID;
        private int placement;
        private Time time;

        public Result(int athleteID, int placement) {
            this.athleteID = athleteID;
            this.placement = placement;
        }


        public int getAthleteID() {
            return athleteID;
        }

        public int getPlacement() {
            return placement;
        }

        public Time getTime() {
            return time;
        }

        @Override
        public String toString() {
            return
                    "athleteID=" + athleteID + ", Placement=" + placement;
        }
    }

    @Override
    public String toString() {
        return eventName + " Hosted by: " + host.getOrganizationName() + " in: " + location;
    }
}
