package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.ArrayList;

public class Organization {

    public String organizationName, email, postal,zipcode;
    public int organizationNr;
    public ArrayList<User> ansatte = new ArrayList<User>();

}
