package com.coderscampus.userlogin;
import java.io.*;

public class UserLoginApplication {


    public static void main(String[] args) {

        //  BufferedReader fileReader = null;

        //Read through the file and then parse into User data fields

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("data.txt"));
          //  System.out.println(fileReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String filePointer;

        //Note:  We must instantiate this 'UserService' because the method -createUser- that we need
        //       to use in UserService is not defined as Static
        UserService userservice = new UserService();
        while (true) {
            try {
                if (!((filePointer = fileReader.readLine()) != null)) break;
                /*
                I need to parse "filePointer" into 3 fields to create the UserRecord.
                 */

                System.out.println("the file pointer points to record:  " + filePointer);
         //We capture the record as a field string array delimited by the comma (comma is ommitted)
              String[] field =  userservice.parseText(filePointer);

              //for every element in the string array 'field', we capture a string 'fd' and then print it
              for (String fd : field){
                  System.out.println(fd);
                  userservice.createUser(fd);
                  User usrRd = new User();
               //  UserRecord[] usrRdd = new UserRecord[3];

                 usrRd.setName(fd);
                 usrRd.setPassword(fd);
                 usrRd.setName(fd);
/*
                  usrRdd[0].setName(fd);
                  usrRdd[0].setPassword(fd);
                  usrRdd[0].setName(fd);   */
              }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }



        // System.out.println("Enter your email address: ");

        // System.out.println("Enter your password: ");


    }
}

