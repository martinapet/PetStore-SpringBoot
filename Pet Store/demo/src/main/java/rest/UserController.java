package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import form.UserCreateForm;
import models.Pet;
import models.User;
import services.UserService;

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService usersService;

    @GetMapping("/list")
    public List<User> list(){
     return usersService.list();
    }
   private User createUser(User user){
    return usersService.addUser(user);
   }

   @PostMapping
    public User createUser(@RequestBody @Valid UserCreateForm form) {
       User user = usersService.createUsers(new User (form.getFirstName(), form.getLastName(), form.getEmail(), form.getBudget(), form.getPets()));
       return user;
    }
    
    /*public Users buyPetForUser(Users user, Pets pet){
      List allUsers= usersService.getAllUsers();
      for(int i; i<allUsers; i++){

      }
      return (Users) allUsers;
    }*/
}
