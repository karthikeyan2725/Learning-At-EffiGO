package WB8_Main;

public class Airline {
    
    Person[] people; //array that stores Person objects...

    // 1. Add Constructor
    public Airline(){
        // 2. assign array of size 11 to people
        people = new Person[11];
    }

    // 3. Create getter to get the person of specific index
    public Person getPerson(int index){
        if (0 < index && index < 11){
            return new Person(people[index]);
        } else{
            return null;
        }
    }

    // 4. Create setPerson method, by indexing the people array with person object passed
    public void setPerson(Person person, int index){
        if (0 < index && index < 11){
            people[index] = new Person(person);
        }
    }

}
