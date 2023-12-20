package SortingAndSearching;

import java.util.Scanner;

public class Q4_MoveAllZeroesAtLast {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static void moveAllZeroesAtLast(int[] array) {
		int n=array.length;
		for(int i=0; i<n-1; i++) {
			boolean flag = false;
			for(int j=0; j<n-i-1; j++) {
				if(array[j]==0 && array[j+1]!=0) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				return;
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
		 moveAllZeroesAtLast(array);
		 printArray(array);
	}
}
