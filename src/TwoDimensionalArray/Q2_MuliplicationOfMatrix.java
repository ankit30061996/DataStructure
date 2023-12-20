package TwoDimensionalArray;

import java.util.Scanner;

public class Q2_MuliplicationOfMatrix {

	static void printMatrix(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void multiplicationOfMatrix(int[][] array, int n, int m, int[][] array1, int a, int b) {
		if(m!=a) {
			System.out.println("Multiplication Not possible");
			return;
		}

			int[][] multiply= new int[n][b];
			for(int i=0; i<n; i++) {
				for(int j=0; j<b; j++) {
					for(int k=0; k<a; k++) {
					multiply[i][j]+=(array[i][k]*array1[k][j]);
					}
				}				
			}
			printMatrix(multiply);
		}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First Matrix ");
		System.out.println("Enter number of Rows ");
		int n=sc.nextInt();
		System.out.println("Enter number of Columns ");
		int m=sc.nextInt();
		int[][] array=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second matrix");
		System.out.println("Enter number of Rows ");
		int a=sc.nextInt();
		System.out.println("Enter number of Columns ");
		int b=sc.nextInt();
		int[][] array1=new int[a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				array1[i][j]=sc.nextInt();
			}
		}
		printMatrix(array);
		System.out.println();
		printMatrix(array1);
		System.out.println();
		multiplicationOfMatrix(array,  n,  m, array1, a, b);	
	}
}
