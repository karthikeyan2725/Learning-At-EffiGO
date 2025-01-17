public class WB14_RandomNumbers {
    public static void main(String[] args) {
        int[][] randomNumbers = new int[100][10];
        for (int i = 0; i < randomNumbers.length; i++){
            for (int j = 0; j < randomNumbers[0].length; j++){
                randomNumbers[i][j] = randomNumber();
            }
        }
        print2DArray(randomNumbers);
    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    /**
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *  1. Nested loop:
     *      - Inner Loop: System.out.print(array[i][j] + " ");
     *      - After the Inner Loop Completes: System.out.print("\n");
     */
    public static void print2DArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
