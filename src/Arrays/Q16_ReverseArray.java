package Arrays;

import java.util.Scanner;

public class Q16_ReverseArray {

	static void printArray(int[] array) {
	for(int i=0; i<array.length; i++) {
		System.out.print(array[i]+" ");
	}	
	}
	
	static int[] reverseArray(int[] array) {
		int n=array.length;
		int[] ans=new int[n];
		int j=0;
		for(int i=n-1; i>=0; i--) {
			ans[j++]=array[i];			
/*
  int i=n-1; j=0;
  while(i>=0){
  ans[j++]=array[i--];
  }
 */
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		int[] ans=reverseArray(array);
		printArray(ans);
	}
}
