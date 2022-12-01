import java.util.*;

public class DemoJoiner {

	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("/");
		sj1.add("12");
		sj1.add("Oct");
		sj1.add("1994");
		int len1 = sj1.length();
		System.out.println("D.O.J.: "+sj1+sj1.toString());
		System.out.println("length of sj1: "+len1);
		
		StringJoiner sj2 = new StringJoiner("_");
		sj2.add("34h");
		sj2.add("SrNagar");
		sj2.add("Hyd");
		sj2.add("612345");
		System.out.println("Address: "+sj2.toString());
		System.out.println("length of sj2: "+sj2.length());
		
		sj1.merge(sj2);
		System.out.println("===After Merging===");
		System.out.println(sj1.toString());
		
}

}
