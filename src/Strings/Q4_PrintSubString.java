package Strings;

import java.util.Scanner;

public class Q4_PrintSubString {

	static void  subString(String s) {
		int n=s.length();
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<=n; j++) {
				System.out.print(s.substring(i, j)+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(); 
		subString(s);
	}
}
