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
        Federation fed = new Federation("Norges fotball forbund","norge@fotball.no","oslo","1920");
        assertEquals("Norges fotball forbund", fed.getOrganizationName());
        assertEquals("norge@fotball.no",fed.getEmail());
        assertEquals("oslo",fed.getPostal());
        assertEquals("1920",fed.getZipcode());
    }

}
