# PetStore-SpringBoot


There are classes **Pet** and **User** with their variables, getters, setters. The classes Dog and Cat inherit from the class Pet, to know what type of pet it is. With this inheritance, classes Dog ang Cat inherit all the variables and methods from the class Pet. Additionally in the Dog class is the variable rating. The method price() is defined in the class Pet, but in the classes Dog and Cat we override the method (accordingly with the formula for the type of pet).  In UserController and PetController there are methods for createPet() and createUser(). In the UserService and PetServices there are listUser, listPet and other methods.

**h2 database**

To initialize the database there Is `data.sql` file with basic SQL scripts. The script populates the Pet, Dog, User tables with some sample data. After starting the application, navigate to *http://localhost:8080/h2-console*, which will present with a login page. The credentials for login page are in `application.properties` file. When we connect, there is webpage that lists the tables for running SQL queries.


**Testingg with POSTMAN**

When we start the application, we can test it in POSTMAN sending the requests:
          - To list all pet *GET:localhost:8080/api/pets/list*
          - To list all user *GET:localhost:8080/api/pets/list* 
and we get the response.
