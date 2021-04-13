public class ListNode{
	
	private int data;
	private ListNode next;

	public ListNode(int data){
		this.data = data;
	}

	public void setData(int data){
		this.data = data;
	}

	public int getData(){
		return data;
	}

	public void setNext(ListNode next){
		this.next = next;
	}

	public ListNode getNext(){
		return this.next;
	}

	public void appendToTail(int d){
		ListNode end = new ListNode(d);
		ListNode n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}
}