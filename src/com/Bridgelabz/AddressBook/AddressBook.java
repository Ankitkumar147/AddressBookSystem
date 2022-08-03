package com.Bridgelabz.AddressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class AddressBook {

    private static Map<String, Person> personMap = new HashMap<>();
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
                    addPersonDetails();
                    break;
                case 2:
                    System.out.println("Enter to details to edit.");
                    editContact();
                    break;
                case 3:
                    System.out.println(personMap.toString());
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    isExit=true;
            }
        } while (!isExit);
    }
        private static void addPersonDetails () {
            Person person;
            person = contactFields();
            personMap.put(person.getFirstName(), person);
            System.out.println(personMap.toString());
        }

        private static void editContact () {
            System.out.println("Enter the first name of Person to edit : ");
            String firstName = sc2.next();
            Person newPerson = personMap.get(firstName);
            //System.out.println(newPerson.toString());
            if (personMap.get(firstName) != null) {
                Person person = contactFields();
                for (int j = 0; j < personMap.size(); j++) {
                    if (personMap.get(firstName).getFirstName().equalsIgnoreCase(newPerson.getFirstName())) {
                        personMap.put(person.getFirstName(), person);
                    }
                }
            }
            System.out.println("\n\t\t" + personMap.toString());
        }

        private static void deleteContact() {
            System.out.println("Enter the first name of Person to delete : ");
            String firstName = sc2.next();
            Person newPerson = personMap.get(firstName);
            System.out.println(newPerson.toString());
            if (newPerson != null) {
                personMap.remove(firstName);
                System.out.println("Deleted Successfully");
            } else {
                System.out.println("Record Not Exist");
            }
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
