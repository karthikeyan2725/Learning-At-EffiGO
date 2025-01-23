import java.util.*;

class Maps{
    public static void main(String[] args){
        Map<Integer, String> students = new HashMap<>();

        // Storing the value in Map
        students.put(1, "Adhitya");
        students.put(2,"Ajai");
        students.put(3, "Ajay Krishna");

        // Fetching the value from the Map
        System.out.println(students.get(1));

        // Storing in same key 
        System.out.println(students.values());

        // KeySet
        System.out.println(students.keySet());

        // size
        System.out.println(students.size());

    }
}