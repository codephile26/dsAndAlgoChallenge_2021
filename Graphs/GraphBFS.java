import java.util.LinkedList;
import java.util.Queue;
import java.util.ListIterator;

public class GraphBFS{

	private int V;
	private LinkedList<Integer> [] edges;
	private boolean [] visited;

	public GraphBFS(int V){
		this.V = V;
		edges = new LinkedList[V];
		for (int i = 0; i < V; i++){
			edges[i] = new LinkedList();
		}
		visited = new boolean[this.V];
	}

	public void addEdge(int v,int w){
		this.edges[v].add(w);
	}

	public void bfs(int s){
		Queue<Integer> queue = new LinkedList();
		visited[s] = true;
		queue.add(s);

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