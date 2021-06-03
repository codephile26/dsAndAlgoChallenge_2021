import java.util.Scanner;

public class Division{

	public static int divide(int dividend, int divisor){
		// if condition is to prevent the overflow
		if (Integer.MIN_VALUE == dividend && divisor == -1){
			return Integer.MAX_VALUE;
		}

		int a = Math.abs(dividend);
		int b = Math.abs(divisor);
		int result = 0;

		while (a - b >=0){
			int x = 0;
			while (a - (b << 1 << x) >= 0){
				x++;			

			}
			result += 1 << x;
			a -= b << x;
		}

		return ((divisor >=0) == (dividend >= 0)) ? result : -1 * result;
	}

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		System.out.println(divide(dividend, divisor));
	}
}