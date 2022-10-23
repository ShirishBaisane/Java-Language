package LinearSearch;

import java.util.Arrays;

public class searchInString {

	public static void main(String[] args) {
		String name = "Shirish";
		char target = 'i';
		
		//convert String datatype into char Array
		System.out.println(Arrays.toString(name.toCharArray()));
		
		System.out.println("===Using search1() method===");
		System.out.println("Is Target char found in the String: "+search1(name, target));
		
		System.out.println("===Using search2() method===");
		System.out.println("Is Target char found in the String: "+search1(name, target));

	}
	
	static boolean search1(String str, char target) {
		if(str.length()==0)
			return false;
		
		for(int i=0; i<str.length(); i++) {
			if(target==str.charAt(i))
				return true;
		}
		
		return false;
	}
	
	static boolean search2(String str, char target) {
		if(str.length()==0)
			return false;
		
		for(char ch: str.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		
		return false;
	}

}
