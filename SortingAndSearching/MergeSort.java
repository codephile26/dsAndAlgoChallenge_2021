public class MergeSort {
	
	/* Recursive function with base case that if length of list is equal to one,
	 * then you must consider it sorted.
	 * Time complexity of merge sort is O(nlogn).
	 *
	 * Merge Sort is not adaptive in nature, which means that at any point in time, we cannot break out of the loop early
	 * if the array is already sorted.
	 *
	 * It is a stable sort
	 */
	public static void sort(int [] list){
		if (list.length == 1){
			return;
		}

		// if not then split the original lists
		int midIndex = list.length/2 + list.length % 2;
		int [] firstHalf = new int[midIndex];
		int [] secondHalf = new int[list.length - midIndex];
		SortHelper.split(list, firstHalf, secondHalf);

		sort(firstHalf);
		sort(secondHalf);

		SortHelper.merge(list, firstHalf, secondHalf);
		SortHelper.print(list);
		System.out.println();
	}

	public static void main(String [] args){
		int [] list = {5,8,2,4,9,7,6,1,10,3};
		sort(list);
	}
}