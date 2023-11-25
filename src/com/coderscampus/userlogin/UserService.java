package com.coderscampus.userlogin;
import java.util.Scanner;

/*
You should make use of a UserService class that will help with things like validating
if the inputted username/password matches what's in our User Array.
        It should also provide the service of reading the data from the file
        and creating the User Array.
*/


public class UserService {

    //this
    //Note:  here we only need to pass in a single variable as a string array
    /*
The createUser method will output a User object that will be populated with
the username, password and name above.
 */

    //Here I just want to read in the file and store all the records in an array
    // I BELIEVE it is here that I need to create an array of UserRecord objects but unsure how

    // this should only create a user and then this will return an User object, then
   // we use the return value of this method (shown below) and pass it to an array (create )
    public User createUser(String lineDetail ){
        // we have to instantiate a new user here

    User user = new User();
    String[] fields = parseText(lineDetail);
    user.setUsername(fields[0]);
    user.setPassword(fields[1]);
    user.setName(fields[2]);

    return user;
    }

    /*
    This method will take the following String as input: "exampleUsername,examplePassword,exampleName"
    And it should return an array of Strings with three elements inside: ["exampleUser", "examplePassword", "exampleName"]
     */
    public String[] parseText(String input) {
        return (input.split(","));

    }

    public String getUserName (){
        Scanner scan = new Scanner(System.in);
    return scan.nextLine();
    }

    public String getUserPwd (){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
