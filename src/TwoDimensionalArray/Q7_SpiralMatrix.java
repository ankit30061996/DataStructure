package TwoDimensionalArray;

import java.util.Scanner;

public class Q7_SpiralMatrix {

	static void printMatrix(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	static void printSpiralMatrix(int[][] array, int n, int m) {
		int toprow=0, bottomrow=n-1, leftcolumn=0, rightcolumn=m-1;
		int totalelements=0;
		while(totalelements<n*m) {
			// toprow:- leftcolumn to rightcolumn
			for(int j=leftcolumn; j<=rightcolumn && totalelements<n*m; j++) {
				System.out.print(array[toprow][j] +" ");
				totalelements++;
			}
			toprow++;
			// rightcolumn:- toprow to botommrow		
			for(int i=toprow; i<=bottomrow && totalelements<n*m; i++) {
				System.out.print(array[i][rightcolumn]+" ");
				totalelements++;
			}
			rightcolumn--;
			// bottomrow:- rightcolumn to leftcolumn
			for(int j=rightcolumn; j>=leftcolumn && totalelements<n*m; j--) {
				System.out.print(array[bottomrow][j]+" ");
				totalelements++;
			}
			bottomrow--;
			// leftcolumn:- bottomrow to toprow
			for(int i=bottomrow; i>=toprow && totalelements<n*m; i--) {
				System.out.print(array[i][leftcolumn]+" ");
				totalelements++;
			}
			leftcolumn++;
		}
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
		printMatrix( array);
		System.out.println();
		printSpiralMatrix( array, n, m);
	}
}
