package Arrays;

import java.util.Scanner;

public class Q4_CopyArray {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	void copy(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0; i<array.length; i++) {
        	array[i]=sc.nextInt();
        }
        int array2[]=array;    // shallow copy
        // int array2[]=array.clone();
        printArray(array);
	}
	
	public static void main(String[] args) {
		Q4_CopyArray ca=new Q4_CopyArray();
		ca.copy();
	}
}
