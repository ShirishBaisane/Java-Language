package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Syntax
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();//declaration
	
		//initialization
		for(int i=0; i<3; i++) {
			list.add(new ArrayList<>());
		}
		
		//add elements
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				list.get(i).add(scan.nextInt());
			}
		}
		
		System.out.println(list);
		
		scan.close();

	}

}
