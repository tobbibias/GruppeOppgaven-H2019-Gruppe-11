package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Organization {

    private String organizationName, email, postal,zipcode;
    private static String organizationCode;
    private AtomicInteger count = new AtomicInteger(0);
    private ArrayList<User> ansatte = new ArrayList<User>();

    public Organization() {
    }

    public Organization(String organizationName, String email, String postal, String zipcode) {
        this.organizationName = organizationName;
        this.email = email;
        this.postal = postal;
        this.zipcode = zipcode;
        this.organizationCode = "O"+String.valueOf(count.incrementAndGet());
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

    public String getOrganizationCode() {
        return organizationCode;
    }

    public ArrayList<User> getAnsatte() {
        return ansatte;
    }

    public  void addEmployee(User u){
        if (!ansatte.contains(u)){
            ansatte.add(u);
        }
    }

    public void removeEmployee(User u){
        if(ansatte.contains(u)){
            ansatte.remove(u);
        }
    }

    @Override
    public String toString() {
        return organizationName;
    }
}
