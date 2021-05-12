public class CheckSubtree{

	public static boolean containsTree(TreeNode t1, TreeNode t2){
		if (t2 == null){
			return true;
		}
		return subTree(t1,t2);
	}

	private static boolean subTree(TreeNode t1, TreeNode t2){
		if (t1 == null){
			return false;
		} else if (t1.getData().equals(t2.getData()) && matchTree(t1,t2)){
			return true;
		}
		return subTree(t1.getLeft(),t2) || subTree(t1.getRight(),t2);
	}

	// match tree checks of the tree after the data matches
	private static boolean matchTree(TreeNode t1, TreeNode t2){
		if (t1 == null && t2 == null){
			return true;
		}
		else if (t1 == null || t2 == null){
			return false;
		} else if (t1.getData() != t2.getData()){
			return false;
		} else {
			return matchTree(t1.getLeft(), t2.getLeft()) && matchTree(t1.getRight(), t2.getRight());
		}
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
		System.out.println(containsTree(root,rightSt3));
	}
}