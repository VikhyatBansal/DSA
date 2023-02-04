package clas;

import java.util.*;

public class breathfirst {
	static int[][] m = { 
			{ 0, 1, 1, 1, 0, 0, 0 },
			{ 1, 0, 1, 1, 1, 0, 0 },
			{ 1, 1, 0, 0, 0, 0, 0 },
			{ 1, 1, 0, 0, 1, 1, 0 },
			{ 0, 1, 0, 1, 0, 0, 1 },
			{ 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 1, 0, 0 } };
	static boolean[] v = new boolean[m.length];

	void bfs(int a) {
		Arrays.fill(v, false);
		List<Integer> q = new ArrayList<>();
		q.add(a);
		v[a] = true;
		int x;
		while (!q.isEmpty()) {
			x = q.get(0);
			System.out.println(x);
			q.remove(q.get(0));
			for (int i = 0; i < m.length; i++) {
				if (m[x][i] == 1 && (!v[i])) {
					q.add(i);
					v[i] = true;
				}
			}
		}
	}


	public static void main(String[] args) {
		breathfirst t = new breathfirst();
		System.out.println("The breath first traversal of the graph is ");
		t.bfs(0);
	}
}
