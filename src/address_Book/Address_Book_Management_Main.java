package address_Book;

public class Address_Book_Management_Main {
    public static void main(String[] args) {


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