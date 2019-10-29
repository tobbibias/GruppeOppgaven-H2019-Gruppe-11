package no.hiof.tobiasgs.GruppeOppgaven.Model;

public class User {
    private String username,password,firstName,surName,email;
    private int userCode;
// constructor
    public User(String username, String password, String firstName, String surName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
    }
// getter functions
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

    private void setUserCode(){
        this.userCode = 0000;
    };


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // login function
    public int login(String u, String p){
        if (u.equals(username) && p.equals(password)){
            return 1;
        }else return 0;
    };

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", userCode=" + userCode +
                '}';
    }


}
