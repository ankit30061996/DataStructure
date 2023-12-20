package TwoDimensionalArray;

import java.util.Scanner;

public class Q3_TransposeOfMatrix {

	static void printMatrix(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int[][] transposeOfMatrix(int[][] array, int n, int m) {
		int[][] ans=new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				ans[i][j]=array[j][i];
				}
			}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns of matrix ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] array=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		printMatrix(array);
		
		int[][] ans=transposeOfMatrix(array, n, m);
		System.out.println();
		printMatrix(ans);
	}
}
