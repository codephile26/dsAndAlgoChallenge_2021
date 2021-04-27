public class MaxHeapTest{
	public static void main(String...ar) throws HeapFullException, EmptyHeapException{
		MaxHeap maxHeap = new MaxHeap(15);
		maxHeap.add(6);
		maxHeap.add(7);
		maxHeap.add(4);
		maxHeap.add(5);
		maxHeap.add(2);
		maxHeap.add(3);
		maxHeap.add(8);
		System.out.println(maxHeap.peek() == 8);
		maxHeap.printHeap();
	}
}