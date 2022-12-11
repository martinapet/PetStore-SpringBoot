package models;

import java.sql.Date;

import jakarta.persistence.OneToOne;

// interface PetType{
//     public void displayType();
// }
public class Pet {
    @OneToOne
    protected User owner;

    protected String name;
    //protected petType type;
    protected String description;
    protected long dateOfBirth; 
    
    
    public Pet(){}

    public void save(Pet pets){}

    public void save(){}

    public int price(){
        return 0;
    }
    // public enum petType implements PetType{
    //     CAT,
    //     DOG;
    //     // public void displayType(){
    //     //     System.out.println("The pet is: "+this);
    //     // }
    // }

    // public void petIsDog()
    // {
    //     switch(type){
    //         case DOG:
    //         String rating;
    //     }
    // }
    
    public Pet(User owner, String name, String description, long dateOfBirth){
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.dateOfBirth = dateOfBirth;
    }

    public Pet(boolean b) {
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void setType(petType type) {
    //     this.type = type;
    // }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    // public petType getType() {
    //     return type;
    // }

    public String getDescription() {
        return description;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

}
