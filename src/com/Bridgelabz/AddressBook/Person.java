package com.Bridgelabz.AddressBook;

import java.util.*;

public class Person {

    public void Details() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter the First & Last Name.");
        String firstName = keyboard.next();
        String lastName = keyboard.next();
        System.out.println("Enter Complete Address.");
        System.out.println("Enter the City Name :- ");
        String city = keyboard.next();
        System.out.println("Enter the State Name :- ");
        String state = keyboard.next();
        System.out.println("Enter the Zip code of the city :-");
        String zipcode = keyboard.next();
        System.out.println("Enter the Contact Number :- ");
        String phoneNumber = keyboard.next();
        System.out.println("Enter the E-Mail Id :- ");
        String email = keyboard.next();
        System.out.println("You have entered data:- "+firstName+" "+lastName+","+city+","+state+","+zipcode+","+phoneNumber+","+email+".");
    }
}
