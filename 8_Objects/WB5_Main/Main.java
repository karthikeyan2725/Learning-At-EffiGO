 package WB5_Main;

 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
        person.chooseSeat();
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        if(person.applyPassport()){
            System.out.println("Your Passport is processed and applied successfully, " + person.getName());
        } else{
            System.out.println("Get Out, Mr." + person.getName());
        }
    }
  
  
}
