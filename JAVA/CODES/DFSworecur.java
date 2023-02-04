package SEM_3_Assign_2;

// depth first search in graph using adjacency matrix WITHOUT RECURSION
public class DFSworecur {

    static int[][] mat = new int[6][6];
    static int[] visited = new int[7];
    static int[] stack = new int[7];
    static int top = -1;
    static int count = 0;

    static void push(int x){
        stack[++top] = x;
        count++;
    }

    static int pop(){
        int x = stack[top--];
        count--;
        return x;
    }

    static void dfs(int v){
        int i;
        visited[v] = 1;
        push(v);
        while(count!=0){
            v = pop();
            System.out.print((v+1) + " ");
            for (i = 0;i<4;i++){
                if (mat[v][i] == 1 && visited[i] == 0){
                    push(i);
                    visited[i] = 1;
                }
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
        mat[3][]
        mat[4][5] = 1;
        mat[5][4] = 1;
        

        System.out.println("The adjacency matrix is: ");
        for (int i = 0;i<6;i++){
            for (int j = 0;j<6;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The depth first search is: ");
        dfs(4);
    }
    
}
