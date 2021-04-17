public class Queue<T>{
	public static class QueueNode<T>{
		private T data;
		private QueueNode next;

		public QueueNode(T data){
			this.data = data;
		}
	}

//implement a FIFO structure using a LinkedList
//methods to be implemented - add elements to the last of the queue, remove elements from the first of the queue, isEmpty check, peek - return data in first element of the queue
	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T data){
		QueueNode<T> newNode = new QueueNode<T>(data);
		if (last != null){
			last.next = newNode;
		}
		last = newNode;
		if (first == null){
			first = last;
		}
	}

	public T remove() throws EmptyQueueException{
		if (first == null) throw new EmptyQueueException();
		QueueNode<T> t = first;
		first = first.next;
		return t.data;
	}

	public T peek() throws EmptyQueueException{
		if (first == null) throw new EmptyQueueException();
		return first.data;
	}

	public boolean isEmpty(){
		return first == null;
	}
}