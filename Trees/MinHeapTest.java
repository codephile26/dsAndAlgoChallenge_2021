import java.util.Arrays;

public class MinHeapTest{
	public static void main(String...ar){
		MinHeap minHeap = new MinHeap(7);
		minHeap.insert(3);
	    	minHeap.insert(13);
	    	minHeap.insert(7);
          	minHeap.insert(16);
	    	minHeap.insert(21);
	    	minHeap.insert(12);
	    	minHeap.insert(9);
		System.out.println("The Min Heap is : " + Arrays.toString(minHeap.getHeap()));
		System.out.println("Min Heap in tree form:");
	   	minHeap.printHeap();
	}
}