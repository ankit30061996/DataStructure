package Strings;

import java.util.Scanner;

public class Q5_Toggle {

	static void toggle(StringBuilder s) {
		int n=s.length();
		for(int i=0; i<n; i++) {
			boolean flag=true;
			char ch=s.charAt(i);
			if(ch==' ') {
				continue;
			}
			int asci=(int)ch;
			if(asci>=97) {
				flag=false;
			}
			if(flag==true) {
				asci+=32;
				char dh=(char)asci;
				s.setCharAt(i, dh);
			}
			else {
				asci-=32;
				char dh=(char)asci;
				s.setCharAt(i, dh);
			}
		}
	}
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        System.out.println(s);
        toggle(s);
        System.out.println(s);
	}
}
