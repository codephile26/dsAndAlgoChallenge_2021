//Stack operations - push, pop, peek, isEmpty
public class StackUsingArray{

    public static final int MAX = 1000;

    private int [] stack;
    private int top;

    public StackUsingArray(){
	this.top = -1;
        stack = new int[MAX];
    }

    public void push(int num) throws FullStackException{
    	if (top >= MAX - 1) throw new FullStackException();
	stack[++top] = num;
        return;
    }

    public int peek() throws EmptyStackException{
	if (top == -1) throw new EmptyStackException();
        return stack[top];
    }

    public int pop() throws EmptyStackException{
    	if (top == -1) throw new EmptyStackException();
        int pop = stack[top--];
	return pop;
    }

    public boolean isEmpty(){
    	return top == -1;
    }

}