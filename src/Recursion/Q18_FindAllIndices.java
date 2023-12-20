package Recursion;

import java.util.Scanner;

public class Q18_FindAllIndices {

	static void findAllIndicesOfElement(int[] array, int n, int target, int index) {
		if(index>=n) {
			return;
		}
		if(array[index]==target) {
			System.out.println(index);
		}
		findAllIndicesOfElement( array, n, target, index+1);
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
	    findAllIndicesOfElement( array, n, target, 0);
	}
}
