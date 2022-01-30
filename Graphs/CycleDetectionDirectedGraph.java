import java.util.*;

public class CycleDetectionDirectedGraph{


	public static boolean detectCycle(List<Integer> [] graph){
		int [] visited = new int[graph.length];

		for (int i = 0; i < graph.length; i++){
			if (!dfsUtil(graph,visited,i)){
				return true;
			}
		}

		return false;
	}

	public static boolean dfsUtil(List<Integer> [] graph, int [] visited, int node){
		if (visited[node] != 0){
			return visited[node] == 2;
		}

		visited[node] = 1;
		for (int next: graph[node]){
			if (!dfsUtil(graph,visited,next)){
				return true;
			}
		}

		visited[node] = 2;
		return false;
	}

	public static void main(String...ar){
		List<Integer> [] graph = new ArrayList[6];
        	for (int i = 0; i < 6; i++){
            		graph[i] = new ArrayList<>();
        	}

		int [][] edges = new int[][]{{0,1},{0,2},{1,2},{3,0},{3,4},{4,5},{5,3}};
		//[[0,1],[0,2],[1,2],[3,0],[3,4],[4,5],[5,3]]
		//edges[0] = [
        	for (int [] edge:edges){
            		graph[edge[0]].add(edge[1]);
        	}

		System.out.println(detectCycle(graph));
	}




}