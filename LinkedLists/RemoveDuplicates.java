import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates{
	
	public static void deleteDuplicates(ListNode n){
		Set<Integer> hashSet = new HashSet<Integer>();
		ListNode previous = null;
		while (n != null){
			if (hashSet.contains(n.data)){
				previous.next = n.next;
			} else {
				hashSet.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}

	public static void main(String...ar){
		ListNode n = new ListNode(3);
		n.appendToTail(5);
		n.appendToTail(3);
		n.appendToTail(7);
		n.appendToTail(2);
		n.appendToTail(8);
		n.appendToTail(7);
		System.out.println("Before removing duplicates:");
		printAllElementsInLinkedList(n);
		deleteDuplicates(n);
		System.out.println("After removing duplicates:");
		printAllElementsInLinkedList(n);
	}

	public static void printAllElementsInLinkedList(ListNode n){
		ListNode node = n;
		while (node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}
}