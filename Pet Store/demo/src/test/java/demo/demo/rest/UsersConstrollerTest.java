package demo.demo.rest;
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
    UserService userService;

    @InjectMocks
    UserController userController;

    @Test void testCreateUser(){
        userController.createUser(null);
        Mockito.verify(userService).createUsers(null);
    }
    
}
