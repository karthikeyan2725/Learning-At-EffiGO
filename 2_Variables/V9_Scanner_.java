import java.util.Scanner;

public class V9_Scanner_ {
   public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.print("Good to know you " + name + ", How much coffee every day? :");
        int numOfCoffee = scanner.nextInt();
        
        System.out.print("You drink " + numOfCoffee + " Per day !!! How much it costs?");
        double coffeePrice = scanner.nextDouble();

        System.out.println(coffeePrice + ". Okay then.");

        scanner.close();  
   } 
}
