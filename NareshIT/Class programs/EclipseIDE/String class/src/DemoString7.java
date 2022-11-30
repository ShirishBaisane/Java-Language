//ASCII>>> American Standard Code for Information Interchange
/*
 Upper case letter -> 65 to 90
 Lower case letter -> 97 to 122
 Numbers(0-9) -> 48-57
 */

public class DemoString7 {

	public static void main(String[] args) {
		System.out.println("===Upper case letters===");
		for(int i=65; i<=90; i++) {
			char ch = (char)i;//TypeCasting;
			System.out.print(ch+" ");
		}//end of loop
		System.out.println("");
		
		System.out.println("===lower case letters===");
		for(int i=97; i<=122; i++) {
			char ch = (char)i;//TypeCasting
			System.out.print(ch+" ");
		}//end of loop
		System.out.println("");
		
		System.out.println("===Numbers(0-9)===");
		for(int i=48; i<=57; i++) {
			char ch = (char)i;//TyprCasting
			System.out.print(ch+" ");
		}
		
	}

}
