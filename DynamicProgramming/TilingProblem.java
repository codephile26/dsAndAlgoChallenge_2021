class TilingProblem{

	public static int numberOfTiles(int n){
		if (n <= 0){
			return 0;
		}

		int [] dp = new int[n+1];

		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		for (int i = 4; i <= n; i++){
			dp[i] = dp[i-1] + dp[i - 4];
		}
		return dp[n];
	}

	public static void main(String...ar){
		int ways = numberOfTiles(6);
		System.out.println(ways);
	}
}