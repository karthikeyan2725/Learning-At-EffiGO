public class WB3_WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 3;   //3rd day of the week...
        boolean holiday = true;
         
        // IF - ELSE IF - ELSE HERE!
        if( day <= 5){
            System.out.println("Wake up at 7:00AM");
        } else if( holiday ){
            System.out.println("Wohoo! Today is an holiday!");
        } else{
            System.out.println("No work today!");
        }
        
    }

}
