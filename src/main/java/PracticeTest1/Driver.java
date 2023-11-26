package PracticeTest1;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for (int i = 0; i < shapes.length; i++) {
            if (Math.random() * 100 > 50) {
                shapes[i] = new Square(Math.random() * 10, Math.random() * 10);
            } else {
                shapes[i] = new Circle(Math.random() * 10);
            }
        }

        Arrays.stream(shapes).forEach(shape -> System.out.println(shape.area()));



        Person p1 = new Person("Bob", 8);
        Person p2 = new Person("Casey", 8);
        Person p3 = new Person("Evan", 7);
        Person p4 = new Person("Sally", 8);
        System.out.println(p1.compareTo(p3));
       // compareScore(p1, p2);
       // compareScore(p1,p3);
    }

    record Person(String name, int score) {
        public int compareTo(Person person){
            if (this.score < person.score) {
                return -1;
            } else if(this.score > person.score) {
                return 1;
            } else return 0;
        }
    }
   // private static void compareScore(Person p1, Person p2) {
   //     System.out.println("Player " + p1.name() + " has a score of " + p1.score() +
   //             ".\nPlayer " + p2.name() + " has a score of " + p2.score() + ".");
   //     if (p1.score() > p2.score()) {
   //         System.out.println("Player " + p1.name() + " is the higher scorer.");
   //     } else if (p2.score() > p1.score()) {
   //         System.out.println("Player " + p2.name() + " is the higher scorer.");
   //     } else {
   //         System.out.println("Both players scored equally.");
   //     }
   // }
}
