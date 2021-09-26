import java.util.Queue;
import java.util.LinkedList;

/* Problem Statement:
*
* 	You are starving and you want to eat food as quickly as possible. You want to find the shortest path to * * * arrive at any food cell.
* 
* You are given an m x n character matrix, grid, of these different types of cells:
  
* '*' is your location. There is exactly one '*' cell.
* '#' is a food cell. There may be multiple food cells.
* 'O' is free space, and you can travel through these cells.
* 'X' is an obstacle, and you cannot travel through these cells.
* You can travel to any adjacent cell north, east, south, or west of your current location if there is not an * * obstacle.
*
* Return the length of the shortest path for you to reach any food cell. If there is no path for you to reach * * food, return -1.
*
* Examples:
*
* Input: grid = *[["X","X","X","X","X","X"],["X","*","O","O","O","X"],["X","O","O","#","O","X"],["X","X","X","X","X","X"]]
* Output: 3
* Explanation: It takes 3 steps to reach the food.
*
* Input: grid = [["X","X","X","X","X"],["X","*","X","O","X"],["X","O","X","#","X"],["X","X","X","X","X"]]
* Output: -1
* Explanation: It is not possible to reach the food.
*
* Input: grid = *[["X","X","X","X","X","X","X","X"],["X","*","O","X","O","#","O","X"],["X","O","O","X","O","O","X","X"],["X","O"*,"O","O","O","#","O","X"],["X","X","X","X","X","X","X","X"]]
*Output: 6
*Explanation: There can be multiple food cells. It only takes 6 steps to reach the bottom food.
*/

public class ShortestPathToGetFood {
	
	private final static int [][] direction = new int[][] {{0,-1},{0,1},{1,0},{-1,0}}; 
	
	public static int getFood(char [][] grid){
		int r = grid.length;
		int c = grid[0].length;
		boolean [][] visited = new boolean[r][c];
		Queue<int[]> queue = new LinkedList<>();
		
		//starting point in a BFS is to find the cell to start BFS
		boolean startFound = false;
		for (int i = 0; i < r && !startFound;i++){
			for (int j = 0; j < c && !startFound;j++){
				if (grid[i][j] == '*'){
					startFound = true;
					visited[i][j] = true;
					queue.offer(new int[]{i,j});
					break;
				}
			}
		}
		
		//actual BFS
		int steps = 0, x, y, size;
		int [] current;
		while (!queue.isEmpty()){
			size = queue.size();
			for (int i = 0; i < size;i++){
				current = queue.poll();
				if (grid[current[0]][current[1]] == '#'){
					return steps;
				}
				
				for (int j = 0; j < direction.length;j++){
					x = current[0] + direction[j][0];
					y = current[1] + direction[j][1];
					
					if (x < r && x > 0 && y < r && y > 0 && !visited[x][y] && grid[x][y] != 'X'){
						visited[x][y] = true;
						queue.offer(new int[]{x,y});
					}
				}
			}
			++steps;
		}
		return -1;
	}
	
	public static void main(String...ar){
		char [][] grid = new char[][] {{'X','X','X','X','X','X'},
			{'X','*','O','O','O','X'},{'X','O','O','#','O','X'},{'X','X','X','X','X','X'}};
		System.out.println(getFood(grid));
	}
}