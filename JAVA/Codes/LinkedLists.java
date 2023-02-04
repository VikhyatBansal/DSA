

// Code for single linked list

public class Prac1 {

    // Class for making a node 


    class Node{   
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;

        }
        }

// defining what is a head and tail initially

    public Node head = null;
    public Node tail = null;

// How adding a node will work in IF and ELSE condition

    public void addNode(int data){
        
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

    }

public void delete(int data) {
    Node n = new Node(data);
    n = head;
    if (n.next!=null && n.data==data) {
        head=n.next;
        return;
    }
    while (n.next!=null) {
        if (n.data == data) {
            n=n.next.next;
        }
        n=n.next;
        if (n.next==null && n.data==data) {
            n=null;
            return;
        }
        }
    
}

public void add(int i,int data) {
    Node n = new Node(data);
    Node prev = new Node(data);
    Node node = new Node(data);
    prev=null;
    node.data=data;
    n = head;
    for(int j=0;j<i;j++) {
        prev=n;
        n=n.next;
    }
    prev.next=node;
    node.next=n;
}

// Displaying the linked list where there a pointer named current is formed which will traverse the list from head till tail.

    public void display(){
        Node current = head;

        if (head==null){
            System.out.println("List is empty");
            
        }

        System.out.println("Node of linked list are;");

        while(current!=null) {
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Prac1 SLL = new Prac1();

        SLL.addNode(5);
        SLL.addNode(10);
        SLL.addNode(15);
        SLL.addNode(20);

        SLL.display();

        SLL.delete(10);
        SLL.add(2,30);
        SLL.display();
        // SLL.removeNode(5);
        // SLL.display();
        
    }    
    }


    // public class dlinkedl {
    //     class Node {
    //         int data;
    //         Node previous;
    //         Node next;
    
    //         public Node (int data){
    //             this.data = data;
    //             this.next = null;
    
    //         }
    //     }
    //     public Node head = null;
    //     public Node tail = null;
    
    //     public void addNode(int data){
    //         Node newNode = new Node(data);
    //         if (head == null) {
    //             head = newNode;
    //             tail = newNode;
    //             head.previous = null;
    //             tail.next = null;
    //         }
    //         else {
    //             tail.next = newNode;
    //             newNode.previous = tail;
    //             tail = newNode;
    //         }
    
    //     }
    //     public void delNode(int data){
    //         Node current= head;
    //         Node pre = tail;
    //         if (current.data==data) {
    //             current.next.previous=null;
    //             head=current.next;
    //             return;
    //         }
    //         pre=null;
    //         while(current.next!=null) {
    //             if (current.data == data) {
    //                 pre.next=current.next;
    //                 current.next.previous=current.previous;
    //                 return;
    //             }
    //             pre=current;
    //             current=current.next;
    //             if (current.data == data && current.next==null) {
    //                 pre.next=null;
    //                 tail=pre;
    //                 return;
    //             }
    //         }
    //     }
        
    //     public void FrontinsertNode(int data){
    //         Node newNode = new Node(data);
    //         newNode.previous = null;
    //         newNode.next = head;
    
    //         if(head!=null){
    //             head.previous = newNode;
    //             head = newNode;
    //         }
    
            
    //     }
        
    
    //     public void Insertbefore(Node nextNode, int data){
    
    //         if(nextNode == null)
    //         {
    //             System.out.println("The given next node can not be NULL");
    //             return;
    //         }
    
    //         Node newNode = new Node(data);
    //         newNode.previous = nextNode.previous;
    //         nextNode.previous = newNode;
    //         newNode.next = nextNode;
    
    //         if(newNode.previous != null){
    //             newNode.previous.next = newNode;
    //         }
    //         else {
    //             head = newNode;
    //         }
    //     }
    
    //     public void Insertafter(Node prevNode, int data){
    
    //         if (prevNode == null) {
    //             System.out.println("The given previous node cannot be NULL ");
    //             return;
    //         }
    
    //         Node newNode = new Node(data);
    //         newNode.next = prevNode.next;
    //         prevNode.next = newNode;
    //         newNode.previous = prevNode;
    
    //         if (newNode.next != null){
    //             newNode.next.previous = newNode;}
            
    //         if (newNode.next==null){
    //             tail = newNode;
    //         }
        
    
    //     }
    
    //     public void display(){
    //         Node current = tail;
    //         Node temp = head;
    
    //         System.out.println("Traversal of DLL in forward direction");
    //         if (head == null){
    //             System.out.println("Linked list is empty.");
    
    //         }
    //         while(temp!=null){
    //             System.out.println(temp.data + "");
    //             temp = temp.next;
    //         }
    //         System.out.println("Traversal of DLL in reverse direction");
    
    //         if (tail==null){
    //             System.out.println("Linked list is empty");
    //         }
    //         while (current != null){
    //             System.out.println(current.data + "");
    //             current = current.previous;
    //         }
    
    //     }
    
    //     public static void main(String[] args) {
    //         dlinkedl nunu = new dlinkedl();
    //         nunu.addNode(5);
    //         nunu.addNode(10);
    //         nunu.addNode(15);
    //         nunu.addNode(20);
    //         nunu.display();
    //         nunu.FrontinsertNode(69);
    //         nunu.Insertafter(nunu.head.next, 420);
    //         nunu.Insertbefore(nunu.head.next.next, 89);
    //         nunu.display();
            
    //         nunu.delNode(69);
            
    //         nunu.display();
    
    //     }
    
    // }