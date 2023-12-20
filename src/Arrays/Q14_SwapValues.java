package Arrays;

import java.util.Scanner;

public class Q14_SwapValues {

	static void swap(int a, int b) {
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		swap(a,b);
	}
}
