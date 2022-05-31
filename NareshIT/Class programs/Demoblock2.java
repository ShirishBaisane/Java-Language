/*
Non-Static-Block(Instance-Block) concepts program.
*/

class BTest2{
	int a=10;//Instance_variable
	static int b=20;//Static_variable
	
	{
		a++;
		b++;
		System.out.println("===Instance Block===");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}//SubClass

class Demoblock2{
	public static void main(String[]args){
		System.out.println("***Object-1***");
		BTest2 ob1 = new BTest2();
		System.out.println("***Object-2***");
		BTest2 ob2 = new BTest2();
	}
}//MainClass


/*
Note: Due to the IndependentObject nature, Instance_variable does not depend upon 
	  other Instance_variable of different objects of same class as they have 
	  different memory location in heap area. But Static_variable has one fix 
	  location, so any operation on it will result in changes in the value.
*/