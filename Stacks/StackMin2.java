public class StackMin2 extends Stack<Integer>{

	public Stack<Integer> s2;

	public StackMin2(){
		this.s2 = new Stack<Integer>();
	}

	public void push(int value) throws EmptyStackException{
		if (value < min()){
			s2.push(value);
		}
		super.push(value);
	}

	public Integer pop() throws EmptyStackException{
		if (super.peek() == min()){
			s2.pop();
		}
		return super.pop();		
	}

	public int min() throws EmptyStackException{
		if (s2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return s2.peek();
	}
}