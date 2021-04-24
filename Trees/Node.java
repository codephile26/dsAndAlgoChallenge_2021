public class Node<T>{
	private T data;
	private Node left, right;

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return this.data;
	}

	public Node getLeft(){
		return left;
	}

	public void setLeft(Node<T> left){
		this.left = left;
	}

	public void setRight(Node<T> right){
		this.right = right;
	}

	public Node getRight(){
		return right;
	}
}