import java.util.List;
import java.util.ArrayList;

public class AllSubarrayOfSumK{

	public static List<List<Integer>> allSubArrayOfSumK(int [] A, int k){
		List<List<Integer>> subarrays = new ArrayList<>();
		int i = 0, j = 0, sum = 0;
		while (j < A.length){
			sum = sum + A[j];
			if (sum > k) {
				while (sum > k){
					sum = sum - A[i];
					i++;
				}
				
			}
			if (sum == k){
				List<Integer> indices = new ArrayList<>();
				indices.add(i);
				indices.add(j);
				subarrays.add(indices);
			}
			j++;
		}
		return subarrays;
	}

	public static void main(String...ar){
		int [] A = new int[]{4,1,1,1,2,3,5};
		System.out.println(allSubArrayOfSumK(A,5));	
	}
}