public class LinkedListsIntersection {

	public static void main(String...ar){
		ListNode head1 = new ListNode(5);
		head1.appendToTail(6);
		head1.appendToTail(11);
		head1.appendToTail(8);
		head1.appendToTail(15);
		head1.appendToTail(7);
		head1.appendToTail(4);
		
		ListNode head2 = new ListNode(2);
		head2.appendToTail(3);
		head2.appendToTail(10);
		head2.next.next.next = head1.next.next.next.next;

		ListNode intersectingNode = findIntersection(head1,head2);
		System.out.println(intersectingNode.data);

	}

	public static ListNode findIntersection(ListNode head1, ListNode head2){
		ListNode n1 = head1;
		ListNode n2 = head2;

		// find tail and length of each of the 
		Result r1 = getTailAndLength(n1);
		Result r2 = getTailAndLength(n2);

		// there is no intersection point if the tails are not equal.
		if (r1.getTail() != r2.getTail()){
			return null;
		}

		// find intersection point
		ListNode shorter = r1.getLength() < r2.getLength() ? head1 : head2;
		ListNode larger = r1.getLength() > r2.getLength() ? head1 : head2;

		// advance K nodes further in the longer list
		larger = getKthNode(larger, Math.abs(r1.getLength() - r2.getLength()));

		while (shorter != larger){
			shorter = shorter.next;
			larger = larger.next;
		}

		return larger;
	}

	public static Result getTailAndLength(ListNode n){
		Result result = new Result();
		int length = 0;
		while (n != null){
			length++;
			n = n.next;
		}

		result.setLength(length);
		result.setTail(n);
		return result;
	}

	static class Result{
		private int length;
		private ListNode tail;

		public void setLength(int length){
			this.length = length;
		}

		public void setTail(ListNode tail){
			this.tail = tail;
		}

		public int getLength(){
			return this.length;
		}

		public ListNode getTail(){
			return this.tail;
		}
	}

	public static ListNode getKthNode(ListNode n, int length){
		ListNode current = n;		
		int k = length;
		while (k > 0 && current != null){
			current = current.next;
			k--;
		}

		return current;
	}

}