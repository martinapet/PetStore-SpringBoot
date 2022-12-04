package models;

import org.junit.jupiter.api.Test;

import models.Pet;
import models.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

public class UsersTest {

    @Test void users(){
        User u = new User();
        Pet p = new Pet();
        u.setPets(p);
        assertEquals(u,p.getOwner());
    }

    @Test void specificFirsNameAndLastName(){
        User users = new User();
        users.setFirstName("Martina");
        users.setLastName("Petrovska");
        Assertions.assertEquals(users.getFirstName(),"Martina");
        Assertions.assertEquals(users.getLastName(),"Martina");
    }    
}
