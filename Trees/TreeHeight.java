public class TreeHeight{

	public static int getHeight(TreeNode root){
		if (root== null){
			return 0;
		}

		int lHeight = getHeight(root.getLeft()) + 1;
		int rHeight = getHeight(root.getRight()) + 1;

		return (lHeight > rHeight)? lHeight : rHeight;
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
	}

}