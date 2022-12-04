package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Pet;

public interface PetsRepository extends JpaRepository<Pet, Long>{

    Object addPet(Object object);
    
}
