public class represent {
    
    //Sparse Matrix representation in form of rows and columns and values
    
    public static int[][] arrayrep (int[][] mat){
        int[][] repmat = new int[mat.length][mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j]!=0){
                    repmat[0][i] = (i+1);
                    repmat[1][i] = (j+1);
                    repmat[2][i] = mat[i][j];
                    System.out.println("Row: " + (i+1) + " Column: " + (j+1) + " Value: " + mat[i][j]);
                }
            }
        }
        System.out.println();

         for(int k = 0; k < repmat.length; k++){
            for(int l = 0; l < repmat.length; l++){
                System.out.print(repmat[k][l] + " ");
            }
            System.out.println();
        }

        System.out.println(
            "------------------------------------"  
        );

        return repmat; 
    }

    public static int[][] transpose (int [][] mat) {
        int [][] transpose = new int[mat.length][mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                transpose[i][j] = mat[j][i];
            }
        }

        for (int k = 0; k<mat.length;k++){
            for(int l = 0; l<mat.length;l++){
                System.out.print(transpose[k][l] + " ");
            }
            System.out.println();
        }
        System.out.println(
            "------------------------------------"  
        );
        return transpose;
    }

    public static int[][] matmult (int [][] mat, int[][] mat2){
        int [][] matmult = new int[mat.length][mat.length];
        // Check if the matrices are compatible for multiplication

        // Compare the number of columns in the first matrix to the number of rows in the second matrix

        
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                matmult[i][j] += mat[i][j] * mat2[j][i];
            }
        }

        for (int k = 0; k<mat.length;k++){
            for(int l = 0; l<mat.length;l++){
                System.out.print(matmult[k][l] + " ");
            }
            System.out.println();
        }
        System.out.println(
            "------------------------------------"  
        );
        return matmult;

    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,10},{2,0,0},{0,4,0},{5,0,0}};
        int [][] mat2 = {{7,0,0,0},{0,8,0,0},{0,0,6,0},{0,0,0,9}};
        int [][] mat3 = {{1,0,0,0},{0,1,0,0},{0,0,0,1},{0,0,1,0}};

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // arrayrep(mat);
        // transpose(mat);
        matmult(mat, mat2);
    
    }
}
