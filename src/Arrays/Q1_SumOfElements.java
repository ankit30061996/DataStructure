package Arrays;

import java.util.Scanner;

public class Q1_SumOfElements {

	void sum () {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int array[]=new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Q1_SumOfElements se=new Q1_SumOfElements();
		se.sum();
}
}
