package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Contact {

private String name;
private String street;
private String city;
private String state;
private int zip;
private int number;


public void ContactEntry() {}

public void ContactEntry(String name, String street,String city,String state,int zip,
                        int number  ){
        this.name = name;
        this.street = street;
        this.city =city;
        this.state = state;
        this.zip = zip;
        this.number = number;
        
        }

public String getName(){
        return name;
        }
public void setName(String name){
        this.name = name;
        }

public String getstreet(){
        return street;
        }
public void setAddress(String street){
        this.street = street;
        }
public String getcity(){
    return city;
    }
public void setcity(String city){
    this.city = city;}

public String getstate(){
    return state;
    }
public void setstate(String state){
    this. state = state;}

public int getzip(){
    return zip;
    }
public void setzip(int zip){
    this.zip = zip;}


public int getnumber(){
        return number;
        }
public void setnumber(int number){
        this.number = number;}




public String toString(){
        return "Name: " + name + ", Street: " + street + ",City:" + city +",State:"+ state +",Zip:"+ zip
         + ",Number:"+ number;
        }

public static class AddressBook {

	private List<ContactEntry> listOfEntries;

	public AddressBook() {
	   
	    this.listOfEntries = new ArrayList<>();
	}

	public void add(ContactEntry contactEntry) {
	    
	    this.listOfEntries.add(contactEntry);
	}

	public void delete(int index) {
	    
	    this.listOfEntries.remove(index);
	}

	public ContactEntry get(int index) {
	    
	    return this.listOfEntries.get(index);
	}

	public ContactEntry[] viewAll() {
	   
	    ContactEntry[] result = new ContactEntry[this.listOfEntries.size()];

	    
	    this.listOfEntries.toArray(result);

	    return result;
	}
	public static void main(String[] args) {

	   

	    String input;
	    Scanner in = new Scanner(System.in);

	    AddressBook addressBook = new AddressBook();

	    boolean stop = false;
	    do
	    {

	        System.out.println("\nMain Menu");
	        System.out.println("1. Add an Entry");
	        System.out.println("2. Delete an Entry");
	        System.out.println("3. View All Entries");
	        System.out.println("4. Update an Entry");
	        System.out.println("5. Exit");
	        System.out.print("Please enter Choices from 1 to 5: \n");
	        input =(in.next());



	        switch (input) {
	            case "1":
	                
	                ContactEntry entry = new ContactEntry();

	                System.out.println("***Adding Entry in Address Book***");

	                System.out.print("Full Name: ");
	                entry.setName(in.next());

	                System.out.print("Street: ");
	                entry.setStreet(in.next());

	                System.out.print("City: ");
	                entry.setCity(in.nextInt());

	                System.out.print("State: ");
	                entry.setState(in.next());
	                
	                System.out.print("Zip: ");
	                entry.setZip(in.next());
	                
	                System.out.print("Number: ");
	                entry.setNumber(in.next());
	                
	                Contact.add(entry);

	                System.out.println("Added a new entry.");
	                break;

	            case "2":
	                System.out.println("Enter the index of the entry, which you want to delete:");
	                
	                Contact.delete(in.nextInt());

	                break;

	            case "3":
	                System.out.println("Your addressbook contains the following entries:");
	                
	                ContactEntry[] listOfEntries = Contact.viewAll();

	               
	                for (int i = 0; i < listOfEntries.length; i++) {
	                    System.out.println(listOfEntries[i].toString());
	                }

	                break;
	            case "4":
	                System.out.println("Enter the index of the entry, which you want to update:");
	               
	                ContactEntry entryToUpdate = Contact.get(in.nextInt());

	                System.out.print("Full Name (current: " + entryToUpdate.getName() + "):");
	                entryToUpdate.setName(in.next());

	                System.out.print("Street: (current: " + entryToUpdate.getstreet() + "):");
	                entryToUpdate.setStreet(in.next());

	                System.out.print("City:  (current: " + entryToUpdate.getCity() + "):");
	                entryToUpdate.setCity(in.next());

	                System.out.print("State: (current: " + entryToUpdate.getState() + "):");
	                entryToUpdate.setState(in.next());

	                System.out.print("Zip: (current: " + entryToUpdate.getZip() + "):");
	                entryToUpdate.setZip(in.nextInt());
	                
	                System.out.print("Mobile Number: (current: " + entryToUpdate.getNumber() + "):");
	                entryToUpdate.setNumber(in.nextInt());


	                break;

	            default:
	                break;
	        }
	    
	    } while (!input.equals("5"));
	    System.out.println("Goodbye");
	}
	}

public static ContactEntry get(int nextInt) {
	// TODO Auto-generated method stub
	return null;
}

public static void add(ContactEntry entry) {
	// TODO Auto-generated method stub
	
}

public static void delete(int nextInt) {
	// TODO Auto-generated method stub
	
}

public static ContactEntry[] viewAll() {
	// TODO Auto-generated method stub
	return null;
}
}