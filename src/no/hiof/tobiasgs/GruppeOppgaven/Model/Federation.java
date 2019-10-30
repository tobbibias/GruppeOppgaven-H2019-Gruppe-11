package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.ArrayList;

public class Federation extends Organization{

    private FederationEmployee federationLeader;
    private ArrayList<SportsClub> teamsInFederation = new ArrayList<SportsClub>();
    private ArrayList<Events> upCommingEvents = new ArrayList<Events>();
    private ArrayList<Events> formerEvents = new ArrayList<Events>();

    public Federation(String organizationName, String email, String postal, String zipcode) {
        super(organizationName, email, postal, zipcode);
    }

    public FederationEmployee getFederationLeader() {
        return federationLeader;
    }

    public void setFederationLeader(FederationEmployee federationLeader) {
        this.federationLeader = federationLeader;
    }

    public ArrayList<SportsClub> getTeamsInFederation() {
        return teamsInFederation;
    }

    public void setTeamsInFederation(ArrayList<SportsClub> teamsInFederation) {
        this.teamsInFederation = teamsInFederation;
    }

    public ArrayList<Events> getUpCommingEvents() {
        return upCommingEvents;
    }

    public void setUpCommingEvents(ArrayList<Events> upCommingEvents) {
        this.upCommingEvents = upCommingEvents;
    }

    public ArrayList<Events> getFormerEvents() {
        return formerEvents;
    }

    public void setFormerEvents(ArrayList<Events> formerEvents) {
        this.formerEvents = formerEvents;
    }


}
