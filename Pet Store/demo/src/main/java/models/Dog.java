package models;

import java.util.Date;

public class Dog extends Pet{
    public Dog(User owner, String name, String description, long dateOfBirth) {
        super(owner, name, description, dateOfBirth);
        //TODO Auto-generated constructor stub
    }
    public Dog() {
    }
    public int rating;
    @Override
    public int price() {
        // TODO Auto-generated method stub
        //super.price();
        //(age(years) * 1$) + (1$ * rating)
       return (int)((new Date(dateOfBirth).getTime()*1)+(1*rating));
    }
    public int getRating() {
        return rating;
    }
   
    
}
