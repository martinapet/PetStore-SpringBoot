package models;

import java.util.Date;

public class Dog extends Pet{
    public int rating;
    @Override
    public int price() {
        // TODO Auto-generated method stub
        //super.price();
        //(age(years) * 1$) + (1$ * rating)
       return (int)((new Date(dateOfBirth).getTime()*1)+(1*rating));
    }
    
}
