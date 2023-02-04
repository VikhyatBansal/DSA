import java.util.Scanner;  
public class Arrayinput   
{  
public static void main(String[] args)   
{  
    int[] oldarr = {1, 2, 3, 4, 5};

        for (int element: oldarr) {
            System.out.println(element);   
        }
int n;  
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter the number of elements you want to store: ");  
    //reading the number of elements from the that we want to enter  
    n=sc.nextInt();  
    
    System.out.println("Enter the new elements of the array: ");  
    for(int i=0; i<n; i++)  
    {  
    //reading array elements from the user   
    oldarr[i]=sc.nextInt();  
    }
}  
System.out.println("Replaced Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.println(oldarr[i]);  
}  
}  
}  
