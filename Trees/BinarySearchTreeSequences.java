import java.util.LinkedList;
import java.util.ArrayList;


public class BinarySearchTreeSequences{

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
	}
}