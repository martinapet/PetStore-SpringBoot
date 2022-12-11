package demo.demo.rest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import rest.PetController;
import services.PetService;

import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)

public class PetsControllerTest {

    @Mock
    PetService petsService;

    @InjectMocks
    PetController petsController;

    @Test void testCreatePets(){ 
        petsController.createPet(null);
        Mockito.verify(petsService.createPets(null));
    }
    
}
