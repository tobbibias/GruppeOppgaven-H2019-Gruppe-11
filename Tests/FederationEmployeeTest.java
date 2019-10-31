import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import no.hiof.tobiasgs.GruppeOppgaven.Model.FederationEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FederationEmployeeTest {
    @Test
    void fedEmployeeTest(){
        Federation nff = new Federation("Norges fotball forbund","nff@fotball.no","norge","1");
        FederationEmployee fedEm = new FederationEmployee("thomasy","forball","Thomas","Ly","thomas@forbal.no",nff,"Forbundsleder");
        assertTrue(fedEm.getFederation().getOrganizationName()== "Norges fotball forbund");
        assertTrue(fedEm.getJobDescription() =="Forbundsleder");

    }
}
