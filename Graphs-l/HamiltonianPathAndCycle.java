/*
Problem Statement: Hamiltonian Path And Cycle

You are given a graph and a src vertex.
You are required to find and print all hamiltonian paths and cycles starting from src. The cycles must end with "*" and paths with a "."

Note -> A hamiltonian path is such which visits all vertices without visiting any twice. A hamiltonian path becomes a cycle if there is an edge between first and last vertex.
Note -> Print in lexicographically increasing order.

Sample Input:
Vertices: 7
Edges: 9
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
2 5 10
Source: 0

Sample Output:
0123456 -> path
0123465 -> path
0125643 -> cycle
0346521 -> cycle

 */

import java.io.*;
import java.util.*;

public class HamiltonianPathAndCycle {
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

	  System.out.print("Vertices: ");
	  int vtces = Integer.parseInt(br.readLine());
	  ArrayList< Edge>[] graph = new ArrayList[vtces];
	  for (int i = 0; i < vtces; i++) {
		  graph[i] = new ArrayList< >();
	  }

	  System.out.print("Edges: ");
	  int edges = Integer.parseInt(br.readLine());
	  for (int i = 0; i < edges; i++) {
	      String[] parts = br.readLine().split(" ");
	      int v1 = Integer.parseInt(parts[0]);
	      int v2 = Integer.parseInt(parts[1]);
	      int wt = Integer.parseInt(parts[2]);
	      graph[v1].add(new Edge(v1, v2, wt));
	      graph[v2].add(new Edge(v2, v1, wt));
	  }

	  System.out.print("Source: ");
	  int src = Integer.parseInt(br.readLine());
    
	  Hamiltonian(graph,src);
    
  }
  
  public static void Hamiltonian(ArrayList< Edge>[] graph,int src) {
	  
	  HashSet< Integer> visited = new HashSet< >();
	  hamiltonianPathAndCycle(graph, src, src, visited, src + "");
	  
  }

  public static void hamiltonianPathAndCycle(ArrayList< Edge>[] graph, int osrc, int src, HashSet< Integer> visited, String psf) {
	  if (visited.size() == graph.length - 1) {      // Base Case
		  System.out.print(psf);

		  boolean closingEdgeFound = false;
		  //  for check Hamiltonian Path or Cycle whether there is an edge between the original source vertex and source vertex at this call.
		  for (Edge e : graph[osrc]) {   
			  if (e.nbr == src) {
				  closingEdgeFound = true;
				  break;
			  }
		  }

		  // print cycle and path
		  if (closingEdgeFound) {
			  System.out.println(" -> cycle");
		  } 
		  else {
			  System.out.println(" -> path");
		  }
		  return;
	  }

	  visited.add(src);
	  for (Edge e : graph[src]) {
		  if (!visited.contains(e.nbr)) {
			  hamiltonianPathAndCycle(graph, osrc, e.nbr, visited, psf + e.nbr);
		  }
	  }
	  visited.remove(src);
  }
}