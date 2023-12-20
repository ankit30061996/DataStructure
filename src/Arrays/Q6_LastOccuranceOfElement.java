package Arrays;

import java.util.Scanner;

public class Q6_LastOccuranceOfElement {

	static int lastoccurance(int[] array, int x) {
		int lastindex=-1;
		for(int i=0; i<array.length; i++) {
			if(array[i]==x) {
				lastindex=i;
			}
		}
		return lastindex;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(lastoccurance(array,x));
	}
}
