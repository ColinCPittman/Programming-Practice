package PracticeTest6;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(sumArrayListRecursively(array));
    }
    public static int sumArrayListRecursively(ArrayList<Integer> array){
        if(array.size() == 0) {
            return 0;
        }
        ArrayList<Integer> sublist = new ArrayList<>(array.subList(1,array.size()));
        return array.get(0) + sumArrayListRecursively(sublist);

    }
}
