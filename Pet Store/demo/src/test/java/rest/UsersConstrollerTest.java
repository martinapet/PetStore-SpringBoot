package rest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import rest.UserController;
import services.UserService;


@ExtendWith(MockitoExtension.class)

public class UsersConstrollerTest {

    @Mock
    UserService usersService;

    @InjectMocks
    UserController usersController;

    @Test void testCreateUser(){
        usersController.createUser(null);
        Mockito.verify(usersService).createUsers(null);
    }
    
}
