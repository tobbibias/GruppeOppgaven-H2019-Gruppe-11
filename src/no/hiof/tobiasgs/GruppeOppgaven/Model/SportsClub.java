package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SportsClub extends Organization{
    private String teamCode;
    private final static AtomicInteger count = new AtomicInteger(0);
    private Teamleader manager;
    private Federation federation;
    private Athlete teamCaptain;
    private ArrayList<Athlete> members = new ArrayList<Athlete>();
    private ArrayList<Events> upCommingEvents = new ArrayList<Events>();
    private ArrayList<Events> participatedEvents = new ArrayList<Events>();

    public SportsClub(String organizationName, String email, String postal, String zipcode, Teamleader manager, Federation federation) {
        super(organizationName, email, postal, zipcode);
        this.manager = manager;
        this.federation = federation;
        this.teamCode = "T" +String.valueOf(count.incrementAndGet());
    }

    public String getTeamCode() {
        return teamCode;
    }

    public Teamleader getManager() {
        return manager;
    }

    public Federation getFederation() {
        return federation;
    }

    public Athlete getTeamCaptain() {
        return teamCaptain;
    }

    public ArrayList<Events> getParticipatedEvents() {
        return participatedEvents;
    }
}
