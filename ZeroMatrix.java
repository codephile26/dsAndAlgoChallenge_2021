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
		
		setZeros(matrix);

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

}