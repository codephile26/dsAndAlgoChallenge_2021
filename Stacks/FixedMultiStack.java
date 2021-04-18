public class FixedMultiStack{

	private int numberOfStacks = 3;
	private int stackCapacity;
	private int [] values;
	private int [] sizes;

	public FixedMultiStack(int stackSize){
		this.stackCapacity = stackSize;
		this.values = new int[stackCapacity * numberOfStacks];
		this.sizes = new int[numberOfStacks];
	}

	public void push(int stackNum, int value) throws FullStackException{
		if (isFull(stackNum)) throw new FullStackException();

		// increase size of stack;
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;
	}

	public int pop(int stackNum) throws EmptyStackException {
		if (isEmpty(stackNum)) throw new EmptyStackException();

		int value = values[indexOfTop(stackNum)];
		values[indexOfTop(stackNum)] = 0; //clear the value at the top of the stack
		sizes[stackNum]--; //reduce the size in the sizes array
		return value;
	}

	public int peek(int stackNum) throws EmptyStackException {
		if (isEmpty(stackNum)) throw new EmptyStackException();

		return values[indexOfTop(stackNum)];
	}

	//check if stack if Full
	private boolean isFull(int stackNum){
		return sizes[stackNum] == this.stackCapacity;
	}

	private boolean isEmpty(int stackNum){
		return sizes[stackNum] == 0;
	}

	//stackNum should vary between 0 till numberOfStacks - 1
	private int indexOfTop(int stackNum){
		int offset = stackNum * this.stackCapacity;
		int size = sizes[stackNum];
		return offset + size - 1;
	}

}