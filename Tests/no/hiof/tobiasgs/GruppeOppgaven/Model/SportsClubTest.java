package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SportsClubTest {
    @Test
    public void testMyArray() {
        //when array list created it has 0 elements
        //Can add to empty list
        ArrayList<String> strings = new ArrayList<>();
        assertEquals(0, strings.size());
        strings.add("Tobias");
        strings.add("thomas");
        assertEquals(2, strings.size());
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
