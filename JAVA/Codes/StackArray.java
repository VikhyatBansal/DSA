
public class StackArray{
	
	int[] stacks;
	int top;
	
	
	public void StacksArray(int size) {
		stacks= new int[size];
		top= -1;
	}
	

	public void push(int d) {
		stacks[++top]=d;
	}


	public int pop() {
		if(top==-1){
			System.out.println("Stack Underflow error");
		return 0;
		}
		return stacks[top--];
	}

	public void print() {
		for(int i=0; i<=top; i++) {
			System.out.print(stacks[i]+" ");
		}
		System.out.println();
	}

	public void peek() {
		if(top==-1) {
			System.out.println("Stack Underflow error");
		}
		else {
			System.out.println("Top element is "+stacks[top]);
		}
	}

	public void isEmpty() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
	}

	public void isFull(){
		if(top==stacks.length-1) {
			System.out.println("Stack is full");
		}
		else {
			System.out.println("Stack is not full");
		}
	}

	public static void main(String[] args) {
			
		StackArray s= new StackArray();
        s.StacksArray(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.print();
		s.pop();
		s.print();
	}
}
