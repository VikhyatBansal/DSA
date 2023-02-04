// public class LL {
//     Node head; // 'head' of the linked list
//     // node in the Linked list is a class
//     static class Node{
//     String data;
//     Node next;
//     //constructor is used to create a new Node and Next is by default is initialized as null
//     Node(String d){
//     data = d;
//     next = null;
//     } //end of constructor
//     } //end of static class node
//     public void DisplayList() {
//     Node node = head;
//     while(node!=null) {
//     System.out.println("Value at each node: "+node.data+" ");
//     node = node.next;
//     }
//     }//end of DisplayList function
//     //main method
//     public static void main(String[] args) {
//     LL LList = new LL(); // create an empty Linked list
//     // create 5 nodes
//     LList.head = new Node("I");
//     Node two = new Node("am");
//     Node three = new Node("writing");
//     Node four = new Node("java");
//     Node five = new Node("code");
//     //five nodes allocated dynamically
//     //link first 'head' node with node 'two'
//     LList.head.next = two;
//     //link node 'two' to node 'three'
//     two.next = three;
//     //link node 'three' to node 'four'
//     three.next = four;
//     //link node 'four' to node 'five'
//     four.next = five;
//     // display value at each node
//     LList.DisplayList(); // Traverse the list
//     }//end of main method
//     } //end of class Q1



