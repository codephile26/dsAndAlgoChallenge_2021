import java.util.LinkedList;

public class Graph<T>{
	private LinkedList<Integer> [] edges;
	private int N;

	public Graph(int N){
		this.N = N;
		this.edges = new LinkedList[N];  // the array of edges is initialized with each edge element carrying null value in the array
		for (int i = 0; i < N; i++){
			edges[i] = new LinkedList<Integer>(); // each of the element in the edges array is initialized an empty linked list object
		}
	}

	public void addEdge(int u, int v){
		this.edges[u].add(v);
	}

	public int getNumberOfNodes(){
		return this.N;
	}

	public LinkedList<Integer>[] getEdges(){
		return this.edges;
	}
}