public class SortedMerge{

	public static void merge(int [] A, int [] B, int sizeA, int sizeB){
		int indexA = sizeA - 1; // index of last element in A
		int indexB = sizeB - 1; // index of last element in B
		int indexMerged = sizeA + sizeB - 1;

		while(indexB >= 0){
			if (indexA >= 0 && A[indexA] > B[indexB]){
				A[indexMerged] = A[indexA];
				indexA--;
			} else {
				A[indexMerged] = B[indexB];
				indexB--;
			}
			indexMerged--;
		}
	}

	public static void main(String...ar){
		int [] A = new int[10];
		A[0] = 1;
		A[1] = 3;
		A[2] = 5;
		A[3] = 7;
		A[4] = 9;
		int [] B = new int [2];
		B[0] = 2;
		B[1] = 4;
		merge(A,B,5,2);
		for (int element : A){
			System.out.print(element + " ");
		}
	}
}

