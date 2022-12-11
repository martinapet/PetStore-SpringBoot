package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/list")
    public List<Pet> list(){
        return petsService.list();
    }
    
    private Pet createPet(Pet pets){
        return petsService.addPet(pets);
    }

    @PostMapping
    public Pet createPet(@RequestBody @Valid PetCreateForm form) {
       Pet pet = petsService.createPets(new Pet (form.getOwner(), form.getName(), form.getDescription(), form.getDateOfBirth()));
       return pet;
    }
}
