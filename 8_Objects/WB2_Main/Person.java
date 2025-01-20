package WB2_Main;

public class Person {
    
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;
 
    // Setting fields except passport
    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

}
