package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import models.User;
import repositories.UserRepository;

@Component
public class UserService {
    
    @Autowired
    private UserRepository usersRepository;

   public List<User> list(){
    return usersRepository.findAll();
   }

   public User addUser(User user){
    return usersRepository.save(user);
   }

   public List<User> getAllUsers(){
    List<User> owners = new ArrayList<>();
    owners.addAll(usersRepository.findAll());
    return owners;
   }

   public User createUsers(User user){
    return usersRepository.save(user);
   };

}
