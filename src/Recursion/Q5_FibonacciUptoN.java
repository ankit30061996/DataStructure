package Recursion;

import java.util.Scanner;

public class Q5_FibonacciUptoN {

	int fibonacci(int n) {
		if(n==0||n==1) {
			return n;
		}
		int fib=fibonacci(n-1)+fibonacci(n-2);
		return fib;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Find fibonacci upto ");
		int n=sc.nextInt();
		Q4_FibonacciNumber fn=new Q4_FibonacciNumber();
		for(int i=0; i<=n; i++) {
		System.out.print(fn.fibonacci(i) + " ");
		}
	}
}
