import java.util.Scanner;
import java.util.Arrays;

public class UniqueCharString{

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(checkIfAllCharactersUnique(inputString));
	}
	
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
}