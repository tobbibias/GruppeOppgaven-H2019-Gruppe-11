package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EventTest {
    @Test
    void eventTest() {
        Events event = new Events(new Federation("Norges fotball forbund","norge@fotball.no", "oslo", "1920"), "Norge vs Sverige",
                "Ullevåll", "Fotballkamp Norge vs Sverige", new Date(2020, 7, 23));


    }

}
