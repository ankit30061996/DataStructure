package Recursion;

import java.util.Scanner;

public class Q20_ReverseString {

	static String reverseString2(String s) {
		if(s.length()==0) {
			return "";
		}
		String smallAns=reverseString2(s.substring(1));
		return smallAns+s.charAt(0);
	}
	
	static String reverseString(String s, int index) {
		if(index==s.length()) {
			return"";
		}
		String smallAns=reverseString(s, index+1);
		return smallAns+s.charAt(index);
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	
			String s=sc.nextLine();
			System.out.println(reverseString(s,0));
	}
}
