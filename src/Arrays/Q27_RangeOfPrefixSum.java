package Arrays;

import java.util.Scanner;

public class Q27_RangeOfPrefixSum {

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
		int[] array=new int[n+1];
		for(int i=1; i<n+1; i++) {
			array[i]=sc.nextInt();
		}
		int[] prefSum=prefixSum(array);
		int q=sc.nextInt();
		while(q>0) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int ans=prefSum[r]-prefSum[l-1];
			System.out.println(ans);
		}
	}
}
