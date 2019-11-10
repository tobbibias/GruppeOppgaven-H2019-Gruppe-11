package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.ArrayList;

public class Athlete extends User {

    public Athlete(String username, String password, String firstName, String surName, String email) {
        super(username, password, firstName, surName, email);
    }
    private SportsClub sportsClub;
    private ArrayList<Events> registeredEvents = new ArrayList<Events>();

    public SportsClub getSportsClub() {
        return sportsClub;
    }

    public void setSportsClub(SportsClub sportsClub) {
        this.sportsClub = sportsClub;
    }
    public void leaveTeam(){
        this.sportsClub = null;
    }

    @Override
    public String toString() {
       return super.toString();
    }

    public ArrayList<Events> getRegisteredEvents() {
        return registeredEvents;
    }

    public void addEvent(Events e){
       if(!this.registeredEvents.contains(e)){
           registeredEvents.add(e);
       }
    }

    public void removeEvent(Events selectedEvent) {
        if (registeredEvents.contains(selectedEvent)){
            registeredEvents.remove(selectedEvent);
        }
    }
}
