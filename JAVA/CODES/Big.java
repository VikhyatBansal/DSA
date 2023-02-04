public class Big {
   
 static void nextLargestNumber(int [] array){

            int largestNumber = -1;
            boolean updated = false;
        
            for(int i = 0; i < array.length; i++){
                if(i == array.length -1){
                    System.out.println("For " + array[i] + " there is no next largest number, so its " + largestNumber);
                    break;
                }
                for(int j = i; j < array.length; j++){
                    if(array[j] > largestNumber && array[j] > array[i]){
                        largestNumber = array[j];
                        updated = true;
                    }
                }
                if(largestNumber == -1 && updated){
                    System.out.println("For " + array[i] + " there is no next largest number, so its " + largestNumber);
                    continue;
                }
                System.out.println("For " + array[i] + " the next largest number is " + largestNumber);
                largestNumber = -1;
    }  
}
public static void main(String[] args) {

    //input    : arr={0,1,2,3,4,5}
    //output   : arr={5,4,3,2,1,0}
    int[] arr={2,1,7,3};
    int length=arr.length;
    Big b=new Big();
    //length-1 as indexing starts from 0
    nextLargestNumber(arr);
    //loop through array for display.
    // for(int i:revArray)
    //     System.out.print(i+" ");

}
}
