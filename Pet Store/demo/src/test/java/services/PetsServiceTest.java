package services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import repositories.PetRepository;

@ExtendWith(MockitoExtension.class)

public class PetsServiceTest {

    @Mock
    PetRepository petsRepository;
    @InjectMocks
    PetService petsService;

    @Test
    void testPets(){
        PetService.addPet(null);
        Mockito.verify(petsRepository.addPet(null));
    }
    
}
