package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FederationTest {


    @Test
    void constructorTest(){
        Federation fed = new Federation("Norges fotball forbund",222,"norge@fotball.no","oslo","1920");
        assertTrue(fed.size()!= 0);
        assertTrue(fed.getFederationName() == "Norges fotball forbund");
        assertTrue(fed.getFederationNumber() == 222);
        assertTrue(fed.getFederationEmail() == "norge@fotball.no");
        assertTrue(fed.getFederationPostal() == "oslo");
        assertTrue(fed.getFederationPostalCode() == "1920");
    }

   @Test
    void TeamsInFederation(){
       Federation fed = new Federation("Norges fotball forbund",222,"norge@fotball.no","oslo","1920");
       SportsClub bomIl = new SportsClub("11",new Teamleader("HarryHole", "9a19","Harry",
               "Hole","Harry@hole.com","Team Leader" ),new Federation("BFF", 222,"bom@hjelp.no","Rygge","1521"),"Nils");
       assertTrue(fed.getClubList.size()!=0);
       assertTrue(fed.getClubList()[0].getteamCode() == "11");
       assertTrue(fed.getClubList()[0].getTeamLeader().getUsername() == "HarryHole");
       assertTrue(fed.getClubList()[0].getFederationName() == "BFF");
       assertTrue(fed.getClubList()[0].getTeamCaptain()=="Nils");

    }

    @Test
    void UpComingEvents(){
        Events upevent = new Events("Norges Fotball Forbund", "Ullevåll", "Norge vs Sverige", "Fotballkamp mellom Norge og Sverige",
                new Date(2020,8,23));
        assertTrue(upevent.getEventList.size()!=0);
        assertTrue(upevent.getHost()=="Norges Fotball Forbund");
        assertTrue(upevent.getLocation() == " Ullevåll");
        assertTrue(upevent.getDescription() != "");
        assertTrue(upevent.getDate()> LocalDate.now());
        /*ArrayList<String> upComingEvents = new ArrayList<>();
        assertEquals(upComingEvents.size(),0);
        upComingEvents.add("Toughest2020");
        upComingEvents.add("Oslo Maraton2020");
        upComingEvents.add("Birkebeineren2020");
        assertEquals(upComingEvents.size(),3);
        upComingEvents.remove("Birkebeineren2020");
        assertEquals(upComingEvents.size(), 2); */
    }

    @Test
    void FormerEvents(){
        Events forevent = new Events("Norges Fotball Forbund", "Ullevåll", "Norge vs Sverige","Fotballkamp mellom Norge og Sverige",
                new Date(2019,9,10));
        assertTrue(forevent.getHost()=="Norges Fotball Forbund");
        assertTrue(forevent.getLocation()=="Ullevåll");
        assertTrue(forevent.getDescription() != "");
        assertTrue(forevent.getDate()< LocalDate.now());
       /* ArrayList<String> formerEvents = new ArrayList<>();
        formerEvents.add("Birkebeineren2018");
        formerEvents.add("Brikebeineren2017");
        formerEvents.add("Oslo Maraton2017");
        assertEquals(formerEvents.size(),3); */
    }
}