package SEM_3_Assign_2;

// depth first search in graph using adjacency matrix WITH RECURSION 
public class RecurDFS {
    static int[][] mat = new int[4][4];
    static int[] visited = new int[6];

    static void dfs(int v){
        int i;
        visited[v] = 1;
        System.out.print((v+1) + " ");
        for (i = 0;i<4;i++){
            if (mat[v][i] == 1 && visited[i] == 0){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        mat[0][1] = 1;
        mat[0][2] = 1;
        mat[1][0] = 1;
        mat[1][2] = 1;
        mat[2][0] = 1;
        mat[2][1] = 1;
        mat[2][3] = 1;
        mat[3][2] = 1;

        System.out.println("The adjacency matrix is: ");
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The depth first search is: ");
        dfs(2);
    }
    
    
}
