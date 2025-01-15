public class F5_BuiltInFunctions {

    public static void main(String[] args) {

        /**
         * Scenario 1
         * 
         * Find a built-in function that prints the message on the console.
         * @param message (String)
         */
        String message = "Hello, World!";
        System.out.println(message);

        /**
         * Scenario 2
         * 
         * Find a built-in function that returns the length of a string.
         * @return length (int)
         */
        String example = "Java";
        System.out.println("The length of " + example + " is " + example.length());

        /**
         * Scenario 3
         * 
         * Find a built-in function that converts a string to lowercase.
         * @return lowerCase (String)
         */
        String upperCase = "JAVA";
        System.out.println("Lowercase of " + upperCase + " is " + upperCase.toLowerCase());

        /**
         * Scenario 4
         * 
         * Find a built-in function that checks if a string starts with a specified prefix.
         * @param prefix (String)
         * @return startsWithPrefix (boolean)
         */
        String programming = "Java programming";
        System.out.println("does " + programming + " Start with Java : " + programming.startsWith("Java"));


        /**
         * Scenario 5
         * 
         * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         * @param oldChar (char)
         * @param newChar (char)
         * @return replacedString (String)
         */
        String original = "Java is fun!";
        System.out.println("Replacing 'a' with @: " + original.replace('a', '@'));
        
        /**
         * Scenario 6
         * 
         * Find a built-in function that calculates the square root of a number.
         * @param number (double)
         * @return squareRoot (double)
         */
        
        double number = 9;
        System.out.println("Square root : " + Math.sqrt(number));

        /**
         * Scenario 7
         * 
         * Find a built-in function that calculates the power of a number.
         * @param base (double)
         * @param exponent (double)
         * @return power (double)
         */
        double base = 2;
        double exponent = 3;
        // Write your code here
        System.out.println("Power of number : " + Math.pow(base, exponent));

        /**
         * Scenario 8
         * 
         * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         * @return randomNumber (double)
         */
        System.out.println("Generating a Random Number, " + Math.random());

        /**
         * Scenario 9
         * 
         * Find a built-in function that returns the larger of two numbers.
         * @param number1 (int)
         * @param number2 (int)
         * @return maxNumber (int)
         */
        int number1 = 5;
        int number2 = 10;
        // Write your code here
        System.out.println("The maximum number is :" + Math.max(number1, number2));

    } 
}
