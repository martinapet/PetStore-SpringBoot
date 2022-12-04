package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import form.PetCreateForm;
import models.Pet;
import services.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    PetService petsService;

    private Pet createPet(Pet pets){
        return petsService.addPet(pets);
    }

    @PostMapping
    public Pet createPet(@RequestBody @Valid PetCreateForm form) {
       Pet pet = petsService.createPets(new Pet (form.getOwner(), form.getName(), form.getType(), form.getDescription(), form.getDateOfBirth()));
       return pet;
    }
}
