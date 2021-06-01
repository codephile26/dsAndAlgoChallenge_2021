import java.util.Scanner;

public class Debugger {

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((n & (n -1)) == 0);	

	}

}