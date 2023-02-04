public class QueueArray {

	int[] queue;
	int front, rear;

	public QueueArray(int s) {
		queue = new int[s];
		front = rear = -1;
	}

	public boolean isEmpty() {
		return front < 0;
	}

	public void enqueue(int d) {
		if ((rear + 1 % queue.length) == front)
			System.out.println("Overflow");
		else if (isEmpty()) {
			queue[0] = d;
			front = rear = 0;
		} else {
			queue[(rear = rear + 1 % queue.length)] = d;

		}
	}

	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Already Empty");
			return 0;}
		else if(rear==front) {
			int temp=queue[front];
			front=rear=-1;
			return temp;
			}
		else {
			int temp=queue[front];
			front=front+1%queue.length;
			return temp;
		}
	}
	

	public void print() {
		if(isEmpty()) {
			System.out.println("Already Empty");
			}
		else for (int i = front; i != rear; i = i + 1 % queue.length)
			System.out.print(queue[i] + " ");
		System.out.println(queue[rear]);
	}
	
	public static void main(String []args) {

		QueueArray q= new QueueArray(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.print();
		q.dequeue();q.print();
		System.out.println(q.dequeue());
	}
}
