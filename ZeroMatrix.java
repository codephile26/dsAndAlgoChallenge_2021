import java.util.Scanner;

public class ZeroMatrix {
	
	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] matrix = new int[m][n];
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		setZerosSpaceEfficient(matrix);

		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.println(matrix[i][j]);
			}
		}

	
	}
	
	public static void setZeros(int[][] matrix){
		boolean [] row = new boolean[matrix.length];
		boolean [] column = new boolean[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				if (matrix[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		//make rows zero
		for (int i = 0; i < row.length; i++){
			if (row[i]) nullifyRow(i, matrix[i]);
		}
		
		//make columns zero
		for (int j = 0; j < column.length; j++){
			if (column[j]) nullifyColumn(j, matrix);
		}
		
	}
	
	public static void nullifyRow(int row, int [] matrixRow){
		for (int i = 0; i < matrixRow.length; i++){
			matrixRow[i] = 0;
		}
	}
	
	public static void nullifyColumn(int column, int [][] matrix){
		for (int i = 0; i < matrix.length; i++){
			matrix[i][column] = 0;
		}
	}

	public static void setZerosSpaceEfficient(int [][] matrix){
		boolean rowHasZero = false;
		boolean colHasZero = false;

		//check for zeros in first row
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0){
				rowHasZero = true;
				break;
			}
		}

		//check for zeros in first column
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0){
				colHasZero = true;
				break;
			}
		}

		// iterate through the rest of the matrix to check for other zeros
		// when a zero is found, make the first element of that row and the first element of that column equal to zero
		for (int i = 1; i < matrix.length; i++){
			for (int j = 1; j < matrix[0].length; j++){
				if (matrix[i][j]== 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		//nullify row, based on value in first column
		for (int i = 1; i < matrix.length; i++){
			if (matrix[i][0] == 0){
				nullifyRow(i, matrix[i]);
			}
		}

		//nullify column, based on value in first row
		for (int j = 1; j < matrix[0].length; j++){
			if (matrix[0][j] == 0){
				nullifyColumn(j,matrix);
			}
		}

		// nullify first row and column, if needed
		if (rowHasZero) nullifyRow(0,matrix[0]);
		if (colHasZero) nullifyColumn(0, matrix);

	}

}