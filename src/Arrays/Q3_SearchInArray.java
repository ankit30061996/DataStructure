package Arrays;

import java.util.Scanner;

public class Q3_SearchInArray {

	void search() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int ans=-1;
		for(int i=0; i<array.length; i++) {
			if(array[i]==k) {
			ans=i;
			}
		}
		System.out.println(k+" Found at index "+ans);
	}
	public static void main(String[] args) {
		Q3_SearchInArray sa=new Q3_SearchInArray();
		sa.search();
	}
}
