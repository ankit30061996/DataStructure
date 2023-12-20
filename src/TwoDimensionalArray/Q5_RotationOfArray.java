package TwoDimensionalArray;

import java.util.Scanner;

public class Q5_RotationOfArray {

	static void printMatrix(int[][] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	static void transposeOfMatrix(int[][] array, int n, int m) {
		for(int i=0; i<m; i++) {
			for(int j=i; j<n; j++) {
				int temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
				}
			}
	}
	
	static void swapArray(int[] array, int i, int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static void reverseArray(int[] array) {
		int i=0, j=array.length-1;
		while(i<j) {
			swapArray(array, i, j);
			i++;
			j--;
		}
	}
	
	static void rotationOfMatrix(int[][] array, int n) {
		transposeOfMatrix( array, n, n);
		for(int i=0; i<n; i++) {
			reverseArray(array[i]);
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
		printMatrix(array);
		System.out.println();
		rotationOfMatrix( array, n);
		printMatrix(array);
	}
}
