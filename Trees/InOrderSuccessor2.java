public class InOrderSuccessor2{

	// This method uses parent pointer, time complexity = O(n), Space Complexity = O(n)
	public static TreeNode<Integer> inOrderSuccessor(TreeNode<Integer> n){
		if (n == null){
			return null;
		}

		if (n.getRight() != null){
			return leftmostChild(n.getRight());
		} else {
			TreeNode2<Integer> q = n;
			TreeNode2<Integer> x = n.getParent();
			while (x != null && x.getLeft() != q){	
				q = x;
				x = x.getParent();
			}
			return x;
		}
	}

	private static TreeNode<Integer> leftmostChild(TreeNode<Integer> n){
		if (n == null){
			return null;
		}
		
		TreeNode2<Integer> current = n;
		while (current.getLeft() != null){
			current = current.getLeft();
		}
		return current;
	}

	public static void main(String...ar){
		TreeNode2<Integer> root = new TreeNode2<>(2,null);
		TreeNode2<Integer> left = new TreeNode2<>(1, root);
		TreeNode2<Integer> right = new TreeNode2<>(3, root);
		root.setLeft(left);
		root.setRight(right);
		TreeNode2<Integer> node = inOrderSuccessor(left);
		System.out.println(node.getData());
	}
}