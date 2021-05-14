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
}