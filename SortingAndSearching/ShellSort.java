public class ShellSort{

	/* Complexity is better than insertion sort, exact complexity is difficult to tell
	*
	* Different values of increment provide different complexities
	*
	*
	*/
	public static void sort(int [] list){
		int increment = list.length/2;
		while (increment > 1){
			for (int startIndex = 0; startIndex < increment; startIndex++){
				InsertionSort.sort(list, startIndex, increment);
			}
			increment = increment/2;
		}
	}

	public static void main(String [] ar){
		int [] list = {5,8,2,4,9,7,6,1,10,3};
		sort(list);
	}


}