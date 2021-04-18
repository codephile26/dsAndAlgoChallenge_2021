public class FixedMultiStackTest{

	public static void main(String...ar) throws FullStackException, EmptyStackException{
		FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
		fixedMultiStack.push(0,3);
		fixedMultiStack.push(0,6);
		fixedMultiStack.push(0,9);
		fixedMultiStack.push(1,12);
		fixedMultiStack.push(1,15);
		fixedMultiStack.push(1,18);
		fixedMultiStack.push(2,21);
		fixedMultiStack.push(2,24);
		fixedMultiStack.push(2,27);

		for (int i = 0; i < 3; i++){
			System.out.println(fixedMultiStack.pop(i));
		}

		for (int i = 0; i < 3; i++){
			System.out.println(fixedMultiStack.peek(i));
		}
	}
}