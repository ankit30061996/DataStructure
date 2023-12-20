package Arrays;

import java.util.Scanner;

public class Q20_QuerySearch {

	static int[] makeFrequencyArray(int[] array) {
		int freq[]=new int[100005];
		for(int i=0; i<array.length; i++) {
			freq[array[i]]++;
		}
		return freq;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		
		int[] freq=makeFrequencyArray(array);
		System.out.println("Enter no of queries");
		int q=sc.nextInt();
		
		while(q>0) {
			int k=sc.nextInt();
			if(freq[k]>0) {
				System.out.println("Found");
			}
			else {
				System.out.println("Not Found");
			}
		}
	}
}
