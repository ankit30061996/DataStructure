package Arrays;

import java.util.Scanner;

public class Q2_MaximInArray {

	void max() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Q2_MaximInArray ma=new Q2_MaximInArray();
		ma.max();
	}
}
