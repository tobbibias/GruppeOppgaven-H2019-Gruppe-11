package no.hiof.tobiasgs.GruppeOppgaven.Data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatahandlerTest {


    // tests if the addUser function adds a user into the user.json file.
    @Test
    void testAddUser(){
        Datahandler d = new Datahandler();
        d.addUser("Bom","Tran","bomth@hiof.no","bombom","tobias");
        assertEquals(d.getUser("bombom","tobias").getFirstName(),"Bom");
    }

    // tests if the getUser returns the correct user the functions calls for.
    @Test
    void testGetUser(){
        Datahandler d = new Datahandler();
        assertEquals(d.getUser("bobby","booby").getFirstName(),"bob");
    }

}