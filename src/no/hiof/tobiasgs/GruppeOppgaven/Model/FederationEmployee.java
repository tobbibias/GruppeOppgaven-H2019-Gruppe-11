package no.hiof.tobiasgs.GruppeOppgaven.Model;

public class FederationEmployee {
    private Federation federation;
    private String jobDescription;

    public FederationEmployee(Federation federation, String jobDescription) {
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
