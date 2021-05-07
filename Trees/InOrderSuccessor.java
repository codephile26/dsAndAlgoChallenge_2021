public class InOrderSuccessor{

	public static TreeNode2 inOrderSuccessor(TreeNode2 n){
		if (n == null){
			return null;
		}

		if (n.getRight() != null){
			return leftmostChild(n.getRight());
		} else {
			TreeNode2 q = n;
			TreeNode2 x = n.getParent();
			while (x != null && x.getLeft() != q){	
				q = x;
				x = x.getParent();
			}
			return x;
		}
	}

	private static TreeNode2 leftmostChild(TreeNode2 n){
		if (n == null){
			return null;
		}
		
		TreeNode2 current = n;
		while (current.getLeft() != null){
			current = current.getLeft();
		}
		return current;
	}

	public static void main(String...ar){
		TreeNode2 root = new TreeNode2(2,null);
		TreeNode2 left = new TreeNode2(1, root);
		TreeNode2 right = new TreeNode2(3, root);
		root.setLeft(left);
		root.setRight(right);
		TreeNode2 node = inOrderSuccessor(left);
		System.out.println(node.getData());
	}
}