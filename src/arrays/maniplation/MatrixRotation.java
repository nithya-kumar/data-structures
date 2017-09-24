package arrays.maniplation;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] input = new int[3][2];
		int[][] output = new int[3][2];
		int val = 1;
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 2; j++) {
				input[i][j] = val ++;
			}
		}
		output = rotateClockwise(input);
		for (int i = 0; i < 2; i ++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
		output = rotateAntiClockwise(input);
		for (int i = 0; i < 2; i ++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static int [][] rotateClockwise(int [][] input){

		int n = input.length;
		int m = input[0].length;
		int [][] output = new int [m][n];

		for (int i=0; i< n; i++)
			for (int j=0; j< m; j++)
				output [j][n-1-i] = input[i][j];
		return output;
		}
	
	static int [][] rotateAntiClockwise(int [][] input){

		int n = input.length;
		int m = input[0].length;
		int [][] output = new int [m][n];

		for (int i=0; i< n; i++)
			for (int j=0; j< m; j++)
				output [m-1-j][i] = input[i][j];
		return output;
		}

}
