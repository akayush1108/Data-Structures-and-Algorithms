/*
Problem Statement: Get Connected Components Of A Graph

You are given a graph.
You are required to find and print all connected components of the graph.

Sample Input:
7
5
0 1 10
2 3 10
4 5 10
5 6 10
4 6 10

Sample Output:
[[0, 1], [2, 3], [4, 5, 6]]

 */
import java.io.*;
import java.util.*;

public class GetConnectedComponentsInGraph {
  static class Edge {
    int src;
    int nbr;
    int wt;

    Edge(int src, int nbr, int wt) {
      this.src = src;
      this.nbr = nbr;
      this.wt = wt;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int vertices = Integer.parseInt(br.readLine());
    ArrayList< Edge>[] graph = new ArrayList[vertices];
    for (int i = 0; i < vertices; i++) {
      graph[i] = new ArrayList< >();
    }

    int edges = Integer.parseInt(br.readLine());
    for (int i = 0; i < edges; i++) {
      String[] parts = br.readLine().split(" ");
      int v1 = Integer.parseInt(parts[0]);
      int v2 = Integer.parseInt(parts[1]);
      int wt = Integer.parseInt(parts[2]);
      graph[v1].add(new Edge(v1, v2, wt));
      graph[v2].add(new Edge(v2, v1, wt));
    }
    
    getConnectedPaths(graph,vertices);

    
  }
  public static void getConnectedPaths(ArrayList< Edge>[] graph,int vertices) {
	  ArrayList< ArrayList< Integer>> comps = new ArrayList< >();

	    boolean[] visited = new boolean[vertices];

	    for (int i = 0; i < vertices; i++) {

	      if (visited[i] == false) {

	        ArrayList< Integer> comp = new ArrayList< >();
	        dfs(graph, i, visited, comp);
	        comps.add(comp);
	      }
	    }

	    System.out.println(comps);
  }

  private static void dfs(ArrayList< Edge>[] graph, int source, boolean[] visited, ArrayList< Integer> comp) {

    visited[source] = true;
    comp.add(source);

    for (Edge e : graph[source]) {

      if (visited[e.nbr] == false) {

        dfs(graph, e.nbr, visited, comp);
      }
    }
  }
}