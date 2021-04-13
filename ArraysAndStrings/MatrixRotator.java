import java.util.Scanner;

public class MatrixRotator {

	public static void main(String...ar){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		//assumption- user would enter size greater than zero
		int [][] matrix = new int[size][size];
		
		//populate the matrix
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				matrix[i][j] = sc.nextInt();
			}
		}

		int [][] rotatedMatrix = rotateMatrix(matrix);
		
		for (int k = 0; k < size; k++){
			for (int l = 0; l < size; l++){
				System.out.print(rotatedMatrix[k][l]);
			}
			System.out.println("\n");
		}

	}


	public static int[][] rotateMatrix(int [][] matrix){
		int n = matrix.length;

		//run two loops - inner and outer
		for (int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++){
				int offset = i - first;
				int top = matrix [first][i];
				
				//left -> top
				matrix[first][i] = matrix[last-offset][first];

				//bottom -> left
				matrix[last-offset][first] = matrix[last][last-offset];

				//right -> bottom
				matrix[last][last-offset] = matrix[i][last];

				//top -> right
				matrix[i][last] = top;

			}
		}
		return matrix;
	}

}