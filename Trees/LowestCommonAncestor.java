public class LowestCommonAncestor {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		// throw error - if either of the node does not exist in the tree
		if ((!covers(root,p)) || (!covers(root,q))){
			return null;
		}

		return ancestorHelper(root,p,q);
	}

	public static TreeNode ancestorHelper(TreeNode root, TreeNode p, TreeNode q){
		if (root == null || p == root || q == root){
			return root;
		}

		boolean isPonLeft = covers(root.getLeft(),p);
		boolean isQonLeft = covers(root.getLeft(),q);
		if (isPonLeft != isQonLeft) {
			return root;
		}

		TreeNode childSide = isPonLeft ? root.getLeft() : root.getRight();
		return ancestorHelper(childSide, p, q);
	}

	// code to find if a given node exists in a Tree
	public static boolean covers(TreeNode root, TreeNode p){
		if (root == null){
			return false;
		}
		if (root == p){
			return true;
		}
		return covers(root.getLeft(), p) || covers(root.getRight(),p);
	}

	public static void main(String...ar){
		TreeNode<Integer> root = new TreeNode<Integer>(8);
		TreeNode<Integer> leftSt1 = new TreeNode<Integer>(6);
		TreeNode<Integer> rightSt1 = new TreeNode<Integer>(10);
		TreeNode<Integer> leftSt2 = new TreeNode<Integer>(4);
		TreeNode<Integer> rightSt2 = new TreeNode<Integer>(7);
		TreeNode<Integer> leftSt3 = new TreeNode<Integer>(9);
		TreeNode<Integer> rightSt3 = new TreeNode<Integer>(12);
		TreeNode<Integer> leftSt4= new TreeNode<Integer>(3);
		TreeNode<Integer> rightSt4 = new TreeNode<Integer>(5);
		TreeNode<Integer> leftSt5 = new TreeNode<Integer>(11);
		TreeNode<Integer> rightSt5 = new TreeNode<Integer>(14);
		root.setLeft(leftSt1); //8 left
		root.setRight(rightSt1);//8 right
		leftSt1.setLeft(leftSt2);//6 left
		leftSt1.setRight(rightSt2);//6 right
		rightSt1.setLeft(leftSt3);//10 left
		rightSt1.setRight(rightSt3);//10 right
		leftSt2.setLeft(leftSt4); //4 left
		leftSt2.setRight(rightSt4);//4 right
		rightSt3.setLeft(leftSt5);
		rightSt3.setRight(rightSt5);
		System.out.println(lowestCommonAncestor(root, leftSt4, rightSt5).getData());
	}
}