package no.hiof.tobiasgs.GruppeOppgaven.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrganizationTest {


    @Test
    void organizationObjectTest(){
        Organization org = new Organization("test","test","test","test");
        assertEquals("O1",org.getOrganizationCode());
    }

    @Test
    void addEmployeeTest(){
        Organization org = new Organization("test","test","test","test");
        User testUser = new User("test","test","test","test","test");

        org.addEmployee(testUser);
        org.addEmployee(testUser);
        assertEquals(1,org.getAnsatte().size());
    }
    @Test
    void removeEmployeeTest(){
        Organization org = new Organization("test","test","test","test");
        User testUser = new User("test","test","test","test","test");

        org.addEmployee(testUser);
        assertEquals(1,org.getAnsatte().size());
        org.removeEmployee(testUser);
        assertEquals(0,org.getAnsatte().size());
    }
}