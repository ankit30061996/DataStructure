package Arrays;

import java.util.Scanner;

public class Q25_PrefixSum {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static int[] prefixSum(int[] array) {
		int n=array.length;
		int[] pref=new int[n];
		pref[0]=array[0];
		for(int i=1; i<n; i++) {
			pref[i]=pref[i-1]+array[i];
		}
		return pref;
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
