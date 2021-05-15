public class QuickSort{

	public static void sort(int [] list, int low, int high){
		if (low >=high){
			return;
		}	
		int pivotIndex = SortHelper.partition(list, low, high);
		sort(list, low, pivotIndex - 1);
		sort(list, pivotIndex + 1, high);
	}

	public static void main(String [] ar){
		int [] list = {5,8,2,4,9,7,6,1,10,3};
		sort(list,0, list.length - 1);
	}
}