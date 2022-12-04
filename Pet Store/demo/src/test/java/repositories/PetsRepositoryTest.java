package repositories;

import models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetsRepositoryTest extends JpaRepository<Pet,Long>{
    
}
