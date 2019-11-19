package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SportsClubTest {
    @Test
    void sportsClubContstructShouldbeTrue(){
        Federation fed = new Federation("test","test","test","test");
        Teamleader teamleader = new Teamleader("test","test","test","test","test","test");
        SportsClub sportClub = new SportsClub("test", "test", "test", "test",teamleader, fed );
        assertEquals(sportClub.getManager(),teamleader);
        assertEquals(sportClub.getFederation(),fed);
        assertEquals(sportClub.getTeamCode(),"T4");
    }

    @Test
    public void addMemberIfMemberNotInTeam() {
        SportsClub testClub = new SportsClub();

        Athlete athlete1 = new Athlete("test","test","test","test","test");

        // test to add member for the first time
        testClub.addMember(athlete1);
        assertEquals(testClub.getMembers().get(0),athlete1);
        // test to see that you cant add the same member twice
        testClub.addMember(athlete1);
        assertTrue(testClub.getMembers().size() == 1);

    }

    @Test
    void addmembersIfMembersNotInTeam(){
        ArrayList<Athlete> member = new ArrayList<>();
        SportsClub testClub = new SportsClub();

        Athlete athlete1 = new Athlete("test","test","test","test","test");
        Athlete athlete2 = new Athlete("test","test","test","test","test");
        Athlete athlete3 = new Athlete("test","test","test","test","test");
        member.add(athlete1);
        member.add(athlete1);
        member.add(athlete2);
        member.add(athlete3);

        testClub.addMembers(member);
        assertTrue(testClub.getMembers().size() == 3);

       /* int count=0;
        for (Athlete a : testClub.getMembers()){

            if (a == athlete1){
                count++;
            }
        }
        assertTrue(count ==1);*/
    }


    @Test
    void removeAMember(){
        ArrayList<Athlete> member = new ArrayList<>();
        SportsClub testClub = new SportsClub();

        Athlete athlete1 = new Athlete("test","test","test","test","test");
        Athlete athlete2 = new Athlete("test","test","test","test","test");
        Athlete athlete3 = new Athlete("test","test","test","test","test");
        member.add(athlete1);
        member.add(athlete1);
        member.add(athlete2);
        member.add(athlete3);
        testClub.addMembers(member);
        assertTrue(testClub.getMembers().size() == 3);

        testClub.removeMember(athlete2);
        assertTrue(testClub.getMembers().size()== 2);
    }

    @Test
    public void canFillAList(){
        List<String> strings = new ArrayList<>();

        fillList(strings, 40);
        assertEquals(40, strings.size());
        assertEquals("String0", strings.get(0));
        assertEquals("String35", strings.get(35));

        strings.clear();
        assertEquals(0, strings.size());
    }
    private void fillList(List<String> strings, int howMany){
        for(int i = 0; i < howMany; i++){
            strings.add("String" + i);
        }
    }
}
