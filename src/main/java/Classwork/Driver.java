package Classwork;

//import java.util.Arrays;
//
//public class Driver {
//    public static void main(String[] args) throws InterruptedException {
//        int[] array = new int[1_000_000];
//        Arrays.setAll(array,i -> (int) (Math.random()*11) + 1);
//        System.out.println("The sum of the array is " + Arrays.stream(array).sum());
//        ArrayCounter[] arrayCounters = new ArrayCounter[5];
//        initializeArrayCounters(array, arrayCounters);
//        startArrayCounters(arrayCounters);
//        joinCounters(arrayCounters);
//        System.out.println("The sum of the array is " + (
//                arrayCounters[0].getTotal() +
//                arrayCounters[1].getTotal() +
//                arrayCounters[2].getTotal() +
//                arrayCounters[3].getTotal() +
//                arrayCounters[4].getTotal()));
//    }
//
//    private static void joinCounters(ArrayCounter[] arrayCounters) {
//        try {
//            for (ArrayCounter counter : arrayCounters) {
//                counter.join();
//            }
//        }catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//    }
//
//    private static void startArrayCounters(ArrayCounter[] arrayCounters) {
//        for (int i = 0; i < arrayCounters.length; i++) {
//        arrayCounters[i].start();
//        }
//    }
//
//    private static void initializeArrayCounters(int[] array, ArrayCounter[] arrayCounters) {
//        for (int i = 0; i < arrayCounters.length; i++) {
//            arrayCounters[i] = new ArrayCounter(i*200000, ((i+1)*200000)-1, array);
//        }
//    }
//}
class Node{
    int value;
    Node next;
}

class LinkedListOld {
    Node head;
    Node tail;

    public LinkedListOld(int value){
        Node n = new Node();
        n.value = value;
        head = n;
        tail = n;
    }

    public void add(int value){
        if(head == null){
            Node n = new Node();
            n.value = value;
            head = n;
            tail = n;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        Node n = new Node();
        n.value = value;
        current.next = n;
        tail = n;
    }
}


public class Driver {
    public static void main(String[] args){
        System.out.println("Program starting");
        Node n1 = new Node();
        n1.value = 1;
        Node n2 = new Node();
        n2.value = 2;
        n1.next = n2;
        System.out.println(n1.value);
        System.out.println(n2.value);
        System.out.println(n1.next.value);
        Node n3 = new Node();
        n3.value = 4;
        n2.next = n3;

        //LinkedList ll = new LinkedList();
        //ll.head = n1;
        System.out.println("Program ending");
    }
}
