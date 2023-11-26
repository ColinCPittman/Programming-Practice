package Misc;

public class SimpleThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbers("Thread-1"));
        Thread thread2 = new Thread(new PrintNumbers("Thread-2"));

        thread1.start();
        thread2.start();
    }
}

class PrintNumbers implements Runnable {
    private String threadName;

    public PrintNumbers(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);

            // Sleep for a while to simulate some work
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}