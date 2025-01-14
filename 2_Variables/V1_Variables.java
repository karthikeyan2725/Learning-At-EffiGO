public class V1_Variables{
    public static void main(String args[]){
        // Create the variable
        int passengers = 10;
        System.out.println(passengers);

        // Passenger value copied to busTickets
        int busTickets = passengers;
        System.out.println(busTickets);

        // Checking if we can store value beyond the storage capacity

        int maxValue = 2_147_483_647;
        System.out.println(maxValue);

        // int exeedingMaxVal = 2_147_483_648; // maxValue + 1, prints out of range error
        // System.out.println(exeedingMaxVal);
    }
}