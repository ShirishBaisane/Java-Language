import java.util.*;

public class DemoTokenizer {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str  = s.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int count1 = st.countTokens();
		System.out.println("Number of Tokens: "+count1);
		System.out.println("Display Tokens::");
		while(st.hasMoreTokens()) {
			String tk = st.nextToken();
			System.out.println(tk.toString());
		}//end of loop
		System.out.println("===After Retrieving Tokens===");
		int count2 = st.countTokens();
		System.out.println("Number Of Tokens: "+count2);
		
		s.close();

	}

}
