package com.coderscampus.userlogin;
import java.io.*;


public class UserLoginApplication {


    public static void main(String[] args) {

        int match = 0;
        int failedAttempt = 0;

        String userName = " ";
        String userPassword = " ";





        //Read through the file and then parse into User data fields
        /*
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("data.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */

        /*
        String lineDetail;
        int i = 0;
        //Note:  We must instantiate this 'UserService' because the method -createUser- that we need
        //       to use in UserService is not defined as Static
        UserService userservice = new UserService();
        //when we have a loop or function in a method, this is
        //called a 'guard close' in javascript
        while (true) {

            try {
                if ( (lineDetail =  fileReader.readLine() ) == null  )  break;
                //Here we create the 'User' object for every record that is successfully read
                // and place it into an array that holds 'User' object

                //we need to parse it

               String fields[] = lineDetail.split(",");

            //    users[i] = userservice.createUser(lineDetail);
                users[i] = new User(fields[0], fields[1], fields[2]);
                i = i + 1;

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
*/

        while (true) {
            if (match == 1) break;
            //we must now prompt the user for their username and password and capture the user's input
            System.out.println("Enter your username: ");
            userName = userservice.getUserName();
           // System.out.println("I captured your username as: " + urName);

            System.out.println("Enter your password: ");
            userPassword = userservice.getUserPwd();
          //  System.out.println("I captured your password as: " + userPassword);

            //Read each line of the datafile and compare it against the captured username and capture password
            for (User user : users) {
                //Here we compare two strings
                if (userName.equalsIgnoreCase(user.getUsername()) && userPassword.equals(user.getPassword())) {
                    System.out.println("Welcome " +  user.getName() );
                    match = 1;
                    break; //this will break out of the for-loop
                }

            }  // end of for-loop statement

            if (match == 0){
                failedAttempt = failedAttempt + 1;
                System.out.println("Invalid login, please try again.");
                System.out.println();
              //  System.out.println("failed attempt counter is:  " + failedAttempt);
            }

            if (failedAttempt > 4){
                System.out.println("Too many failed login attempts, you are now locked out.");
                break;
            }

        } // end-of while loop;




    }
}

