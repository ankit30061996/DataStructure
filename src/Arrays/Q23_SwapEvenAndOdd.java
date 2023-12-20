package Arrays;

import java.util.Scanner;

public class Q23_SwapEvenAndOdd {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static void swap(int[] array, int i, int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static void swapOddAndEven(int[] array) {
		int n=array.length;
		int left=0, right=n-1;
		while(left<right) {
			if(array[left]%2!=0 && array[right]%2==0) {
				swap(array, left, right);
				left++;
				right--;
			}
			if(array[left]%2==0) {
				left++;
			}
			if(array[right]%2!=0) {
				right--;
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
		swapOddAndEven(array);
		printArray(array);
	}
}
