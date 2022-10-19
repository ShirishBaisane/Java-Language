package Example;

import java.util.Arrays;

public class ex2_max {

	public static void main(String[] args) {
		int[] arr = {3, 4, 17, 7, 10, 6};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Max: "+max(arr));
		System.out.println("Max(in range): "+maxR(arr, 3, (arr.length-1)));

	}
	
	static int max(int[] ar) {
		int max = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		
		return max;
	}
	
	static int maxR(int[] ar, int index1, int index2) {
		int max = ar[index1];
		for(int i=(index1+1); i<=index2; i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		
		return max;
	}

}
