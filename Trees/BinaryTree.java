public class BinaryTree<T>{
	private TreeNode<T> root;

	public void setRoot(TreeNode<T> root){
		this.root = root;
	}

	public TreeNode<T> getRoot(){
		return this.root;
	}

	public int getHeight(TreeNode<T> root){
		if (root == null){
			return 0;
		}
	        else {
			int lHeight = getHeight(root.getLeft());
			int rHeight = getHeight(root.getRight());

			// lHeight + 1/rHeight + 1 increase the height of the tree by 1 in each recursive call
			return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
		}
	}

	//recursive function to do Level Order traversal
	private void printGivenLevel(TreeNode<T> root, int level){
		if (root == null){
			return;
		}
		if (level == 1){
			System.out.print(root.getData() + " ");
		} else if (level > 1){
			printGivenLevel(root.getLeft(), level - 1);
			printGivenLevel(root.getRight(), level - 1);
		}
	}

	//public API to print nodes in Level Order or BFS way
	public void printLevelOrder(){
		int height = getHeight(this.root);
		for (int i = 1; i <=height; i++){
			printGivenLevel(this.root, i);
		}
	}
}