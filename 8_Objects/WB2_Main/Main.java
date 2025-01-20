package WB2_Main;
import java.util.Arrays;
 
public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Karthikeyan", "Indian", "01/03/2004", 478);
 
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

    }
  
  
}
