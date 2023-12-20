package Recursion;

import java.util.Scanner;

public class Q10_SumUptoN {

	int sum(int n) {
		if(n==0) {
			return 0;
		}
		return sum(n-1)+n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sum upto ");
		int n=sc.nextInt();
		Q10_SumUptoN sn=new Q10_SumUptoN();		
		System.out.println(sn.sum(n));
	}
}
