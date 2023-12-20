package SortingAndSearching;

import java.util.Scanner;

public class Q2_SelectionSorting { 

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static void selectionSorting(int[] array){
		int n=array.length;
		for(int i=0; i<n-1; i++) {
			int min_index=i;
			for(int j=i+1; j<n; j++) {
			if(array[j]<array[min_index]) {
				min_index=j;
			}
			}
			int temp=array[i];
			array[i]=array[min_index];
		    array[min_index]=temp;
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
		selectionSorting(array);
		 printArray(array);
	}
}
