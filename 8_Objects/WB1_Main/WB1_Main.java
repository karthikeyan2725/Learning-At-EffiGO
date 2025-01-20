package WB1_Main;
import java.util.Arrays; 

public class WB1_Main {
    public static void main(String args[]){
        Person object = new Person();

        // Before Update
        System.out.println("Before Update:");
        System.out.println(object.name);
        System.out.println(object.nationality);
        System.out.println(object.dateOfBirth);
        System.out.println(object.seatNumber);
        System.out.println(Arrays.toString(object.passport));

        // Updating the fields 
        object.name = "Karthikeyan";
        object.nationality = "Indian";
        object.dateOfBirth = "01/03/2004";
        object.seatNumber = 5;
        object.passport = new String[]{object.name , object.nationality, object.dateOfBirth};

        // After Update
        System.out.println("After Update: ");
        System.out.println(object.name);
        System.out.println(object.nationality);
        System.out.println(object.dateOfBirth);
        System.out.println(object.seatNumber);
        System.out.println(Arrays.toString(object.passport));
    }
}
