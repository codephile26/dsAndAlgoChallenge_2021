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

	public TreeNode getIthNode(int index){
		int leftSize = (left != null) ? left.size() : 0;
		if (index < leftSize){
			return left.getIthNode(index);
		} else if (index == leftSize){
			return this;
		} else {
			return right.getIthNode(index - (leftSize + 1));
		}
	}

	public int size(){ return size;}
	public int data(){ return data;}
	public TreeNode getLeft(){ return this.left;}
	public TreeNode getRight(){ return this.right;}
}

class Tree {
	//size, getRandomNode - optimized to reduce random number calls, insertInOrder

	TreeNode root = null;

	public int size(){
		return (root == null) ? 0 : root.size();
	}

	public TreeNode getRandomNode(){
		if (root == null){
			return null;
		}
		Random random = new Random();
		int index = random.nextInt(size());
		return root.getIthNode(index);
	}

	public void insertInOrder(int d){
		if (root == null){
			root = new TreeNode(d);
		} else {
			root.insertInOrder(d);
		}
	}
}

public class RandomNode {
	public static void main(String...ar){
		Tree tree = new Tree();
		TreeNode treeNode = new TreeNode(5);
		tree.root = treeNode;
		tree.insertInOrder(1);
		tree.insertInOrder(3);
		tree.insertInOrder(6);
		tree.insertInOrder(7);
		TreeNode randomNode = tree.getRandomNode();
		System.out.println("Random Node data:" + randomNode.data());
	}
}