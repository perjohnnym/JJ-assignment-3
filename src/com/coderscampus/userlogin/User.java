package com.coderscampus.userlogin;

public class User {
    //instance variables; declared as Private
    //this private variable can only be accessed using the methods shown within this class
    private String username;
    private String password;
    private String name;

    /*
Create a constructor for this POJO that takes in those three properties as parameters
and set them using the "this" keyword.

Below are the methods that can be used to access the above 'private' instance variables.
They are known as Getters and Setters

What is a POJO?
A POJO (Plain Old Java Object) is a simple Java class that does not extend any other class
and does not implement any interfaces. POJOs are typically used to represent data.

 */
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }



}
