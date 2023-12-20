package Recursion;

import java.util.Scanner;

public class Q11_SumAndDifference {

	int sum(int n) {
		if(n==0) {
			return 0;
		}
		if(n%2==0) {
			return sum(n-1)-n;
		}
		else {
			return sum(n-1)+n;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sum and difference upto ");
		int n=sc.nextInt();
		Q11_SumAndDifference sn=new Q11_SumAndDifference();		
		System.out.println(sn.sum(n));
	}
}
