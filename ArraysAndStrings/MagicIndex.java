public class MagicIndex {

	public static void main(String...ar){
		int [] magicArray = {0,1,2,3,8,9,11,10,13};
		// int magicIndex = magicSlow(magicArray);
		// System.out.println(magicIndex);
		int fastMagicIndex = magicFast(magicArray);
		System.out.println(fastMagicIndex);
	}

	//this array traverses through the whole array and its complexity is O(n)
	public static int magicSlow(int [] array){
		for (int i = 0; i < array.length; i++){
			if (array[i] == i){
				return i;
			}
		}
		return -1;
	}

	public static int magicFast(int [] array){
		return magicFast(array, 0, array.length - 1);
	}

	public static int magicFast(int [] array, int start, int end){
		if (end < start) {
			return -1;
		}

		int midIndex = (start + end)/2;
		int midValue = array[midIndex];
		if (midValue == midIndex){
			return midIndex;
		}

		int leftIndex = Math.min(midIndex - 1, midValue);
		int left = magicFast(array, start, leftIndex);
		if (left >=0) {
			return left;
		}

		int rightIndex = Math.max(midIndex + 1, midValue);
		int right = magicFast(array, rightIndex, end);
		return right;
	}
}