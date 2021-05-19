public class SparseSearch{

	private static int search(String [] strings, String value, int first, int last){
		if (first > last){
			return -1;
		}
		int mid = (first + last)/2;

		if (strings[mid].isEmpty()){
			// find the nearest non-empty string
			int left = mid - 1;
			int right = mid + 1;
			while (true){
				if (left < first && right > last){ //this condition should be or, 
					return -1;
				} else if (right <= last && !strings[right].isEmpty()){
					mid = right;
					break;
				} else if (left >= first && !strings[left].isEmpty()){
					mid = left;
					break;
				}
				right++;
				left--;
			}		
		}

		if (strings[mid].equals(value)){
			return mid;
		} else if (strings[mid].compareTo(value) < 0){
			return search(strings, value, mid + 1, last);
		} else {
			return search(strings, value, first, mid - 1);
		}
	}

	public static int search(String [] strings, String value){
		if (strings == null || value == null || value.isEmpty()){
			return -1;
		}
		return search(strings,value,0,strings.length - 1);
	}

	public static void main(String...ar){
		String [] strings = {"","apple","","","","","","ball","","","","","","","cat","",""};
		System.out.println(search(strings, "ball"));
	}
}

//Assumption 1 - there are no null values in the given array