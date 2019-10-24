import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FederationEmployeeTest {
    @Test
    void fedEmployeeTest(){
        FederationEmployee fedEm = new FederationEmployee(new Federation("Norges fotball forbund",222,"norge@fotball.no","oslo","1920"),"Forbundsleder");
        assertTrue(fedEm.getFederationName()=="Norges forball forbund");
        assertTrue(fedEm.getJobDescription() =="Fobundsleder");

    }
}
