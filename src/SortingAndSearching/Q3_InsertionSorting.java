package SortingAndSearching;

import java.util.Scanner;

public class Q3_InsertionSorting {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static void insertionSorting(int[] array) {
		int n=array.length;
		for(int i=1; i<n; i++) {
			int j=i;
			while(j>0 && array[j]<array[j-1]) {
				int temp=array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		 printArray(array);
		 System.out.println();
		insertionSorting(array);
		 printArray(array);
	}
}
