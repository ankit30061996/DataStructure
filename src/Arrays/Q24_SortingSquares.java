package Arrays;

import java.util.Scanner;

public class Q24_SortingSquares {
	
	static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static void reverseArray(int[] array) {
		int i=0, j=array.length-1;
		while(i<j) {
			swap(array,i,j);
			i++;
			j--;
		}
	}
	static void swap(int[] array, int i, int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	static int[] sortSqaure(int[] array) {
		int n=array.length;
		int left=0, right=n-1;
		int[] ans=new int[n];
		int k=0;                     // k=n-1;
		while(left<=right) {
			if(Math.abs(array[left])>Math.abs(array[right])) {
				ans[k++]=array[left]*array[left];
				// ans[k--] if we write this then we don't have to write reverse method
				left++;
			}
			else {
				ans[k++]=array[right]*array[right];
				right--;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=sc.nextInt();
		}
		int[] ans=sortSqaure(array);	
		reverseArray(ans);
		printArray(ans);
	}
}
