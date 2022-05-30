class  DemoVariables3
{
	static int a=10; //static variable memory in Class
	int b=20; //instance variable memory in Object
	
	public static void main(String[] args) //memory in class
	{
		int c=30; //local variable memory in meothod_frame
		System.out.println("The value a:"+DemoVariables3.a);
		DemoVariables3 ob = new DemoVariables3();
		System.out.println("Value of b:"+ob.b);
		System.out.println("Value of c:"+c);

	}
}
