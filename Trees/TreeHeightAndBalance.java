public class TreeHeightAndBalance{

	public static int getHeight(TreeNode root){
		if (root== null){
			return 0;
		}

		int lHeight = getHeight(root.getLeft()) + 1;
		int rHeight = getHeight(root.getRight()) + 1;

		return (lHeight > rHeight)? lHeight : rHeight;
	}

	public static boolean isBalanced(TreeNode root){
		if (root == null){
			return true;
		}

		int heightDiff = getHeight(root.getLeft()) - getHeight(root.getRight());
		if (Math.abs(heightDiff) > 1){
			return false;
		} else {
			return isBalanced(root.getLeft()) && isBalanced(root.getRight());
		}
	}

	private static int checkHeight(TreeNode root){
		if (root == null){
			return 0;
		}

		int leftHeight = checkHeight(root.getLeft());
		if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

		int rightHeight = checkHeight(root.getRight());
		if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

		int heightDiff = Math.abs(leftHeight - rightHeight);
		if (heightDiff > 1){
			return Integer.MIN_VALUE;
		}
		else {
			return (Math.max(leftHeight,rightHeight) + 1);
		}
	}

	public static boolean isTreeBalanced(TreeNode root){
		return checkHeight(root) != Integer.MIN_VALUE;
	}

	public static void main(String...ar){
		TreeNode<Integer> root = new TreeNode<>();
		root.setData(1);
		TreeNode<Integer> left = new TreeNode<>();
		left.setData(2);
		TreeNode<Integer> leftChild1 = new TreeNode<>();
		leftChild1.setData(3);
		TreeNode<Integer> leftChild2 = new TreeNode<>();
		leftChild2.setData(4);
		TreeNode<Integer> leftChild3 = new TreeNode<>();
		leftChild3.setData(5);
		left.setLeft(leftChild1);
		left.setRight(leftChild2);
		leftChild2.setRight(leftChild3);
		root.setLeft(left);
		System.out.println("Height of tree is: " + getHeight(root));
		System.out.println("The tree is balanced " + isTreeBalanced(root));
	}
}