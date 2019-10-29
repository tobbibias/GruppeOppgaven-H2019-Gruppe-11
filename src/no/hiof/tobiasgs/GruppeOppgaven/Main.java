package no.hiof.tobiasgs.GruppeOppgaven;

import no.hiof.tobiasgs.GruppeOppgaven.Data.Datahandler;
import no.hiof.tobiasgs.GruppeOppgaven.Model.User;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User jhon = new User("jhonnyboy","shining","Jhon","Smith","here@jhonny.com");
        Datahandler d = new Datahandler();
        d.addUser(jhon);
        System.out.println(d.getUser("jhonnyboy","shining"));




    }
}
