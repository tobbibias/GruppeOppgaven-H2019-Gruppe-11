package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.ArrayList;

public class Organization {

    public String organizationName, email, postal,zipcode;
    public int organizationNr;
    public ArrayList<User> ansatte = new ArrayList<User>();

    public Organization(String organizationName, String email, String postal, String zipcode) {
        this.organizationName = organizationName;
        this.email = email;
        this.postal = postal;
        this.zipcode = zipcode;
    }


    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getOrganizationNr() {
        return organizationNr;
    }

    public void setOrganizationNr(int organizationNr) {
        this.organizationNr = organizationNr;
    }

    public ArrayList<User> getAnsatte() {
        return ansatte;
    }

    public void setAnsatte(ArrayList<User> ansatte) {
        this.ansatte = ansatte;
    }
}
