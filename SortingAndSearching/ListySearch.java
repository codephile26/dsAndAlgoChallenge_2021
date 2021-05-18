public class ListySearch {

	public static int search(Listy list, int value){
		int index = 1;
		while (list.elementAt(index) != -1 && list.elementAt(index) < value){
			index *= 2;
		}

		return binarySearch(list, value, index/2, index);
	}

	// Binary search method returns index of the value we are looking for in the array
	public static int binarySearch(Listy list, int value, int low, int high){
		while (low <= high){
			int mid = (low + high)/2;
			int middle = list.elementAt(mid);
			if (middle > value || middle == -1){
				high = mid - 1;
			} else if (middle < value){
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String...ar){
		int [] array = {2,3,5,7,11,13,17,19,23,29};
		Listy list = new Listy(array);
		System.out.println(search(list, 7));
	}
}