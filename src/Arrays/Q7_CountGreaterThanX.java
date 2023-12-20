package Arrays;

import java.util.Scanner;

public class Q7_CountGreaterThanX {

	static int greaterThanX(int[] array, int x) {
		int count=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]>x) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println();
		greaterThanX(array, x);
	}
}
