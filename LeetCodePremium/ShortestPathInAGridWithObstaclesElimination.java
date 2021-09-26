import java.util.Queue;
import java.util.LinkedList;

public class ShortestPathInAGridWithObstaclesElimination{
	
	private static int [][] direction = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
	
	public static int shortestPath(int[][] grid, int k){
		int r = grid.length;
		int c = grid[0].length;
		Queue<int[]> queue = new LinkedList<>();
		boolean [][][] visited = new boolean[r][c][k+1];
		
		// in this question there is no need to find the starting position for BFS because we 
		// are given that starting position is 0,0.
		queue.offer(new int[]{0,0,0});
		visited[0][0][0] = true;
		
		int size, steps = 0, obsEliminated,x,y;
		int [] current;
		while (!queue.isEmpty()){
			size = queue.size();
			for (int i = 0; i < size; i++){
				current = queue.poll();
				if (current[0] == r - 1 && current[1]  == c - 1){
					return steps;
				}
				
				//x = current[0];
				//y = current[1];
				obsEliminated = current[2];
				for (int j = 0; j < direction.length;j++){
					x = current[0] + direction[j][0];
					y = current[1] + direction[j][1];
					
					if (x < r && x >= 0 && y < c && y >= 0){
						if (grid[x][y] == 1){
							if ((obsEliminated < k) && !visited[x][y][obsEliminated + 1]){
								queue.offer(new int[]{x,y,obsEliminated + 1});
								visited[x][y][obsEliminated+1]=true;
							}
						} else {
							if (!visited[x][y][obsEliminated]){
								queue.offer(new int[]{x,y,obsEliminated});
								visited[x][y][obsEliminated]=true;
							}
						 }
					}
				}
			}
			++steps;
		}
		return -1;
	}

	public static void main(String...ar){
		int [][] grid = new int[][]{{0,1,1},{1,1,1},{1,0,0}};
		System.out.println(shortestPath(grid,1));
	}
}