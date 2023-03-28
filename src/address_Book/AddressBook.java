package address_Book;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<Contact> cotacts_array=new ArrayList<>();

    private String getBookName;
    public AddressBook(String getBookName ){
        this.getBookName=getBookName;
    }
    public String getBookName(){return getBookName;}

    //------------------        Adding person Details       -----------------------
     void addPersonDetails(){
//        AddressBook addressBook=new AddressBook();
        Scanner sc=new Scanner(System.in);
        System.out.println("          Enter First Name :");
        String name=sc.nextLine();
        if(isDuplicate(name)){
            System.out.println(name+"  Already in contacts ...");
            return;
        }
        System.out.println("          Enter Last Name :");
        String last_Name=sc.nextLine();
        System.out.println("          Enter City :");
        String city = sc.nextLine();
         System.out.println("          Enter State :");
         String state = sc.nextLine();
        System.out.println("          Enter Number :");
        String number = sc.nextLine();
        System.out.println("          Enter email :");
        String email=sc.nextLine();
        System.out.println("          Enter address :");
        String address=sc.nextLine();
        System.out.println("          Enter zip :");
        String zip=sc.nextLine();
        Contact contact = new Contact(name, last_Name, city,state, number, email,address,zip);
        cotacts_array.add(contact);
//        System.out.println("Contact Added Successfully...");
    }

    //------------------        Edit person Details      -----------------------
    static void editPersonDetails() {
        System.out.println("    Enter existing 'Email' and 'Number' to EDIT    ");
        Scanner sc = new Scanner(System.in);
        String checkE = sc.nextLine();
        String checkNum =sc.nextLine();

        for(Contact contact : cotacts_array){
            if(checkE.equals(contact.getEmail()) && checkNum.equals(contact.getNumber())){
                System.out.println("          Enter Update First Name :");
                String New_name=sc.nextLine();
                System.out.println("          Enter Update Last Name :");
                String New_last_Name=sc.nextLine();
                System.out.println("          Enter Update City :");
                String New_city = sc.nextLine();
                System.out.println("          Enter Update Number :");
                String New_number = sc.nextLine();
                System.out.println("          Enter Update email :");
                String New_email=sc.nextLine();
                System.out.println("          Enter Update Address :");
                String new_address=sc.nextLine();
                System.out.println("          Enter Update zip :");
                String new_zip=sc.nextLine();
                contact.setName(New_name);
                contact.setLast_N(New_last_Name);
                contact.setCity(New_city);
                contact.setState(New_city);
                contact.setNumber(New_number);
                contact.setEmail(New_email);
                contact.setAddress(new_address);
                contact.setZip(new_zip);
                System.out.println("Update ...");
            }else {
                System.out.println("Sorry Not found");
            }
        }
    }

    //------------------        Delete person Details       -----------------------
     static void deletePersonDetails() {
        System.out.println("    Enter Name to delete that CONTACT :");
        Scanner sc = new Scanner(System.in);
        String deleteNameContact = sc.nextLine();
//        Contact contact;
        for (Contact contact : cotacts_array) {
            if (deleteNameContact.equals(contact.getName())) {
                cotacts_array.remove(contact);
                System.out.println("Contact Deleted ....");
            } else {
                System.out.println("Values you enter Not Found");
            }
        }
    }

    boolean isDuplicate(String checkDuplicate){
        checkDuplicate = checkDuplicate.toLowerCase();
        for (Contact contact : cotacts_array) {
        if(checkDuplicate.equals(contact.getName().toLowerCase())){
            return true;
        }
        }
        return false;
    }

    static void searchDetailsByCityOrState() {
        System.out.println("    Enter City Or State to search :");
        Scanner sc = new Scanner(System.in);
        String search_CityOrState = sc.nextLine();
        int i=1;
        for (Contact contact : cotacts_array) {
            if (search_CityOrState.equals(contact.getCity()) || search_CityOrState.equals(contact.getState())) {
                System.out.println(i+" Contacts are :");
                System.out.println(contact.getName());
                System.out.println(contact.getLast_N());
                System.out.println(contact.getCity());
                System.out.println(contact.getState());
                System.out.println(contact.getEmail());
                System.out.println(contact.getNumber());
                System.out.println(contact.getAddress());
                System.out.println(contact.getZip());
                i++;
            } else {
                System.out.println("Not Found By "+search_CityOrState);
            }
        }
    }

//    public void printContacts() {
////        if (Contact.isEmpty()) {
////            System.out.println("No contacts in address book");
////        } else {
////            for (ContactPerson contact : contacts) {
////                System.out.println(contact);
////            }
////        }
//
////            System.out.println("No contacts in address book");
////        } else {
//        for (Contact contact : cotacts_array) {
//            if (contact.getName()!=null) {
////                cotacts_array.remove(contact);
//                System.out.println("==============="+contact);
//            } else {
//                System.out.println("Values Not Found");
//            }
//        }
//    }
    }
