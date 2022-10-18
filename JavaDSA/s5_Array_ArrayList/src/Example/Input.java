package Example;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(arr[3]);
		
		//input using for-loop
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter "+(i+1)+" element:");
			arr[i] = scan.nextInt();
		}
		
		//output using for-loop
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//for every element in array, print the element
		for(int num : arr) { //here num represents element for the array
			System.out.println(num);
		}
		
		//array of objects
		String[] str = new String[4];
		for(int i = 0; i<str.length; i++) {
			str[i] = scan.next();;
		}
		
		System.out.println(Arrays.toString(str));
		
		//modify
		str[1] = "Shirish";
		
		System.out.println(Arrays.toString(str));
		
		scan.close();

	}

}
