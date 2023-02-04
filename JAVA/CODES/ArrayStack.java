import java.util.Scanner;  
public class ArrayStack   
{  
// public static void main(String[] args)   
//  
// }  
public int [] arraytemp;
    public int top;
    public int length;
    // Constructor to create stack of dimension provided as argument.
    ArrayStack(int dim){
    arraytemp = new int [dim];
    length = dim;
    // Top is maintained, the default value is -1 (no elements)
    top = -1;
    }
    // Method for pushing element to Stack
    public void push(int data){
    // Check if Stack is full. If yes, exit
    if(isFull()){
    System.out.println("Stack Full");
    System.exit(1);
    }
    // Increment the Stack pointer
    top = top+1;
    arraytemp[top] = data;
    }
    // Method to pop element from Stack
    public int pop(){
    // Check if stack is empty. If yes, exit.
    if(isEmpty()){
    System.out.println("Stack Empty");
    System.exit(1);
    }
    // Decrement the stack pointer
    top = top - 1;
    // Return the popped value
    return arraytemp[top+1];
    }
    // Method to check if the Stack is full
    public boolean isFull(){
    /* If Stack Pointer is = length -1 then the Stack is full
    and this method will return true. */
    return top==(length-1);
    }
    // Method to check if the Stack is full
    public boolean isEmpty(){
    // If Stack Pointer is -1, the Stack is empty.
    return top==-1;
    }
    // Method to print the values in Stack
    public void displayStack(){
    // Same as traversing an array
    for(int i = 0; i < top+1; i++){
    System.out.println(arraytemp[i]);
    }
    }
    public static void sortStack(ArrayStack stack){
    // Create an array of stack's length
    int [] arraytemp = new int[stack.length];
    // An array index counter
    int counter = stack.length-1;
    // While stack is not empty, execute this loop
    while(!stack.isEmpty()){
    // Pop element from stack and put it into array
    arraytemp[counter] = stack.pop();
    counter--;
    }
    // For loops to sort array
    for (int i = 0; i < arraytemp.length; i++){
    for (int j = i + 1; j < arraytemp.length; j++){
    int temp = 0;
    if (arraytemp[i] < arraytemp[j]){
    temp = arraytemp[i];
    arraytemp[i] = arraytemp[j];
    arraytemp[j] = temp;
    }
    }
    }
    // Push the elements from sorted array to the stack
    for(int i = arraytemp.length-1; i > -1; i--){
    stack.push(arraytemp[i]);
    }
    }
    public static void main(String[] args){
        int n;

        int[] arr;
         
        // allocating memory for 5 integers.
        arr = new int[5];
           
        // initialize the first elements of the array
        arr[0] = 10;
        arr[1] = 21;
        arr[2] = 9;
        arr[3] = 40;
        arr[4] = 19;
          
    ArrayStack s1 = new ArrayStack(arr.length);
    for (int i =0; i<arr.length; i++)
    s1.push(arr[i]);
    sortStack(s1);
    s1.displayStack();
    
    }

    
} 
