public class FindPathTest{
	public static void main(String...ar){
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		//g.addEdge(1, 2);
		g.addEdge(2, 0);
		//g.addEdge(3, 2);
		g.addEdge(1, 5);
		g.addEdge(5, 4);
		g.addEdge(4, 3);
		FindPath findPath = new FindPath(g);
		boolean isReachable = findPath.isReachable(g,0,2);
		System.out.println("It is " + isReachable + " that path exists between 0 and 2");
	}

}