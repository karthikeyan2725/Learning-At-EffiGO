import java.util.Scanner;

public class WB8_Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int secret = 3;
       int guess = scan.nextInt();

        while(guess != secret){
            System.out.print("Guess Again: ");
            guess = scan.nextInt();
        }
        System.out.println("You got it !!!");

        scan.close();
    }

}
