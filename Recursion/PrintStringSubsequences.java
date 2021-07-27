import java.util.Scanner;

public class PrintStringSubsequences{

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		printStringSubSequences(s,"");
	}

	public static void printStringSubSequences(String input, String output){
		if (input.length() == 0){
			System.out.println(output);
			return;
		}
		String output2 = output + input.charAt(0);
		printStringSubSequences(input.substring(1),output);
		printStringSubSequences(input.substring(1),output2);
	}
}