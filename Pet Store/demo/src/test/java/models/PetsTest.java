package models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import models.Pet;
import models.User;

public class PetsTest {
    @Test void testObjectCreation(){
        Pet pet = new Pet();
        pet.setName("Charlie");
        Assertions.assertEquals(pet.getName(), "Charlie");
    }
    @Test void testSpecificDescription(){
        Pet pet = new Pet();
        pet.setDescription("This pet is dog!");
        Assertions.assertEquals(pet.getDescription(), "This pet is a dog!");
    }
    @Test void owners(){
        Pet pet = new Pet();
        User user = new User();
        pet.setOwner(user);
        assertEquals(pet,user.getPets());
    }
    
}
