package com.coderscampus.userlogin;
import java.io.*;

public class FileService {

    // here we can create an array of  'User' objects..
    User[] users = new User[4];

    //Read through the file and then parse into User data fields
    BufferedReader fileReader = null;
        try {
        fileReader = new BufferedReader(new FileReader("data.txt"));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    String lineDetail;
    int i = 0;
    //Note:  We must instantiate this 'UserService' because the method -createUser- that we need
    //       to use in UserService is not defined as Static
   // UserService userservice = new UserService();
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

}
