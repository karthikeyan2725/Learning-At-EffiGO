import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // Creating and instantiating employeeMap
        Map<Integer, Employee> employeeMap = new LinkedHashMap<>();

        employeeMap.put(1, new Employee("Adhitya", 1));
        employeeMap.put(2, new Employee("Ajai Prasath", 2));
        employeeMap.put(3, new Employee("Ajay Krishna", 3));
        employeeMap.put(4, new Employee("Akshaya Ashok", 4));

        employeeMap.entrySet().stream()
        .forEach((entry) -> System.out.println(entry.getValue()));

        for(int i = 0; i < employeeMap.size(); i++){
            System.out.println("> Employee " + employeeMap.get(i));
        }

        // Finding employee with even id and printing them
        employeeMap.entrySet().stream()
            .filter((entry) -> entry.getValue().getEmployeeId() % 2 == 0)
            .forEach((entry) -> System.out.println(entry.getValue()));
        
        // Finding Objects with key greater than given number,
        // and printing the corresponding employee name
        Optional<String> firstEntryGT = employeeMap.entrySet().stream()
            .filter((entry) -> entry.getKey() > 4)
            .map((entry) -> entry.getValue().getName())
            .findFirst();

        System.out.println(Collectors.toList());

        // Using Optional to check for null values
        if(firstEntryGT.isPresent()){
            System.out.println("Found Key : " + firstEntryGT.get());
        } else{
            System.out.println("No keys found");
        }
        
        Predicate<Integer> a;
    }
}
