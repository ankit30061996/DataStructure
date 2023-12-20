package Recursion;

import java.util.Scanner;

public class Q4_FibonacciNumber {

	int fibonacci(int n) {
		if(n==0||n==1) {
			return n;
		}
		int fib=fibonacci(n-1)+fibonacci(n-2);
		return fib;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Find fibonacci of ");
		int n=sc.nextInt();
		Q4_FibonacciNumber fn=new Q4_FibonacciNumber();
		System.out.println(fn.fibonacci(n));
	}
}
