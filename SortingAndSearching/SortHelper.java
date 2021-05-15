public class SortHelper{

	public static void print(int [] list){
		for (int number : list){
			System.out.print(number + " ");
		}	
	}

	public static void swap(int [] list, int index1, int index2){
		int temp = list[index1];
		list[index1] = list[index2];
		list[index2] = temp;
	}

	/* Helper method to split an array into smaller lists
	*  of size equal to half the original list.
	*/
	public static void split(int [] list, int [] firstHalf, int [] secondHalf){
		int index = 0;
		int secondHalfIndex = firstHalf.length;
		for (int element : list){
			if (index < secondHalfIndex){
				firstHalf[index] = list[index];
			} else {
				secondHalf[index - secondHalfIndex] = list[index];
			}
			index++;
		}
	}

	/* 
	 * Merges the splitted lists back into a sorted list
	 */
	public static void merge(int [] list, int [] firstHalf, int [] secondHalf){
		int mergeIndex = 0;
		int firstHalfIndex = 0;
		int secondHalfIndex = 0;
		
		while (firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length){
			if (firstHalf[firstHalfIndex] < secondHalf[secondHalfIndex]){
				list[mergeIndex] = firstHalf[firstHalfIndex];
				firstHalfIndex++;
			} else if (secondHalfIndex < secondHalf.length){
				list[mergeIndex] = secondHalf[secondHalfIndex];
				secondHalfIndex++;
			}
			mergeIndex++;
		}

		if (firstHalfIndex < firstHalf.length){
			while (mergeIndex < list.length){
				list[mergeIndex++] = firstHalf[firstHalfIndex++];
			}
		}
		if (secondHalfIndex < secondHalf.length){
			while (mergeIndex < list.length){
				list[mergeIndex++] = secondHalf[secondHalfIndex++];
			}
		}
	}

	public static int partition(int [] list, int low, int high){
		int l = low;
		int h = high;
		int pivot = list[low];
		while (l < h){
			while(list[l] <= pivot && l < h){
				l++;
			}
			while(list[h] > pivot){
				h--;
			}
			if (l < h){
				swap(list, l, h);
			}
		}
		swap(list, low, h);
		System.out.println("Pivot element: " + pivot);
		print(list);
		System.out.println();
		return h; // does it matter whether we return l or h?
	}
}