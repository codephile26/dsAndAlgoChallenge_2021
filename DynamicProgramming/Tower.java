import java.util.Stack;

public class Tower {
	private Stack<Integer> disks;
	private int index;

	public Tower(int index){
		this.disks = new Stack<Integer>();
		this.index = index;
	}

	//add, index, moveTopTo, moveDisks
	public int index(){
		return index;
	}

	public void add(int d){
		System.out.println("Adding value " + d);
		if (!disks.isEmpty() && disks.peek() <= d){
			throw new RuntimeException("Cannot add the disk");
		} else {
			disks.push(d);
		}
	}

	public Stack<Integer> getDisks(){
		return disks;
	}

	public void moveTopTo(Tower destination){
		int top = disks.pop();
		destination.add(top);
	}

	public void moveDisks(int n, Tower destination, Tower buffer){
		System.out.println("Moving " + n + "disks from tower " + this.index + " to tower " + destination.index());
		if (n > 0){
			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, this);
		}
	}
}