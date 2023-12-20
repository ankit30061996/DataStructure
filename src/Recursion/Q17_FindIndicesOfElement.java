package Recursion;

import java.util.Scanner;

public class Q17_FindIndicesOfElement {

	static int findIndicesOfElement(int[] array, int n, int target, int index) {
		if(index>=n) {
			return -1;
		}
		if(array[index]==target) {
			return index;
		}
		return findIndicesOfElement( array, n, target, index+1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int array[]=new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(findIndicesOfElement( array, n, target, 0));
	}
}
