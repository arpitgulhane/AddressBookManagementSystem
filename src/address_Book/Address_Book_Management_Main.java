package address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Address_Book_Management_Main {
    public static ArrayList<Contact> cotacts_array=new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("      ~ Welcome to Address Book ~      ");
//        System.out.println("      Enter Number 1(add) , 0(Exit) , 2(edit)    ");
        Scanner sc =new Scanner(System.in);
//        int input =sc.nextInt();
        int exit=1;


        do {
            add();
            edit();
            delete();
            System.out.println("To add new Contact press 1-9  To Exit press ' 0 ' ");
            exit =sc.nextInt();
        }while (exit!=0);

//        int exit=0;
//        do{
//            switch (input){
//                case 0:
//                    exit=1;
//                    System.out.println("  Left Thank You ...");
//                    break;
//                case 1:
//                    add();
//                    break;
//                case 2:
//                    edit();
//                    break;
////                case 2:
//
//            }
//
//        }while (exit!=1);
    }


    static void add(){
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

        Contact contact = new Contact(name, last_n, city, number, email);
        cotacts_array.add(contact);
//        System.out.println("Contact Added Successfully...");
    }
    static void edit() {
        System.out.println("Enter Name to check");
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();

        for(Contact contact : cotacts_array){
            if(newName.equals(contact.getName())){

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

                contact.setName(New_name);
                contact.setLast_N(New_last_n);
                contact.setCity(New_city);
                contact.setNumber(New_number);
                contact.setEmail(New_email);

                System.out.println("Update ...");
            }else {
                System.out.println("Sorry Not found");
            }
        }
    }

    public static void delete(){
        System.out.println("Enter Name to delete that address book :");
        Scanner sc = new Scanner(System.in);
        String deleteNameContact=sc.nextLine();
//        Contact contact;
        for(Contact contact : cotacts_array){
            if (deleteNameContact.equals(contact.getName())){
                cotacts_array.remove(contact);
                System.out.println("Contact Deleted ....");
            }else {
                System.out.println("Values you enter Not Found");
            }
        }
    }

}


class Contact{
    //String name,String lasttN,String city,String number,String email
    private String name;
    private String last_N;
    private String city;
    private String number;
    private String email;

    public Contact(String name,String lasttN,String city,String number,String email){
        this.name = name;
        this.last_N = lasttN;
        this.city = city;
        this.number = number;
        this.email = email;
    }

   public String getName(){return name;}
    public String getLast_N(){return last_N;}
    public String getCity(){return city;}
    public String getNumber(){return number;}
    public String getEmail(){return email;}

    public String setName(String new_name){
        this.name=new_name;
        return new_name;
    }

    public String setLast_N(String new_Last_N){
        this.last_N=new_Last_N;
        return new_Last_N;
    }

    public String setCity(String new_City){
        this.city=new_City;
        return new_City;
    }

    public String setNumber(String new_Number){
        this.name=new_Number;
        return new_Number;
    }
    public String setEmail(String new_Email){
        this.email=new_Email;
        return new_Email;
    }

}