// The code starts with a day variable. Your friend wants to hang out on that day. 

public class WB4_Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Tuesday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check 'calendar' here:        
        switch (day) {
            case "Monday":
               System.out.println("Sorry, I have to stay at work late"); 
                break;
            case "Tuesday":
               System.out.println("It looks like I have meetings all day"); 
                break;
            case "Wednesday":
               System.out.println("I have dentist appointment, some other time"); 
                break;
            case "Thursday":
               System.out.println("Sorry, Thursday is a date night."); 
                break;
            case "Friday":
               System.out.println("I'm free !"); 
                break;
            case "Saturday":
               System.out.println("I'm free !"); 
                break;
            case "Sunday":
               System.out.println("I'm Free !"); 
                break;
            default:
                System.out.println("That's not a day");
                break;
        } 

    }
}
