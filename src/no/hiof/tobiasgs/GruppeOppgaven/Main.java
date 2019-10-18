package no.hiof.tobiasgs.GruppeOppgaven;

import no.hiof.tobiasgs.GruppeOppgaven.Data.Datahandler;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Datahandler d = new Datahandler();
        System.out.println(d.getUserArrayList().toArray()[0]);

    }
}
