package models;

import java.util.Date;

public class Cat extends Pet{
    public Cat(User owner, String name, String description, long dateOfBirth) {
        super(owner, name, description, dateOfBirth);
        //TODO Auto-generated constructor stub
    }

    public Cat() {
    }
    @Override
    public int price() {
        // TODO Auto-generated method stub
        //return super.price();
        //age(years) * 1$.
        return (int)((new Date(dateOfBirth).getTime()*1));
    }
    
}
