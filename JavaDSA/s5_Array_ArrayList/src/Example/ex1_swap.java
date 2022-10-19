package Example;

import java.util.Arrays;

public class ex1_swap {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		swap(arr ,0, 3);
		System.out.println(Arrays.toString(arr));

	}
	
	static void swap(int[] ar, int index1, int index2) {
		int temp = ar[index1];
		ar[index1] = ar[index2];
		ar[index2] = temp;
	}

}
