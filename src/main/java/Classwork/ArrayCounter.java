package Classwork;

public class ArrayCounter extends Thread {
    int total;
    int upperBound;
    int lowerBound;
    int[] array;

    public ArrayCounter(int lowerBound, int upperBound, int[] array) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.array = array;
        total = 0;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public void run() {
        for (int i = lowerBound; i <= upperBound; i++) {
            total += array[i];
        }
    }
}
