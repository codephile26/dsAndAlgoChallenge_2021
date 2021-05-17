public class SearchRotatedArray{

	public static int search(int [] a, int left, int right, int x){
		int mid = (left + right)/2;

		if (x == a[mid]){
			return mid;
		}

		if (right < left){
			return -1;
		}

		if (a[left] < a [mid]){
			if (x >= a[left] && x < a[mid]){ //search left side of the array
				return search(a, left, mid - 1, x);
			} else { 			// search right side of the array, if x not in between left and mid
				return search(a, mid + 1, right, x);
			}
		} else if (a[mid] < a[left]){
			if (x >= a[mid] && x < a[right]){ //search right side of the array if x in between middle element and right element
				return search(a,mid + 1, right, x);
			} else {
				return search(a,left,mid-1,x);
			}
		} else if (a[left] == a[mid]){
			if (a[mid] != a[right]){ //search right side of the array if right side is different
				return search(a, mid +1, right,x);
			} else {	//search both sides
				int result = search(a, left, mid - 1, x);
				if (result == -1){
					return search(a,mid + 1, right, x);
				} else {
					return result;
				}
			}
		}
		return -1;
	}

	public static void main(String [] args){
		int [] array = {5,7,10,14,15,16,19,20,25,1,3,4};
		System.out.println(search(array, 0, 11, 2));
	}
}