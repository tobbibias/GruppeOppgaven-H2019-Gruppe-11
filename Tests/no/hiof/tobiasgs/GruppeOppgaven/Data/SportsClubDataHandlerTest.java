package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Data.SportsclubDataHandler;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import no.hiof.tobiasgs.GruppeOppgaven.Model.SportsClub;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Teamleader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SportsClubDataHandlerTest {

    @Test
    void arrayListStaticShouldAddEachMemberIntoSportsClub(){
        SportsclubDataHandler s = new SportsclubDataHandler();
        Teamleader oliver = new Teamleader("Olli","Ollie","Oliver","PingPong","Oliver@pingPong.no","Manager");
        Federation federation = new Federation("test", "test@hotmail", "1570", "1212");
        SportsClub sportsClub = new SportsClub("test", "test", "test@hotmail.com", "Sarps", oliver, federation );
            int count = s.getSportsClubArrayList().size();

            s.addTeam(sportsClub);
            assertTrue(count+1 == s.getSportsClubArrayList().size());
    }


    @Test
    void removeASportsclubMember(){
        SportsclubDataHandler s = new SportsclubDataHandler();

        int count = s.getSportsClubArrayList().size();
        SportsClub teamForRemoval = s.getSportsClubArrayList().get(0);


        s.removeSportsClub(teamForRemoval);
        s.removeSportsClub(teamForRemoval);
        assertTrue(count-1 == s.getSportsClubArrayList().size());


    }
}
