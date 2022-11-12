/*

Problem Statement: Is Graph Cyclic ?

 */

import java.io.*;
import java.util.*;

public class IsGraphCyclic {
	static class Edge 
	{
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

		boolean[] visited = new boolean[vertices];
		int[] parent = new int[vertices];
		Arrays.fill(parent, -1); // Initially, all nodes will have parent -1.

		for (int v = 0; v < vertices; v++) {
			if (visited[v] == false) {
				boolean cyclic = IsCyclic(graph, v, visited, parent);
				if (cyclic) {
					System.out.println(true);
					return;
				}
			}
		}

		System.out.println(false);
	}

	public static boolean IsCyclic(ArrayList< Edge>[] graph, int src,
                                 boolean[] visited, int[] parent) {
		ArrayDeque< Integer> queue = new ArrayDeque<>();

		queue.add(src);
		visited[src] = true;

		while (queue.size() > 0) {
			int remove = queue.remove();

			for (Edge e : graph[remove]) {

				if (visited[e.nbr] && parent[remove] != e.nbr) {
					// e.nbr is visited already & it is not the parent of rem.
					// Hence, there exists a cycle
					return true;
				}

				if (!visited[e.nbr]) {
					queue.add(e.nbr);
					visited[e.nbr] = true;
					parent[e.nbr] = remove;
				}
			}
		}

		return false;
	}

}