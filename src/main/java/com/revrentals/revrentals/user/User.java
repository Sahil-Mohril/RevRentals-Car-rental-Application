package com.revrentals.revrentals.user;

import java.util.ArrayList;
import java.util.List;

import  com.revrentals.revrentals.rental.Rental;
public class User {
     private String userId;
    private String userName;
    private String email;
    private String password;
    private List<Rental> rentalHistory=new ArrayList<>();

    public User(String id,String name,String email,String Password)
    {
        userId=id;
        userName=name;
        this.email=email;
        this.password=Password;
    }
    @Override
    public String toString()
    {
        return "ID: "+userId+"\nName: "+userName+"\nEmail: "+email;
    }
    public String getName()
    {
        return userName;
    }
    public String getUserId()
    {
        return userId;
    }
    public String getemail()
    {
        return email;
    }
}
