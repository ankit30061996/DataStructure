package Arrays;

import java.util.Scanner;

public class Q9_TargetSum {

	static int targetSum(int[] array, int target) {
		int count=0;
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]+array[j]==target) {
				count++;	
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(targetSum(array, target));
	}
}
