

/**
 * Created by Sherzod on 12/10/2017.
 */
public class LinkedListNew {
    private Node head,teal;
    private int countList;
    private  class Node {
        String value;
        Node next,preav;

        public Node(String value) {
            this.value = value;
        }
    }

    public LinkedListNew() {
        this.head = null;
        this.teal = null;
        countList = 0;
    }

    public void add(String data){
        Node current = head;
        Node node = new Node(data);
        while(current.next!=null){
            current = current.next;
        }
        current.next = node;
        node.preav = current;
        countList++;

    }
}

