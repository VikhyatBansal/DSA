public class StringLL {
    Node head; // 'head' of the linked list
    // node in the Linked list is a class
    static class Node{
    String data;
    Node next;
    //constructor is used to create a new Node and Next is by default is initialized as null
    Node(String string){
    data = string;
    next = null;
    } //end of constructor
    } //end of static class node
    public void DisplayList() {
    Node node = head;
    // A tempNode to hold the value in node temporarily.
    Node tempNode = new Node("random string");
    /*
    While node is not null and the data in node is not same as the data in tempNode, keep looping.
    */
    while(node != null && !node.data.equals(tempNode.data)){
    // If next node is same as tempNode then print the value in node.
    if(node.next == tempNode){
    tempNode = node;
    System.out.print(tempNode.data+" ");
    node = head;
    /* If next node is null then clone node to tempNode and also print the value.
    Node is saved to tempNode so in the next iteration the program can check if it reached the last value
    and print the value just before it.
    This is possible because tempNode always holds the last value.
    */
    } else if(node.next == null){
    tempNode = node;
    System.out.print(tempNode.data+" ");
    node = head;
    }
    node = node.next;
    }
    // Finally, if head is not null print the value in it.
    if(head != null){
    System.out.println(head.data);
    }
    }
    //main method
    public static void main(String[] args) {
    StringLL LList = new StringLL(); // create an empty Linked list
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
    // display value at each node
    LList.DisplayList(); // Traverse the list
    }//end of main method
    } //end of class Q2

