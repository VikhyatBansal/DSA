package clas;

import java.util.Stack;

public class depthfirst {
	static int[][] m = { 
			{ 0, 1, 1, 1, 0, 0, 0 },
			{ 1, 0, 1, 1, 1, 0, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 },
			{ 1, 1, 0, 0, 1, 1, 0 },
			{ 0, 1, 0, 1, 0, 0, 1 },
			{ 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 1, 0, 0 } };
	static boolean[] v = new boolean[m.length];


	public void dfs(int a) {
        v[a] = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(a);
        int i,x;
        System.out.println(a);
        while(!stack.isEmpty()){
            x = stack.pop();
            for(i=0; i<m.length; i++){
                if(m[x][i] == 1 && v[i] == false){
                    stack.push(x);
                    v[i] = true;
                    System.out.println(i);
                    x = i;
                    i = 0;
                }
            }
        }
    }
		
	public static void main(String[] args) {
		depthfirst d = new depthfirst();
		System.out.println("The depth first traversal of the graph is ");
		d.dfs(1);
	}
}
