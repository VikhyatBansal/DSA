package clas;

public class depthfirstrec {
	
	static int[][] m = { 
			{ 0, 1, 1, 1, 0, 0, 0 },
			{ 1, 0, 1, 1, 1, 0, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 },
			{ 1, 1, 0, 0, 1, 1, 0 },
			{ 0, 1, 0, 1, 0, 0, 1 },
			{ 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 1, 0, 0 } };
	
	static boolean[] v = new boolean[m.length];
	
	void dfs(int a, boolean[] visited) {
		System.out.println(a);
		visited[a] = true;
		for (int i = 0; i < m[a].length; i++) {
			if (m[a][i] == 1 && (!visited[i])) {
				dfs(i,v);
			}
		}
	}

	public static void main(String[] args) {
		depthfirstrec dfs = new depthfirstrec();
		System.out.println("The depth first traversal of the graph is ");
		dfs.dfs(1, v);
	}
}