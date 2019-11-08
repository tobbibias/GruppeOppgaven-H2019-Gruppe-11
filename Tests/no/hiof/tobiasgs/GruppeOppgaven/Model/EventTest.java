package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EventTest {

    @Test
    void eventTest() {
        Federation f = new Federation("ab","b@hotmail.com","1555",
                "4545");
        Events event = new Events ( f, "Sarpsborg","Vin Testing",
                "drikke minst mulig", new Date(2019, 12, 24));

}
}