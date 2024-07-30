public class Reverse_LL {
    Node head;

    class Node { // node class
        String data;
        Node next;

        Node(String data) { // Constructor for Node
            this.data = data;
            this.next = null;
        }
    }

    public void add(String data) { // Method to add data to the linked list
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void reverse() { // Using an iterative loop for reversing the linked list
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        head.next = null; // Setting the first node's next to null

        while (currNode != null) { // Corrected condition to check if currNode is not null
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public void printList() { // Method to print the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse_LL list = new Reverse_LL();
        list.add("hello");
        list.add("I");
        list.add("am");
        list.add("Divyesh");
        list.add("Vaghela");

        System.out.println("Original list:");
        list.printList();

        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}
