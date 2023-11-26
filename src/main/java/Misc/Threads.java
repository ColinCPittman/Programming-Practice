package Misc;

class Threaded extends Thread{
    int count;
    static int total = 0;
    public Threaded(int count){
        this.count = count;
    }

    @Override
    public void run(){
        for(int i = 0; i < count; i++){
            int temp = total;
            temp += 1;
            total = temp;
        }
    }
}

public class Threads {
    public static void main(String[] args){
        int countTo = 10000;
        int numOfThreads = 10;
        Threaded[] allThreads = new Threaded[numOfThreads];

        for(int i = 0; i < numOfThreads; i++){
            allThreads[i] = new Threaded(countTo);
        }

        for(int i = 0; i < numOfThreads; i++){
            allThreads[i].start();
        }

        try{
            for(int i = 0; i < numOfThreads; i++){
                allThreads[i].join();
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Calculation complete. After running " + numOfThreads + " each counting up to " + countTo +
                " the total is " + Threaded.total + ".");



    }
}
