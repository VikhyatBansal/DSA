public class revstack {
    
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

    public void reverse() {
        revstack s1 = new revstack();
        revstack s2 = new revstack();
        while(top!=null) {
            s1.push(pop());
        }
        while(s1.top!=null) {
            s2.push(s1.pop());
        }
        while(s2.top!=null) {
            push(s2.pop());
        }
    }

    public static void main(String[] args) {
        revstack s = new revstack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();
        s.reverse();
        s.print();  
    }
}

    

