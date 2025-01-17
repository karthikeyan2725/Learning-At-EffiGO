public class WB5_HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        int[] scores = new int[10];

        for (int i = 0; i < scores.length; i++){
            scores[i] = randomNumber();
        }

        System.out.print("Here are the scores: ");

        for(int i = 0; i < scores.length; i++){
            if(scores[i] > highScore){
                highScore = scores[i];
            }
            System.out.print(scores[i] + " ");
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    }    

    /**
     * Function name - randomNumber
     * @return (int)
     * 
     * Inside the function:
     *  - returns random number between 1 to 49999
     */
    public static int randomNumber(){
        int randomNumber = (int)(Math.random() * 49999 + 1);
        return randomNumber;
    }
}
