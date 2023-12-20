package Recursion;

import java.util.Scanner;

public class Q21_CheckPalindrome {

	static String reverseString(String s) {
		if(s.length()==0) {
			return "";
		}
		String smallAns=reverseString(s.substring(1));
		return smallAns+s.charAt(0);
	}
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	
			String s=sc.nextLine();
			String rev=reverseString(s);
			if(rev.equals(s)) {
				System.out.printf("%s is Palindrome", s);
			}
			else {
				System.out.printf("%s is not Palindrome", s);
			}
	}
}
