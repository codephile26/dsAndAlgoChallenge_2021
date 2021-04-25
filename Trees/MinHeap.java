public class MinHeap {

	private int [] heap;
	private int index; //represents current number of elements in the heap
	private int size; // represents capacity

	public MinHeap(int size){
		this.size = size;
		this.heap = new int[size];
	}

	public int[] getHeap(){
		return this.heap;
	}	

	// public methods - add element in min heap, remove element, peak element
	private int parent(int i){
		return (i - 1)/2;
	}

	private int leftChild(int i){
		return (2*i) + 1;
	}

	private int rightChild(int i){
		return (2*i) + 2;
	}

	private boolean isLeaf(int i){
		if ((rightChild(i) >= size) || (leftChild(i) >=size)){
			return true;
		}
		return false;
	}

	public void insert(int element){
		if (index >= size){
			return;  //this check means capacity is full
		}

		heap[index] = element;
		int current = index;

		while (heap[current] < heap[parent(current)]){
			swap(current, parent(current));
			current = parent(current);
		}
		index++;
	}

	private void swap(int x, int y){
		int temp = heap[x];
		heap[x] = heap[y];
		heap[y] = temp;
	}

	public int remove(){
		int popped = heap[0];
		heap[0] = heap[--index];
		minHeapify(0);
		return popped;
	}

	private void minHeapify(int i){
		if (!isLeaf(i)){
			if ((heap[i] > heap[leftChild(i)]) ||
				(heap[i] > heap[rightChild(i)])){
				if (heap[leftChild(i)] < heap[rightChild(i)]){
					swap(i, leftChild(i));
					minHeapify(leftChild(i));
				} else {
					swap(i, rightChild(i));
					minHeapify(rightChild(i));
				}
			}
		}
	}

	public int peek() throws NoElementFoundException{
		if (this.index == 0){
			throw new NoElementFoundException();
		}
		return heap[0];
	}

	public void printHeap() {
		for (int i = 0; i < (index / 2); i++) {
			System.out.print("Parent : " + heap[i]);
			if (leftChild(i) < index)
				System.out.print(" Left : " + heap[leftChild(i)]);
			if (rightChild(i) < index)
				System.out.print(" Right :" + heap[rightChild(i)]);
			System.out.println();
		}
	}
}