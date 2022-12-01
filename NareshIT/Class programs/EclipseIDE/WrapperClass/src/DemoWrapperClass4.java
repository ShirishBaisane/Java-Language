
public class DemoWrapperClass4 {

	public static void main(String[] args) {
		String ob1 = "12";
		String ob2 = "123.45";
		String ob3 = "a";
		String ob4 = "true";
		
		//Parse methods
		int i = Integer.parseInt(ob1);
		float f = Float.parseFloat(ob2);
		char ch = ob3.charAt(0);
		boolean b = Boolean.parseBoolean(ob4);
		
		System.out.println("Value using Parse methods");
		System.out.println("i: "+i);
		System.out.println("f: "+f);
		System.out.println("ch: "+ch);
		System.out.println("boolean: "+b);

	}

}
