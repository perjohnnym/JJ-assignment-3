package com.coderscampus.userlogin;
import java.util.Scanner;

public class UserInputHelper {

    public static String getUserInput(String promptMessage){
        Scanner scan = new Scanner(System.in);
        System.out.println(promptMessage);
        return scan.nextLine();
    }
}
