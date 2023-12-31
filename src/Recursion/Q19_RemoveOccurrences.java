package Recursion;

import java.util.Scanner;

public class Q19_RemoveOccurrences {

	static String removeA2(String s) {
		if(s.length()==0) {
			return "";
		}
		String smallAns=removeA2(s.substring(1));
		char currentChar=s.charAt(0);
		if(currentChar!='a') {
			return currentChar+smallAns;
		}
		else {
			return smallAns;
		}
	}
	
	static String removeA(String s, int index) {
		if(index==s.length()) {
			return "";
		}
		String smallAns=removeA(s, index+1);
		char currentChar=s.charAt(index);
		if(currentChar!='a') {
			return currentChar+smallAns;
		}
		else {
			return smallAns;
		}
	}
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);	
		String s=sc.nextLine();
		System.out.println();
		System.out.println(removeA(s,0));
		System.out.println();
		System.out.println(removeA2(s));
	}
}
