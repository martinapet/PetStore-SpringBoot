package form;

import models.Pet;

public class UserCreateForm {
    private String firstName;
    private String lastName;
    private String email;
    private int budget;
    private Pet pets;

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
    
    
    
}
