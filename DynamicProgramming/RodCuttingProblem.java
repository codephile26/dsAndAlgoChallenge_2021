public class RodCuttingProblem {

	public static int cutRod(int [] lengths, int [] prices, int maxLength){
		int [][] dp = new int[lengths.length + 1][maxLength + 1];

		for (int i = 0; i < dp.length; i++){
			dp[i][0] = 0;
		}

		for (int i = 0;i < dp[0].length;i++){
			dp[0][i] = 0;
		}

		for (int i = 1; i <= lengths.length; i++){
			for (int j = 1; j <= maxLength; j++){
				if (lengths[i - 1] <= j){
					dp[i][j] = Math.max(dp[i-1][j], prices[i-1] + dp[i][j - lengths[i-1]]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}		
		}

		return dp[lengths.length][maxLength];
	}

	public static void main(String...ar){
		int [] lengths = new int[]{1,2,3,4,5,6,7,8};
		int [] prices = new int[]{1,5,8,9,10,17,17,20};
		System.out.println(cutRod(lengths,prices,8));	
	}
}