package no.hiof.tobiasgs.GruppeOppgaven.Data;


import no.hiof.tobiasgs.GruppeOppgaven.Model.Athlete;
import no.hiof.tobiasgs.GruppeOppgaven.Model.User;


import java.util.ArrayList;


public class Datahandler {


    private final static ArrayList<Athlete> USER_ARRAY_LIST = new ArrayList<Athlete>();

    public static ArrayList<Athlete> getUserArrayList(){
        if(USER_ARRAY_LIST.isEmpty()){
            USER_ARRAY_LIST.addAll( collectUserData());
        }
        return USER_ARRAY_LIST;
    }

    private static ArrayList<Athlete> collectUserData(){
        ArrayList<Athlete> athleteList = new ArrayList<Athlete>();
        Athlete bom = new Athlete("bommi","Emilie","Bom","Tran","Bom@mail.com");
        Athlete tob = new Athlete("tobbi","Amanda","Tobias","Søyland","Tob@mail.com");
        Athlete tom = new Athlete("tommi","tommy","Thomas","Etternavn","Tom@mail.com");
        Athlete rob = new Athlete("robbi","asthmahest","Robert","Engsmyr","robban@mail.com");
        athleteList.add(bom);
        athleteList.add(tob);
        athleteList.add(tom);
        athleteList.add(rob);


        return athleteList;
    }

    public static void addUser(Athlete athlete){
        // first we check if the user is already in the list.


        if (getUserArrayList().contains(athlete)){
            System.out.println("user is allready in register.");
        }else{

            getUserArrayList().add(athlete);
            // Konverterer hele listen til JSON
        }
    }

    public  static User getUser(String username, String password){
        for (User user:getUserArrayList()) {

            if (user.login(username, password) == 1) {
                return user;
            }

        }
        return null;
    }

    public static User getUserByCode(int UserCode) {
        for (User u:getUserArrayList()
             ) {
            if (u.getUserCode() == UserCode){
                return u;
            }
        }
        System.out.println("could not find user with that code.");
        return null;
    }
}

