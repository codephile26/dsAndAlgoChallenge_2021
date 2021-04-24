public class TreeTraversal<T>{
	
	public void visitNode(Node<T> node){
		System.out.println(node.getData());
	}

	public void inorderTraversal(Node<T> node){
		if (node == null){
			return;
		}
		inorderTraversal(node.getLeft());
		visitNode(node);
		inorderTraversal(node.getRight());
	}

	public void preorderTraversal(Node<T> node){
		if (node == null){
			return;
		}
		visitNode(node);
		preorderTraversal(node.getLeft());
		preorderTraversal(node.getRight());
	}

	public void postorderTraversal(Node<T> node){
		if (node == null){
			return;
		}
		postorderTraversal(node.getLeft());
		postorderTraversal(node.getRight());
		visitNode(node);
	}
}