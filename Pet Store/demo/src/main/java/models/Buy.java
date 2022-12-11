package models;

public class Buy {
    public static int buyPet(User user, Pet pet){
        //Pet freePet = new Pet(Pet.owner == null && (User.getBudget()>= Dog.price() || User.getBudget() >= Cat.price()));
        //pet kojsto nema owner
        Pet freePet = new Pet(); 
        Dog freeDog = new Dog();
        Cat freeCat = new Cat();
        // availablePet = new Pet(Pet.owner == null && Pet.owner.getBudget()>=Dog.dogPrice());
        if(user.getPets() == null && user.getBudget()>=pet.price())
        if(Pet.owner == null){
            if(user.getBudget()>=freeDog.price()){
                System.out.println("Woof, dog" +freeDog.name+ " has owner" +Pet.owner);
            }
            if(user.getBudget()>=freeCat.price()){
                System.out.println("Meow, cat" +freeCat.name+ " has owner" +Pet.owner);
            }
            System.out.println("Pet has been bought!!");            
        }
        return 0;
        
    }
    
}
