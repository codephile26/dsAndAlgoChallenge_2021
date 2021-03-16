import java.util.Scanner;
import java.util.Arrays;

public class StringPermutations {

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(checkIfStringsArePermutationsOfEachOther(str1,str2));
	}

	public static boolean checkIfStringsArePermutationsOfEachOther(String str1, String str2){
		char [] strChar1 = str1.toCharArray();
		char [] strChar2 = str2.toCharArray();
		Arrays.sort(strChar1);
		Arrays.sort(strChar2);
		String sortedString1 = new String(strChar1);
		String sortedString2 = new String(strChar2);
		return sortedString1.equals(sortedString2);
	}

} 