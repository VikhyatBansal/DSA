
public class StackList{

	class Node{
		int data;
		Node next;
		
		public Node(int data, Node n) {
			this.data=data;
			this.next=n;
		}
	}
	
	Node top=null;
	
	public void push(int data) {
		top=new Node(data,top);
	}

	public int pop(){
		if(top==null) {
			System.out.println("Stack Underflow error");
		return 0;
		}
		Node temp;
		temp=top;
		top=top.next;
		return temp.data;
	}

	public void print() {
		for(Node current=top; current!=null; current=current.next) {
			System.out.print(current.data+" ");
		}
		System.out.println();
	}

	public void peek() {
		if(top==null) {
			System.out.println("Stack Underflow error");
		}
		else {
			System.out.println("Top element is "+top.data);
		}
	}

	public void isEmpty() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
	}

	public static void main(String[] args){
		StackList s= new StackList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.print();
		s.pop();
		s.print();
		s.peek();
	}
}
