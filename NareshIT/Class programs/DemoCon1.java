/*
wAP to understand the working of Constructor_without_parameter.
*/

class CTest1{
	int a=10;//Instance_variable
	CTest1(){
		System.out.println("===CTest1() Constructor===");
		System.out.println("a: "+a);
	}//Constructor
	void dis(){
		System.out.println("***dis() Method***");
		System.out.println("a: "+a);
	}//Instance_method
}//SubClass

class DemoCon1{
	public static void main(String[]args){
		CTest1 ob = new CTest1();//Constructor_call
		ob.dis();//Instance_method_call
		ob.dis();//Instance_method_call
	}
}