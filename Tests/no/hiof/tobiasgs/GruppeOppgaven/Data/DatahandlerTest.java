package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Athlete;
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
        Athlete bom = new Athlete("bombom","tobias","Bom","Tran","bomth@hiof.no");
        d.addUser(bom);
        d.addUser(bom);
        int userCount = 0;
        for (User user:d.collectUserData()
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
        assertEquals("Robert",d.getUser("robbi","robbern").getFirstName());
    }

    @Test
    void getUserByCode(){
        Datahandler d = new Datahandler();
        d.getUserArrayList();
        User tob = new User("tobbi","tobias","Tobias","Søyland","Tobisy@hiof.no");
        User knu = new User("knutern","knuknu","Knut","Søyland","Knut@hiof.no");
        User rob = new User("robbi","robbern","Robert","Søyland","Robert@hiof.no");
        d.addUser(tob);
        d.addUser(knu);
        d.addUser(rob);
       assertEquals( "Tobias",d.getUserByCode(1).getFirstName());
       assertEquals("Knut",d.getUserByCode(2).getFirstName());
       assertEquals("Robert",d.getUserByCode(3).getFirstName());

    }
}
