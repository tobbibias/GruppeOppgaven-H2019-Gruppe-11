package no.hiof.tobiasgs.GruppeOppgaven.Model;

public class Teamleader extends User {
    private String job_Description;
    private SportsClub teamName;

    public Teamleader (String username, String password, String firstName, String surName, String email, String job_Description) {
        super(username, password, firstName, surName, email);
        this.job_Description = job_Description;
    }



    public String getJob_Description() {
        return job_Description;
    }

    public void setJob_Description(String job_Description) {
        this.job_Description = job_Description;
    }
}
