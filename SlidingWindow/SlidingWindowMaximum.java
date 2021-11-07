import java.util.LinkedList;

public class SlidingWindowMaximum{

	public static int[] slidingWindowMaximumBruteForce(int [] arr, int k){
		int n = arr.length;
		int [] result = new int[n-k+1];
		for (int i = 0; i < n - k + 1; i++){
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < k; j++){
				if (arr[i+j] > max){
					max = arr[i+j];
					result[i] = arr[i+j];
				}
			}
		}
		return result;
	}

	public static int [] slidingWindowMaximum(int [] arr, int k){
		int n = arr.length;
		int [] result = new int[n-k+1];
		LinkedList<Integer> dq = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++){
			while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()]){
				dq.pollLast();
			}
			dq.offerLast(i);	
		}
		
		for (;i < n;i++){
			if (!dq.isEmpty()){
				result[i-k] = arr[dq.peekFirst()];
			}

			while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()]){
				dq.pollLast();
			}
			

			while (!dq.isEmpty() && dq.peek() < i - k + 1){
				dq.pollFirst();
			}

			dq.offerLast(i);
		}
		result[i-k] = arr[dq.peekFirst()];
		return result;
	}

	public static void main(String...ar){
		int [] arr = new int[]{9, 7, 2, 4, 6, 8, 2, 1, 5};
		//int [] result = slidingWindowMaximumBruteForce(arr,3);
		int [] result = slidingWindowMaximum(arr,3);
		for (int i : result){
			System.out.print(" " + i);
		}
	}


//int [] arr = new int[]{9, 7, 2, 4, 6, 8, 2, 1, 5};
}