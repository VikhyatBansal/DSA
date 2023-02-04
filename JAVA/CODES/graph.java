package clas;

public class graph {
	public void indegree(int[][] m, int a) {
		int id = 0;
		for (int i = 0; i < m.length; i++) {
			id=id+m[i][a-1];
		}
		System.out.println("indegree of the vertex is " + id);
	}
	public void outdegree(int[][] m, int a) {
		int od = 0;
		for (int i = 0; i < m.length; i++) {
			od=od+m[a-1][i];
		}
		System.out.println("outdegree of the vertex is " + od);
	}
	public void degree(int[][] m, int a) {
		int od = 0;
		int id = 0;
		int d = 0;
		for (int i = 0; i < m.length; i++) {
			od=od+m[a-1][i];
		}
		for (int i = 0; i < m.length; i++) {
			id=id+m[i][a-1];
		}
		d=id+od;
		
		System.out.println("degree of the vertex is " + d);
	}
	

	public static void main(String[] args) {
		graph g = new graph();
		int[][] m = { { 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 1, 1 },
				{ 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int a = 1;
		//int b = 2;
		//int c = 3;
		//int d = 4;
		//int e = 5;
		g.indegree(m,a);
		g.outdegree(m,a);
		g.degree(m,a);
	}
}
