//3 types of linklist  1).singular linklist  2).double linklist 3).circular linklist

// public class Link_List {
    // Node head;

    // class Node { // node class
    //     String data;
    //     Node next;

    //     Node(String data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // // add values in linklist (1. on first, 2.on last)
    // public void addFirst(String data) { // Function to add values
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     newNode = head;
    //     head = newNode;
    // }

    // public void addLast(String data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     Node currNode = head;
    //     while (currNode.next != null) {
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }

    // public void printlist() {
    //     if (head == null) {
    //         System.out.print("List is empty!!");
    //         return;
    //     }
    //     Node currNode = head;
    //     while (currNode != null) {
    //         System.out.print(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("NULL");
    // }

    // public void deleteFirst() {
    //     if (head == null) {
    //         System.out.println("The list is empty..");
    //         return;
    //     }
    //     head = head.next;
    // }

    // public void deleteLast() {
    //     if (head == null) {
    //         System.out.println("The list is empty..");
    //         return;
    //     }
    //     if (head.next == null) {
    //         head = null;
    //         return;

    //     }

    //     Node secondLast = head;
    //     Node LastNode = head.next;
    //     while (LastNode.next != null) {
    //         LastNode = LastNode.next;
    //         secondLast = secondLast.next;
    //     }
    //     secondLast.next = null;
    // }

    // public static void main(String[] args) {
    //     Link_List list = new Link_List(); // object
    //     list.addFirst("Divyesh");
    //     list.addLast("is");
    //     list.addLast("genius");
    //     list.addLast("I know that");
    //     list.deleteFirst();
    //     list.deleteLast();
    //     list.printlist();

    //     list.addFirst("hello!!!!");
    //     list.printlist();
    // }// }}

    
    /**
     * Link_List
     */
    // LinkList using collection Framwork
    //we don't have to write all above code because using collection framwork we can directely import the packages for link list
    import java.util.LinkedList;
public class Link_List {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<String>();

        list.addFirst("Hello");
        list.addLast("world!!!!");
        list.addLast("this");
        list.addLast("is");
        list.addLast("wonderfull");
        list.addLast("I");        
        list.addLast("like");        
        list.addLast("this");        


        System.out.println(list);
        System.out.println(list.size());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        
        list.removeFirst();
        System.out.println(list);
        
        list.removeLast();
        
        list.remove(2);
        System.out.println(list);

    }    
}