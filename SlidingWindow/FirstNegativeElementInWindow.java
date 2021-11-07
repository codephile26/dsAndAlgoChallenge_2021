import java.util.LinkedList;

public class FirstNegativeElementInWindow{

	public static int[] findFirstNegativeElementInWindow(int [] arr, int k){
		int [] result = new int[arr.length - k + 1];
		int i;
		LinkedList<Integer> dQ = new LinkedList<>();
		for (i =0; i < k; i++){
			if (arr[i] < 0){
				dQ.add(i);
			}
		}
		
		for (;i < arr.length; i++){
			if (!dQ.isEmpty()){
				result[i-k] = arr[dQ.peek()];
			}
			
			//remove indices which are not in current window
			while (!dQ.isEmpty() && dQ.peek() < i - k + 1){
				dQ.remove();
			}
			
			if (arr[i] < 0){
				dQ.add(i);
			}
		}
		return result;
	}

	public static int[] findFirstNegativeElementInWindowNoQueue(int [] arr, int k){
		int [] result = new int[arr.length - k + 1];
		int firstNegativeIndex = 0;
		for (int i = k - 1; i < arr.length; i++){
			while ((firstNegativeIndex < i) && (firstNegativeIndex <= i- k || arr[firstNegativeIndex] > 0)){
				firstNegativeIndex++;
			}

			if (arr[firstNegativeIndex] < 0){
				result[i-k+1] = arr[firstNegativeIndex];
			} else {
				result[i-k+1] = 0;
			}

		}
		return result;
	}
	
	public static int[] findFirstNegativeElementInWindowBruteForce(int [] arr, int k){
		int [] result = new int[arr.length - k + 1];
		for (int i = 0; i < arr.length - k + 1; i++){
			for (int j = 0; j < k; j++){
				if (arr[i+j] < 0){
					result[i]= arr[i+j];
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String...ar){
		int [] arr = new int[]{12,-1,-7,8,-15,30,-16,28};
		// int [] result = findFirstNegativeElementInWindowBruteForce(arr,3);
		// int [] result = findFirstNegativeElementInWindow(arr,3);
		int [] result = findFirstNegativeElementInWindowNoQueue(arr,3);
		for(int i : result)
		  System.out.print(" " + i);
	}



}