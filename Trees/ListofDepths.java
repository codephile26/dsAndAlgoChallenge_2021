import java.util.ArrayList;
import java.util.LinkedList;

public class ListofDepths{

	public static ArrayList<LinkedList<TreeNode<Integer>>> createLevelLinkedListBfs(TreeNode<Integer> root){
		ArrayList<LinkedList<TreeNode<Integer>>> result = new ArrayList<>();

		LinkedList<TreeNode<Integer>> current = new LinkedList<TreeNode<Integer>>();
		if (root != null){
			current.add(root);
		}

		while(current.size() > 0){
			result.add(current); //add the current level to the result list
			LinkedList<TreeNode<Integer>> parents = current;
			current = new LinkedList<>();
			for(TreeNode<Integer> parent:parents){
				if (parent.getLeft() != null){
					current.add(parent.getLeft());
				}
				if (parent.getRight() != null){
					current.add(parent.getRight());
				}
			}
		}
		return result;
	}

	public static ArrayList<LinkedList<TreeNode<Integer>>> createLevelLinkedListDfs(TreeNode<Integer> root){
			ArrayList<LinkedList<TreeNode<Integer>>> result = new ArrayList<>();
			createLevelLinkedListDfs(root, result, 0);
			return result;
	}

	private static void createLevelLinkedListDfs(TreeNode<Integer> root, ArrayList<LinkedList<TreeNode<Integer>>> lists, int level){
		if (root == null){
			return;
		}
	
		LinkedList<TreeNode<Integer>> list = null;
		if (lists.size() == level){
			list = new LinkedList<TreeNode<Integer>>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedListDfs(root.getLeft(), lists, level + 1);
		createLevelLinkedListDfs(root.getRight(), lists, level + 1);
	}

	public static void main(String [] args){
		TreeNode<Integer> rootNode = new TreeNode<>();
		rootNode.setData(15);
		TreeNode<Integer> leftSubtree = new TreeNode<>();
		leftSubtree.setData(12);
		TreeNode<Integer> rightSubtree = new TreeNode<>();
		rightSubtree.setData(18);
		TreeNode<Integer> leftSubtreeChild1 = new TreeNode();
		leftSubtreeChild1.setData(8);
		TreeNode<Integer> leftSubtreeChild2 = new TreeNode();
		leftSubtreeChild2.setData(13);
		TreeNode<Integer> rightSubtreeChild1 = new TreeNode();
		rightSubtreeChild1.setData(16);
		TreeNode<Integer> rightSubtreeChild2 = new TreeNode();
		rightSubtreeChild2.setData(20);
		rootNode.setLeft(leftSubtree);
		rootNode.setRight(rightSubtree);
		leftSubtree.setLeft(leftSubtreeChild1);
		leftSubtree.setRight(leftSubtreeChild2);
		rightSubtree.setLeft(rightSubtreeChild1);
		rightSubtree.setRight(rightSubtreeChild2);
		ArrayList<LinkedList<TreeNode<Integer>>> listsBfs = createLevelLinkedListBfs(rootNode);
		System.out.println(listsBfs.size());
		ArrayList<LinkedList<TreeNode<Integer>>> listsDfs = createLevelLinkedListDfs(rootNode);
		System.out.println(listsDfs.size());
	}
}