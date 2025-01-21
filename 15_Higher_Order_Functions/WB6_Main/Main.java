import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        System.out.println("\n**************************************");
        // names.stream()
        names.stream()
        .map(name -> "Hello, " + name + "!")
        .forEach(string -> System.out.println(string));
   
        System.out.println("\n**************************************");
        
        List<String> usernames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");
     
        // String username =  usernames.stream();
        
        // System.out.println("Found you: " + username);
        String neon_ninja = usernames.stream()
        .filter(username -> username.equals("neon_ninja"))
        .findFirst()
        .orElse(null);
        if(neon_ninja != null){
            System.out.println("Found you neon_ninja");
        }

        System.out.println("\n**************************************");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // long numEven = numbers.stream()
        
        // System.out.println("There are " + numEven + " even numbers in this list");
        long numberOfEven = numbers.stream()
            .filter(number -> (number % 2 == 0))
            .count();
        System.out.println("There are " + numberOfEven + " even numbers in this list.");
    }   
    
}


