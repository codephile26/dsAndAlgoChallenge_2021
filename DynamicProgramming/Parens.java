import java.util.ArrayList;
import java.util.Scanner;


public class Parens{

	public static ArrayList<String> getParens(int count){
		if (count <= 0){
			System.out.println("No combinations possible");
			return null;
		}
		char [] str = new char[count * 2];
		ArrayList<String> result = new ArrayList<>();
		getParens(result,count,count,str,0);
		return result;
	}

	public static void getParens(ArrayList<String> result, int leftRem, int rightRem, char [] str, int index){
		if (leftRem < 0 || rightRem < leftRem) return;

		if (leftRem == 0 && rightRem == 0){
			String string = String.copyValueOf(str);
			result.add(string);
		} else {
			if (leftRem > 0){
				str[index] = '(';
				getParens(result, leftRem - 1, rightRem, str, index + 1);
			}
			if (rightRem > leftRem){
				str[index] = ')';
				getParens(result, leftRem, rightRem - 1, str, index + 1);
			}
		}
	
	}

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		ArrayList<String> result = getParens(count);
		System.out.println(result);
	}
}