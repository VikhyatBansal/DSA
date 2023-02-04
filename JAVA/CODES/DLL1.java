
/* code creates nodes, add more nodes to the LL, add node to the beginning
 */

public class DLL1 {
	
	public class Node{
		
		int data;
		Node next;
		Node prev;
		
		public Node(int d) {
			this.data = d;
			this.next = null;
			this.prev = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	// adds node to the Linked List (LL)
	public void addNode(int d) {
		
		Node newNode = new Node(d);
		
		if(head==null) {
			head = newNode;	
			tail = newNode;
			tail.next = null;
			head.prev = null;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		tail.next = null;
		
	}
	
	//insert the node at the beginning
	public void addNodeFirst(int d) {
		
		Node newNode = new Node(d);
		
		if(head==null) {
			head = newNode;	
			tail = newNode;
			tail.next = null;
			head.prev = null;
			return;
		}
		
		
		head.prev = newNode;
		newNode.next = head;
		newNode.prev = null;
		head = newNode;
		
	}
	
	public void addNodeLast(int d) {
		
		Node newNode = new Node(d);
		
		if(head==null) {
			head = newNode;	
			tail = newNode;
			tail.next = null;
			head.prev = null;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		tail.next = null;
	}
	
	//display all nodes in the LL
	public void displayNodes() {
		
		Node node = head;
		
		if (head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		
		while(node.next!=null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		//display last nodes data
     
		System.out.print(node.data+"->" + "null");
        // display null at the end

		System.out.println("null");
	}

	public static void main(String[] args) {
		
		DLL1 l1 = new DLL1();
        DLL1 l2 = new DLL1();
		
		l1.addNode(12);
		l1.addNode(1);
		l1.addNode(40);
		l1.addNode(3);
        l1.addNode(88);
		
        l2.addNode(23);
        l2.addNode(69);
        l2.addNode(46);
        l2.addNode(25);
        l2.addNode(87);
        
        l1.displayNodes();
        l2.displayNodes();

	}

}