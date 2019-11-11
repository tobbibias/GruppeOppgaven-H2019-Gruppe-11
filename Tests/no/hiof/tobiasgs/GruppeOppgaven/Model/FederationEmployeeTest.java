package no.hiof.tobiasgs.GruppeOppgaven.Model;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import no.hiof.tobiasgs.GruppeOppgaven.Model.FederationEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FederationEmployeeTest {

    @Test
    void FederationEmployeeObjectTest(){
            Federation fed = new Federation("test","test","test","test");
            FederationEmployee fedemp = new FederationEmployee("test","test","test","test","test",fed,"test");

            assertEquals(fed,fedemp.getFederation());
            assertEquals("test",fedemp.getJobDescription());
            assertEquals(1,fedemp.getUserCode());
    }


}
