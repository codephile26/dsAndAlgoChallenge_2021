public class GraphBFSTest{
	public static void main(String [] args){
		GraphBFS graph = new GraphBFS(6);
		graph.addEdge(0,1);
		graph.addEdge(0,3);
		graph.addEdge(1,5);
		graph.addEdge(1,3);
		graph.addEdge(1,2);
		graph.addEdge(3,2);
		graph.addEdge(5,4);
		graph.addEdge(4,3);
		graph.addEdge(2,0);
		graph.bfs(0);
	}
}