package no.hiof.tobiasgs.GruppeOppgaven.Model;

public class FederationEmployee extends User {
    private Federation federation;
    private String jobDescription;

    public FederationEmployee(String username, String password, String firstName, String surName, String email, Federation federation) {
        super(username, password, firstName, surName, email);
        this.federation = federation;
    }

    public FederationEmployee(String username, String password, String firstName, String surName, String email, Federation federation, String jobDescription) {
        super(username, password, firstName, surName, email);
        this.federation = federation;
        this.jobDescription = jobDescription;
    }

    public Federation getFederation() {
        return federation;
    }

    public String getJobDescription() {
        return jobDescription;
    }
}
