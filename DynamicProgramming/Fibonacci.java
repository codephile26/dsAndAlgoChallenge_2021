import java.util.Scanner;

public class Fibonacci{

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
	}

}