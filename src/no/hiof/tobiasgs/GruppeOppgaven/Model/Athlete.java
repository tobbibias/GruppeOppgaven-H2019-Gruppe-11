package no.hiof.tobiasgs.GruppeOppgaven.Model;

public class Athlete extends User {

    public Athlete(String username, String password, String firstName, String surName, String email) {
        super(username, password, firstName, surName, email);
    }
    SportsClub sportsClub;

    public SportsClub getSportsClub() {
        return sportsClub;
    }

    public void setSportsClub(SportsClub sportsClub) {
        this.sportsClub = sportsClub;
    }
}
