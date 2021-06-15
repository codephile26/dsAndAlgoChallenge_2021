import java.util.LinkedList;

public class FirstNegativeElementInWindow{

	public static int[] findFirstNegativeElementInWindow(int [] arr, int k){
		int i;
		int [] result = new int[arr.length - k + 1];
		LinkedList<Integer> list = new LinkedList<>();
		//Before hitting the size of the sliding window
		for (i = 0; i < k;i++){
			if (arr[i] < 0){
				list.add(i);
			}
		}

		// calculations after hitting the sliding window
		for (; i < arr.length; i++){
			if (!(list.isEmpty())){
				result[i - k] = list.peek();
			} else {
				result[i - k] = 0;
			}

			// remove elements from the queue when we proceed to the next  window, here the condition after && 
			// is responsible for checking if the current index in queue is less than the index of the next //window.
			while((!list.isEmpty()) && list.peek() < (i - k + 1)){
				list.remove();
			}

			if (arr[i] < 0){
				list.add(i);
			}
		}

		if (!list.isEmpty()){
			result[i] = list.peek();
		} else {
			result[i] = 0;
		}

		return result;
	}

	public static void main(String...ar){
		int [] arr = new int[]{12,-1,-7,8,-15,30,16,28};
		System.out.print(findFirstNegativeElementInWindow(arr,3));
	}



}