public class GraphBFSTest{
	public static void main(String [] args){
		Graph graph = new Graph(6);
		graph.addEdge(0,1);
		graph.addEdge(0,3);
		graph.addEdge(1,5);
		graph.addEdge(1,3);
		graph.addEdge(1,2);
		graph.addEdge(3,2);
		graph.addEdge(5,4);
		graph.addEdge(4,3);
		graph.addEdge(2,0);
		GraphBFS graphBfs = new GraphBFS(graph);
		graphBfs.bfs(graph,0);
	}
}