package SEM_3_Assign_2;

// breadth first search in graph using adjacency matrix WITHOUT RECURSION

import java.util.*;

public class BFSworecur {
    static int[][] mat = new int[4][4];
    static int[] visited = new int[4];
    static int[] queue = new int[4];
    static int front = 0;
    static int rear = 0;
    static int count = 0;

    static void insert(int x){
        queue[rear] = x;
        rear++;
        count++;
    }

    static int delete(){
        int x = queue[front];
        front++;
        count--;
        return x;
    }

    static void bfs(int v){
        int i;
        visited[v] = 1;
        insert(v);
        while(count!=0){
            v = delete();
            System.out.print((v+1) + " ");
            for (i = 0;i<4;i++){
                if (mat[v][i] == 1 && visited[i] == 0){
                    insert(i);
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


        System.out.println("The adjacency matrix is: ");
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The BFS traversal is: ");
        bfs(2);
}
}