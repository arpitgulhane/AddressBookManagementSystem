package address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<Contact> cotacts_array=new ArrayList<>();

    private String getBookName;
    public AddressBook(String getBookName ){
        this.getBookName=getBookName;
    }
    public String getBookName(){return getBookName;}

     void add(){
//        AddressBook addressBook=new AddressBook();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Name :");
        String name=sc.nextLine();

        System.out.println("Enter Last Name :");
        String last_n=sc.nextLine();

        System.out.println("Enter City :");
        String city = sc.nextLine();

        System.out.println("Enter Number :");
        String number = sc.nextLine();

        System.out.println("Enter email :");
        String email=sc.nextLine();

        System.out.println("Enter address :");
        String address=sc.nextLine();

        System.out.println("Enter zip :");
        String zip=sc.nextLine();

        Contact contact = new Contact(name, last_n, city, number, email);
        cotacts_array.add(contact);
//        System.out.println("Contact Added Successfully...");
    }
    static void edit() {
        System.out.println("Enter existing 'Email' and 'Number' to check");
        Scanner sc = new Scanner(System.in);
        String checkE = sc.nextLine();
        String checkNum =sc.nextLine();

        for(Contact contact : cotacts_array){
            if(checkE.equals(contact.getEmail()) && checkE.equals(contact.getEmail())){

                System.out.println("Enter Update First Name :");
                String New_name=sc.nextLine();

                System.out.println("Enter Update Last Name :");
                String New_last_n=sc.nextLine();

                System.out.println("Enter Update City :");
                String New_city = sc.nextLine();

                System.out.println("Enter Update Number :");
                String New_number = sc.nextLine();

                System.out.println("Enter Update email :");
                String New_email=sc.nextLine();

                System.out.println("Enter Update Address :");
                String new_address=sc.nextLine();

                System.out.println("Enter Update zip :");
                String new_zip=sc.nextLine();

                contact.setName(New_name);
                contact.setLast_N(New_last_n);
                contact.setCity(New_city);
                contact.setNumber(New_number);
                contact.setEmail(New_email);
                contact.setEmail(new_address);
                contact.setEmail(new_zip);

                System.out.println("Update ...");
            }else {
                System.out.println("Sorry Not found");
            }
        }
    }

     static void delete() {
        System.out.println("Enter Name to delete that address book :");
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
    }
