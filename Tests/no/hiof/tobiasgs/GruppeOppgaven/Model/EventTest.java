package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EventTest {
    @Test
    void eventTest() {
        Events event = new Events(new Federation("Norges fotball forbund", 222, "norge@fotball.no", "oslo", "1920"), "Norge vs Sverige",
                "Ullevåll", "Fotballkamp Norge vs Sverige", new Date(2020, 7, 23));
        assertTrue(event.getEventList()[0].getFederationName()== "Norges Fotball Forbund");
        assertTrue(event.getEventList()[0].getDescription()!=null);
        assertTrue(event.getEventList()[0].getEventName()!=null);
        assertTrue(event.getEventList()[0].getEventLocation()!=null);
        assertTrue(event.getEventList()[0].getEventDate()!= null);

    }

}
