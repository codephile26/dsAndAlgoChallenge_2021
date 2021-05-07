public class TreeNode2<T>{
	private T data;
	private TreeNode2<T> left, right, parent;

	public TreeNode2(T data, TreeNode2<T> parent){
		this.data = data;
		this.parent = parent;
	}

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return this.data;
	}

	public TreeNode2<T> getLeft(){
		return left;
	}

	public void setLeft(TreeNode2<T> left){
		this.left = left;
	}

	public void setRight(TreeNode2<T> right){
		this.right = right;
	}

	public TreeNode2<T> getRight(){
		return right;
	}

	public TreeNode2<T> getParent(){
		return this.parent;
	}
}