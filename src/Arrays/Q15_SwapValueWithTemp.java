package Arrays;

import java.util.Scanner;

public class Q15_SwapValueWithTemp {
	
	static void swapWithoutTemp(int a, int b) {
	System.out.println("Value of a "+a);
	System.out.println("Value of b "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Value of a "+a);
	System.out.println("Value of b "+b);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		swapWithoutTemp(a,b);
	}
	}

