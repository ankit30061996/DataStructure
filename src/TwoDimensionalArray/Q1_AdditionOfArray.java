package TwoDimensionalArray;

import java.util.Scanner;

public class Q1_AdditionOfArray {

	static void printMatrix(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void addOfMatrix(int[][] array, int n, int m, int[][] array1, int a, int b) {
		if(n!=a || m!=b) {
			System.out.println("Not possible ");
			return;
		}		
		int[][] sum=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				sum[i][j]=array[i][j]+array1[i][j];
			}
		}
		printMatrix(sum);
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
		addOfMatrix(array, n, m, array1, a, b);
	}
}
