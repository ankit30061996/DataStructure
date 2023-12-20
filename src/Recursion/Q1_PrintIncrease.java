package Recursion;

import java.util.Scanner;

public class Q1_PrintIncrease {
 
	void printIncreasing(int n) {
		if(n==1) {
			System.out.println("1");
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print upto ");
		int n=sc.nextInt();
		Q1_PrintIncrease pi=new Q1_PrintIncrease();
		pi.printIncreasing(n);
	}
}
