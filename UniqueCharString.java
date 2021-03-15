import java.util.Scanner;
import java.util.Arrays;

public class UniqueCharString{

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(checkIfAllCharactersUnique(inputString));
		System.out.println(checkIfAllCharactersUnique_hashArray(inputString));
	}
	
	// has a complexity of O(nlogn), not a very good approach if the sorting algorithm takes too long over here, or for large strings
	public static boolean checkIfAllCharactersUnique(String inputString){
		char [] inputStringArray = inputString.toCharArray();
		Arrays.sort(inputStringArray);
		char previousChar = inputStringArray[0];
		for (int i = 1; i < inputStringArray.length; i++) {
			if (previousChar == inputStringArray[i]){
				return false;
			}
			previousChar = inputStringArray[i];
		}
		return true;		
	}

	//based on assumption that the input string is an ASCII string, time complexity = O(n), space complexity = 1
	public static boolean checkIfAllCharactersUnique_hashArray(String inputString){
		if (inputString.length() > 128) {
			return false;
		}
		boolean [] hashArray = new boolean[128];
		for (int i = 0; i<inputString.length(); i++){
			int val = inputString.charAt(i);
			if (hashArray[val]){
				return false;
			}
			hashArray[val] = true;
		}
		return true;
	}
}