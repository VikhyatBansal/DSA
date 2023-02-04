package Assignment_5;
import java.util.*;  
import java.io.*;
import java.io.IOException;

    /**first element of string must go first in stack so that the last element of string is at top of the stack so when elements are popped from the stack the values in the string in such a manner that it reverses the input string.*/

public class reverseStringStack {
   private String str; 
   private String output;
   public reverseStringStack(String in) {
      str = in;
   }
   public String doReverse() {
      int stackSize = str.length(); 
      Stack theStack = new Stack(stackSize); 
      
      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i); 
         theStack.push(ch); 
      }
      output = "";
      while (!theStack.isEmpty()) {
         char ch = theStack.pop(); 
         output = output + ch; 
      }
      return output;
   }
   public static void main(String[] args) throws IOException {
      System.out.print("Enter a sentence: ");
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      String output;
      reverseStringStack theReverser = 
      new reverseStringStack(str);
      output = theReverser.doReverse();
      System.out.println("The Reversed string is: " + output);
   }
   class Stack {
      private int maxSize;
      private char[] stackArray;
      private int top;
      
      public Stack(int max) {
         maxSize = max;
         stackArray = new char[maxSize];
         top = -1;
      }
      public void push(char j) {
         stackArray[++top] = j;
      }
      public char pop() {
         return stackArray[top--];
      }
      public char peek() {
         return stackArray[top];
      }
      public boolean isEmpty() {
         return (top == -1);
      }
   }
}