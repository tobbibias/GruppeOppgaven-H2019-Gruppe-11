package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EventTest {

    @Test
    void eventTest() {
        Federation f = new Federation("ab","b@hotmail.com","1555",
                "4545");
        Events event = new Events ( f, "Sarpsborg","Vin Testing",
                "drikke minst mulig", new Date(2019, 12, 24));

}

    @Test
    void addParticipantWhenNowISBiggerThanEvenTime(){
        Athlete testAthlete = new Athlete("test","test", "test",
                "test", "test@.com");
        Federation testFed = new Federation("Testfed", "test", "test", "test");

        Events testEvent1 = new Events(testFed,"test","test","test",new Date(2003,1,1) );
        Events testEvent2 = new Events(testFed,"test","test","test",new Date(2030,1,1) );
        testEvent1.addParticipant(testAthlete);
        testEvent2.addParticipant(testAthlete);

        assertFalse(testEvent1.getParticipants().contains(testAthlete));
        assertTrue(testEvent2.getParticipants().contains(testAthlete));
    }
    @Test
    void addMultipleParticipantsWhen(){
        Athlete testAthlete1= new Athlete("test","test", "test", "test", "test@.com");
        Athlete testAthlete2 = new Athlete("test","test", "test", "test", "test@.com");
        Athlete testAthlete3 = new Athlete("test","test", "test", "test", "test@.com");

        Federation testFed = new Federation("Testfed", "test", "test", "test");

        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
        athletes.add(testAthlete1);
        athletes.add(testAthlete2);
        athletes.add(testAthlete3);

        Events testEvent1 = new Events(testFed,"test","test","test",new Date(2003,1,1) );
        Events testEvent2 = new Events(testFed,"test","test","test",new Date(2030,1,1) );
        testEvent1.addMultipleParticipants(athletes);
        testEvent2.addMultipleParticipants(athletes);

        assertFalse(testEvent1.getParticipants().size() > 0);
        assertFalse(testEvent2.getParticipants().size() < 0);

    }
}