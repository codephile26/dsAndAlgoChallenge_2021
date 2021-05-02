import java.util.LinkedList;
import java.util.Queue;
import java.util.ListIterator;

public class GraphBFS{
	private boolean [] visited;

	public GraphBFS(Graph g){
		visited = new boolean[g.getNumberOfNodes()];
	}

	public void bfs(Graph g,int s){
		Queue<Integer> queue = new LinkedList();
		visited[s] = true;
		queue.add(s);
		LinkedList<Integer> [] edges = g.getEdges();
		while(!queue.isEmpty()){
			int current = queue.remove();
			System.out.print(current);
			ListIterator<Integer> iterator = edges[current].listIterator();
			while (iterator.hasNext()){
				int adjacentNode = iterator.next();
				if (!visited[adjacentNode]){
					visited[adjacentNode] = true;
					queue.add(adjacentNode);
				}
			}
		}
	}
}