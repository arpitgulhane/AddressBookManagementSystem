package address_Book;

import java.util.Scanner;

public class Address_Book_Management_Main {
    public static void main(String[] args) {
        System.out.println("---   Welcome to Address Book   ---");
        System.out.println("      Enter Number 1(add) , 0(Exit)      ");
        Scanner sc =new Scanner(System.in);
        int input =sc.nextInt();

        int exit=0;
        do{
            switch (input){
                case 0:
                    exit=1;
                    System.out.println("  Left Thank You ...");
                    break;
                case 1:
                    add();
                    break;
//                case 2:


            }

        }while (exit!=1);
    }


    static void add(){
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

        Contact Contact = new Contact(name, last_n, city, number, email);
        System.out.println("Contact Added Successfully...");

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

}