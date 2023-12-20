package Arrays;

import java.util.Scanner;

public class Q17_ReverseArrayWithoutSecondArray {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		reverseArray(array);
		printArray(array);
	}
}
