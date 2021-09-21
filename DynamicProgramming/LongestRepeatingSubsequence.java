import java.util.Scanner;

public class LongestRepeatingSubsequence{

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String lrs = longestRepeatingSubsequence(s);
		System.out.println(lrs);
	}

	public static String longestRepeatingSubsequence(String s){
		int n = s.length();
		if (n <	2){
			return s;
		}

		int [][] dp = new int[n + 1][n + 1];
		String sb = "";

		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n; j++){
				if (s.charAt(i-1) == s.charAt(j-1) && i != j){
					dp[i][j] = 1 + dp[i-1][j-1];
					sb = !sb.contains(s.charAt(i-1) + "") ? sb +  s.charAt(i-1) : sb;
				} else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
	
		return sb;
	}
}