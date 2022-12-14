package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import models.Dog;
import models.Pet;
import models.User;

public class BuyService {

    @Autowired
    private PetService petService;
    @Autowired
    private UserService userService;

    public void buyPet() {
        List<Pet> allPets = petService.list();
        List<User> allUsers = userService.list();

        for (User u : allUsers) {
            for (Pet p : allPets) {
                if (p.owner == null) { //ako pet e sloboden, t.e. ako nema sopstvenik
                    if (u.getBudget() >= p.price()) { //proveruva dali user-ot ima dovolno budget za da go kupi milenikot
                        System.out.println("Pet has been bought!!");
                        p.setOwner(u);
                        u.setBudget(u.getBudget()-p.price());
        
                    }
                }

            }
        }
    }
}
