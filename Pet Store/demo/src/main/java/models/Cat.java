package models;

import java.util.Date;

public class Cat extends Pet{
    @Override
    public int price() {
        // TODO Auto-generated method stub
        //return super.price();
        //age(years) * 1$.
        return (int)((new Date(dateOfBirth).getTime()*1));
    }
    
}
