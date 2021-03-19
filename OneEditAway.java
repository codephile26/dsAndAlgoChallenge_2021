import java.util.Scanner;

public class OneEditAway {
	
	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.length() == str2.length()){
			 System.out.println(checkOneReplacement(str1,str2));
		} else if ((str1.length() + 1) == str2.length()) {
			System.out.println(checkOnlyOneEditDifference(str1,str2));
		} else if (str1.length() == str2.length() + 1){
			System.out.println(checkOnlyOneEditDifference(str2,str1));
		} else {
			System.out.println(false);
		}
	}
	
	//pale bale  pale pale
	public static boolean checkOneReplacement(String str1, String str2){
		boolean found = false;
		for (int i = 0; i < str1.length(); i++){
			if (str1.charAt(i) != str2.charAt(i)){
				if (found) {
					return false;
				}
				else {
					found = true;
				}
			}
		}
		return false;
	}
	
	//pale ple
	// in this method str1 is a string with smaller length
	public static boolean checkOnlyOneEditDifference(String str1, String str2){
		int index1 = 0;
		int index2 = 0;
		while (index1 < str1.length() && index2	< str2.length()){
			if (str1.charAt(index1) != str2.charAt(index2)){
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
}
	
	