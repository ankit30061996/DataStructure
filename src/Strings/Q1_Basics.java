package Strings;

import java.util.Scanner;

public class Q1_Basics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		System.out.println(s);
	
		
		// Read Character at some point
		char ch=s.charAt(3);
		System.out.println(ch);
		
		// Print all character 
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		// Print substring
		System.out.println(s.substring(2,4));
		
		// Print Length
		System.out.println(s.length());
	}
}
