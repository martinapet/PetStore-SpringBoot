package services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import repositories.UserRepository;


@ExtendWith(MockitoExtension.class)

public class UsersServiceTest {
    @Mock
    UserRepository usersRepository;
    @InjectMocks
    UserService usersService;

    @Test
    void testUsers(){
        usersService.addUser(null);
        Mockito.verify(usersRepository.addUser(null));
    }
    
}
