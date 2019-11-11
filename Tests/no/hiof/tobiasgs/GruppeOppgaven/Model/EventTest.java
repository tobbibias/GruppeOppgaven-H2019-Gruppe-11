package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

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
}