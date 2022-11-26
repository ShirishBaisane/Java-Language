//Types of TypeCasting processes

public class DemoString8 {

	public static void main(String[] args) {
		//Widening process
		int k = 'g';
		float f = 123;
		System.out.println("===Widening process===");
		System.out.println("Value of k: "+k);
		System.out.println("Value of f: "+f);
		
		//Narrowing process
		char ch = (char)69;
		int p = (int) 123.456;
		System.out.println("===Narrowing process===");
		System.out.println("Value of ch: "+ch);
		System.out.println("Value of p: "+p);

	}

}
