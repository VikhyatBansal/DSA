import java.util.*;
import java.io.*;

// Stack implementation in Java
//We are using two stack where stack1 is used to get elements from enqueue and then stack2 is then given the elements of stack1 and then stack1 is emptied.
public class QueueUStack {

Stack stack1 = new Stack(10);
Stack stack2 = new Stack(10);

   public void enqueue(int element) {
      stack1.push(element);
      System.out.println(element + " inserted at the rear location");
   }

   public void dequeue() {
      if(stack2.isEmpty()) {
         while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
         }
      }
      System.out.println(stack2.pop() + " removed from the front location");
   }
   public static void main(String args[]) {
      QueueUStack Q = new QueueUStack();
      Q.enqueue(47);
      Q.enqueue(52);
      Q.enqueue(720);
      Q.dequeue();
      Q.dequeue();
      Q.enqueue(8);
   }

   class Stack {

    // store elements of stack
    private int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;
  
    // Creating a stack
    Stack(int size) {
      // initialize the array
      // initialize the stack variables
      arr = new int[size];
      capacity = size;
      top = -1;
    }
  
    // push elements to the top of stack
    public void push(int x) {
      if (isFull()) {
        System.out.println("Stack OverFlow");
  
        // terminates the program
        System.exit(1);
      }
  
      // insert element on top of stack
      arr[++top] = x;
    }
  
    // pop elements from top of stack
    public int pop() {
  
      // if stack is empty
      // no element to pop
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        // terminates the program
        System.exit(1);
      }
  
      // pop element from top of stack
      return arr[top--];
    }
  
    // return size of the stack
    public int getSize() {
      return top + 1;
    }
  
    // check if the stack is empty
    public Boolean isEmpty() {
      return top == -1;
    }
  
    // check if the stack is full
    public Boolean isFull() {
      return top == capacity - 1;
    }
  
  }
}
