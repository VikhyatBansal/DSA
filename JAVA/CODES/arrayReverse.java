// Reverse an array using recursion

public class arrayReverse {

    public static int[] reverseArray(int[] t,int i,int j){
        
        if(i<j){
            //swap elements t[i],t[j]
            //t[i] = first element of array
            //t[j] = last element of array
            int temp=t[i];
            t[i]=t[j];
            t[j]=temp;
            reverseArray(t, i+1, j-1);
        }
        return t;
    }
    public static void main(String[] args) {

        //input    : arr={0,1,2,3,4,5}
        //output   : arr={5,4,3,2,1,0}
        int[] arr={0,1,2,3,4,5};
        int length=arr.length;
        //length-1 as indexing starts from 0
        int[] revArray=reverseArray(arr,0,length-1);
        //loop through array for display.
        for(int i:revArray)
            System.out.print(i+" ");

    }
}
