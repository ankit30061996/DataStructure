package Arrays;

import java.util.Scanner;

public class Q28_PartiionSum {

	static int sumOfArray(int[] array) {
		int totalSum=0;
		for(int i=0; i<array.length; i++) {
			totalSum=totalSum+array[i];
		}
		return totalSum;
	}
	static boolean equalSumPartition(int[] array) {
		int totalSum=sumOfArray(array);
		int prefixSum=0;
		for(int i=0; i<array.length; i++) {
			prefixSum=prefixSum+array[i];
			int suffixSum=totalSum-prefixSum;
			if(prefixSum==suffixSum) {
				return true;
			}
		}
		return false;
	} 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n+1];
		for(int i=1; i<n+1; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println(equalSumPartition(array));
	}
}
