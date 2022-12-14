package models;

import java.util.List;

import javax.persistence.Entity;
import jakarta.persistence.ManyToOne;
import services.PetService;

@Entity
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int budget;
    @ManyToOne
    private Pet pets;

    public User(String firstName, String lastName, String email, int budget, Pet pets) {
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

    // public void buy(List<User> users, Dog d, Cat c) {
    //     for (User u : users) {
    //         // Dog d = new Dog();
    //         // Cat c = new Cat();
    //         try {
    //             // Buy.buyPet(u,p);
    //             if (u.getBudget() >= c.price()) {
    //                 System.out.println("Meow, cat" + c.name + " has owner" + c.owner);
    //             }
    //             if (u.getBudget() >= d.price()) {
    //                 System.out.println("Woof, dog" + d.name + " has owner" + d.owner);
    //             }
    //         } catch (Exception e) {
    //             System.out.println(e);
    //         }
    //     }
    // }

}
