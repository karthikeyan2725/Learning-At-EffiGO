public class V2_UpdateVariable {
    public static void main(String[] args) {
        int passengers;
        
        // Normal Way of updating 

        passengers = 0;
        // Passengers board
        passengers = passengers + 10;
        System.out.println(passengers);
        // Passengers leave
        passengers = passengers - 4;
        System.out.println(passengers);

        // Update with the += and -= operators 

        passengers = 0;
        // Passengers board
        passengers += 10;
        System.out.println(passengers);
        // Passengers leave
        passengers -= 4;
        System.out.println(passengers);


    }
}
