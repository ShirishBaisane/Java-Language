package main;

import test.Product;

public class demoArrays4 {

	public static void main(String[] args) {
		Object o[] = new Object[3];
		o[0] = new Integer("1234");//Integer object
		o[1] = new String("Shirish");//String object
		o[2] = new Product("A111","Mouse",123.45f, 12);//User-defined class object
		
		System.out.println("===Display from Object Array===");
		for(Object k:o) {
			System.out.println(k.toString());
		}//end of loop

	}

}
