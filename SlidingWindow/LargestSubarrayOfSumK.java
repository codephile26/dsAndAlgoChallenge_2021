public class LargestSubarrayOfSumK{

	public static int largestSubArrayOfSumK(int [] A, int k){
		int i = 0, j = 0, max = 0, sum = 0;
		while (j < A.length){
			sum = sum + A[j];
			if (sum == k){
				max = Math.max(max, j - i + 1);
			} else if (sum > k){
				while (sum > k){
					sum = sum - A[i];
					i++;
				}
			}
			j++;
		}
		return max;
	}

	public static void main(String...ar){
		int [] A = new int[]{4,1,1,1,2,3,5};
		System.out.println(largestSubArrayOfSumK(A,5));	
	}
}