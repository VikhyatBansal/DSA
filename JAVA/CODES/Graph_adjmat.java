public class Graph_adjmat {

     public static void main(String[] args) {
      
        
        int [][] adjmatrix = new int[5][5];
        adjmatrix[0][1] = 1;
        adjmatrix[0][2] = 1;
        adjmatrix[1][0] = 1;
        adjmatrix[2][0] = 1;

        

        for (int i =0;i<5;i++){
            for (int j =0;j<5;j++){
                System.out.print(adjmatrix[i][j] );
            }
            System.out.println();

        }

     }
    
}
