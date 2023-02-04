import java.util.Scanner;  
public class Sub   
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
subtract(array);
 
}

private static void subtract(int[] array) {
    // Scanner to take input from user
    Scanner sub = new Scanner(System.in);

    {
        // Ask user to input index of the element
        System.out.println("Enter index of first Element:" );
        int firstIndex = sub.nextInt();
        System.out.println("Enter index of second Element:");
        int secondIndex = sub.nextInt();
        // Subtract the elements
        int subtraction = array[firstIndex] - array[secondIndex];
        // Now we will create a loop where subtraction must be greater than 0, display the output
        if(subtraction > 0){
            System.out.println("The result of subtraction is a positive number:" + array[firstIndex] + "-" + array[secondIndex] + "=" + subtraction);
        } else {
            System.out.println("The result of subtraction is a negative number:" + array[firstIndex] + "-" + array[secondIndex] + "=" + subtraction);
        }
    }
}  
} 
