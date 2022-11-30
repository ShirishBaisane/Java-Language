//Case-4: Using constructor 'StringBuffer(CharSequence)'.

public class DemoStringBuffer4 {

	public static void main(String[] args) {
		System.out.println("===sb1===");
		StringBuffer sb1 = new StringBuffer("nit");
		System.out.println("sb1: "+sb1.toString());
		System.out.println("default capacity: "+sb1.capacity());
		System.out.println("length: "+sb1.length());
		
		sb1.append("program");
		System.out.println("sb1: "+sb1.toString());
		System.out.println("capacity: "+sb1.capacity());
		System.out.println("length: "+sb1.length());
		
		System.out.println("===sb2===");
		StringBuffer sb2 = new StringBuffer(sb1);
		System.out.println("sb2: "+sb2.toString());
		System.out.println("capacity: "+sb2.capacity());
		System.out.println("length: "+sb2.length());
		

	}

}
