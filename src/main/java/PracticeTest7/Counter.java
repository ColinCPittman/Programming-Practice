package PracticeTest7;

public class Counter implements Runnable{
    public int counter = 0;
    public synchronized void incrementCounter() {
        counter++;
    }
    //using three threads does not necessarily mean the task
    //will get completed in 1/3 of the time because using threads
    //introduces a lot of overhead, such as randomness in the process scheduler
    //and downtime waiting around for other threads to finish or open up.
    //and tasks that are not well suited to being divvied up such as a task that
    //requires sequential execution won't benefit greatly from being split up between threads
    //as talking between the thread introduces more overhead.
    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            incrementCounter();
        }
    }
}
