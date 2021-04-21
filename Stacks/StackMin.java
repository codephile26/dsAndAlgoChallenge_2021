public class StackMin extends Stack<NodeWithMin>{

	public void push(int value) throws EmptyStackException{
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}

	public int min() throws EmptyStackException{
		if (this.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			return peek().getMin();
		}
	}
}

class NodeWithMin{

		private int value;
		private int min;

		public int getValue(){
			return this.value;
		}

		public int getMin(){
			return this.min;
		}

	 	NodeWithMin(int value, int min){
			this.value = value;
			this.min = min;
	 	}
}