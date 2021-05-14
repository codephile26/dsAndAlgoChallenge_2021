public class BubbleSort{

	/* Bubble sort has O(n^2) time complexity and it does n^2 swaps.
	* It is adaptive in nature, that is at any point if our array becomes sorted,
	* then it is easy to break out of the loop.
	*
	* It is also a stable sort.
	*
	*/
	public static void sort(int [] list){
		for (int i = 0; i < list.length; i++){
			boolean swapped = false;
			for (int j = list.length-1; j > i; j--){
				if (list[j] < list[j-1]){
					SortHelper.swap(list, j, j-1);
					swapped = true;
				}
			}
			SortHelper.print(list);
			System.out.println();
			if (!swapped){
				break;
			}
		}
	}

	public static void main(String [] args){
		int [] list = {5,8,2,4,9,7,6,1,10,3};
		sort(list);
	}
}