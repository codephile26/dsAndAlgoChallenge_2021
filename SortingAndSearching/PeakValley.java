public class PeakValley{

	public static void peakValley(int [] array){
		for (int i = 1; i < array.length; i +=2){
			int maxIndex = findMaxElementIndex(array, i - 1, i, i + 1);
			if (i != maxIndex){ //means that maximum element is already a peak
				swap(array, i, maxIndex);
			}
		}
	}

	public static void swap(int [] array, int i, int j){
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

	public static int findMaxElementIndex(int [] array, int a, int b, int c){
		int lastIndex = array.length - 1;
		int valueA = a >= 0 && a <= lastIndex ? array[a] : Integer.MIN_VALUE;
		int valueB = b >= 0 && a <= lastIndex ? array[b] : Integer.MIN_VALUE;
		int valueC = c >= 0 && c <= lastIndex ? array[c] : Integer.MIN_VALUE;

		int maxValue = Math.max(valueA, Math.max(valueB,valueC));
		if (maxValue == valueA){
			return a;
		} else if (maxValue == valueB){
			return b;
		} else{
			return c;
		}
	}

	public static void main(String...ar){
		int [] array = {9,6,3,10,8,4,1,0,11,12};
		peakValley(array);
		for(int element : array){
			System.out.print(element + " ");
		}
	}
}