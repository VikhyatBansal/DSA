public class parenthesis {
    // The stack is created using arrays
    public char [] array;
    public int top;
    public static int length;
    // Constructor to create stack of dimension provided as argument.
    parenthesis(int dim){
    array = new char[dim];
    length = dim;
    // Top is maintained, the default value is -1 (no elements)
    top = -1;
    }
    // Method for pushing element to Stack
    public void push(char data){
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
    public char pop(){
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
    public void print(){
    // Same as traversing an array
    for(int i = 0; i < top; i++){
    System.out.println(array[i]);
    }
    }
    public static boolean balancedParenthesis(String str) {
    parenthesis stack = new parenthesis(str.length());
    for (int i = 0; i < str.length(); i++) {
    char x = str.charAt(i);
    if (x == '(' || x == '[' || x == '{') {
    stack.push(x);
    continue;
    }
    if (stack.isEmpty())
    return false;
    // To store the char value that's stored in the stack
    char fromStack;
    // Switch case to check
    switch (x) {
    /*
    The program is checking if the stack contains a right parenthesis.
    If the right parenthesis is not the matching one, it will return
    false.
    If the current char is ')' and the value popped from stack is '{'
    When you combine them it will be '{)'
    */
    case ')' -> {
    fromStack = stack.pop();
    if (fromStack == '{' || fromStack == '[')
    return false;
    }
    case '}' -> {
    fromStack = stack.pop();
    if (fromStack == '(' || fromStack == '[')
    return false;
    }
    case ']' -> {
    fromStack = stack.pop();
    if (fromStack == '(' || fromStack == '{')
    return false;
    }
    }
    }
    // If the traversal is complete and there's still some string remaining, then strings are unbalanced
    return (stack.isEmpty());
    }
    public
    static void main(String[] args) {
    String str = "[[]{}]((){[]}";
    if (balancedParenthesis(str))
    System.out.println("Balanced");
    else
    System.out.println("Unbalanced");
    }
    }
