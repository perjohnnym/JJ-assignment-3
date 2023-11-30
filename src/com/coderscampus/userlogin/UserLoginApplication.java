package com.coderscampus.userlogin;
import java.io.*;


public class UserLoginApplication {


    public static void main(String[] args) {

        int match = 0;
        int failedAttempt = 0;

        //Following code will invoke FileService and read the file and load Users via the User constructor
        UserService userservice = new UserService();

        int maxLoginAttempt = 5;
        int loginCounter = 0;
        User endUser = null;

        while (loginCounter < maxLoginAttempt){
            String userName = UserInputHelper.getUserInput("Enter your username: ");
            String userPassword = UserInputHelper.getUserInput("Enter your password: ");
            endUser = userservice.getUserByUserNameAndPassword(userName, userPassword);
            if (endUser != null){
                System.out.println("Welcome " + endUser.getUsername());
                break;
            }else{
                System.out.println("Invalid login, please try again.");
                loginCounter++;
            }

        }

        if (endUser == null){
            System.out.println("Too many failed login attempts, you are now locked out.");
        }


    }
}

