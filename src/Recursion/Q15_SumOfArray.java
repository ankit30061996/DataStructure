package Recursion;

import java.util.Scanner;

public class Q15_SumOfArray {

	int sumOfArray(int[] array, int index) {
		if(index==array.length-1) {
			return array[index];		
	}
	int sum=sumOfArray(array,index+1);
	return array[index]+sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		Q15_SumOfArray sa=new Q15_SumOfArray();
		System.out.println(sa.sumOfArray(array, 0));
	}
}
