package no.hiof.tobiasgs.GruppeOppgaven.Model;

public class FederationEmployee extends User{
    private Federation federation;
    private String jobDescription;

    public FederationEmployee(String username,String password,String firstname, String surname, String email,Federation federation, String jobDescription) {
        super(username,password,firstname,surname,email);
        this.federation = federation;
        this.jobDescription = jobDescription;
    }

    public Federation getFederation() {
        return federation;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
