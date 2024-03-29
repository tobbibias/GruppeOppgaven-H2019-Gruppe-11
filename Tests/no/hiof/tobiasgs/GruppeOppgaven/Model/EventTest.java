package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import java.sql.Time;
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
    @Test
    void checkConstructsForResultInnerClassWork(){
        Federation testFed = new Federation("Testfed", "test", "test", "test");
        Events testEvent1 = new Events(testFed,"test","test","test",new Date(2030,1,1) );

        Athlete testAthlete1= new Athlete("test","test", "test", "test", "test@.com");
        Athlete testAthlete2 = new Athlete("test","test", "test", "test", "test@.com");
        Athlete testAthlete3 = new Athlete("test","test", "test", "test", "test@.com");

        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
        athletes.add(testAthlete1);
        athletes.add(testAthlete2);
        athletes.add(testAthlete3);

        testEvent1.addMultipleParticipants(athletes);

        testEvent1.addResults(testEvent1.getParticipants().get(0),1);
        testEvent1.addResults(testEvent1.getParticipants().get(1),2);
        testEvent1.addResults(testEvent1.getParticipants().get(2),3);

        assertTrue(testAthlete1.getUserCode() == testEvent1.getResults().get(0).getAthleteID());
        assertTrue(testAthlete2.getUserCode() == testEvent1.getResults().get(1).getAthleteID());
        assertTrue(testAthlete3.getUserCode() == testEvent1.getResults().get(2).getAthleteID());

    }
    @Test
    void removeParticipantFromAthleteList(){
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
        testEvent2.addMultipleParticipants(athletes);

       testEvent2.removeParticipant(testAthlete1);
       assertEquals(2,testEvent2.getParticipants().size());

    }
}