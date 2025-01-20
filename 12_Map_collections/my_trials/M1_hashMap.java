import java.util.HashMap;
import java.util.Map;

public class M1_hashMap {
    public static void main(String[] args){
        Map<Integer, String>  students = new HashMap<>();
        students.put(1, "Adithya Laxman");
        students.put(2, "Ajai Prasath");
        students.put(4, "Akshaya Ashok");
        students.put(3, "Ajay Krishna");

        System.out.println("Student at index 1: " + students.get(1));

        students.remove(2);

        System.out.println(students.toString());
    } 
}
