import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> stack){
		if (stack.isEmpty() || stack.size() == 1){
			return;
		}

		int top = stack.pop();
		reverseStack(stack);
		insert(stack,top);
		return;	
	}

	public static void insert(Stack<Integer> stack, int element){
		if (stack.isEmpty()){
			stack.push(element);
			return;
		}
		int temp = stack.pop();
		insert(stack,element);
		stack.push(temp);
	}

	public static void main(String...ar){
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Before reversing ");
		stack.stream().forEach(System.out::println);
		reverseStack(stack);
		System.out.println("After reversing ");
		stack.stream().forEach(System.out::println);
	}
}