
public class DemoString1 {

	public static void main(String[] args) {
		String s1 = "java";//syntax 1
		int len1 = s1.length();
		String s2 = new String("program");//syntax 2
		int len2 = s2.length();
		String s3 = s1.concat(s2);//Concatenation method process
		int len3 = s3.length();
		System.out.println("String s1: "+s1);
		System.out.println("Length of s1: "+len1);
		System.out.println("String s2: "+s2);
		System.out.println("Length of s2: "+len2);
		System.out.println("String s3: "+s3);
		System.out.println("Length of s3: "+len3);

	}

}
