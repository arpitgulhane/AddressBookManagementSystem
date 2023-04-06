package address_Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address_Book_Management_Main {
    //    public static ArrayList<Contact> cotacts_array=new ArrayList<>();
    List<Contact> contactsInAnycity;

    public static void main(String[] args) {
        System.out.println("      ~ Welcome to Address Book ~      ");
        AddressBook addressBook = new AddressBook();
        addressBook.addAddressBook();
    }

}

