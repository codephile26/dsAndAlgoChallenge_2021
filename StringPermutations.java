import java.util.Scanner;
import java.util.Arrays;

public class StringPermutations {

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(checkIfStringsArePermutationsOfEachOther(str1,str2));
		System.out.println(permutation(str1,str2));
	}

	// in this approach we sort the two strings and check them for equality
	public static boolean checkIfStringsArePermutationsOfEachOther(String str1, String str2){
		if (str1.length() != str2.length()){
			return false;
		}
		char [] strChar1 = str1.toCharArray();
		char [] strChar2 = str2.toCharArray();
		Arrays.sort(strChar1);
		Arrays.sort(strChar2);
		String sortedString1 = new String(strChar1);
		String sortedString2 = new String(strChar2);
		return sortedString1.equals(sortedString2);
	}

	//hashtable
	public static boolean permutation(String str1, String str2){
		if (str1.length() != str2.length()){
			return false;
		}
		int [] hashArray = new int[128];
		char [] strChar1 = str1.toCharArray();
		char [] strChar2 = str2.toCharArray();
		for (char c : strChar1){
			hashArray[c]++;
		}
		for (int j = 0; j < strChar2.length; j++){
			hashArray[strChar2[j]]--;
			if (hashArray[strChar2[j]] < 0) {
				return false;
			}
		}
		return true;
	}

} 