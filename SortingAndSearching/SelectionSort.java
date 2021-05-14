public class SelectionSort{

	/*
	* Selection sort to sort a list in ascending order.
	* It is not a stable sort. Elements which are equal
	* might get rearranged.
	* Selection sort is not adaptive. At any point in time 
	* if the list gets sorted, it is not possible to break out of the loop.
	*/
	public static void sort(int [] list){
		for (int i = 0; i < list.length; i++){
			for (int j = i + 1; j < list.length; j++){
				if (list[i] > list[j]){
					SortHelper.swap(list,i,j);
					SortHelper.print(list);
					System.out.println();
				}
			}
		}
	}

	public static void main(String [] ar){
		int [] list = {5,8,2,4,9,7,6,1,10,3};
		sort(list);
	}
}