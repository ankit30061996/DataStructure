package Recursion;

import java.util.Scanner;

public class Q7_CountNumberOfDigit {

	int count(int n) {
		if(n>=0 && n<=9) {
			return 1;
		}
		return 1 + count(n/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The number of digits in a number ");
		int n=sc.nextInt();
		Q7_CountNumberOfDigit cd=new Q7_CountNumberOfDigit();
		System.out.println(cd.count(n));
	}
}
