package Strings;

import java.util.Scanner;

public class Q6_PalindromeOrNot {

	static void palindrome(String s) {
	int i=0;
	int j=s.length()-1;
	boolean flag=true;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j)) {
			flag=false;
			break;
		}
		i++;
		j--;
	}
	if(flag==true) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		palindrome(s);
	}
}
