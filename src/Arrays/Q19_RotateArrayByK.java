package Arrays;

import java.util.Scanner;

public class Q19_RotateArrayByK {

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
	
	static void reverse(int[] array, int i, int j) {
		while(i<j) {
			swap(array, i,j);
			i++;
			j--;
		}
	}
	
	static void rotateInPlace(int[] array, int k) {
		int n=array.length;
		k=k%n;
		reverse(array, 0, n-k-1);
		reverse(array, n-k, n-1);
		reverse(array, 0, n);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		rotateInPlace(array, k);
		printArray(array);
		}
}
