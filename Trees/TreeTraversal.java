public class TreeTraversal{
	
	public static void visitNode(TreeNode node){
		System.out.print(node.getData() + " ");
	}

	public static void inorderTraversal(TreeNode node){
		if (node == null){
			return;
		}
		inorderTraversal(node.getLeft());
		visitNode(node);
		inorderTraversal(node.getRight());
	}

	public static void preorderTraversal(TreeNode node){
		if (node == null){
			return;
		}
		visitNode(node);
		preorderTraversal(node.getLeft());
		preorderTraversal(node.getRight());
	}

	public static void postorderTraversal(TreeNode node){
		if (node == null){
			return;
		}
		postorderTraversal(node.getLeft());
		postorderTraversal(node.getRight());
		visitNode(node);
	}
}