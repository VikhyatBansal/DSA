// Sort the stack elements in increasing order.

public class SortedStack {
    // The stack is created using arrays
    public int [] array;
    public int top;
    public int length;
    // Constructor to create stack of dimension provided as argument.
    SortedStack(int dim){
    array = new int [dim];
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
    array[top] = data;
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
    return array[top+1];
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
    System.out.println(array[i]);
    }
    }
    public static void sortStack(SortedStack stack){
    // Create an array of stack's length
    int [] array = new int[stack.length];
    // An array index counter
    int counter = stack.length-1;
    // While stack is not empty, execute this loop
    while(!stack.isEmpty()){
    // Pop element from stack and put it into array
    array[counter] = stack.pop();
    counter--;
    }
    // For loops to sort array
    for (int i = 0; i < array.length; i++){
    for (int j = i + 1; j < array.length; j++){
    int temp = 0;
    if (array[i] < array[j]){
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
    }
    }
    // Push the elements from sorted array to the stack
    for(int i = array.length-1; i > -1; i--){
    stack.push(array[i]);
    }
    }
    public static void main(String[] args){
    SortedStack s1 = new SortedStack(6);
    s1.push(20);
    s1.push(0);
    s1.push(10);
    s1.push(4);
    s1.push(12);
    s1.push(3);
    sortStack(s1);
    s1.displayStack();
    }
    }





