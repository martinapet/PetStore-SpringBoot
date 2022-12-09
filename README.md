# PetStore-SpringBoot
**Pet collection** 
{ 
                             “owner”: “Martina Petrovska”,
                              “name”: “Charlie”,
                              “type”: “Dog”,
                              “description”: “This pet is a dog!”
                              “dateOfBirth”: “06.12.2014”,
                              “price”: “300$”
}

There are classes Pet and User with their variables, getters, setters. The classes Dog and Cat inherit from the class Pet, to know what type of pet it is. With this inheritance, classes Dog ang Cat inherit all the variables and methods from the class Pet. Additionally in the Dog class is the variable rating. The method price() is defined in the class Pet, but in the classes Dog and Cat we override the method (accordingly with the formula for the type of pet).  In UserController and PetController there are methods for createPet() and createUser(). In the UserService and PetServices there are listUser, listPet and other methods.
**To list all pet GET: localhost:8080/api/pets/list** 
***
**To list all user GET:  localhost:8080/api/pets/list**
