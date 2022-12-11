package models;
import java.util.List;

import javax.persistence.Entity;
import jakarta.persistence.ManyToOne;
import services.PetService;

@Entity
public class User {
    private static String firstName;
    private static String lastName;
    private String email;
    private static int budget;
    @ManyToOne
    private Pet pets;

    public User(String firstName, String lastName, String email, int budget, Pet pets){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.budget = budget;
        this.pets = pets;
    }

    
    public User() {
    }


    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public int getBudget() {
        return budget;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }


    public Pet getPets() {
        return pets;
    }


    public void setPets(Pet pets) {
        this.pets = pets;
    }

    public static void buy(List<User> users){
        for(User u: users){
            Pet p = u.getPets();
            try{
                Buy.buyPet(u,p);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    

    
}
