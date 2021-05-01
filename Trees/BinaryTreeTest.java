public class BinaryTreeTest{
	public static void main(String [] args){
		BinaryTree<Integer> binaryTree = new BinaryTree();
		TreeNode<Integer> root = new TreeNode();
		root.setData(8);
		TreeNode<Integer> left = new TreeNode();
		left.setData(6);
		TreeNode<Integer> right = new TreeNode();
		right.setData(9);
		TreeNode<Integer> leftChild1 = new TreeNode();
		leftChild1.setData(5);
		TreeNode<Integer> leftChild2 = new TreeNode();
		leftChild2.setData(7);
		TreeNode<Integer> rightChild1 = new TreeNode();
		rightChild1.setData(10);
		TreeNode<Integer> rightChild2 = new TreeNode();
		rightChild2.setData(11);
		
		left.setLeft(leftChild1);
		left.setRight(leftChild2);
		right.setLeft(rightChild1);
		right.setRight(rightChild2);
		root.setLeft(left);
		root.setRight(right);
		binaryTree.setRoot(root);
		binaryTree.printLevelOrder();
	}
}