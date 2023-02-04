import java.util.Arrays;
import java.util.Scanner;
public class Search_Element {

    public static void main( String[] args ) {
        long start = System.currentTimeMillis();            //Start a counter to keep track of time.
        int min = 1;
        int max = 100000;
        int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);

        int[] arr = new int[1000001];
        for ( i = 0; i < 100000; i++) {
            
            int range = (max - min) + 1;
            int randomNum = (int)(Math.random() * range) + min;
            arr[i] = randomNum;
            System.out.println(arr[i]);

        }
        System.out.println("Last element of array is: " + arr[99999]);

        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        for( i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
          
        }
        else
        {
            System.out.println("Element not found");
        }
             
          long end = System.currentTimeMillis();
          System.out.println("Total Time taken by the program to execute is " +
                                    ((end - start)/1000) + " seconds");
 
    }
}
