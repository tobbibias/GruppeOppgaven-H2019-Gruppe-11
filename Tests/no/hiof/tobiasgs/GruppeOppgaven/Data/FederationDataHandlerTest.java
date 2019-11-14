package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FederationDataHandlerTest {
    @Test
    void addFederationMemberToArraylist(){
        FederationDatahandler fed = new FederationDatahandler();
        Federation fed1 = new Federation("test","test@email.com","1234","1345");

        int count = fed.getFederationArrayList().size();
        fed.addFederation(fed1);

        assertTrue(count +1 == fed.getFederationArrayList().size());
    }
    @Test
    void removeAFederationMember(){
        FederationDatahandler fed = new FederationDatahandler();
        int count = fed.getFederationArrayList().size();
        Federation federationRemoval = fed.getFederationArrayList().get(0);

        fed.removeFederation(federationRemoval);
        fed.removeFederation(federationRemoval);
        assertTrue( count -1 == fed.getFederationArrayList().size());
    }
}