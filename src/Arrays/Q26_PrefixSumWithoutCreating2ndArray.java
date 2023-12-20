package Arrays;

import java.util.Scanner;

public class Q26_PrefixSumWithoutCreating2ndArray {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static int[] prefixSum(int[] array) {
		int n=array.length;
		for(int i=1; i<n; i++) {
			array[i]=array[i-1]+array[i];
		}
		return array;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		int[] ans = prefixSum(array);
		printArray(ans);
	}
}
