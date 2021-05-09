public class InOrderSuccessor {

	public static TreeNode<Integer> inOrderSuccessor(TreeNode<Integer> n, TreeNode<Integer> root){
		TreeNode<Integer> successor = null;

		while (root != null){
			if (n.getData() >= root.getData()){
				root = root.getRight();
			} else {
				successor = root;
				root = root.getLeft();
			}
		}
		return successor;
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
		System.out.println(inOrderSuccessor(rightSt2,root).getData());
		System.out.println(inOrderSuccessor(root,root).getData());
	}
}