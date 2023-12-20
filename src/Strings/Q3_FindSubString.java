package Strings;

import java.util.Scanner;

public class Q3_FindSubString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(s.substring(2,4));
	System.out.println(s.substring(3));
	System.out.println();
	for(int i=2; i<4; i++) {
		System.out.print(s.substring(i));
	}
	}
}
