class ReverseLL {
    static Node head; // head of list
     
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    static Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;
 
        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverse(head.next);
        head.next.next = head;
 
        head.next = null;
 
        /* fix the head pointer */
        return rest;
    }
 
    /* Function to print linked list, we created a temporary list */
    static void print()
    {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
  
 
public static void main(String args[])
{
    /* Start with the empty list */
      
    push(10);
    push(84);
    push(69);
    push(77);
    push(99);
 
    System.out.println("Given linked list");
    print();
 
    head = reverse(head);
 
    System.out.println("Reversed Linked list");
    print();
}
}
