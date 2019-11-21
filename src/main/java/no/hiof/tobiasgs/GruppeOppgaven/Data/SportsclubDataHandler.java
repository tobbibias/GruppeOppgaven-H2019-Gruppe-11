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

        Teamleader oliver = new Teamleader("Olli","Ollie","oliver","PingPong","oliver@pingPong.no","Manager");

        SportsClub bomIL = new SportsClub("bomIL","BomIl@fotball.no","Moss","1790",oliver,d.getFederationArrayList().get(0));

        Teamleader hans = new Teamleader("Hanhan","HansErBest","hans","Hansen","hans@email.no","Manager");
        SportsClub hansIL = new SportsClub("hansIL","hansIL@mail.no","Sarpsborg","1800",hans,d.getFederationArrayList().get(0));

        bomIL.addMembers(d_athletes.getUserArrayList());


        // adding the teams to the arrayList
        sportsClubArrayList.add(bomIL);
        sportsClubArrayList.add(hansIL);
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
