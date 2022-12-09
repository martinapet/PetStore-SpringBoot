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
    private int budget;
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
    public static int getBudget() {
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
            try{
                buyPet(u);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }


    public static void buyPet(User user){
        Pet freePet = new Pet(Pet.owner == null && (User.getBudget() >= Dog.price() || User.getBudget() >= Cat.price()));
        //pet od listata pets sto nema owner i userot ima dovolen budget da ja plati cenata na toj pet
        //let petWithoutOwner=new Pet(owner == null && owner.getBudget()>=price());

        if(freePet == null)
        {
            throw new Exception("All pets have {} owners, so user: " +User.firstName +User.lastName + " cant buy a pet");
        
        }
        freePet.owner = user;
        
        switch(freePet.type){
            case(Cat):
            System.out.println("Meow, cat" +Cat.name+ " has owner" +Pet.owner);
            break;
            case(Dog):
            System.out.println("Woof, dog" +Dog.name+ " has owner" +Pet.owner);
            break;
            default:
            System.out.println("Pet has been bought!!");
            break;
        }
    }    
}
