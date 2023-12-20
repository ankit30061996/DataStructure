package TwoDimensionalArray;

import java.util.Scanner;

public class Q8_SpiralNMatrixes {

	static void printMatrix(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int[][] printSpiralMatrix(int n) {
		int [][]array=new int[n][n];
		int toprow=0, bottomrow=n-1, leftcolumn=0, rightcolumn=n-1;
		int totalelements=1;
		while(totalelements<n*n) {
			// toprow:- leftcolumn to rightcolumn
			for(int j=leftcolumn; j<=rightcolumn && totalelements<=n*n; j++) {
				array[toprow][j]=totalelements++;
			}
			toprow++;
			// rightcolumn:- toprow to botommrow		
			for(int i=toprow; i<=bottomrow && totalelements<=n*n; i++) {
			array[i][rightcolumn]=totalelements++;
			}
			rightcolumn--;
			// bottomrow:- rightcolumn to leftcolumn
			for(int j=rightcolumn; j>=leftcolumn && totalelements<=n*n; j--) {
				array[bottomrow][j]=totalelements++;
			}
			bottomrow--;
			// leftcolumn:- bottomrow to toprow
			for(int i=bottomrow; i>=toprow && totalelements<=n*n; i--) {
				array[i][leftcolumn]=totalelements++;
			}
			leftcolumn++;
		}
		return array;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
	
		System.out.println();
		int[][]ans=printSpiralMatrix(n);
	    printMatrix(ans);
	}
}
