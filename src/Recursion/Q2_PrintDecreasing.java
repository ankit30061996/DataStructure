package Recursion;

import java.util.Scanner;

public class Q2_PrintDecreasing {

	void printDecreasing(int n) {
		if(n==1) {
			System.out.println("1");
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print decreasing order upto 1");
		int n=sc.nextInt();
		Q2_PrintDecreasing pd=new Q2_PrintDecreasing ();
		pd.printDecreasing(n);
	}
}
