package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatahandlerTest {


    // tests if the addUser function adds a user into the user.json file.
    @Test
    void testAddUser(){
        Datahandler d = new Datahandler();
        User bom = new User("bombom","tobias","Bom","Tran","bomth@hiof.no");
        d.addUser(bom);
        assertEquals("Bom",d.getUser("bombom","tobias").getFirstName());
    }

    @Test
    void testExsistingUser(){
        Datahandler d = new Datahandler();
        User bom = new User("bombom","tobias","Bom","Tran","bomth@hiof.no");
        d.addUser(bom);
        d.addUser(bom);
        int userCount = 0;
        for (User user:d.collectUserData("userData.json")
        ) {
            if (user.getFirstName().equals("Bom")){
                userCount++;
            }
        }
        assertEquals(1,userCount);
    }
    // tests if the getUser returns the correct user the functions calls for.
    @Test
    void testGetUser(){
        Datahandler d = new Datahandler();
        assertEquals(d.getUser("jhonnyboy","shining").getFirstName(),"Jhon");
    }

}
