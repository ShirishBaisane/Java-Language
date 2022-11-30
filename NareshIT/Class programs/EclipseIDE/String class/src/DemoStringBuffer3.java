//Case-3: Using constructor 'StringBuffer(String)'.

public class DemoStringBuffer3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("nit");//con_call
		System.out.println("sb: "+sb.toString());
		System.out.println("Default capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		sb.append("languageprogram");
		System.out.println("sb: "+sb.toString());
		System.out.println("capacity: "+sb.capacity());
		System.out.println("length: "+sb.length());
		
		sb.append("Hyd");
		System.out.println("sb: "+sb.toString());
		System.out.println("capacity: "+sb.capacity());
		System.out.println("length: "+sb.length());
		

	}

}
