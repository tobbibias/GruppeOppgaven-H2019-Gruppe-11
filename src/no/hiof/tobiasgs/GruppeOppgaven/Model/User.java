package no.hiof.tobiasgs.GruppeOppgaven.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private String username,password,firstName,surName,email;
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int userCode;
    public User(String username, String password, String firstName, String surName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        userCode = count.incrementAndGet();
    }



    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public int getUserCode() {
        return userCode;
    }


    public int login(String u, String p){
        if (u.equals(username) && p.equals(password)){
            return 1;
        }return 0;
    }
}
