public class MinAdjacentSwapsInBinaryArray{
	public static void main(String...ar){
		//int [] A = new int[]{1,0,0,1,0,1,1,0,0,1};
		int [] A = new int[]{1,0,1,0,1};
		System.out.println(minAdjacentSwapsInBinaryArrayLeft(A));
		System.out.println(minAdjacentSwapsInBinaryArrayRight(A));
	}

	public static int minAdjacentSwapsInBinaryArrayLeft(int [] A){
		int i0 = 0, i1 = 0, n0 = 0, n1 = 0;
		for (int i = 0; i < A.length; i++){
			if (A[i]==0){
				n0 += i - i0;
				i0++;
			} else {
				n1 += i - i1;
				i1++;
			}
		}
		return n1 < n0 ? n1 : n0;
	}

	public static int minAdjacentSwapsInBinaryArrayRight(int [] A){
		int i0 = A.length - 1, i1 = A.length - 1, n0 = 0, n1 = 0;
		for (int i = A.length-1; i >= 0; i--){
			if (A[i]==0){
				n0 += i0 - i;
				i0--;
			} else {
				n1 += i1 - i;
				i1--;
			}
		}
		return n1 < n0 ? n1 : n0;
	}

}