package address_Book;

public class Contact {

//    class Contact{
        public static void display(){
            System.out.println("Display");
        }
        //String name,String lasttN,String city,String number,String email
        private String name;
        private String last_Name;
        private String city;
        private String state;
        private String number;
        private String email;
        private String address;
        private String zip;

        public Contact(String name,String lasttN,String city,String state,String number,String email,String address,String zip){
            this.name = name;
            this.last_Name = lasttN;
            this.city = city;
            this.state = state;
            this.number = number;
            this.email = email;
            this.address = address;
            this.zip = zip;
        }

        //-------------     Get Daetails  ----------------------------------------
        public String getName(){return name;}
        public String getLast_N(){return last_Name;}
        public String getCity(){return city;}
        public String getState(){return state;}
        public String getNumber(){return number;}
        public String getEmail(){return email;}
        public String getAddress(){return address;}
        public String getZip(){return zip;}

    ////-------------   Set Details Like Name=arpit ----------------------------------------
        public String setName(String new_name){
            this.name=new_name;
            return new_name;
        }

        public String setLast_N(String new_last_Name){
            this.last_Name=new_last_Name;
            return new_last_Name;
        }

        public String setCity(String new_City){
            this.city=new_City;
            return new_City;
        }
        public String setState(String new_State){
            this.state=new_State;
            return new_State;
        }

        public String setNumber(String new_Number){
            this.name=new_Number;
            return new_Number;
        }
        public String setEmail(String new_Email){
            this.email=new_Email;
            return new_Email;
        }
        public String setAddress(String new_address){
            this.address=new_address;
            return new_address;
        }
        public String setZip(String new_zip){
            this.email=new_zip;
            return new_zip;
        }
}
