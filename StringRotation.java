import java.util.Scanner;

public class StringRotation {
	
	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(isRotation(s1,s2));
	}

	public static boolean isRotation(String s1, String s2){
		if (s1.length() == s2.length() && !s2.isEmpty()){
			String xyxy = s1 + s1;
			return xyxy.contains(s2);
		}
		return false;
	}
}