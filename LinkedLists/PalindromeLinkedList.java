import java.util.Stack;

public class PalindromeLinkedList{

	public static void main(String...ar){
		ListNode n = new ListNode(5);
		n.appendToTail(4);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		System.out.println(isPalindrome(n));
	}

	public static boolean isPalindrome(ListNode head){
		ListNode slow = head;
		ListNode fast = head;

		Stack<Integer> values = new Stack<>();

		while (fast != null && fast.next != null){
			values.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}

		// implies that the list has even number of elements
		if (fast != null){
			slow = slow.next;
		}

		// 1 -> 2 -> 3 -> 2 -> 1
		while (slow != null){
			int top = values.pop();
			
			if (top != slow.data) {
				return false;
			}
			
			slow = slow.next;
		}
		return slow == null;	
	}
}