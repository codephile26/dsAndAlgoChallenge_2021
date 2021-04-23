public class MyQueue<T>{
	Stack<T> newest, oldest;

	public MyQueue(){
		this.newest = new Stack<T>();
		this.oldest = new Stack<T>();
	}

	public void add(T data){
		this.newest.push(data);
	}

	private void shiftStacks() throws EmptyStackException{
		if (oldest.isEmpty()){
			while(!newest.isEmpty()){
				oldest.push(newest.pop());
			}
		}
	}

	public T peek() throws EmptyStackException{
		shiftStacks();
		return oldest.peek();
	}

	public T remove() throws EmptyStackException, EmptyQueueException{
		if (newest.isEmpty()){
			throw new EmptyQueueException();
		}
		shiftStacks();
		return oldest.pop();
	}

}