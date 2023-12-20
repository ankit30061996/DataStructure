 package Recursion;

import java.util.Scanner;

public class Q12_FindGCD {

	// recursive approach
	int gcd(int x,int y) {
		if(y==0) {
			return x;
		}
		return gcd(y, x%y);
	}
	
	//iterative approach
	int Gcd(int x, int y) {
		while(x%y!=0) {
			int rem=x%y;
			x=y;
			y=rem;
		}
		return y;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The first number is ");
		int x=sc.nextInt();
		System.out.println("The second number is ");
		int y=sc.nextInt();
		 Q12_FindGCD g=new  Q12_FindGCD();
		 System.out.println(g.gcd(x, y));
		 System.out.println(g.Gcd(x, y));
	}
}
