package WB5_Main;

public class Person {
    
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    /**
     *  Function name: applyPassport
     *  @return (boolean)
     *
     *  Inside the function:
     *     1. Returns a random boolean of true or false.
     */
    public Boolean applyPassport(){
        int randomBinary = (int)(Math.random() * 2);
        return randomBinary == 1;
    }

    /**
     *  Function name: chooseSeat
     *
     *  Inside the function:
     *    1. Sets this.seat to a random number between 1 -- 11.
     */
        public void chooseSeat(){
            int randomSeat = (int)(Math.random() * 12 + 1);
            seatNumber = randomSeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

 
}
