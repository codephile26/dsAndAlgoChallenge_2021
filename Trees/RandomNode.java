import java.util.Random;

class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private int data;
	private int size;

	TreeNode(int d){
		this.data = d;
		this.size = 1;
	}

	//find, insert, delete, randomNode
	public int getData(){
		return this.data;
	}

	public int getSize(){
		return this.size;
	}

	public TreeNode find(int d){
		if (d == this.data){
			return this;
		} else if (d < this.data){
			return this.left.find(d);
		} else {
			return this.right.find(d);
		}
	}

	public void insertInOrder(int d){
		if (d <= this.data){
			if (this.left == null){
				this.left = new TreeNode(d);
			} else {
				this.left.insertInOrder(d);
			}
		} else {
			if (this.right == null){
				this.right = new TreeNode(d);
			} else {
				this.right.insertInOrder(d);
			}
		}
		size++;
	}

	public TreeNode getRandomNode(){
		int leftSize = (left != null) ? left.size() : 0;
		Random randomIndex = new Random();
		int index = randomIndex.nextInt(size);
		System.out.println("random index " + index);
		if (index < leftSize){
			return left.getRandomNode();
		} else if (index == leftSize){
			return this;
		} else {
			return right.getRandomNode();
		}
	}

	public int size(){ return size;}
	public int data(){ return data;}
	public TreeNode getLeft(){ return this.left;}
	public TreeNode getRight(){ return this.right;}
}

public class RandomNode {
	public static void main(String...ar){
		TreeNode treeNode = new TreeNode(5);
		treeNode.insertInOrder(1);
		treeNode.insertInOrder(3);
		treeNode.insertInOrder(6);
		treeNode.insertInOrder(7);
		TreeNode randomNode = treeNode.getRandomNode();
		System.out.println(treeNode.size());
		System.out.println(treeNode.getLeft().size());
		System.out.println(treeNode.getRight().size());
		System.out.println("Random Node data:" + randomNode.data());
	}
}