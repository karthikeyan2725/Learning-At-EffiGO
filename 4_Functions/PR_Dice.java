import java.util.Scanner;

public class PR_Dice {

    public static void main(String[] args) {
        int userNum1, userNum2, userNum3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers");
        userNum1 = scan.nextInt();
        userNum2 = scan.nextInt();
        userNum3 = scan.nextInt();
        scan.nextLine();

        if(!isAboveRange(userNum1, userNum2, userNum3)
            && !isBelowRange(userNum1, userNum2, userNum3)){
                System.out.println("Error: Values not in range [1,6]");
                System.exit(0);
        }

        int rand1, rand2, rand3;
        System.out.println("Press enter to generate three random numbers: ");
        scan.nextLine();
        rand1 = (int) (Math.random()*6 + 1);
        rand2 = (int) (Math.random()*6 + 1);
        rand3 = (int) (Math.random()*6 + 1);  
        System.out.println("Generated : " + rand1 + " " + rand2 + " " + rand3);

        int userSum = userNum1 + userNum2 + userNum3;
        int randSum = rand1 + rand2 + rand3;

        if(userSum < randSum && DiffLessThanThree(userNum1, userNum2, userNum3)){
            System.out.println("You Win !!!");
        } else{
            System.out.println("Better Luck next time !!!");
        }

        scan.close();
    } 
    
    public static Boolean isAboveRange(int num1, int num2, int num3){
        return (num1 > 0 && num2 > 0 && num3 > 0);
    } 

    public static Boolean isBelowRange(int num1, int num2, int num3){
        return (num1 <= 7 && num2 <= 7 && num3 <= 7);
    }

    public static Boolean DiffLessThanThree(int num1, int num2, int num3){
        return ((num1 - num2) < 3) && ((num2 - num3) < 3);
    }
}
