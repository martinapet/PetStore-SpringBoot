package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import models.Pet;
import repositories.PetRepository;

public class PetService {

    @Autowired
    private static PetRepository petsRepository;

    

    public static Pet addPet(Pet pets) {
        return petsRepository.save(pets);
    }

    public Pet updatePet(Pet pets){
        return petsRepository.save(pets);
    }
    
    public Pet createPets(Pet pet){
        return petsRepository.save(pet);
    }

    public List<Pet> list(){
        return petsRepository.findAll();
       }
    
    
}
