public class FloydCycle{

	public static void main(String...ar){
		ListNode n = new ListNode(3);
		n.appendToTail(5);
		n.appendToTail(7);
		n.appendToTail(2);
		n.appendToTail(8);
		n.appendToTail(7);
		//n.next.next.next.next.next = n.next.next;
		ListNode loopBeginning = detectCycleBeginning(n);
		System.out.println(loopBeginning.data);
	}

	public static ListNode detectCycleBeginning(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast){
				break;
			}
		}
		
		// this condition means that there is no cycle in the linked list
		if (fast == null || fast.next == null){
			return null;
		}

		// this gives us the starting position of the loop
		slow = head;
		while (fast != slow){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}

}