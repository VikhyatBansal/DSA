public class reversingLL {
    static Node head; // head of list
    static class Node {
    String data;
    Node next;
    Node(String string)
    {
    data = string;
    next = null;
    }
    }
    static Node reverse(Node head)
    {
    if (head == null || head.next == null)
    return head;
    /* reverse the rest list and put
    the first element at the end */
    Node rest = reverse(head.next);
    head.next.next = head;
    head.next = null;
    /* head is null now and rest of list is returned */
    return rest;
    }
    /* Function to print linked list */
    static void print()
    {
    Node temp = head;
    while (temp != null) {
    System.out.print(temp.data + " ");
    temp = temp.next;
    }
    System.out.println();
    }
    //end of static class node
    //main method
    public static void main(String[] args) {
    reversingLL LList = new reversingLL(); // create an empty Linked list
    // create 5 nodes
    LList.head = new Node("I");
    Node two = new Node("am");
    Node three = new Node("writing");
    Node four = new Node("java");
    Node five = new Node("code");
    //five nodes allocated dynamically
    //link first 'head' node with node 'two'
    LList.head.next = two;
    //link node 'two' to node 'three'
    two.next = three;
    //link node 'three' to node 'four'
    three.next = four;
    //link node 'four' to node 'five'
    four.next = five;
    System.out.println("Initial linked list:");
    print();
    head = reverse(head);
    System.out.println("Linked list after reversing:");
    print();
    }//end of main method
    } //end of class Q3



    
    

