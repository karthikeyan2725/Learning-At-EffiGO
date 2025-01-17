import java.util.Scanner;

public class WB11_JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        int diceRoll;
        int score = 0;

        System.out.println("Let's play rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great, here are the rules: \n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, Nothing happens.");
        System.out.println(" - Otherwise, you get 1 point");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        scan.nextLine();

        while(true){
            diceRoll = rollDice();
            if (diceRoll == 6){
                System.out.println("You rolled a 6. End of Game.");
                break;
            } else if (diceRoll == 4){
                System.out.println("You rolled a 4, Zero Points. Keep rolling");
            } else {
                System.out.println("You rolled a " + diceRoll + ", 1 Point. Keep rolling");
                score += 1;
            }
            scan.nextLine();
        }

        if (score > 3){
            System.out.println("\nWow, that's Lucky. You win !!!");
        } else {
            System.out.println("\nTough Luck. You lose.");
        }

        scan.close();
    }
  
    /**
     * Function name: rollDice
     * @return randomNumber (int)
     *
     * Inside the function:
     *  - return a random number between one and six. 
     */
    public static int rollDice(){
        return (int) (Math.random() * 6 +1);
    }
  
  
}
