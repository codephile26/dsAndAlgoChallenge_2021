import java.util.ArrayList;
import java.util.Scanner;

public class StringPermutations{

	public static ArrayList<String> getPerms(String string){
		ArrayList<String> result = new ArrayList<>();
		getPerms("",string,result);
		return result;
	}

	public static void getPerms(String prefix, String remainder, ArrayList<String> result){
		if (remainder.length() == 0) result.add(prefix);

		int len = remainder.length();
		for (int i = 0; i < len; i++){
			String before = remainder.substring(0,i);
			String after = remainder.substring(i+1, len);
			char c = remainder.charAt(i);
			getPerms(prefix + c, before + after, result);
		}
	}

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		ArrayList<String> result = getPerms(string);
		System.out.println(result);
	}
}