package Arrays;

import java.util.Scanner;

public class Q10_TripletSum {

	static int tripletSum(int[] array, int target) {
		int count=0;
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				for(int k=j+1; k<array.length; k++) {
				if(array[i]+array[j]+array[k]==target) {
				count++;	
				}
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
		System.out.println(tripletSum(array, target));
	}
}
