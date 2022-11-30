//Case-2: Using constructor 'StringBuffer(int)'.

public class DemoStringBuffer2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(0);//con_call;
		System.out.println("Default caoacity: "+sb.capacity());
		System.out.println("length: "+sb.length());
		
		sb.append("Hyd");
		System.out.println("sb: "+sb.toString());
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		sb.append("nit");
		System.out.println("sb: "+sb.toString());
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		sb.append("classes");
		System.out.println("sb: "+sb.toString());
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		

	}

}
