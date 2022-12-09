package models;

import java.util.Date;

public class Dog extends Pet{
    public Dog(User owner, String name, petType type, String description, long dateOfBirth) {
        super(owner, name, type, description, dateOfBirth);
        //TODO Auto-generated constructor stub
    }
    public int rating;
    @Override
    public int price() {
        // TODO Auto-generated method stub
        //super.price();
        //(age(years) * 1$) + (1$ * rating)
       return (int)((new Date(dateOfBirth).getTime()*1)+(1*rating));
    }
    
}
