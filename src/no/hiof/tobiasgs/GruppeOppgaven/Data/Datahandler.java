package no.hiof.tobiasgs.GruppeOppgaven.Data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import no.hiof.tobiasgs.GruppeOppgaven.Model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
            // converts the stringbuiler jsonlines list to an array of countries.
            User[] userArray = gson.fromJson(jsonLines.toString(),User[].class);

            usersInJson.addAll(Arrays.asList(userArray));
        }catch (IOException ioexc){
            System.out.println(ioexc.getMessage());
        }


        return usersInJson;
    }




    public static void addUser(String firstname,String surname, String email,String username, String password ){
    }
    public static User getUser(String username, String password){

        for (User user:getUserArrayList()
             ) {

            if(user.login(username,password) == 1){
                return user;
            }
        }
        return null;
    }
}
