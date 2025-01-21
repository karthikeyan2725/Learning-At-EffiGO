import java.util.TreeMap;
import java.util.Map;

public class M2_treeMap {
    public static void main(String[] args){
        Map<Integer, String> students = new TreeMap<>(); 
        students.put(1,"Adithya Laxman");
        students.put(2, "Ajai Prasath");
        students.put(3,"Ajay Krishna");
        students.put(4, "Akshaya Ashok");
    
        System.out.println(students.toString()); 

        students.remove(2);
    }
}
