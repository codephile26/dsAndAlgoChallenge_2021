import java.util.Scanner;

public class CountOnesInBinary{

	public static int count(int n){
		System.out.println("The binary representation of the number is: " + Integer.toBinaryString(n));
		int count = 0;
		while (n > 0){
			n = n & (n-1);
			System.out.println("The binary representation of the number & (number-1) is: " + Integer.toBinaryString(n));
			count++;		
		}
		return count;
	}


	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));
	}

}