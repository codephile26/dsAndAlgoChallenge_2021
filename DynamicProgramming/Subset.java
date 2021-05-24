import java.util.ArrayList;

public class Subset{

	public static ArrayList<ArrayList<Integer>> getSubSets2(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << set.size(); /* max is equal to 2^set.size() */
		for (int k = 0; k < max; k++){
			ArrayList<Integer> subset = convertIntToSet(k,set);
			allSubSets.add(subset);
		}
		return allSubSets;
	}

	public static ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set){
		ArrayList<Integer> subset = new ArrayList<Integer>();
		int index = 0;
		int k = 0;
		for (k = x; k > 0; k >>= 1){
			System.out.println("Value of k at the start of iteration:" + k);
			if ((k & 1) == 1){
				System.out.println("Value of k after and operation:" + k);
				subset.add(set.get(index));
			}
			index++;
		}
		System.out.println("Value of k at the end of iteration:" + k);
		return subset;
	}

	public static void main(String...ar){
		ArrayList<Integer> set = new ArrayList();
		set.add(1);
		set.add(2);
		set.add(3);
		ArrayList<ArrayList<Integer>> subsets = getSubSets2(set);
		for(ArrayList<Integer> subset : subsets){
			System.out.print(subset);
		}
	}




}