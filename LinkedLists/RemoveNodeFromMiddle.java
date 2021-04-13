public class RemoveNodeFromMiddle{

	public static void main(String...ar){
		ListNode n = new ListNode(3);
		n.appendToTail(5);
		n.appendToTail(3);
		n.appendToTail(7);
		n.appendToTail(2);
		n.appendToTail(8);
		n.appendToTail(7);
		ListNode k = KthElementFromLast.findKthElementFromLast(n,3);
		removeGivenNode(k);
		RemoveDuplicates.printAllElementsInLinkedList(n);
	}

	public static boolean removeGivenNode(ListNode k){
		if (k == null || k.next == null) return false;

		k.data = k.next.data;
		k.next = k.next.next;
		return true;
	}

}