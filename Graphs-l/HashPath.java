/*
Problem Statement: Hash Path ?

You are given a graph, a src vertex and a destination vertex.
You are required to find if a path exists between src and dest. If it does, print true 
     otherwise print false.
     
Sample Input:
7
8
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
0
6

Sample Output:
true

 */
import java.io.*;

import java.util.*;

public class HashPath {
  static class Edge {
    int source;
    int neighbour;
    int wt;

    Edge(int source, int neighbour, int wt) {
      this.source = source;
      this.neighbour = neighbour;
      this.wt = wt;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int vertices = Integer.parseInt(br.readLine());
    ArrayList< Edge>[] graph = new ArrayList[vertices];
    for (int i = 0; i < vertices; i++) {
      graph[i] = new ArrayList<>();
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

    int source = Integer.parseInt(br.readLine());
    int destination = Integer.parseInt(br.readLine());

    boolean[] visited = new boolean[vertices];
    boolean flag = hasPath(graph, source, destination, visited);
    System.out.println(flag);
  }

  public static boolean hasPath(ArrayList< Edge>[] graph, int sourse, int destination, boolean[] visited) {
	  
    if (sourse == destination)
      return true;
    
    // for visited edges
    visited[sourse] = true;
    
    for (Edge e : graph[sourse]) {
      if (!visited[e.neighbour]) {
        boolean neighbourHasPath = hasPath(graph, e.neighbour, destination, visited);
        if (neighbourHasPath==true)
          return true;
      }
    }
    return false;
  }

}