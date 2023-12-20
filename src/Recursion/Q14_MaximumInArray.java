package Recursion;

import java.util.Scanner;

public class Q14_MaximumInArray {

	int maximumArray(int[] array, int index) {
		if(index==array.length-1) {
			return array[index];		
	}
	int ans=maximumArray(array,index+1);
	return Math.max(array[index], ans);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		Q14_MaximumInArray ma=new Q14_MaximumInArray();
		System.out.println(ma.maximumArray(array, 0));
	}
}
