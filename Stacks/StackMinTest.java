public class StackMinTest{
	public static void main(String...ar) throws EmptyStackException{
		StackMin minStack = new StackMin();
		minStack.push(5);
		minStack.push(6);
		minStack.push(7);
		System.out.println(minStack.min() == 5);
	}
}