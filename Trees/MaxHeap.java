public class MaxHeap{

	private int [] heap;
	private int capacity;
	private int size;

	public MaxHeap(int capacity){
		this.capacity = capacity;
		this.heap = new int[capacity];
	}

	//add, remove, peek

	private int getLeftChild(int i){
		return (2*i) + 1;
	}

	private int getRightChild(int i){
		return (2*i) + 2;
	}

	private int getParent(int i){
		return (i-1)/2;
	}

	private boolean isLeaf(int i){
		return ((getLeftChild(i) >=size) || (getRightChild(i) >= size));
	}

	// x and y are positions of elements in the array over here
	private void swap(int x, int y){
		int temp = heap[x];
		heap[x] = heap[y];
		heap[y] = temp;
	}

	public void add(int element) throws HeapFullException{
		if (size == capacity){
			throw new HeapFullException();
		}

		heap[size] = element;
		int current = size;

		while (heap[current] > heap[getParent(current)]){
			swap(current, getParent(current));
			current = getParent(current);
		}
		this.size++;
	}

	public int peek() throws EmptyHeapException{
		if (size == 0){
			throw new EmptyHeapException();
		}
		return heap[0];
	}

	public int remove() throws EmptyHeapException{
		if (size == 0){
			throw new EmptyHeapException();
		}

		int popped = heap[0];
		heap[0] = heap[--size];
		maxHeapify(0);
		return popped;
	}

	private void maxHeapify(int i){
		if (!isLeaf(i)){
			if ((heap[i] < heap[getLeftChild(i)]) || (heap[i] < heap[getRightChild(i)])){
				if (heap[getLeftChild(i)] > heap[getRightChild(i)]){
					swap(i,getLeftChild(i));
					maxHeapify(getLeftChild(i));
				} else {
					swap(i, getRightChild(i));
					maxHeapify(getRightChild(i));
				}
			} 
		}
	}

	public void printHeap(){
		for (int i = 0; i < (size/2); i++){
			System.out.println("Parent: " + heap[i]);
		  	if (getLeftChild(i) < size)
				System.out.println("Left Child: " + heap[getLeftChild(i)]);
			if (getRightChild(i) < size)
				System.out.println("Right Child: " + heap[getRightChild(i)]);
		}
	}
}