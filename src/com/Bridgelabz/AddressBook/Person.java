package com.Bridgelabz.AddressBook;

public class Person {

    //public class contacts {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zipCode;
    private long phoneNumber;
    private String email;

    //public Person(String firstName, String lastName, String city,String state,int zipCode,long phoneNumber,String email){
    //  this.firstName = firstName;
    //this.lastName = lastName;
    //this.city = city;
    //this.state = state;
    //this.zipCode = zipCode;
    //    this.phoneNumber = phoneNumber;
    //  this.email = email;
    // }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmailId(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "[ Person ] { \n Full Name :- "+firstName+" "+lastName +"\n Address----> \n City :- "+city+"\n State :- "+state+"\n Postal Code :- "+zipCode+"\n Contact Details -----> "+"\n Phone NUmber :- "+phoneNumber+"\n Email Id :- "+email+ "\n}"+"\n<------------------------------>\n";
    }
}
