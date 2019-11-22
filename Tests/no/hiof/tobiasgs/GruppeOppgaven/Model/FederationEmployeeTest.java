package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FederationEmployeeTest {

    @Test
    void FederationEmployeeObjectTest(){
            Federation fed = new Federation("test","test","test","test");
            FederationEmployee fedemp = new FederationEmployee("test","test","test","test","test",fed,"test");

            assertEquals(fed,fedemp.getFederation());
            assertEquals("test",fedemp.getJobDescription());

    }


}
