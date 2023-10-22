package com.coderscampus.userlogin;

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
    public User createUser(String customer){
        // we have to instantiate a new user here
       // UserRecord user = new UserRecord();



        User[] user = new User[4];

        //here we should capture the record string
        //we then need to parse this string into fields
        //we then should create an array of UsuarioRecords (that has 3 fields in it).


       // user.setUsername(customer[0]);
       // user.setPassword(customer[1]);
       // user.setName(customer[2]);
        //have to return the user record
        return user[0];
    }

    /*
    This method will take the following String as input: "exampleUsername,examplePassword,exampleName"
    And it should return an array of Strings with three elements inside: ["exampleUser", "examplePassword", "exampleName"]
     */
    public String[] parseText(String input) {
        return (input.split(","));

    }


}
