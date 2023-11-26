package DataStructures;

public class CustomQueue<T> {
    Node rear;
    Node front;


    public class Node {
        private T value;
        private Node nextNode;

        public T getValue() {
            return value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public Node(T value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        public Node(T value) {
            this.value = value;
            this.nextNode = null;
        }
    }
    public void Enqueue(T value) {
        if(rear == null) {
            this.rear = new Node(value);
            this.rear = front;
        }
        else {
            this.rear = new Node(value);
        }
    }
    public T Dequeue() {
       if(this.rear.nextNode != null){
          Node temp = rear;
          rear = null;
          return temp.getValue();
       }
       else {
           Node current = rear;
           while(current.nextNode.nextNode != null) {
               current = current.nextNode;
           }
           Node temp = current.nextNode;
           current.nextNode = null;
           front = current;
           return temp.getValue();
       }
    }
}
