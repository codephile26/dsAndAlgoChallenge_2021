public class CheckSubtreePreOrder{

	public static boolean checkSubtree(TreeNode t1, TreeNode t2){
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		getOrderString(t1,sb1);
		getOrderString(t2,sb2);

		return (sb1.indexOf(sb2.toString()) != -1);
	}

	public static void getOrderString(TreeNode t, StringBuilder sb){
		if (t == null){
			sb.append('X');
			return;
		}

		sb.append(t.getData() + " ");
		getOrderString(t.getLeft(),sb);
		getOrderString(t.getRight(), sb);
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
		System.out.println(checkSubtree(root,rightSt3));
	}
}