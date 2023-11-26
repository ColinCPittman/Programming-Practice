package DataStructures;

public class Driver {
    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("Legface");
        list.add("A freaking beagle");
        list.add("Train's Heart");
        list.remove("A freaking beagle");

        CustomStack bookStack = new CustomStack();
        bookStack.push("Moby Dick");
        bookStack.push("Doby Mick");
        //bookStack.push("Bomy Bick");
        //bookStack.push("Koby Micd");
        //bookStack.push("The Art of War");
        //bookStack.push("The Art of the Steal");
        //bookStack.push("Harry Potter");
        System.out.println("______________");
        bookStack.print();
        System.out.println("______________");
        System.out.println(bookStack.getTop().value);
        System.out.println(bookStack.getBottom().value);
        bookStack.pull();
        System.out.println("______________");
        bookStack.print();
        System.out.println("______________");
        bookStack.pop();
        System.out.println("______________");
        bookStack.print();
        System.out.println("______________");
        bookStack.push("Coding for Dummies");
        bookStack.print();
    }
}
