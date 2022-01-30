import java.util.*;

public class CycleDetectionUndirectedGraph{

	public static boolean detectCycle(List<Integer> [] graph){
		int [] visited = new int[graph.length];

		for (int i = 0; i < graph.length; i++){
			if (dfsUtil(graph,visited,0,0)){
				return true;
			}
		}
		return false;
	}

	public static boolean dfsUtil(List<Integer> [] graph, int [] visited, int parent, int current){
		visited[current] = 1;
		for (int next : graph[parent]){
			if (visited[next] == 0){
				dfsUtil(graph,visited,parent,next);
			} else if (next != parent){
				return true;
			}
		}
		return false;
	}


	public static void main(String...ar){
		List<Integer> [] graph = new ArrayList[6];
		for (int i = 0; i < 6; i++){
			graph[i] = new ArrayList<Integer>();
		}
		int [][] edges = new int[][]{{0,1},{0,5},{1,2},{1,4},{2,3},{3,4}};
		for (int [] edge : edges){
			graph[edge[0]].add(edge[1]);
			graph[edge[1]].add(edge[0]);
		}

		System.out.println(detectCycle(graph));
		
	}



}