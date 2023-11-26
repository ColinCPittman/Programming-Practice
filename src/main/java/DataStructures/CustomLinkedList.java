package DataStructures;

public class CustomLinkedList<T> {
    private Node head;
    class Node {
        T value;

        public Node(T value) {
            this.value = value;
        }

        Node nextNode;
    }

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(T value){
        if(this.head == null) {
            head = new Node(value);
            System.out.println("New head added");
        }
        Node current = this.head;
        while(current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = new Node(value);
        System.out.println("New node added");
    }
    public void remove(T value) {
        if(this.head == null) return;
        if(value.equals(head.value)) {
            this.head = head.nextNode;
            System.out.println("Removed head");
            return;
        }
        Node current = this.head;
        Node previous = null;

        while (current != null && !current.value.equals(value)) {
            previous = current;
            current = current.nextNode;
        }
        if(current == null){
            System.out.println("Node not found");
        }else {
            previous.nextNode = current.nextNode;
            System.out.println("Node removed");
        }
    }
}
