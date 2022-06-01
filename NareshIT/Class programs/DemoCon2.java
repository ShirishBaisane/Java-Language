/*
Comparing Blocks and Constructor_without_parameter
Note: In this program we can observe the execution priority between Blocks(static&instance)&Constructor.
*/

class CTest2{
	int a=10;//Instance_variable
	int b=10;//Instance_variable
	static int k=10;//Static_variable
	
	{
		b++;
		k++;
		System.out.println("===Instance Block===");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("k: "+k);
	}//Instance_block
	static
	{
		k++;
		System.out.println("===Static Block===");
		System.out.println("k: "+k);
	}//Static_block
	CTest2(){
		b++;
		k++;
		System.out.println("===Constructor===");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("k: "+k);
	}//Constructor_without_parameter
	void dis(){
		b++;
		k++;
		System.out.println("===Instance Method===");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("k: "+k);
	}
	
}//SubClass

class DemoCon2{
	public static void main(String[]args){
		CTest2 ob = new CTest2();//Constructor_call
		ob.dis();//method_call
	}
}//MainClass