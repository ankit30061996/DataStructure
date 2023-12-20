package TwoDimensionalArray;

import java.util.Scanner;

public class Q9_RectangleSum {

	static int findSum(int[][]array, int l1, int l2, int r1, int r2) {
		int sum=0;
		for(int i=l1; i<=l2; i++) {
			for(int j=r1; j<=r2; j++) {
				sum=sum+array[i][j];
			}
		}
		return sum;
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
		System.out.println("Enter l1, l2, r1, r2");
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		System.out.println(findSum(array, l1, r1, l2, r2));
	}
}
