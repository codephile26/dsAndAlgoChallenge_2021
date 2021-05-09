public class TreeNode<T>{
	private T data;
	private TreeNode left, right;

	public TreeNode(T data){
		this.data = data;
	}

	public TreeNode(){
	}

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return this.data;
	}

	public TreeNode getLeft(){
		return left;
	}

	public void setLeft(TreeNode<T> left){
		this.left = left;
	}

	public void setRight(TreeNode<T> right){
		this.right = right;
	}

	public TreeNode getRight(){
		return right;
	}
}