package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FederationTest {
    @Test
    void FederationEmployeeTest(){
        String FerderationEmployee = "Forbundsleder";
        assertTrue(FerderationEmployee =="Forbundsleder");
    }

   @Test
    void TeamsInFederation(){
        ArrayList<String> teamsInFederation = new ArrayList<>();

        assertEquals(teamsInFederation.size(), 0);
        teamsInFederation.add("Liverpool");
        assertEquals(teamsInFederation.size(),1);
        teamsInFederation.add("Real Madrid");
        teamsInFederation.add("Moss");
        teamsInFederation.add("Halden");
        assertEquals(teamsInFederation.size(),4);
        teamsInFederation.remove("Real Madrid");
        assertEquals(teamsInFederation.size(),3);
    }

    @Test
    void UpComingEvents(){
        ArrayList<String> upComingEvents = new ArrayList<>();
        assertEquals(upComingEvents.size(),0);
        upComingEvents.add("Toughest2020");
        upComingEvents.add("Oslo Maraton2020");
        upComingEvents.add("Birkebeineren2020");
        assertEquals(upComingEvents.size(),3);
        upComingEvents.remove("Birkebeineren2020");
        assertEquals(upComingEvents.size(), 2);
    }

    @Test
    void FormerEvents(){
        ArrayList<String> formerEvents = new ArrayList<>();
        formerEvents.add("Birkebeineren2018");
        formerEvents.add("Brikebeineren2017");
        formerEvents.add("Oslo Maraton2017");
        assertEquals(formerEvents.size(),3);
    }
}