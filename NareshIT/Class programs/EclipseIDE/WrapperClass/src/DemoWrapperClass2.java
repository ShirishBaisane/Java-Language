
public class DemoWrapperClass2 {

	public static void main(String[] args) {
		//Boxing process
		Integer ob1 = new Integer(12);
		Float ob2 = new Float(123.45);
		Character ob3 = new Character('A');
		Boolean ob4 = new Boolean(true);
		//UnBoxing process
		int i = ob1.intValue();
		float f = ob2.floatValue();
		boolean b = ob4.booleanValue();
		char ch = ob3.charValue();
		
		System.out.println("===Values after UnBoxing===");
		System.out.println("int value: "+i);
		System.out.println("float value: "+f);
		System.out.println("boolean value: "+b);
		System.out.println("char value: "+ch);

	}

}
