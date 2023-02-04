package Assignment_5;

import java.io.*; 
import java.util.*; 
import java.util.Scanner;  
public class Sortarraystack {  

   
    
      static Stack<Integer> sortStack(Stack<Integer> input){ 
          Stack<Integer> tmpStack = new Stack<Integer>(); 
        
          while(!input.empty()){ 
              int tmp = input.peek(); 
              input.pop(); 
        
              while(!tmpStack.empty() && tmpStack.peek() < tmp){ 
                  input.push(tmpStack.peek()); 
                  tmpStack.pop(); 
              } 
        
              tmpStack.push(tmp); 
          } 
          return tmpStack; 
      } 
        
      static void sortUsingStack(int []arr, int n){ 
          
          Stack<Integer> input = new Stack<Integer>(); 
          
          for(int i = 0; i < n; i++){ 
              input.push(arr[i]); 
          }
        
          Stack<Integer> tmpStack = sortStack(input); 
        
          for(int i = 0; i < n; i++){ 
              arr[i] = tmpStack.peek(); 
              tmpStack.pop(); 
          } 
      } 
 


    public static void main(String[] args){
  
        int n;  
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements you want to store: ");  
            //reading the number of elements from the that we want to enter  
            n=sc.nextInt();  
            int arr[] = new int[n];
            
            System.out.println("Enter the new elements of the array: ");  
            for(int i=0; i<n; i++)  
            {  
            //reading array elements from the user   
            arr[i]=sc.nextInt();  
            }
            System.out.println("Array elements are: "); 
            for (int j=0; j<n; j++)
      {
         System.out.println(arr[j]);
      } 
         
      sortUsingStack(arr, n); 

      System.out.println("Sorted Array elements are: "); 
        for(int i = 0; i < n; i++){ 
            System.out.print(arr[i] + " "); 
        } 
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
}
