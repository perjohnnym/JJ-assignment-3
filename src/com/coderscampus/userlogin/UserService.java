package com.coderscampus.userlogin;
import java.util.Scanner;

/*
You should make use of a UserService class that will help with things like validating
if the inputted username/password matches what's in our User Array.
        It should also provide the service of reading the data from the file
        and creating the User Array.
*/

public class UserService {

    private User[] users = new User[4];

    public UserService() {
        FileService fileService = new FileService();
        users = fileService.readUsersFromfile();
    }

    public User getUserByUserNameAndPassword(String userName, String userPassword) {
        //Read each line of the datafile and compare it against the captured username and capture password
        for (User user : users) {
            //Here we compare two strings
            if (userName.equalsIgnoreCase(user.getUsername()) && userPassword.equals(user.getPassword())) {
                System.out.println("Welcome " + user.getName());
                return user;
            }
        }
        return null;
    }
}