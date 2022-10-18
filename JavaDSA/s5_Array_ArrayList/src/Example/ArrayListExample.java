package Example;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Syntax
		ArrayList<Integer> list = new ArrayList<>(5);
		list.add(6);
		list.add(7);
		list.add(9);
		list.add(11);
		list.add(17);
		list.add(21);
		list.add(1);
		System.out.println(list.contains(7));//to check if the element is present in the list
		System.out.println(list);
		
		list.set(0,  10);//to set value at specific index
		System.out.println(list);
		
		//input
		for(int i=0; i<5; i++) {
			list.add(scan.nextInt());//to add elements to Arraylist 
		}
		
		//get item at any index
		for(int i=0; i<list.size(); i++) {//to get size of ArrayList
			System.out.println(list.get(i));
		}
		
		System.out.println(list);
		
		scan.close();

	}

}
