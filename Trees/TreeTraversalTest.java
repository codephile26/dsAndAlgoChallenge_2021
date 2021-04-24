public class TreeTraversalTest{
	public static void main(String [] ar){
		Node<Integer> rootNode = new Node<>();
		rootNode.setData(15);
		Node<Integer> leftSubtree = new Node<>();
		leftSubtree.setData(12);
		Node<Integer> rightSubtree = new Node<>();
		rightSubtree.setData(18);
		Node<Integer> leftSubtreeChild1 = new Node();
		leftSubtreeChild1.setData(8);
		Node<Integer> leftSubtreeChild2 = new Node();
		leftSubtreeChild2.setData(13);
		Node<Integer> rightSubtreeChild1 = new Node();
		rightSubtreeChild1.setData(16);
		Node<Integer> rightSubtreeChild2 = new Node();
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