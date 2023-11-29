package PracticeTest7;

public class DoubleLinkedList {
    class Node {
        String value;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public Node getPreviousNode() {
            return previousNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode;
        }

        Node nextNode;
        Node previousNode;

    }
    private Node front;
    private Node middle;
    private Node back;
    private int size = 0;

    public void add(String value) {
       if(back == null) {
           back = new Node(value);
           front = back;
           middle = back;
           size++;
       }else{
           back.nextNode = new Node(value);
           back.nextNode.previousNode = back;
           back = back.nextNode;
           size++;

           if(size % 2 == 0) {
               middle = middle.nextNode;
           }
       }


    }
    public void remove(String value) {
    if(back == null) return;

    }
}
