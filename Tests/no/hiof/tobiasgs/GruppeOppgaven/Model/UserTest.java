package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testUserClass(){
        User user = new User("user1","password","bob","smith","bob@smith.com");
        assertTrue(user.getFirstName()=="bob");
        assertTrue(user.getSurName()=="smith");
        assertTrue(user.getEmail()=="bob@smith.com");
        assertTrue(user.getUserCode()>0);

    }


    @Test
    void testLogin(){
        User user = new User("user1","password","bob","smith","bob@smith.com");
        assertTrue(user.login("user1","password") == 1);
    }
}