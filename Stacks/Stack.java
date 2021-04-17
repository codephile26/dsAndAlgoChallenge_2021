public class Stack<T>{
	public static class StackNode<T>{
		private T data;
		private StackNode<T> next;

		public StackNode(T data){
			this.data = data;
		}
	}

	private StackNode<T> top;

	//push, pop, peek, isEmpty

	public StackNode<T> pop() throws EmptyStackException{
		if (top == null) throw new EmptyStackException();
		StackNode<T> t = top;
		top = top.next;
		return t;
	}

	public void push(T data){
		StackNode<T> nodeData = new StackNode<T>(data);
		nodeData.next = top;
		top = nodeData;
	}

	public T peek() throws EmptyStackException{
		if (top == null) throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty(){
		return top == null;
	}
}