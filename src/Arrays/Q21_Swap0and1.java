package Arrays;

import java.util.Scanner;

public class Q21_Swap0and1 {

	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	static void swap0and1(int array[]) {
		int n=array.length;
		int zeroes=0;
	    for(int i=0; i<n; i++) {
	    	if(array[i]==0) {
	    		zeroes++;
	    	}
	    }
	    for(int i=0; i<n; i++) {
	    	if(i<zeroes) {
	    		array[i]=0;
	    	}
	    	else {
	    		array[i]=1;
	    	}
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		swap0and1(array);
		printArray(array);
	}
}
