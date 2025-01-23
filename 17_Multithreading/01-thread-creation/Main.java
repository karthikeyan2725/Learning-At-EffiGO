public class Main {

    public static class ChildThreadTask implements Runnable {
        public void run(){
            for (int i = 0; i < 100; i++){
                System.out.println("This is " + Thread.currentThread() + " " + i);
            }
        }
    }

    public static void main(String[] args) {
        // Thread thread = new Thread(new ChildThreadTask());
        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++)
                System.out.println("Hello");
        });
        thread.start();
        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}