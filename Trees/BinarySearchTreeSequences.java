import java.util.LinkedList;
import java.util.ArrayList;

public class BinarySearchTreeSequences{

	public static ArrayList<LinkedList<Integer>> allSequences(TreeNode<Integer> root){
		ArrayList<LinkedList<Integer>> results = new ArrayList<LinkedList<Integer>>();

		if (root == null){
			results.add(new LinkedList<Integer>());
			return results;
		}

		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(root.getData());

		ArrayList<LinkedList<Integer>> leftSequences = allSequences(root.getLeft());
		ArrayList<LinkedList<Integer>> rightSequences = allSequences(root.getRight());

		for(LinkedList<Integer> first : leftSequences){
			for(LinkedList<Integer> second : rightSequences){
				ArrayList<LinkedList<Integer>> weavedLists = new ArrayList<LinkedList<Integer>>();
				weave(first,second,weavedLists,prefix);
				results.addAll(weavedLists);
			}
		}

		return results;
	}

	public static void weave(LinkedList<Integer> first, LinkedList<Integer> second, ArrayList<LinkedList<Integer>> weavedLists, LinkedList<Integer> prefix){
		if (first.size() == 0 || second.size() == 0){
			LinkedList<Integer> result = (LinkedList)prefix.clone();
			result.addAll(first);
			result.addAll(second);
			weavedLists.add(result);
			return;
		}

		int headFirst = first.removeFirst();
		prefix.addLast(headFirst);
		weave(first,second,weavedLists,prefix);
		prefix.removeLast();
		first.addFirst(headFirst);

		int headSecond = second.removeFirst();
		prefix.addLast(headSecond);
		weave(first,second,weavedLists,prefix);
		prefix.removeLast();
		second.addFirst(headSecond);
	}

	public static void main(String...ar){
		//Test case for weave method
		ArrayList<LinkedList<Integer>> weavedLists = new ArrayList<>();
		LinkedList<Integer> first = new LinkedList<>();
		first.add(4);
		first.add(3);
		LinkedList<Integer> second = new LinkedList<>();
		second.add(8);
		second.add(9);
		LinkedList<Integer> prefix = new LinkedList<>();
		prefix.add(5);
		weave(first,second,weavedLists,prefix);
		System.out.println(weavedLists);

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
		//leftSt2.setLeft(leftSt4); //4 left
		//leftSt2.setRight(rightSt4);//4 right
		//rightSt3.setLeft(leftSt5);
		//rightSt3.setRight(rightSt5);
		System.out.println("Binary Search Tree Sequences:");
		System.out.println(allSequences(root));
	}
}