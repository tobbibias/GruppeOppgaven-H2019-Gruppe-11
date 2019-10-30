package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamleaderTest {

    @Test
    void testTeamLeaderClass(){
        Teamleader teamleader = new Teamleader("user1","password","bob","smith","bob@smith.com","teamLeader");
        assertTrue(teamleader.getFirstName()=="bob");
        assertTrue(teamleader.getSurName()=="smith");
        assertTrue(teamleader.getEmail()=="bob@smith.com");
        assertTrue(teamleader.getJob_Description()== "teamLeader");
       // assertTrue(teamleader.getUserCode()>0);

    }

}