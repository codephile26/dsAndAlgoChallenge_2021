import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PalindromeString {

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkIfPalindromePermutation(str));
	}

	public static boolean checkIfPalindromePermutation(String str){
		int [] table = buildCharFrequencyTable(str);
		return checkMaxOneOdd(table);

 	}

	public static int [] buildCharFrequencyTable(String str){
		int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (int i = 0; i < str.length(); i++){
			int val = getCharNumber(str.charAt(i));
			if (val != -1){
				table[val]++;
			}
		}
		return table;
	}

	public static boolean checkMaxOneOdd(int [] table){
		boolean foundOdd = false;
		for (int k : table){
			if (k % 2 == 1)
			 if (foundOdd) {
				return false;
			 }
			 else {
				foundOdd = true;
			}
		}
		return true;
	} 	
	
	// in this method non letter characters return -1
	public static int getCharNumber(char c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		if (a <= c && z >= c){
			return c - a;
		}
		return -1;
	}
}