public class Main {

    public static void main(String[] args) {
        // Creating the first athlete thread
        Thread firstAthlete = new AtheleteThread(84291);
        // Creating the second athlete thread
        Thread secondAthlete = new AtheleteThread(43114);

        // Starting the threads
        firstAthlete.start();
        secondAthlete.start();
    }

}