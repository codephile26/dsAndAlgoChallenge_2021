public class RobotInAGrid{

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        	int m = obstacleGrid.length;
        	int n = obstacleGrid[0].length; 
        
        	if (obstacleGrid[0][0] == 1){
            		return 0; //this implies that the first cell has an obstacle itself and the robot cannot move forward
        	}
        
        	if (obstacleGrid[0][0] == 0){
            		obstacleGrid[0][0] = 1;
        	}
        
        	//iterate over the first row
        	for (int i = 1;i < n; i++){
            		obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        	}
        
        	//iterate over the first column
        	for (int j = 1; j < m; j++){
            		obstacleGrid[j][0] = (obstacleGrid[j][0] == 0 && obstacleGrid[j-1][0] == 1) ? 1 : 0;
        	}
        
        	for (int k = 1; k < m; k++){
            		for (int l = 1; l < n; l++){
                		obstacleGrid[k][l] = (obstacleGrid[k][l] == 1)? 0 : obstacleGrid[k-1][l] + obstacleGrid[k][l-1];
            		}
        	}
        
        	return obstacleGrid[m - 1][n - 1];
    	}
}