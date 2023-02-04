import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        printStringArray(replaceInitial(new String[]{"Yolo", " Land", "Water","Fire", "Song", "CSGO", "Halo"}));
    }

   
   


    private static String [] replaceInitial(String[] array) {
        //Get user input for replacing with 4 new words
        Scanner ab = new Scanner(System.in);
        //Asking for input 4 times from user
        System.out.println("Enter the first word:");
        array[0] = ab.next();
        System.out.println("Enter the second word:");
        array[1] = ab.next();
        System.out.println("Enter the third word:");
        array[2] = ab.next();
        System.out.println("Enter the fourth word:");
        array[3] = ab.next();

        
        return array;

          
    }
    private static void printStringArray(String [] stringArray) {
        for (String s : stringArray){
            System.out.print(s);
        }
    }
  
} 
