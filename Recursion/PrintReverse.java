import java.util.Scanner;

public class PrintReverse {

	public static void printReverse(int n){
		if (n == 1){
			System.out.print(n);
			return;
		}
		System.out.println(n);
		printReverse(n-1);
	}

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printReverse(n);
	}
}