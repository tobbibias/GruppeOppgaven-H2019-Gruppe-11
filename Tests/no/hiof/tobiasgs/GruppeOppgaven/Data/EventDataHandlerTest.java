package no.hiof.tobiasgs.GruppeOppgaven.Data;

import no.hiof.tobiasgs.GruppeOppgaven.Model.Events;
import no.hiof.tobiasgs.GruppeOppgaven.Model.Federation;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventDataHandlerTest {

    @Test
    void addEventsToArraylist(){
        EventDatahandler event = new EventDatahandler();
        Federation testFed2 = new Federation("Testfed", "test", "test", "test");
        Events testEvent = new Events(testFed2,"test","test","test",new Date(2030,1,1) );

        int count = event.getEventsArrayList().size();
        event.addEvent(testEvent);

        assertTrue(count +1 == event.getEventsArrayList().size());
    }

    @Test
    void removeAEventFromTheList(){
        EventDatahandler event = new EventDatahandler();
        int count = event.getEventsArrayList().size();
        Events eventRemoval = event.getEventsArrayList().get(0);

        event.removeEvent(eventRemoval);
        event.removeEvent(eventRemoval);
        assertTrue(count -1 == event.getEventsArrayList().size());
    }
}
