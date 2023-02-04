
import java.lang.Math;
import java.util.LinkedList;
public class sumprod {

    
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

    public int get(int i) {
        Node n = new Node(i);
        n = head;
        for(int j=0;j<i;j++) {
            n=n.next;
        }
        // System.out.println(n.data);
        return n.data;
    }

    public static void main(String[] args) {

        sumprod LL = new sumprod();
        LL.addNode(-10);
        LL.addNode(3);
        LL.addNode(1);
        LL.addNode(10);
        LL.addNode(-11);
        LL.addNode(-12);

        sumprod LL_1 = new sumprod();
        LL_1.addNode(1);
        LL_1.addNode(0);
        LL_1.addNode(0);
        LL_1.addNode(0);
        LL_1.addNode(1);
        LL_1.addNode(1);

        sumprod LL_2 = new sumprod();
        LL_2.addNode(0);
        LL_2.addNode(1);
        LL_2.addNode(1);
        LL_2.addNode(1);
        LL_2.addNode(0);
        LL_2.addNode(0);


        int sum = 0;
        int sum_1 = 0;

        for(int a = 0; a<6; a++) {
            int c = LL.get(a)*LL_1.get(a);
            sum = sum + c;
            
        }
        System.out.println(sum);

        for(int e = 0; e<6; e++) {
            int d = LL.get(e)*LL_2.get(e);
            sum_1 = sum_1 + d;
            
        }
        System.out.println(sum_1);

        int e = 1;
        double func = e/(1+Math.exp(-sum));
        double func_1 = e/(1+Math.exp(-sum_1));
        
     
        System.out.println(func);
        System.out.println(func_1);

        

   
        
    }
}