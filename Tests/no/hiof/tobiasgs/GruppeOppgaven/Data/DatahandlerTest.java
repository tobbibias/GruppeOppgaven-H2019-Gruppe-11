package main.java.no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Athlete;
import no.hiof.tobiasgs.GruppeOppgaven.Model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DatahandlerTest {


    // tests if the addUser function adds a user into the user.json file.
    @Test
    void testAddUser(){
        Datahandler d = new Datahandler();
        Athlete bom = new Athlete("bombom","tobias","Bom","Tran","bomth@hiof.no");
        d.addUser(bom);
        assertEquals("Bom",d.getUser("bombom","tobias").getFirstName());
    }

    @Test
    void testExsistingUser(){
        Datahandler d = new Datahandler();
        Athlete knut = new Athlete("bombom","tobias","knut","Tran","bomth@hiof.no");
        d.addUser(knut);
        d.addUser(knut);
        int userCount = 0;
        for (User user:d.getUserArrayList()
        ) {
            if (user.getFirstName().equals("knut")){
                userCount++;
            }
        }
        assertEquals(1,userCount);
    }
    // tests if the getUser returns the correct user the functions calls for.
    @Test
    void testGetUser(){
        Datahandler d = new Datahandler();
        assertEquals("Robert",d.getUser("robbi","asthmahest").getFirstName());
    }

    @Test
    void getUserByCode(){
        Datahandler d = new Datahandler();
        d.getUserArrayList();
        Athlete tob = new Athlete("tobbi","tobias","Tobias","Søyland","Tobisy@hiof.no");
        Athlete knu = new Athlete("knutern","knuknu","Knut","Søyland","Knut@hiof.no");
        Athlete rob = new Athlete("robbi","robbern","Robert","Søyland","Robert@hiof.no");
        d.addUser(tob);
        d.addUser(knu);
        d.addUser(rob);
       assertEquals( "Tobias",d.getUserByCode(tob.getUserCode()).getFirstName());
       assertEquals("Knut",d.getUserByCode(knu.getUserCode()).getFirstName());
       assertEquals("Robert",d.getUserByCode(rob.getUserCode()).getFirstName());

    }
}
