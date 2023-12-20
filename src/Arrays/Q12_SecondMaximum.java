package Arrays;

import java.util.Scanner;

public class Q12_SecondMaximum {

	static int findMax(int[] array) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
	return max;
	}
	
	static int findSecondMax(int[] array) {
	    int max=findMax(array);
	    for(int i=0; i<array.length; i++) {
	    	if(array[i]==max) {
	    		array[i]=Integer.MIN_VALUE;
	    	}
	    }
	    int secondMax=findMax(array);
	    return secondMax;
	}
	
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] array=new int[n];
      for(int i=0; i<n; i++) {
    	  array[i]=sc.nextInt();
      }
      System.out.println(findSecondMax(array));
	}
}
