import java.util.Scanner;

public class Fibonacci{

	/* Time complexity is O(n)
	 *
	 * Space Complexity is O(n)
	 *
	 */
	public static int fibonacciMemoization(int n){
		return fibonacciMemoization(n, new int[n + 1]);
	}

	public static int fibonacciMemoization(int n, int [] memo){
		if (n == 0 || n == 1) return 1;

		if (memo[n] == 0){
			memo[n] = fibonacciMemoization(n - 1, memo) + fibonacciMemoization(n-2, memo);
		}
		return memo[n];
	}

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n +"th number in Fibonacci Sequence is " + fibonacciMemoization(n));
		System.out.println(n +"th number in Fibonacci Sequence is " + fibonacciBottomUp(n));
	}

	/* Time complexity is O(n)
	 *
	 * Space Complexity is O(1)
	 *
	 */
	public static int fibonacciBottomUp(int n){
		if (n == 0) return 1;
		if (n == 1) return 1;
		int a = 0;
		int b = 1;
		for (int i = 2; i <=n; i++){
			int c = a + b;
			a = b;
			b = c;
		}
		return a + b;
	}
}