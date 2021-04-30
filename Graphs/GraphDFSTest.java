public class GraphDFSTest{
	public static void main(String...ar){
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(3, 2);
		g.addEdge(1, 5);
		g.addEdge(5, 4);
		g.addEdge(4, 3);
		System.out.println("Nodes of this graph in DFS order are:");
		g.dfs(0);

	}
}