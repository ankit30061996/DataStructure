package Recursion;

import java.util.Scanner;

public class Q3_Factorial {

	int factorial(int n) {
		if(n==0) {
			return 1; 
		}
		int subfact = factorial(n-1);
		int ans=n*subfact;
		return ans;
		
		// we can write line number 11,12,13 in just one line
		// return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Find factorial of ");
		int n=sc.nextInt();
		 Q3_Factorial f=new  Q3_Factorial();
		 System.out.println(f.factorial(n));
	}
}
