public class KthElementFromLast{
	
	public static void main(String...ar){
		ListNode n = new ListNode(3);
		n.appendToTail(5);
		n.appendToTail(3);
		n.appendToTail(7);
		n.appendToTail(2);
		n.appendToTail(8);
		n.appendToTail(7);
		ListNode kthFromLast = findKthElementFromLast(n,3);
		System.out.println(kthFromLast.data);
	}

	public static ListNode findKthElementFromLast(ListNode n, int k){
		ListNode p1 = n;
		ListNode p2 = n;

		//Move p1 k places into the list
		for (int i = 0; i < k; i++){
			if (p1 == null) return null;
			p1 = p1.next;
		}

		while (p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
}