package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.ArrayList;

public class Federation extends Organization{

    public Federation(String organizationName, String email, String postal, String zipcode) {
        super(organizationName, email, postal, zipcode);
    }

    private FederationEmployee federationLeader;
    private ArrayList<SportsClub> teamsInFederation = new ArrayList<SportsClub>();
    private ArrayList<Events> upCommingEvents = new ArrayList<Events>();
    private ArrayList<Events> formerEvents = new ArrayList<Events>();



}
