import java.util.LinkedList;

public class GraphNode<T>{
	private T data;
	private LinkedList<GraphNode<T>> adjacent = new LinkedList<>();
	public State state;

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return this.data;
	}

	public LinkedList<GraphNode<T>> getAdjacent(){
		return this.adjacent;
	}

	public void setAdjacent(GraphNode<T> graphNode){
		this.adjacent.add(graphNode);
	}
}

enum State{
	Unvisited,
	Visiting,
	Visited;
}