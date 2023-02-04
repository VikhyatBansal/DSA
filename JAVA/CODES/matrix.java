package DSA_Inclass;

public class matrix {

    // matrix multiplication

    public static int[][] matrixmult (int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        return c;
    }
        
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[0][2] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[2][0] = 0;
        arr[2][1] = 0;
        arr[2][2] = 1;

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] arr1 = new int[3][3];
        arr1[0][0] = 1;
        // arr1[0][1] = 0;
        // arr1[0][2] = 0;
        arr1[1][0] = 2;
        // arr1[1][1] = 0;
        // arr1[1][2] = 0;
        arr1[2][0]= 3;
        // arr1[2][1] = 0;
        // arr1[2][2] = 0;
            
        // for (int k = 0; i < arr1.length; i++) {
        //     for (int l = 0; j < arr1.length; j++) {
        //         System.out.print(arr1[k][l] + " ");
        //     }
        //     System.out.println();
        // }

        matrixmult(arr, arr1);


    }
    
}
