public class CheckBinarySearchTree{

	private static Integer lastData = -1;

	public static boolean checkBst(TreeNode<Integer> root){
		if (root == null){
			return true;
		}

		// Visit left node
		if (!checkBst(root.getLeft())){
			return false;
		}
		
		// visit root node
		if (root.getData() < lastData){
			return false;
		}
		lastData = root.getData();

		if (!checkBst(root.getRight())){
			return false;
		}
		return true;
	}

	public static void main(String [] args){
		TreeNode<Integer> root = new TreeNode();
		root.setData(8);
		TreeNode<Integer> left = new TreeNode();
		left.setData(6);
		TreeNode<Integer> right = new TreeNode();
		right.setData(9);
		//TreeNode<Integer> leftChild1 = new TreeNode();
		//leftChild1.setData(5);
		//TreeNode<Integer> leftChild2 = new TreeNode();
		//leftChild2.setData(7);
		//TreeNode<Integer> rightChild1 = new TreeNode();
		//rightChild1.setData(10);
		//TreeNode<Integer> rightChild2 = new TreeNode();
		//rightChild2.setData(11);
		
		//left.setLeft(leftChild1);
		//left.setRight(leftChild2);
		//right.setLeft(rightChild1);
		//right.setRight(rightChild2);
		root.setLeft(left);
		root.setRight(right);
		System.out.println("CheckBST: " + checkBst(root));
	}


}