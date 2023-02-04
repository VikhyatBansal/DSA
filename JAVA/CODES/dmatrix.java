package DSA_Inclass;

public class dmatrix {

    public static int[][] adjmatrix () {
        int [][] mat = new int[6][6];
        mat[0][0] = 0;
        mat[0][1] = 1;
        mat[0][2] = 1;
        mat[0][3] = 0;
        mat[0][4] = 0;
        mat[0][5] = 0;
        mat[1][0] = 1;
        mat[1][1] = 0;
        mat[1][2] = 1;
        mat[1][3] = 0;
        mat[1][4] = 0;
        mat[1][5] = 0;
        mat[2][0] = 1;
        mat[2][1] = 1;
        mat[2][2] = 0;
        mat[2][3] = 1;
        mat[2][4] = 0;
        mat[2][5] = 0;
        mat[3][0] = 0;
        mat[3][1] = 0;
        mat[3][2] = 1;
        mat[3][3] = 0;
        mat[3][4] = 1;
        mat[3][5] = 1;
        mat[4][0] = 0;
        mat[4][1] = 0;
        mat[4][2] = 0;
        mat[4][3] = 1;
        mat[4][4] = 0;
        mat[4][5] = 1;
        mat[5][0] = 0;
        mat[5][1] = 0;
        mat[5][2] = 0;
        mat[5][3] = 1;
        mat[5][4] = 1;
        mat[5][5] = 0;

        System.out.println("The Adjacency matrix will look something like this");
        for (int i = 0;i<6;i++){
            for (int j = 0;j<6;j++){
               
                System.out.print(mat[i][j] + " ");
               
            }
            System.out.println();
        }
        return mat;
    }

    // public static void adjacencylist (){

    //     //Adjacency list using array of linked list

    //      static Node head; // head of list

    //     static class Node{
    //         int data;
    //         Node next;
    //         Node(int d){
    //             data = d;
    //             next = null;
    //         }
    //     }

    //     static void print(){
    //         Node temp = head;
    //         while (temp!= null) {
    //             System.out.print(temp.data + " ");
    //             temp = temp.next;
    //         }
    //         System.out.println();
    //     }

    //     static void push(int data){
    //         Node temp = new Node(data);
    //         temp.next = head;
    //         head = temp;
    //     }


    //     int adjlist[] = new int[6];
    //     for (int i = 0;i<6;i++){
    //         adjlist[i] = 
    //     }
    //     adjlist[0].add(1);
    //     adjlist[0].add(2);
    //     adjlist[1].add(0);
    //     adjlist[1].add(2);
    //     adjlist[2].add(0);
    //     adjlist[2].add(1);
    //     adjlist[2].add(3);
    //     adjlist[3].add(2);
    //     adjlist[3].add(4);
    //     adjlist[3].add(5);
    //     adjlist[4].add(3);
    //     adjlist[4].add(5);
    //     adjlist[5].add(3);
    //     adjlist[5].add(4);
    // }

    static void neighbours(int[][] mat, int node){
        System.out.println("The neighbours of node " + (node+1) + " are: ");
        for (int i = 0;i<6;i++){
            if (mat[node][i] == 1){
                System.out.print(i+1 + " ");
            }
        }
        System.out.println();
    }

    static void cycles (int[][] mat){
        System.out.println("The cycles in the graph are: ");
        for (int i = 0;i<6;i++){
            for (int j = 0;j<6;j++){
                if (mat[i][j] == 1){
                    for (int k = 0;k<6;k++){
                        if (mat[j][k] == 1 && mat[k][i] == 1){
                            System.out.println((i+1) + " " + (j+1) + " " + (k+1));
                        }
                    }
                }
            }
        }
    }

    static void changenodevalue (int[][] mat, int node, int value){
        mat[node][node] = value;
        System.out.println("The new adjacency matrix is: ");
        for (int i = 0;i<6;i++){
            for (int j = 0;j<6;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // adjmatrix();
        // adjacencylist();
        // neighbours(adjmatrix(), 0);
        // cycles(adjmatrix());
        
      
    }
}