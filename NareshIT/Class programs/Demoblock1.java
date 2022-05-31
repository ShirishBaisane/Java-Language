/*
Static-Block Concept practice program.
*/

class BTest1{
	int a = 10;//Instance_variable, memory in object
	static int b = 20;//Static_variable, memory in class
	
	static{
		System.out.println("===SubClass Static Block===");
		//System.out.println("a:"+a);//ERROR, static-block cannot access Instance_variables
		System.out.println("b:"+b);
	}//Static-Block
}

class Demoblock1{
	int x=100;//Instance_variable
	static int y=200;//static_variable
	public static void main(String[]args){
		System.out.println("====main() method===");
		//System.out.println("x:"+x);//error: non-static variable x cannot be referenced from a static context
		System.out.println("y"+y);
		BTest1 ob = new BTest1();
	}
	static
	{
		System.out.println("===MainClass Static Block===");
		//System.out.println("x:"+x);//error: non-static variable x cannot be referenced from a static context
		System.out.println("y:"+y);
	}//Static-Block
}