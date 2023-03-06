package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter name");
    String userName = myObj.nextLine();  // Read user input

    System.out.println("Enter surname");
    String surname = myObj.nextLine();

    System.out.println("Enter Age");
    Integer age = myObj.nextInt();




    System.out.println("Username is: " + userName);  // Output user input
        System.out.println("Surname is: " + surname); // Output user surname
        System.out.println("User age is: "+ age); // Output user age
    }
}
