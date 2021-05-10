public class TreeTraversalTest{
	public static void main(String [] ar){
		TreeNode<Integer> rootNode = new TreeNode<>();
		rootNode.setData(15);
		TreeNode<Integer> leftSubtree = new TreeNode<>();
		leftSubtree.setData(12);
		TreeNode<Integer> rightSubtree = new TreeNode<>();
		rightSubtree.setData(18);
		TreeNode<Integer> leftSubtreeChild1 = new TreeNode();
		leftSubtreeChild1.setData(8);
		TreeNode<Integer> leftSubtreeChild2 = new TreeNode();
		leftSubtreeChild2.setData(13);
		TreeNode<Integer> rightSubtreeChild1 = new TreeNode();
		rightSubtreeChild1.setData(16);
		TreeNode<Integer> rightSubtreeChild2 = new TreeNode();
		rightSubtreeChild2.setData(20);
		rootNode.setLeft(leftSubtree);
		rootNode.setRight(rightSubtree);
		leftSubtree.setLeft(leftSubtreeChild1);
		leftSubtree.setRight(leftSubtreeChild2);
		rightSubtree.setLeft(rightSubtreeChild1);
		rightSubtree.setRight(rightSubtreeChild2);
		TreeTraversal<Integer> treeTraversal = new TreeTraversal<Integer>();
		System.out.println("Inorder Traversal");
		treeTraversal.inorderTraversal(rootNode);
		System.out.println("Preorder Traversal");
		treeTraversal.preorderTraversal(rootNode);
		System.out.println("Postorder Traversal");
		treeTraversal.postorderTraversal(rootNode);
	}
}