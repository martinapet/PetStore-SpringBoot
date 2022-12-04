package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import models.Pet;
import repositories.PetRepository;

public class PetService {

    @Autowired
    private PetRepository petsRepository;

    public List<Pet> list(){
        return petsRepository.findAll();
    }

    public Pet addPet(Pet pets) {
        return petsRepository.save(pets);
    }

    public Pet updatePet(Pet pets){
        return petsRepository.save(pets);
    }
    
    public Pet createPets(Pet pet){
        return petsRepository.save(pet);
    }
    
    
}
