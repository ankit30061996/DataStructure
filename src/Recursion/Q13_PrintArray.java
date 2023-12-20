 package Recursion;

import java.util.Scanner;

public class Q13_PrintArray {

	void printArray(int[] array, int index) {
		if(index==array.length) {
			return;
		}
		System.out.print(array[index]+" ");
		printArray(array, index+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		Q13_PrintArray pa=new Q13_PrintArray();
		pa.printArray(array, 0);
	}
}
