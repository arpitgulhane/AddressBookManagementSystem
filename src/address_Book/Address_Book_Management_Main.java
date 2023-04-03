package address_Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address_Book_Management_Main {
    public static ArrayList<AddressBook> addressBook_arr = new ArrayList<>();
//    public static ArrayList<Contact> cotacts_array=new ArrayList<>();
    List<Contact> contactsInAnycity ;

    public static void main(String[] args) {
        System.out.println("      ~ Welcome to Address Book ~      ");
        addAddressBook();
    }

   static void addAddressBook(){

       Scanner get = new Scanner(System.in);
       int getMoreBook;
       int check=1;

       do {
           System.out.println("       ~ ~ ~ Enter BOOK Name ~ ~ ~         ");
           String getBookName=get.next();

// ---------- To Add AddressBook 2nd time (check)----------------------------------------------
           for (AddressBook addBook : addressBook_arr) {
               System.out.println("Nothing" + addBook);
               if (getBookName.equals(addBook.getBookName())) {
                   System.out.println(addBook+" AddressBook already present ");
                   check = 0;
               }
               else {
                   AddressBook addressBook = new AddressBook(getBookName);
                   addressBook_arr.add(addressBook);
                   System.out.println("Address Book Added ...");
                   check = 0;

                   //--------T0 add contact
                   Scanner sc =new Scanner(System.in);
                   System.out.println("             ~ ~ ~ ADD NEW CONTACT press 1-9  :: To EXIT ( 0 ZERO ) ~ ~ ~             ");
                    int exit=sc.nextInt();
                    while (exit!=0){
                        Scanner sc1 =new Scanner(System.in);
                        System.out.print("Enter command (add, edit , searchcitystate, delete, exit): ");
                        String command =sc1.nextLine();
                        switch (command) {
                            case "add":
                                addressBook.addPersonDetails();
//                                contactsInAnycity  addressBook.getContactsByCity();
                                break;
                            case "edit":
                                addressBook.editPersonDetails();
                                break;
                            case "searchcitystate":
                                addressBook.searchDetailsByCityOrState();
                                break;
                            case "delete":
                                addressBook.deletePersonDetails();
                                break;
                            case "exit":
                                break;
//                                   addressBook.printContacts();
                        }
                        System.out.println("             ~ ~ ~ ADD NEW CONTACT press 1-9  ::  To Exit press (0 ZERO) ~ ~ ~             ");
                        exit =sc.nextInt();
                    }
               }
           }
// ---------- To Add AddressBook 1st time (check)----------------------------------------------
                   if (check == 1) {
                       AddressBook addressBook = new AddressBook(getBookName);
                       addressBook_arr.add(addressBook);
                       System.out.println("Address Book Added ...");

                       //--------T0 add contact
                       Scanner sc =new Scanner(System.in);
                       System.out.println("             ~ ~ ~ ADD NEW CONTACT press 1-9  ::  To Exit press (0 ZERO) ~ ~ ~             ");
                        int exit=sc.nextInt();
                       Scanner sc2 =new Scanner(System.in);
                            while (exit!=0){
                                System.out.print("Enter command (add, edit ,Display, searchcitystate, sortByName ,ContactsByCity,ContactsByState ,ContactCountByCity,ContactCountByState, delete, exit): ");
                                String command =sc2.nextLine();
                                switch (command) {
                                    case "add":
                                        addressBook.addPersonDetails();
                                        break;
                                    case "edit":
                                        addressBook.editPersonDetails();
                                        break;
                                    case "Display":
                                        addressBook.display();
                                        break;
                                    case "searchcitystate":
                                        addressBook.searchDetailsByCityOrState();
                                        break;
                                    case "sortByName":
                                        addressBook.sortByName();
                                        break;
                                    case "ContactsByCity":
                                        addressBook.getContactsByCity();
                                        break;
                                    case "ContactsByState":
                                        addressBook.getContactsByState();
                                        break;
                                    case "ContactCountByCity":
                                        addressBook.getContactCountByCity();
                                        break;
                                    case "ContactCountByState":
                                        addressBook.getContactCountByState();
                                        break;
                                    case "delete":
                                        addressBook.deletePersonDetails();
                                        break;
                                    case "exit":
                                        break;
//                                   addressBook.printContacts();
                                }
                                   System.out.println("             ~ ~ ~ ADD NEW CONTACT press 1-9  ::  To EXIT press (0 ZERO) ~ ~ ~             ");
                                   exit =sc.nextInt();
                            }
                   }
               System.out.println("             ~ ~ ~ press 1 to 9 add onemore ADDRESS BOOK  ::  Exit ( 0 ZERO ) ~ ~ ~              ");
               getMoreBook=get.nextInt();
       }while (getMoreBook==1);
   }
}

