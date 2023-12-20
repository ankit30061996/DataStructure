package Strings;

import java.util.Scanner;

public class Q7_NumberOfPalindrome {

	static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
			return false;
			}
			i++;
			j--;
		}
		return true;
		}
	
	static void numberOfPalindrome(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				if(isPalindrome(s.substring(i,j))==true) {
					System.out.println(s.substring(i,j)+" ");
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		numberOfPalindrome(s);
	} 
}
