//Case-1: Using constructor 'StringBuffer()'.
public class DemoBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//con_call
		System.out.println("Default capacity: "+sb.capacity());//capacity()_call
		System.out.println("Length: "+sb.length());
		
		sb.append("java");//Adding data to Buffer object
		System.out.println("sb: "+sb.toString());
		System.out.println("capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		sb.append("programming");//Adding data to Buffer object
		System.out.println("sb: "+sb.toString());
		System.out.println("capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		sb.append("language");//Adding data to Buffer object
		System.out.println("sb: "+sb.toString());
		System.out.println("capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		sb.insert(4," version17 by 2021 ");//Inserting string at index value
		System.out.println("sb: "+sb.toString());
		System.out.println("capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		sb.delete(4,23);//Delete data from string with given range
		System.out.println("sb: "+sb.toString());
		System.out.println("capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		
		System.out.println("==String reverse() method==");
		System.out.println(sb.toString());//reverse()_call

	}

}
