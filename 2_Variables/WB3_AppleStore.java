public class WB3_AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;
    

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;

        System.out.println("Time for business! You're selling each apple for 40 cents");
        int price = 40;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfCustomers++;
        numOfApples -= 4;
        profit = 4 * price;

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers++;
        numOfApples -= 20;
        profit += 20 * price;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfCustomers++;
        numOfApples -= 200;
        profit += 200 * price;
        

        System.out.println("Wow! So far, you made: $" + profit/100);
        System.out.println(numOfCustomers + " + customers love your apples.");
        System.out.println("You have "+ numOfApples +" apples left.");
    }

}
