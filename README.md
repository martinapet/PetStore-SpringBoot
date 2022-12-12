# PetStore-SpringBoot

We have two classes **Pet** and **User** which represent pets and their owners. The classes Dog and Cat inherit from the class Pet, to know what type of pet it is.  Additionally in the Dog class is the variable rating. With the list() methods found in **PetService** and **UserService**, we list all pets and users, respectively. With the buy() method, we go through all the users and check if they have enough budget to buy the pet and if that pet has an owner at all. If these conditions are met, then you can buy a pet for this user. And we continue on with checking the users.. We also have methods that create pets and users.. In UserController and PetController there are methods for createPet() and createUser().

**h2 database**

To initialize the database there Is `data.sql` file with basic SQL scripts. The script populates the Pet, Dog, User tables with some sample data. After starting the application, navigate to *http://localhost:8080/h2-console*, which will present with a login page. The credentials for login page are in `application.properties` file. When we connect, there is webpage that lists the tables for running SQL queries.


**Testingg with POSTMAN**

When we start the application, we can test it in POSTMAN sending the requests:

          - To list all pet GET:localhost:8080/api/pets/list
          - To list all user GET:localhost:8080/api/pets/list
          
and we get the response.
