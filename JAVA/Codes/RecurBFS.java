package SEM_3_Assign_2;
import java.util.*;

// breadth first search in graph using adjacency list WITH RECURSION  

import java.util.*;
 
class RecurBFS
{
    // Perform BFS recursively on the graph
    public static void recursiveBFS(Graph graph, Queue<Integer> q,
                                    boolean[] discovered)
    {
        if (q.isEmpty()) {
            return;
        }
 
        // dequeue front node and print it
        int v = q.poll();
        System.out.print(v + " ");
 
        // do for every edge (v, u)
        for (int u: graph.adjList.get(v))
        {
            if (!discovered[u])
            {
                // mark it as discovered and enqueue it
                discovered[u] = true;
                q.add(u);
            }
        }
 
        recursiveBFS(graph, q, discovered);
    }
 
    public static void main(String[] args)
    {
        // List of graph edges as per the above diagram
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5),
                new Edge(2, 6), new Edge(5, 9), new Edge(5, 10), new Edge(4, 7),
                new Edge(4, 8), new Edge(7, 11), new Edge(7, 12),new Edge
                (3,13),new Edge(3,14)
        );
 
        // total number of nodes in the graph (labelled from 0 to 14)
        int n = 15;
 
        // build a graph from the given edges
        Graph graph = new Graph(edges, n);
 
        // to keep track of whether a vertex is discovered or not
        boolean[] discovered = new boolean[n];
 
        // create a queue for doing BFS
        Queue<Integer> q = new ArrayDeque<>();
 
        // Perform BFS traversal from all undiscovered nodes to
        // cover all connected components of a graph
        for (int i = 0; i < n; i++)
        {
            if (discovered[i] == false)
            {
                // mark the source vertex as discovered
                discovered[i] = true;
 
                // enqueue source vertex
                q.add(i);
 
                // start BFS traversal from vertex `i`
                recursiveBFS(graph, q, discovered);
            }
        }
    }
}

// A class to store a graph edge
class Edge
{
    int source, destin;
 
    public Edge(int source, int destin)
    {
        this.source = source;
        this.destin = destin;
    }
}
 
// A class to represent a graph object
class Graph
{
    // A list of lists to represent an adjacency list
    List<List<Integer>> adjList = null;
 
    // Constructor
    Graph(List<Edge> edges, int n)
    {
        adjList = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
 
        // add edges to the undirected graph
        for (Edge edge: edges)
        {
            int src = edge.source;
            int destin = edge.destin;
 
            adjList.get(src).add(destin);
            adjList.get(destin).add(src);
        }
    }
}
 

