public class CountDecreasingSubArray{

	public static void main(String...ar){
		int [] A = new int[]{4,3,5,4,3};
		System.out.println(countDecreasingSubarray(A));
	}

	public static long countDecreasingSubarray(int [] A){
		long res = 0;
		int i = 0;
		for (int j = 1; j < A.length;j++){
			if (A[j] < A[j-1]){
				res += j - i + 1;
			} else {
				i = j; //refresh the start pointer
				res += 1; //j to j is decreasing
			}
		}
		res += 1; //for i to i
		return res;
	}
}