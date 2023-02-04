public class replaceLL {
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
    // replace writing with scribbling
    void replaceWord(String oldWord, String newWord){
    Node node = head;
    /* While loop to iterate through linked list to check if old word is string in linkedlist. */
    while (node != null){
    if(node.data.equals(oldWord)){
    node.data = newWord;
    }
    node = node.next;
    }
    }
    //main method
    public static void main(String[] args) {
    replaceLL LList = new replaceLL(); // create an empty Linked list
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
    // Call replaceWord method
    LList.replaceWord("writing", "scribbling");
    // display value at each node
    LList.DisplayList(); // Traverse the list
    }//end of main method
    } //end of class Q4
