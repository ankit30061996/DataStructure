package Recursion;

import java.util.Scanner;

public class Q9_KthMultipleOfN {

	void multiple(int n, int k) {
		if(k==1) {
			System.out.println(n);
			return;
			// we can also write k==0 and direct return;
		}
		multiple(n,k-1);
		System.out.println(n*k);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The number is ");
		int n=sc.nextInt();
		System.out.println("The Multiple is ");
		int k=sc.nextInt();
		Q9_KthMultipleOfN m=new Q9_KthMultipleOfN();
		m.multiple(n, k);
	}
}
