import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class FindPath {
	private boolean [] visited;

	public FindPath(Graph g){
		visited = new boolean[g.getNumberOfNodes()];
	}
	
	public boolean isReachable(Graph g, int u, int v){
		Queue<Integer> queue = new LinkedList();
		visited[u] = true;
		queue.add(u);
		LinkedList<Integer>[] graphEdges = g.getEdges();

		while(!queue.isEmpty()){
			int current = queue.poll();
			Iterator<Integer> iter = graphEdges[current].listIterator();
			while (iter.hasNext()){
				int adjNode = iter.next();
				if (adjNode == v){
					return true;
				} else if (!visited[adjNode]){
					visited[adjNode] = true;
					queue.add(adjNode);
				}
			}
		}
		return false;			
	}
}