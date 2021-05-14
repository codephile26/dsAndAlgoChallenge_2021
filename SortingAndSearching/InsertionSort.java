public class InsertionSort{

	/* InsertionSort is better than bubble sort, as it does fewer comparisons 
	* than bubble sort. If the sublist is already sorted then there is no need to
	* compare with every other element in the list.
	*
	* Insertion Sort gives a better performance in modern hardware than the bubble sort.
	*
	*
	*/
	public static void sort(int [] list){
		for (int i = 0; i < list.length - 1; i++){
			for (int j = i+1; j > 0; j--){
				if (list[j] < list[j-1]){
					SortHelper.swap(list,j,j-1);
				} else {
					break;
				}
				SortHelper.print(list);
				System.out.println();
			}
		}
	}

	public static void sort(int [] list, int startIndex, int increment){
		for (int i = startIndex; i < list.length; i = i + increment){
			for (int j = Math.min(i + increment, list.length - 1);
				j - increment >= 0;
				j = j - increment){
				if (list[j] < list[j - increment]){
					SortHelper.swap(list, j, j - increment);
				} else {
					break;
				}
				SortHelper.print(list);
				System.out.println();
			}	
		}
	}

		
}