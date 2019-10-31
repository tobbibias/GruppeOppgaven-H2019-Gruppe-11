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
    void testUserCode(){
        User user = new User("user1","password","bob","smith","bob@smith.com");
        User user2 = new User("user2","password2","bobb","smithy","bob@smithy.com");
        assertTrue(user2.getUserCode() > user.getUserCode());
    }

    @Test
    void testLogin(){
        User user = new User("user1","password","bob","smith","bob@smith.com");
        assertTrue(user.login("user1","password") == 1);
    }
}