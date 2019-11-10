package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Athlete;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Events;

import java.util.ArrayList;
import java.util.Date;

public class EventDatahandler {

    // list output
    private final static ArrayList<Events> EVENTS_ARRAY_LIST = new ArrayList<Events>();
    // fetch list if empty
    public static ArrayList<Events> getEventsArrayList(){
        if (EVENTS_ARRAY_LIST.isEmpty()){
            EVENTS_ARRAY_LIST.addAll(generateEventList());
        }
        return EVENTS_ARRAY_LIST;
    }

    // generate list
    private static ArrayList<Events> generateEventList() {
        ArrayList<Events> output = new ArrayList<Events>();
        // we need a federation to host the event so we get this from the datahandler.
        FederationDatahandler feds = new FederationDatahandler();
        Events norwayCup = new Events(feds.getFederationArrayList().get(0),"Oslo","Norway cup","a football tournement",new Date(2020,01,01));
        Events norwayRace = new Events(feds.getFederationArrayList().get(1),"Bergen","Norge Race","A bike race in bergen",new Date(2020,2,14));

        Athlete a = new Athlete("Foxi","rosie","Kaley","Jersey","foxi@email.com");
        Athlete b = new Athlete("Ozzymandius","Bread","Yanis","Greece","yanis@email.com");
        Athlete c = new Athlete("Melly","ohNo","Jorgen","Greece","melly@email.com");
        Athlete d = new Athlete("Artrid","dead","Alexander","Greece","artrid@email.com");
        Athlete e = new Athlete("Lando","rocks","Patrin","Britan","Lando@email.com");

        ArrayList<Athlete> p = new ArrayList<Athlete>();
        p.add(a);
        p.add(b);
        p.add(c);
        p.add(d);
        p.add(e);


        norwayRace.addMultipleParticipants(p);


        norwayRace.addResults(norwayRace.getParticipants().get(0),1);
        norwayRace.addResults(norwayRace.getParticipants().get(1),2);
        norwayRace.addResults(norwayRace.getParticipants().get(2),3);
        norwayRace.addResults(norwayRace.getParticipants().get(3),4);
        norwayRace.addResults(norwayRace.getParticipants().get(4),5);

        output.add(norwayCup);
        output.add(norwayRace);

        return output;
    }


    // add event
    public static void addEvent(Events e){
        if(EVENTS_ARRAY_LIST.contains(e)){
            EVENTS_ARRAY_LIST.add(e);
        }
    }
    // remove event
    public static void removeEvent(Events e){
        if(EVENTS_ARRAY_LIST.remove(e)){
            System.out.println("Removed Event.\n");
        }else{
            System.out.println("Did not remove Event.\n");
        }
    }
}
