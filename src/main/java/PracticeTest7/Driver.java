package PracticeTest7;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread[] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
           threads[i] = new Thread(counter);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println(counter.counter);
    }
}
