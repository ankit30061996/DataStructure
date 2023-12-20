package Recursion;

import java.util.Scanner;

public class Q6_SumOfDigits {

	int sum(int n) {
		if(n>=0 && n<=9) {
			return n;
		}
		int lastdigit=n%10;
		int add=lastdigit+sum(n/10);
		return add;
		
		// return sum(n/10)+n%10;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The sum of digit of a number ");
		int n=sc.nextInt();
		 Q6_SumOfDigits sd=new  Q6_SumOfDigits ();
		 System.out.println(sd.sum(n));
		}
	}

