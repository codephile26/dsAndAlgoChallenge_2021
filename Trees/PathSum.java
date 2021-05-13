import java.util.HashMap;

public class PathSum{

	public static int pathSum(TreeNode<Integer> node, int targetSum){
		return preOrder(node, targetSum, 0, new HashMap<Integer, Integer>());
	}

	public static int preOrder(TreeNode<Integer> node, int targetSum, int currentSum, HashMap<Integer, Integer> map){
		if (node == null){
            		return 0;
        	}
        
        	int count = 0;
        	currentSum += node.getData();
        	if (currentSum == targetSum){
            		count += 1;
        	}
        	if (map.containsKey(currentSum - targetSum)){
            		count += map.get(currentSum - targetSum);
        	}
       
        	map.put(currentSum, map.getOrDefault(currentSum,0) + 1);
        
        
        	count +=  preOrder(node.getLeft(), targetSum, currentSum, map );
        	count +=  preOrder(node.getRight(), targetSum, currentSum, map );
        
        	map.put(currentSum, map.getOrDefault(currentSum,0) - 1);
        	return count;
	}

	public static void main(String...ar){
		TreeNode<Integer> treeNode = new TreeNode<Integer>();
		treeNode.setData(0);
		TreeNode<Integer> treeNode1 = new TreeNode<Integer>();
		treeNode1.setData(1);
		TreeNode<Integer> treeNode2 = new TreeNode<Integer>();
		treeNode2.setData(1);
		treeNode.setLeft(treeNode1);
		treeNode.setRight(treeNode2);
		System.out.println(pathSum(treeNode,1));
	}
}