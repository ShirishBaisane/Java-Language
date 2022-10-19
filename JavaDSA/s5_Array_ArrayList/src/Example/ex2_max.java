package Example;

import java.util.Arrays;

public class ex2_max {

	public static void main(String[] args) {
		int[] arr = {23, 4, 67, 17, 10, 21};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Max: "+max(arr));

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

}
