package address_Book;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    public static ArrayList<Contact> cotacts_array = new ArrayList<>();
    private Map<String, List<Contact>> cityDictionary = new HashMap<>();
    private Map<String, List<Contact>> stateDictionary = new HashMap<>();
    List<Contact> contactsInAnycity;
    List<Contact> contactsInCA;
    //    AddressBook addressBook = new AddressBook();
    private String getBookName;

//    public AddressBook(String getBookName) {
//        this.getBookName = getBookName;
//    }

//    public String getBookName() {
//        return getBookName;
//    }

    //----------------------Book Logic-----------------------

    public static ArrayList<AddressBook> addressBook_arr = new ArrayList<>();

    static void addAddressBook() {

        Scanner get = new Scanner(System.in);
        int getMoreBook;
        int check = 1;

        do {
            System.out.println("\n       ~ ~ ~ Enter BOOK Name ~ ~ ~         ");
            String getBookName = get.next();

// ---------- To Add AddressBook 2nd time (check)----------------------------------------------
            for (AddressBook addBook : addressBook_arr) {
                System.out.println("Nothing" + addBook);
                if (getBookName.equals(addBook)) {
                    System.out.println(addBook + " AddressBook already present ");
                    check = 0;
                } else {
                    AddressBook addressBook = new AddressBook();
                    addressBook_arr.add(addressBook);
                    System.out.println("Address Book Added ...");
                    check = 0;

                    //--------T0 add contact
                    Scanner sc = new Scanner(System.in);
                    System.out.println("\n             ~ ~ ~ ADD NEW CONTACT press 1-9  :: To EXIT ( 0 ZERO ) ~ ~ ~             ");
                    int exit = sc.nextInt();
                    while (exit != 0) {
                            Scanner sc1 = new Scanner(System.in);
                            System.out.print("Enter command \t\t( Add , Edit , Display , Searchcitystate ," +
                                    "\t SortByName , SortByCity , SortByState , SortByZip , \n" +
                                    "\t \t\t \t\t \tContactsByCity , ContactsByState , ContactCountByCity , ContactCountByState ," +
                                    "WriteToFile , "+"ReadFromFile"+
                                    "\t Delete , Exit ): \n");
                            String command = sc1.nextLine();
                            switch (command) {
                                case "Add":
                                    addressBook.addPersonDetails();
                                    break;
                                case "Edit":
                                    addressBook.editPersonDetails();
                                    break;
                                case "Display":
                                    addressBook.display();
                                    break;
                                case "Searchcitystate":
                                    addressBook.searchDetailsByCityOrState();
                                    break;
                                case "SortByName":
                                    addressBook.sortByName();
                                    break;
                                case "SortByCity":
                                    addressBook.sortByCity();
                                    break;
                                case "SortByState":
                                    addressBook.sortByState();
                                    break;
                                case "SortByZip":
                                    addressBook.sortByZip();
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
                                case "WriteToFile":
                                    addressBook.writeToFile();
                                    break;
                                case "ReadFromFile":
                                    addressBook.readFromFile();
                                    break;
                                case "Delete":
                                    addressBook.deletePersonDetails();
                                    break;
                                case "Exit":
                                    break;
//                                   addressBook.printContacts();
                            }
                            System.out.println("\n             ~ ~ ~ ADD NEW CONTACT press 1-9  ::  To EXIT press (0 ZERO) ~ ~ ~             ");
                            exit = sc.nextInt();
                        }
                }
            }
// ---------- To Add AddressBook 1st time (check)----------------------------------------------
            if (check == 1) {
                AddressBook addressBook = new AddressBook();
                addressBook_arr.add(addressBook);
                System.out.println("Address Book Added ...");

                //--------T0 add contact
                Scanner sc = new Scanner(System.in);
                System.out.println("\n             ~ ~ ~ ADD NEW CONTACT press 1-9  ::  To Exit press (0 ZERO) ~ ~ ~             ");
                int exit = sc.nextInt();
                Scanner sc2 = new Scanner(System.in);
                while (exit != 0) {
                    System.out.print("Enter command \t\t( Add , Edit , Display , Searchcitystate ," +
                            "\t SortByName , SortByCity , SortByState , SortByZip , \n" +
                            "\t \t\t \t\t \tContactsByCity , ContactsByState , ContactCountByCity , ContactCountByState ," +
                            "WriteToFile , "+"ReadFromFile"+
                            "\t Delete , Exit ): \n");
                    String command = sc2.nextLine();
                    switch (command) {
                        case "Add":
                            addressBook.addPersonDetails();
                            break;
                        case "Edit":
                            addressBook.editPersonDetails();
                            break;
                        case "Display":
                            addressBook.display();
                            break;
                        case "Searchcitystate":
                            addressBook.searchDetailsByCityOrState();
                            break;
                        case "SortByName":
                            addressBook.sortByName();
                            break;
                        case "SortByCity":
                            addressBook.sortByCity();
                            break;
                        case "SortByState":
                            addressBook.sortByState();
                            break;
                        case "SortByZip":
                            addressBook.sortByZip();
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
                        case "WriteToFile":
                            addressBook.writeToFile();
                            break;
                        case "ReadFromFile":
                            addressBook.readFromFile();
                            break;
                        case "Delete":
                            addressBook.deletePersonDetails();
                            break;
                        case "Exit":
                            break;
//                                   addressBook.printContacts();
                    }
                    System.out.println("\n             ~ ~ ~ ADD NEW CONTACT press 1-9  ::  To EXIT press (0 ZERO) ~ ~ ~             ");
                    exit = sc.nextInt();
                }
            }
            System.out.println("\n             ~ ~ ~ press 1 to 9 add onemore ADDRESS BOOK  ::  Exit ( 0 ZERO ) ~ ~ ~              ");
            getMoreBook = get.nextInt();
        } while (getMoreBook == 1);
    }


    //------------------        Adding person Details       -----------------------
    void addPersonDetails() {
//        AddressBook addressBook=new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("          Enter First Name :");
        String name = sc.nextLine();
        if (isDuplicate(name)) {
            System.out.println(name + "arpit these  Already in contacts ...");
            return;
        }
        System.out.println("          Enter Last Name :");
        String last_Name = sc.nextLine();
        System.out.println("          Enter City :");
        String city = sc.nextLine();
        System.out.println("          Enter State :");
        String state = sc.nextLine();
        System.out.println("          Enter Number :");
        String number = sc.nextLine();
        System.out.println("          Enter email :");
        String email = sc.nextLine();
        System.out.println("          Enter address :");
        String address = sc.nextLine();
        System.out.println("          Enter zip :");
        String zip = sc.nextLine();
        Contact contact = new Contact(name, last_Name, city, state, number, email, address, zip);
        addContactToDictionary(contact);
        cotacts_array.add(contact);
//        System.out.println("Contact Added Successfully...");
    }

    //------------------        Edit person Details      -----------------------
    static void editPersonDetails() {
        System.out.println("\n    Enter existing 'Email' and 'Number' to EDIT    \n");
        Scanner sc = new Scanner(System.in);
        String checkE = sc.nextLine();
        String checkNum = sc.nextLine();

        for (Contact contact : cotacts_array) {
            if (checkE.equals(contact.getEmail()) && checkNum.equals(contact.getNumber())) {
                System.out.println("          Enter Update First Name :");
                String New_name = sc.nextLine();
                System.out.println("          Enter Update Last Name :");
                String New_last_Name = sc.nextLine();
                System.out.println("          Enter Update City :");
                String New_city = sc.nextLine();
                System.out.println("          Enter Update Number :");
                String New_number = sc.nextLine();
                System.out.println("          Enter Update email :");
                String New_email = sc.nextLine();
                System.out.println("          Enter Update Address :");
                String new_address = sc.nextLine();
                System.out.println("          Enter Update zip :");
                String new_zip = sc.nextLine();
                contact.setName(New_name);
                contact.setLast_N(New_last_Name);
                contact.setCity(New_city);
                contact.setState(New_city);
                contact.setNumber(New_number);
                contact.setEmail(New_email);
                contact.setAddress(new_address);
                contact.setZip(new_zip);
                System.out.println("Update ...");
            } else {
                System.out.println("Sorry arpit Data Not found");
            }
        }
    }

    //------------------        Delete person Details       -----------------------
    static void deletePersonDetails() {
        System.out.println("\n    Enter Name to delete that CONTACT : \n");
        Scanner sc = new Scanner(System.in);
        String deleteNameContact = sc.nextLine();
//        Contact contact;
        for (Contact contact : cotacts_array) {
            if (deleteNameContact.equals(contact.getName())) {
                cotacts_array.remove(contact);
                System.out.println("Contact Deleted ....");
                return;
            } else {
                System.out.println("arpit Values you enter Not Found");
            }
        }
    }

    boolean isDuplicate(String checkDuplicate) {
        checkDuplicate = checkDuplicate.toLowerCase();
        for (Contact contact : cotacts_array) {
            if (checkDuplicate.equals(contact.getName().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    static void searchDetailsByCityOrState() {
        System.out.println("\n    Enter City Or State to search :\n");
        Scanner sc = new Scanner(System.in);
        String search_CityOrState = sc.nextLine();
        int i = 1;
        for (Contact contact : cotacts_array) {
            if (search_CityOrState.equals(contact.getCity()) || search_CityOrState.equals(contact.getState())) {
                System.out.println(i + " Contacts are :");
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
                System.out.println("Not Found By " + search_CityOrState);
            }
        }
    }

    public void addContactToDictionary(Contact contact) {
        String city = contact.getCity();
        String state = contact.getState();
        if (!cityDictionary.containsKey(city)) {
            cityDictionary.put(city, new ArrayList<>());
        }
        cityDictionary.get(city).add(contact);

        if (!stateDictionary.containsKey(state)) {
            stateDictionary.put(state, new ArrayList<>());
        }
        stateDictionary.get(state).add(contact);
    }

//    List<ContactPerson> contactsInAnycity = addressBook.getContactsByCity("Anycity");
//System.out.println("Contacts in Anycity:");
//for (ContactPerson contact : contactsInAnycity) {
//        System.out.println(contact);
//    }
//
//    // Get contacts by state
//    List<ContactPerson> contactsInCA = addressBook.getContactsByState("CA");
//System.out.println("Contacts in California:");
//for (ContactPerson contact : contactsInCA) {
//        System.out.println(contact); }
//public List<ContactPerson> getContactsByCity(String city) {
//    if (cityDictionary.containsKey(city)) {
//        return cityDictionary.get(city);
//    } else {
//        return new ArrayList<>();
//    }
//}
//
//    public List<ContactPerson> getContactsByState(String state) {
//        if (stateDictionary.containsKey(state)) {
//            return stateDictionary.get(state);
//        } else {
//            return new ArrayList<>();
//        }
//    }


    // working code before Use Java Streams
//    public List<Contact> getContactsByCity() {
//        System.out.println("To get contact by city enter City Name :");
//        Scanner sc=new Scanner(System.in);
//        String city=sc.nextLine();
//        // check in Dictionary
//        if (cityDictionary.containsKey(city)) {
//             cityDictionary.get(city);
//        } else {
//             new ArrayList<>();
//        }
//        for (Contact contact : contactsInAnycity) {
//        System.out.println(contact);
//    }
//        return null;
//    }

//    public List<Contact> getContactsByState() {
//        System.out.println("To get contact by city enter City Name :");
//        Scanner sc=new Scanner(System.in);
//        String state=sc.nextLine();
//        if (stateDictionary.containsKey(state)) {
//            stateDictionary.get(state);
//        } else {
//            new ArrayList<>();
//        }
//        for (Contact contact : contactsInCA) {
//        System.out.println(contact); }
//        return null;
//    }

//    public void getContactCountByCity() {
//        System.out.println("To get count enter City Name :");
//        Scanner sc=new Scanner(System.in);
//        String city=sc.nextLine();
//        if (cityDictionary.containsKey(city)) {
//            System.out.println(cityDictionary.get(city).size());
//        } else {
//            System.out.println("Not Found");
//        }
//    }

//    public void getContactCountByState() {
//        System.out.println("To get count enter State Name :");
//        Scanner sc=new Scanner(System.in);
//        String state=sc.nextLine();
//        if (stateDictionary.containsKey(state)) {
//            System.out.println(stateDictionary.get(state).size());
//        } else {
//            System.out.println("Not Found");
//        }
//    }

    //--------------------New by Streams ------------------------------
    public void getContactsByCity() {
        System.out.println("\nTo get contact by city enter City Name :\n");
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        cityDictionary.getOrDefault(city, Collections.emptyList()).forEach(n -> System.out.println(n));
    }

    public void getContactsByState() {
        System.out.println("\nTo get contact by city enter City Name :\n");
        Scanner sc = new Scanner(System.in);
        String state = sc.nextLine();
        stateDictionary.getOrDefault(state, Collections.emptyList()).forEach(n -> System.out.println(n));
    }

    public void getContactCountByCity() {
        System.out.println("\nTo get count enter City Name :\n");
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        int count = cityDictionary.getOrDefault(city, Collections.emptyList()).size();
        System.out.println(count);
    }

    public void getContactCountByState() {
        System.out.println("\nTo get count enter State Name :\n");
        Scanner sc = new Scanner(System.in);
        String state = sc.nextLine();
        int count = stateDictionary.getOrDefault(state, Collections.emptyList()).size();
        System.out.println(count);
    }


    // Sort contacts by Zip using Java Streams
    public void sortByZip() {
        cotacts_array.stream()
                .sorted(Comparator.comparing(Contact::getZip))
                .collect(Collectors.toList());
        System.out.println("\n After Sort Zip : \n");
        this.display();
    }
    public void sortByName() {
        Comparator<Contact> comparator = Comparator.comparing(Contact::getName)
                .thenComparing(Contact::getLast_N);
        Collections.sort(this.cotacts_array, comparator);
    }

    // Sort contacts by City using Java Streams
    public void sortByCity() {
        cotacts_array.stream()
                .sorted(Comparator.comparing(Contact::getCity))
                .collect(Collectors.toList());
        System.out.println("\n After Sort City : \n");
        this.display();
    }

    // Sort contacts by State using Java Streams
    public void sortByState() {
        cotacts_array.stream()
                .sorted(Comparator.comparing(Contact::getState))
                .collect(Collectors.toList());
        System.out.println("\n After Sort State : \n");
        this.display();

    }

    //-------------------------------------------------------------------------
    // Write the address book to a file
    public void writeToFile() {
        System.out.println("\n Enter File Path to Write : ex: C:\\Users\\USER\\Desktop\\arpit2.txt\n");
        Scanner sc = new Scanner(System.in);
        String filepath = sc.nextLine();
////        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
        try (FileWriter fileWriter = new FileWriter(filepath);) {
            fileWriter.write(String.valueOf(cotacts_array));
            System.out.println("Write Contacts To File ~ "+filepath);
        } catch (IOException e) {
            System.out.println("path not valid");
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        System.out.println("\n Enter file Path to read : ex: C:\\Users\\USER\\Desktop\\arpit2.txt\n");
        Scanner sc = new Scanner(System.in);
        String filepath = sc.nextLine();

//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
        try (BufferedReader br  = new BufferedReader(new FileReader(filepath));) {
            String str;
            System.out.println("Read from "+filepath);
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("path not valid");
            e.printStackTrace();
        }
    }

    public void display() {
//        if (Contact.isEmpty()) {
//            System.out.println("No contacts in address book");
//        } else {
//            for (ContactPerson contact : contacts) {
//                System.out.println(contact);
//            }
//        }

//            System.out.println("No contacts in address book");
//        } else {
        for (Contact contact : cotacts_array) {
            if (contact.getName() != null) {
//                cotacts_array.remove(contact);
                System.out.println(contact);
            } else {
                System.out.println("Values Not Found");
                return;
            }
        }
    }


}
