package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import no.hiof.tobiasgs.GruppeOppgaven.Model.SportsClub;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Teamleader;

import java.util.ArrayList;
import java.util.Collection;

public class SportsclubDataHandler {
    private final static ArrayList<SportsClub> SPORTS_CLUB_ARRAY_LIST = new ArrayList<SportsClub>();

    public static ArrayList<SportsClub> getSportsClubArrayList(){
        if (SPORTS_CLUB_ARRAY_LIST.isEmpty()){
            SPORTS_CLUB_ARRAY_LIST.addAll(collectSportsclubs());
        }
        return SPORTS_CLUB_ARRAY_LIST;
    }
    // generate some data to prototype
    private static ArrayList<SportsClub> collectSportsclubs() {
        // the list we return
        ArrayList<SportsClub> sportsClubArrayList = new ArrayList<SportsClub>();
        FederationDatahandler d = new FederationDatahandler();
        Datahandler d_athletes = new Datahandler();
        // making two teams to prototype

        Teamleader Oliver = new Teamleader("Olli","Ollie","Oliver","PingPong","Oliver@pingPong.no","Manager");

        SportsClub BomIL = new SportsClub("BomIL","BomIl@fotball.no","Moss","1790",Oliver,d.getFederationArrayList().get(0));

        Teamleader Hans = new Teamleader("Hanhan","HansErBest","Hans","Hansen","hans@email.no","Manager");
        SportsClub HansIL = new SportsClub("HansIL","HansIL@mail.no","Sarpsborg","1800",Hans,d.getFederationArrayList().get(0));

        BomIL.addMembers(d_athletes.getUserArrayList());


        // adding the teams to the arrayList
        sportsClubArrayList.add(BomIL);
        sportsClubArrayList.add(HansIL);
        // returning the list
        return sportsClubArrayList;
    }
    public void addTeam(SportsClub s){
        // first we check if it exists in the list in order to avoid duplicate teams.
        int count = 0;
        for (SportsClub t:getSportsClubArrayList()
             ) {
           if (s.getTeamCode() == t.getTeamCode()){
               count++;
           }
        }
        if (count <1){
            SPORTS_CLUB_ARRAY_LIST.add(s);
        }
    }
    public void removeSportsClub(SportsClub s){
        if (SPORTS_CLUB_ARRAY_LIST.remove(s)){
            System.out.println("Sportsclub was removed\n");
        }else{
            System.out.println("Sportsclub was not removed\n");
        }
    }


}
