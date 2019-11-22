package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AthleteTest {

    @Test
    void testLeaveTeamFunc(){
        Athlete athlete = new Athlete("TestAthlete","Testword","Test","Test","test@mail.com");
        SportsClub testClub = new SportsClub();
        athlete.setSportsClub(testClub);
        assertNotEquals(athlete.getSportsClub(),null);
        athlete.leaveTeam();
        assertEquals(athlete.getSportsClub(),null);

    }

    @Test
    void addEventTest(){
        Athlete athlete = new Athlete("TestAthlete","Testword","Test","Test","test@mail.com");
        Events event = new Events();
        athlete.addEvent(event);
        athlete.addEvent(event);
        assertTrue(athlete.getRegisteredEvents().contains(event));
        assertTrue(athlete.getRegisteredEvents().size() == 1);
    }

    @Test
    void removeEventTest(){
        Athlete athlete = new Athlete("TestAthlete","Testword","Test","Test","test@mail.com");
        Events event = new Events();
        athlete.addEvent(event);
        assertTrue(athlete.getRegisteredEvents().contains(event));
        athlete.removeEvent(event);
        assertFalse(athlete.getRegisteredEvents().contains(event));
    }


}