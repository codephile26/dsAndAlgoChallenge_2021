import java.util.LinkedList;
import java.util.Iterator;

public class GraphDFS{
	// made up of Vertices and Edges
	private int V;
	private LinkedList<Integer> [] edges;
	boolean [] visited;

	//constructor- accepts number of vertices
	public GraphDFS(int V){
		this.V=V;
		edges = new LinkedList[V];
		for (int i = 0; i < V; ++i){
			edges[i] = new LinkedList<Integer>();
		}
		visited = new boolean[V];
	}

	//add Edge v-w - this is an example of an undirected graph
	public void addEdge(int v, int w){
		edges[v].add(w);
	}

	public void dfs(int v){
		dfsUtil(v);
	}

	public void dfsUtil(int v){
		System.out.print(v + " ");
		visited[v]=true;

		Iterator<Integer> i = edges[v].listIterator();
		while (i.hasNext()){
			int n = i.next();
			if (!visited[n]){
				dfsUtil(n);
			}
		}
	}
}