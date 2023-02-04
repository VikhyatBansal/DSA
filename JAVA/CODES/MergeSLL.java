public class MergeSLL {
    Node head;
    Node tail;
    static class Node{
    String data;
    Node next;
    // Constructor is used to create new nodes
    Node(String d){
    data = d;
    next = null;
    }
    }
    // To display the output to terminal
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
    // Method to add nodes to linked list
    void add(String data)
    {
    // Create a temp node to hold data
    Node temp = new Node(data);
    /* If head is null, then the temp node is supposed to be the head.
    The head is only null if the linked list is empty
    */
    if(head == null){
    head = temp;
    }
    /*
    Append nodes to the tail, than traversing through the whole linked list the adding to final node.
    Appending by traversal will result in o(n) time complexity.
    */
    else if(tail != null){
    tail.next = temp;
    tail = tail.next;
    }
    else {
    tail = head.next = temp;
    }
    }
    public static void mergeLL(MergeSLL LList, MergeSLL LList2){
    // Create node and assign the second Linked List’s head to it.
    Node node = LList2.head;
    /* This will add nodes of LList2 to LList1 and exit once
    All the elements are added*/
    while(node != null){
    // Add the value from node of 2nd LList to tail of 1st LList
    LList.tail.next = node;
    LList.tail = LList.tail.next;
    node = node.next;
    }// Each Linked list contains atleast 5 nodes
    }
    public static void main(String[] args) {
    MergeSLL LList = new MergeSLL();
    MergeSLL LList2 = new MergeSLL();
    LList.add("hi");
    LList.add("ABC");
    LList.add("how");
    LList.add("are");
    LList.add("you?");
    LList2.add("What");
    LList2.add("is");
    LList2.add("your");
    LList2.add("name");
    LList2.add("??");
    mergeLL(LList, LList2);
    LList2 = null;
    LList.DisplayList();
    }
    }
