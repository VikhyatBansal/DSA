package clas;

import java.util.*;

class Edge {
	int source, dest;

	public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
}

class Graph {
	List<List<Integer>> adjList = null;

	Graph(List<Edge> edges, int n) {
		adjList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());
		}

		for (Edge edge : edges) {
			int src = edge.source;
			int dest = edge.dest;

			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}
	}
}

class breathfirstrec {

	public static void recursiveBFS(Graph graph, Queue<Integer> q, boolean[] discovered) {
		if (q.isEmpty()) {
			return;
		}
		int v = q.poll();
		System.out.println(v);

		for (int u : graph.adjList.get(v)) {
			if (!discovered[u]) {
				discovered[u] = true;
				q.add(u);
			}
		}

		recursiveBFS(graph, q, discovered);
	}

	public static void main(String[] args) {
		List<Edge> edges = Arrays.asList(new Edge(0, 2), new Edge(0, 3), new Edge(0, 1), new Edge(3, 5), new Edge(3,4),
				new Edge(3,1), new Edge(1,2), new Edge(4,6),new Edge(1,4));
		int n =7 ;
		Graph graph = new Graph(edges, n);
		boolean[] discovered = new boolean[n];
		Queue<Integer> q = new ArrayDeque<>();
		System.out.println("The breath first traversal of the graph is ");

		for (int i = 0; i < n; i++) {
			if (discovered[i] == false) {
				discovered[i] = true;
				q.add(i);

				recursiveBFS(graph, q, discovered);
			}
		}
	}
}