import java.util.Arrays;
import java.util.Scanner;

public class TripleStep{

	public static int count(int n){
		int [] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return count(n, memo);
	}

	public static int count(int n, int [] memo){
		if (n < 0){
			return 0;
		} else if (n == 0){
			return 1;
		}
		else if (memo[n] > -1){
			return memo[n];
		}
		else {
			memo[n] = count(n-1,memo) + count(n-2, memo) + count(n-3,memo);
			return memo[n];
		}
	}

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(count(n));
	}
}