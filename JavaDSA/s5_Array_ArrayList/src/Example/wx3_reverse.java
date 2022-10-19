package Example;

import java.util.Arrays;

public class wx3_reverse {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println("Before Reverse"+Arrays.toString(arr));
		reverse(arr);
		System.out.println("After Reverse"+Arrays.toString(arr));

	}
	
	static void swap(int[] ar, int index1, int index2) {
		int temp = ar[index1];
		ar[index1] = ar[index2];
		ar[index2] = temp;
	}
	
	static void reverse(int[] ar) {
		int i1 = 0;
		int i2 = ar.length-1;
		
		while(i2>i1) {
			swap(ar, i1, i2);
			i1++;
			i2--;
		}
	}

}
