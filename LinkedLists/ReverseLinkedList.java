public class ReverseLinkedList {

	public static void main(String...ar){
		ListNode n = new ListNode(5);
		n.appendToTail(4);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		ListNode reversed = reverseAndClone(n);
		RemoveDuplicates.printAllElementsInLinkedList(reversed);
		System.out.println(isEqual(n,reversed));
	}

	public static ListNode reverseAndClone(ListNode node){
		ListNode head = null;
		while (node != null){
			ListNode n = new ListNode(node.data);
			n.next = head;
			head = n;
			node = node.next;
		}
		return head;
	}
	
	public static boolean isEqual(ListNode head1, ListNode head2){
		if (head1 == null || head2 == null){
			return false;
		}

		ListNode one = head1;
		ListNode two = head2;

		while (one != null && two != null){
			if (one.data != two.data) {
				return false;
			}
			one = one.next;
			two = two.next;
		}

		return one == null && two == null;
	}

}