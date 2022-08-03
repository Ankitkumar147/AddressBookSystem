package com.Bridgelabz.AddressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class AddressBook {

    private static Map<String, Person> personMap = new HashMap<>();
    private static Map<String, Map<String, Person>> addressBookMap = new HashMap();
    private static Scanner sc2 = new Scanner(System.in);
    //Person person = new Person();

    public static void main(String[] args) throws IllegalStateException {
        boolean isExit = false;
        do {
            System.out.println("Welcome to the Address Book.");
            System.out.println("Choose the desired options :--- \n 1. Add contact.\n 2. Edit contact. \n 3. Show.\n 4. Delete.");
            System.out.println(" 5. Exit");
            int choice = sc2.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please Enter the desired contact in the Address Book.");
                    addBook();
                    break;
                case 2:
                    System.out.print("\nEnter the first name of the person to edit : ");
                    String firstName = sc2.next();
                    System.out.print("\nEnter the city name of the person to edit : ");
                    String cityName = sc2.next();
                    editContact(firstName,cityName);
                    break;
                case 3:
                    System.out.println("\n\t\t"+personMap.toString());
                    System.out.println("\n\t\t" + addressBookMap.toString());
                    break;
                case 4:
                    System.out.print("\nEnter the first name of the person to edit : ");
                    String personName = sc2.next();
                    System.out.print("\nEnter the city name of the person to edit : ");
                    String city = sc2.next();
                    deleteContact(personName, city);
                    break;
                case 5:
                    isExit=true;
                    break;
                default:
                    System.out.println("Please Select Correct option.!!!");
                    break;
            }
        } while (!isExit);
    }
       // private static void addPersonDetails () {
         //   Person person;
           // person = contactFields();
           // personMap.put(person.getFirstName(), person);
            //addressBookMap.put(personMap.getCity());
           // System.out.println(personMap.toString());
       // }
        private static void addBook(){
        Map<String,Person> newPersonMap = new HashMap();
        Person newPerson;
        newPerson = contactFields();
        if (addressBookMap.get(newPerson.getCity()) != null){
            newPersonMap = addressBookMap.get(newPerson.getCity());
            newPersonMap.put(newPerson.getFirstName(),newPerson);
            addressBookMap.put(newPerson.getCity(),newPersonMap);
            System.out.println("\n\t\t"+addressBookMap.toString());
        }
        }

        private static void editContact (String firstName, String cityName) {
            personMap = addressBookMap.get(cityName);
            System.out.println(personMap.toString());
            if (addressBookMap.get(cityName).get(firstName) != null) {
                Person editedPerson = contactFields();
                personMap.put(editedPerson.getFirstName(), editedPerson);
                addressBookMap.put(editedPerson.getCity(), personMap);
            } else {
                System.out.println("Record Not Found");
            }
            System.out.println("\n\t\t" + addressBookMap.toString());
        }
        private static void deleteContact(String firstName,String cityName) {
            Person newPerson = addressBookMap.get(cityName).get(firstName);
            System.out.println(newPerson.toString());
           // if (addressBookMap.get(cityName).get(firstName) != null ) {
                addressBookMap.get(cityName).remove(firstName);
                System.out.println("Deleted Successfully");
           // } else {
             //   System.out.println("Record Not Exist");

            System.out.println(addressBookMap.toString());
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
