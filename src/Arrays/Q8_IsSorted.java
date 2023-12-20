package Arrays;

import java.util.Scanner;

public class Q8_IsSorted {

	static boolean isSorted(int []array) {
		boolean check=true;
		for(int i=1; i<array.length; i++) {
			if(array[i]<array[i-1]) {
				check=false;
				break;
			}
		}
		return check;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int array[]=new int[n];
	for(int i=0; i<n; i++) {
		array[i]=sc.nextInt();
	}
	System.out.println(isSorted(array));
	}
}
