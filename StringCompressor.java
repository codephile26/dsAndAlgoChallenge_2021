import java.util.Scanner;

public class StringCompressor {
	
	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(compressString(str));
	}

	public static String compressString(String str){
		String compressedString = "";
		int charCount = 0;
		
		for (int i = 0; i < str.length(); i++){
			charCount++;
			if ( i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
				compressedString = compressedString + str.charAt(i) + charCount;
				charCount = 0;
			}
		}
		
		return compressedString.length() > str.length() ? str : compressedString;

	}

}