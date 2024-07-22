//3 types of linklist  1).singular linklist  2).double linklist 3).circular linklist

public class Link_List {
    public Link_List.Node head;

    class Node { // node class
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

        // add values in linklist (1. on first, 2.on last)
        public void addFirst(String data) {     // Function to add values
            Node newNode = new Node(data); 
            if (head == null) {
                head = newNode;
                return;
            }
            newNode = head;
            head = newNode;
        }
    public static void main(String[] args) {
        Link_List list = new Link_List(); // object
        list.addFirst("Divyesh");
        list.addFirst("is");

        System.out.println(list);
    }

}