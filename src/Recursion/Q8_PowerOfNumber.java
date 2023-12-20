package Recursion;

import java.util.Scanner;

public class Q8_PowerOfNumber {

	int power(int p, int q) {
		if(q==0) {
			return 1;
		}
		return power(p,q-1)*p;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The number is ");
		int p=sc.nextInt();
		System.out.println("The power is ");
		int q=sc.nextInt();
		Q8_PowerOfNumber pn=new Q8_PowerOfNumber();
		System.out.println(pn.power(p, q));
	}
}
