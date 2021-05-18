public class SortedMatrixSearch{

	public boolean search(int [][] matrix, int element){
		int row = 0;
		int column = matrix[0].length - 1;
		while (row < matrix.length & column >= 0){
			if (matrix[row][column] == element){
				return true;
			} else if (matrix[row][column] > element){
				column--;
			} else{
				row++;
			}
		}
		return false;
	}
}