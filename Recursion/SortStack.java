import java.util.Stack;

public class SortStack {

	public static void sortStack(Stack<Integer> stack){
		if (stack.size() == 1){
			return;
		}
		int top = stack.pop();
		sortStack(stack);
		insert(stack, top);
	}

	private static void insert(Stack<Integer> stack, int top){
		if (stack.isEmpty() || stack.peek() <= top){
			stack.push(top);
			return;
		}
		int currentTop = stack.pop();
		insert(stack,top);
		stack.push(currentTop);
	}


	public static void main(String...ar){
		Stack<Integer> stack = new Stack<>();
		stack.push(30);
		stack.push(-5);
		stack.push(18);
		stack.push(14);
		stack.push(-3);
		sortStack(stack);
		stack.stream().forEach(System.out::println);
	}
}