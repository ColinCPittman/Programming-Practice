package DataStructures;

public class CustomStack<T> {
    private Node top;
    private Node bottom;
    public Node getTop() {
        return top;
    }
    public Node getBottom() {
        return bottom;
    }
    class Node {
        T  value;
        Node nextNode;

        public T getValue() {
            return value;
        }

        public Node getNextNode() {
            return nextNode;
        }
        public Node(T  value) {
            this.value = value;
            this.nextNode = null;
        }
        public Node(T  value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }
    }
    public Node pull() {
        if(top == null) return null;
        Node current = top;
        int size = size();
        if(size == 1) {
            Node temp = top;
            top = null;
            return temp;
        }
        Node previous = null;
        int midpoint = (size - 1) / 2;
        for (int i = 0; i < midpoint; i++) {
            previous = current;
            current = current.nextNode;
        }
        if(previous != null) {
            previous.nextNode = current.nextNode;
        }else {
            top = current.nextNode;
        }
        current.nextNode = null;
        return current;
    }
    public Node pullSimple() {
        if(top == null) return null;
        if(top.nextNode == null) return top;
        Node midpoint = top;
        Node endpoint = top.nextNode;

        while(midpoint != null && endpoint.nextNode != null) {
            midpoint = midpoint.nextNode;
            endpoint = endpoint.nextNode.nextNode;
        }
        return midpoint;
    }
    public T  peek(){
        if(top == null) return null;
        return top.value;
    }
    public int size() {
        int count = 0;
        if(top == null) return count;
        Node current = top;
        count++;
        while(current.nextNode != null) {
             current = current.nextNode;
             count++;
        }
        return count;
    }
    public boolean isEmpty() {
        return (top == null);
    }
    public T  pop() {
        if(top == null) return null;
        Node temp = top;
        top=top.nextNode;
        return temp.value;

    }
    public void push(T  value) {
        if (top == null) {
            Node newNode = new Node(value, top);
            top = newNode;
            bottom = newNode;
        } else {
            Node newNode = new Node(value, top);
            top = newNode;
        }
    }
    public void print() {
        if(top == null) return;
        Node current = top;
        System.out.println(top.value);
        while(current.nextNode != null) {
            current = current.nextNode;
            System.out.println(current.value);
        }
    }
}
