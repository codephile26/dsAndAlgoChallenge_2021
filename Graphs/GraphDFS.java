import java.util.LinkedList;
import java.util.Iterator;

public class GraphDFS{
	// visited array boolean to mark the graph nodes as visited or univisited
	boolean [] visited;

	//constructor- accepts number of vertices
	public GraphDFS(Graph g){
		visited = new boolean[g.getNumberOfNodes()];
	}

	public void dfs(Graph g,int v){
		dfsUtil(g,v);
	}

	private void dfsUtil(Graph g, int v){
		System.out.print(v + " ");
		visited[v]=true;
		LinkedList<Integer>[] edges = g.getEdges();

		Iterator<Integer> i = edges[v].listIterator();
		while (i.hasNext()){
			int n = i.next();
			if (!visited[n]){
				dfsUtil(g,n);
			}
		}
	}
}