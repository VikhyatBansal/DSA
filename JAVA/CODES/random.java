import java.util.Arrays;
import java.util.Scanner;
public class random {

    public static void main( String[] args ) {
        long start = System.currentTimeMillis();            //Start a counter to keep track of time.
        int min = 1;
        int max = 100000;
        int x, flag = 0, i =0;
        int k = 0;
        int temp[] = new int[3];


        int[] arr = new int[1000000];
        for ( i = 0; i < 100000; i++) {
            
            int range = (max - min) + 1;
            int randomNum = (int)(Math.random() * range) + min;
            arr[i] = randomNum;
            System.out.println(arr[i]);

        }
        System.out.println();


          int[] subarr = Arrays.copyOfRange(arr, 99997, 100000);
          for (int p : subarr) {
            System.out.print("Subarray of size 3 from initial array: " +p + "  ");

            System.out.println();

        }
          System.out.println();


        for (int j = 0; j <arr.length-1; j++) {
            for (int l = 0; l < 3; l++) {
                if (arr[j] == subarr[0] && arr[j + 1] == subarr[1] && arr[j + 2] == subarr[2]) {
                    System.out.println("the element present in the array are: " +subarr[l]);
                    System.out.println("the location(index) at which all elements of subarray are: " +(((arr.length-1))-l));
//
                    k = 1;
                }

            }
        }
        if (k==0) {
            System.out.println("the subarray is not present in the array");
        }


        long end = System.currentTimeMillis();
          System.out.println("Total time taken by the program to execute is: " +
                  ((end - start)/1000) + " seconds");


    }
}

  