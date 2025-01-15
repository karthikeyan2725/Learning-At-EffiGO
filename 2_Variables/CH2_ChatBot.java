/*
 * Chat age : 500
 * Hello, there whats your name?
 * Hi <name>. How old are you?
 * I am 1000 years old. I am <times> older than you. Where are you from?
 * okay, then <name> from <location>
 */

import java.util.Scanner;

public class CH2_ChatBot {

    public static void main(String[] args) {
        int chatBotAge = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there what's your name?");
        String name = scanner.nextLine();
        System.out.println("\nHi " + name +". How Old are you?");
        int userAge = scanner.nextInt();
        int timesOld = chatBotAge / userAge;
        System.out.println("\nI am 1000 years old, which means, I am " + timesOld + " times older than you. Where are you from?");
        scanner.nextLine(); // Get rid of the garbage newline
        String location = scanner.nextLine();
        System.out.println("\nOkay then, " + name + " from " + location);
        scanner.close();
    }
}