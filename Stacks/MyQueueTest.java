public class MyQueueTest{

	public static void main(String...ar) throws EmptyStackException, EmptyQueueException{
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.add(1);
		myQueue.add(3);
		myQueue.add(9);
		myQueue.add(27);
		System.out.println(myQueue.remove()==1);
		myQueue.add(81);
		myQueue.add(243);
		System.out.println(myQueue.remove()==3);
	}


}