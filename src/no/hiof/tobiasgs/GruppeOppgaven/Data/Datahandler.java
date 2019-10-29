package no.hiof.tobiasgs.GruppeOppgaven.Data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import no.hiof.tobiasgs.GruppeOppgaven.Model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Datahandler {


    private final static ArrayList<User> USER_ARRAY_LIST = new ArrayList<User>();

    public static ArrayList<User> getUserArrayList(){
        if(USER_ARRAY_LIST.isEmpty()){
           USER_ARRAY_LIST.addAll( collectUserData("userData.json"));
        }
        return USER_ARRAY_LIST;
    }

    public static ArrayList<User> collectUserData(String filepath){

        // creating the gson builder and gson from wich we wil parse json to or wanted format.
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        // the arrayList we want to fill with countries and then send to our observableList and further more to our controller's listView.
        ArrayList<User> usersInJson = new ArrayList<User>();
        // the strinbuilder wich will record the data red from the lines in json.
        String line = "";
        StringBuilder jsonLines = new StringBuilder();


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            while ((line = bufferedReader.readLine()) != null){
                jsonLines.append(line);
            }
            // converts the stringbuiler jsonlines list to an array of users.
            User[] userArray = gson.fromJson(jsonLines.toString(),User[].class);

            usersInJson.addAll(Arrays.asList(userArray));

        }catch (IOException ioexc){
            System.out.println(ioexc.getMessage());
        }


        return usersInJson;
    }

    public static void addUser(User user){
        // first we check if the user is already in the list.
        int user_count = 0;
        for (User user1: collectUserData("userData.json")
             ) {
            if (user1.getFirstName().equals(user.getFirstName())){
                user_count++;
            }
        }
        if (user_count >= 1){
            System.out.println("user is allready in register.");
        }else{
            // Oppretter og instansierer et gsonbuilder objekt
            GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
            // Oppretter og instansierer et gson-objekt basert på de parameterne vi har laget builderen med
            Gson gson = gsonBuilder.create();


            getUserArrayList().add(user);
            // Konverterer hele listen til JSON
            String jsonTextListe = gson.toJson(getUserArrayList());
            // Skriver ut JSON-en til konsollen
            System.out.println("JSON liste: " + jsonTextListe);

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("userData.json"))) {
                bufferedWriter.write(jsonTextListe);
            } catch (IOException ioexc) {
                System.out.println(ioexc.getMessage());
            }
        }
    }

    public  static User getUser(String username, String password){
        collectUserData("userData.json");
        for (User user:getUserArrayList()) {

            if (user.login(username, password) == 1) {
                return user;
            }

        }
        return null;
    }
}

