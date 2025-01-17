import java.util.Scanner;

public class WB9_SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");

        //pick up username
        System.out.print("- Username: ");
        String inputUsername = scan.nextLine();

        //pick up password
        System.out.print("- Password: ");
        String inputPassword = scan.nextLine();

        System.out.println();
        
        /* will be useful for task 2
        
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();

        
        */

        while (!username.equals(inputUsername) && !password.equals(inputPassword)){
            System.out.println("Incorrect password, Try again\n");
            System.out.print("- Username: ");
            inputUsername = scan.nextLine();
            System.out.print("- Password: ");
            inputPassword = scan.nextLine(); 
            System.out.println();
        }

        System.out.println("Sign In successful. Welcome...");
        scan.close();
        
    }
}
