import java.util.Scanner;

public class PrintNumber{

	public static void print(int n){
		if (n == 1){
			System.out.println(n);
			return;
		}
		print(n-1);	
		System.out.println(n);
	}

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}
}