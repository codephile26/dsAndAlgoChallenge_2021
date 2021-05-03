public class MinimalBST{

	public static TreeNode<Integer> createMinimalBST(int [] array){
		return createMinimalBST(array, 0, array.length - 1);
	}

	private static TreeNode<Integer> createMinimalBST(int [] array, int start, int end){
		if (end < start){
			return null;
		}

		int mid = (start + end)/2;
		TreeNode<Integer> treeNode = new TreeNode<Integer>();
		treeNode.setData(array[mid]);
		treeNode.setLeft(createMinimalBST(array, start, mid -1));
		treeNode.setRight(createMinimalBST(array, mid + 1, end));
		return treeNode;
	}

	public static void main(String [] args){
		int [] array = {5,7,10,13,15,20,29};
		TreeNode<Integer> bst = createMinimalBST(array);
		TreeTraversal.inorderTraversal(bst);
	}
}