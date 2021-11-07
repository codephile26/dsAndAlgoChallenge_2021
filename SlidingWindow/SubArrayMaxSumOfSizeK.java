public class SubArrayMaxSumOfSizeK {

	public static void main(String...ar){
		int [] A = new int[]{5,2,4,6,3,1};
		System.out.println(findSubArrayOfSizeKWithMaxSum(A,3));
	}

	public static int findSubArrayOfSizeKWithMaxSum(int [] A, int k){
		int i = 0, j =0, max = Integer.MIN_VALUE, sum = 0;
		while (j < A.length){
			sum += A[j];
			if (j - i + 1 < k){
				j++;
			} else if (j - i + 1 == k){
				max = sum > max ? sum : max;
				sum = sum - A[i];
				i++;
				j++;
			}
		}
		return max;
	}
}