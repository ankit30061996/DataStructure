package Recursion;

import java.util.Scanner;

public class Q16_PresentElement {

	static boolean findElement(int[] array, int n, int target, int index) {
		if(index>=n) {
			return false;
		}
		if(array[index]==target) {
			return true;
		}
		return findElement( array, n, target, index+1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int array[]=new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		if(findElement( array, n, target, 0)) {
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element not found");
		}
	}
}
