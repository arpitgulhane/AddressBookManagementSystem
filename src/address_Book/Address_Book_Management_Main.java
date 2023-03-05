package address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Address_Book_Management_Main {
    public static ArrayList<AddressBook> addressBook_arr = new ArrayList<>();
//    public static ArrayList<Contact> cotacts_array=new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("      ~ Welcome to Address Book ~      ");
        addAddressBook();
    }

   static void addAddressBook(){

       Scanner get = new Scanner(System.in);

       int getMoreBook;
       int check=1;

       do {
           System.out.println("Enter bookname :");
           String getBookName=get.next();
           for (AddressBook addBook : addressBook_arr) {
               System.out.println("Nothing" + addBook);
               if (getBookName.equals(addBook.getBookName())) {
                   System.out.println(addBook+"AddressBook already present");
                   check = 0;
               } else {
                   AddressBook addressBook = new AddressBook(getBookName);
                   addressBook_arr.add(addressBook);
                   System.out.println("Address Book Added ...");
                   check = 0;
//               System.out.println(" if You Want to add Contact   Enter Number 1(add) , 0(Exit) , 2(edit)  ,3(delete)  ");
//               Scanner sc =new Scanner(System.in);
//        int exit=sc.nextInt();
//        while (exit!=0){
                   addressBook.add();
                   addressBook.edit();
                   addressBook.delete();
//        System.out.println("To add new Contact press 1-9  To Exit press ' 0 ' ");
//        exit =sc.nextInt();
//    }
// --------------------------------------------------------
               }
           }
           if (check == 1) {
               AddressBook addressBook = new AddressBook(getBookName);
               addressBook_arr.add(addressBook);
               System.out.println("Address Book Added ...");
               //               System.out.println(" if You Want to add Contact   Enter Number 1(add) , 0(Exit) , 2(edit)  ,3(delete)  ");
//               Scanner sc =new Scanner(System.in);
//        int exit=sc.nextInt();
//        while (exit!=0){
               addressBook.add();
               addressBook.edit();
               addressBook.delete();
//        System.out.println("To add new Contact press 1-9  To Exit press ' 0 ' ");
//        exit =sc.nextInt();
//    }
               ;
           }
           System.out.println("press 1 to add onemore Address Book 0 to Exit");
           getMoreBook=get.nextInt();
       }while (getMoreBook==1);
   }
}

