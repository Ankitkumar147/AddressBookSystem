package com.Bridgelabz.AddressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class AddressBook {

    private static Map<String, Person> personMap = new HashMap<>();
    private static Scanner sc2 = new Scanner(System.in);
    //Person person = new Person();

    public static void main(String[] args) throws IllegalStateException {

            System.out.println("Welcome to the Address Book.");
            System.out.println("Choose the desired options :--- \n 1.Add contact.  \n 2.Show Details");
            int choice = sc2.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the desired contact in the Address Book.");
                    addPersonDetails();
                    break;
                default:
                    System.out.println(personMap.toString());
                    break;
            }
    }
        private static void addPersonDetails () {
            Person person;
            person = contactFields();
            personMap.put(person.getFirstName(), person);
            System.out.println(personMap.toString());
        }

        private static Person contactFields () {
            Person person = new Person();
            //  Scanner sc1 = new Scanner(System.in);
            System.out.println("Please Enter the First & Last Name.");
            person.setFirstName(sc2.next());
            person.setLastName(sc2.next());
            System.out.println("Enter Complete Address.");
            System.out.println("Enter the City Name :- ");
            person.setCity(sc2.next());
            System.out.println("Enter the State Name :- ");
            person.setState(sc2.next());
            System.out.println("Enter the Zip code of the city :-");
            person.setZipCode(sc2.nextInt());
            System.out.println("Enter the Contact Number :- ");
            person.setPhoneNumber(sc2.nextLong());
            System.out.println("Enter the E-Mail Id :- ");
            person.setEmailId(sc2.next());
            System.out.println("\n-------------------\n");
            return person;
        }
    }
