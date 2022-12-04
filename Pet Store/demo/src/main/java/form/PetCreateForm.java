package form;

import java.sql.Date;

import models.User;

public class PetCreateForm {

    private User owner;

    private String name;
    private models.Pet.petType type;
    private String description;
    private long dateOfBirth;

    public enum petType{
        cat,
        dog
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(models.Pet.petType type) {
        this.type = type;
    }

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

    public models.Pet.petType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }
  
}
