package WB8_Main;

public class Main {
  
    public static void main(String[] args) {

        Person[] people = new Person[] { 
            new Person("Cleopatra", "Egypt", "69 BC", 1),
            new Person("Alexander the Great", "Macedon", "356 BC", 2),
            new Person("Julius Caesar", "Rome", "100 BC", 3),
            new Person("Hannibal", "Carthage", "247 BC", 4),
            new Person("Confucius", "China", "551 BC", 5),
            new Person("Pericles", "Greece", "429 BC", 6),
            new Person("Spartacus", "Thrace", "111 BC", 7),
            new Person("Marcus Aurelius", "Rome", "121 AD", 8),
            new Person("Leonidas", "Greece", "540 BC", 9),
            new Person("Sun Tzu", "China", "544 BC", 10),
            new Person("Hammurabi", "Babylon", "1750 BC", 11),
        };

        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            // 5. Populate the internal people array with setPerson(index) method
            airline.setPerson(people[i], i);
        }


        // 6. Print objects at 1,5,10
        System.out.println(airline.getPerson(1));
        System.out.println(airline.getPerson(5));
        System.out.println(airline.getPerson(10));
     }
    
  
}
