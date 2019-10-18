package no.hiof.tobiasgs.GruppeOppgaven.Data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatahandlerTest {


    // tests if the addUser function adds a user into the user.json file.
    @Test
    void testAddUser(){
        Datahandler datahandler = new Datahandler();
        datahandler.addUser("Edward","Eddison","ed@ed.com","eded","password");
        assertTrue(datahandler.getUser("eded","password").getFirstName() == "Edward");
        assertTrue(datahandler.getUser("eded","password").getSurName() == "Eddison");
        assertTrue(datahandler.getUser("eded","password").getEmail() == "ed@ed.com");
    }

    // tests if the getUser returns the correct user the functions calls for.
    @Test
    void testGetUser(){
        Datahandler d = new Datahandler();
        d.addUser("Edward","Eddison","ed@ed.com","eded","password");

        assertTrue(d.getUser("eded","password").getFirstName() == "Edward");
    }

}