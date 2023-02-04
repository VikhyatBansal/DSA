// Merge two doubly linked lists and return the merged list.

public class DoublyLinkedList {
    Node head;
    Node tail;

    static class Node{
        String data;
        Node prev;
        Node next;

        Node(String d){
            data=d;
        }
    }
    public void add(String d){
        Node newNode = new Node(d);
        newNode.prev = null;
        newNode.next = head;

        if(head == null) {
            //Both head and tail will point to newNode
            head = tail = newNode;
            //head's previous will point to null
            head.prev = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        //Add newNode as new tail of the list
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode's previous will point to tail
            newNode.prev = tail;
            //newNode will become new tail
            tail = newNode;
            //As it is last node, tail's next will point to null
            tail.next = null;
        }
    }
    public void DisplayList(){
        // Start from head
        Node node = head;
        /* While loop to traverse through the linked list.
        It will stop execution once the node is null.
        */
        while(node!=null){
        // node.data is used to access the data inside node
        System.out.print(node.data + " ");
        // proceed to next node
        node = node.next;
        }
        }
        
    public static void mergeLL(DoublyLinkedList LList, DoublyLinkedList LList2){
        Node node  = LList2.head;
        while(node != null){
            LList.tail.next = node;
            LList.tail.next.prev = LList.tail;
            LList.tail = LList.tail.next;
            node = node.next;
        }
    }
public static void main(String[] args) {
        DoublyLinkedList LList = new DoublyLinkedList();
        DoublyLinkedList LList2 = new DoublyLinkedList();

        LList.add("Hi");
        LList.add("XYZ");
        LList.add("have");
        LList.add("you");
        LList.add("completed");

        LList2.add("D");
        LList2.add("S");
        LList2.add("A");
        LList2.add("assignment");
        LList2.add("?");

        mergeLL(LList, LList2);
        
       LList.DisplayList();
    }
}

