package no.hiof.tobiasgs.GruppeOppgaven.Model;


import java.util.ArrayList;

public interface Organization {
    public String OrganizationName, Email, Postal,Zipcode;
    public int OrganizationNr;
    public ArrayList<User> Ansatte = new ArrayList<User>();
    
}
